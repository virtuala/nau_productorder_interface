package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.coreentity.entity.Userrole;
import com.nets.productorder.coreentity.entity.Warehouseorder;
import com.nets.productorder.userinfo.dao.Universal.UniversalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nets.productorder.userinfo.dao.Userinfo.ProductlineorderdetailDao;
import com.nets.productorder.coreentity.entity.Productlineorderdetail;
import com.nets.productorder.userinfo.service.Userinfo.ProductlineorderdetailService;
import nets.unionnets.java_lib.util.Func.netsCode;

@Service
public class ProductlineorderdetailServiceImpl implements ProductlineorderdetailService{
	@Autowired
	private UniversalDao sDaoAuto;
	@Autowired
	private ProductlineorderdetailDao sDao;
	public Productlineorderdetail sPOJO;
	public String sysLastError="";
	protected netsCode sApp_Code=netsCode.getInstance();

	@Autowired
	private WarehouseorderService sServiceWarehouseorder;


	/* 取得最后的错误消息 */
	@Override
	public String getLastError(){ return this.sysLastError; }

	@Override
	public int OnAdd(Productlineorderdetail pPOJO){

		this.sDao.add(pPOJO,"N_");

		return 0;
	}
	@Override
	public int OnModify(Productlineorderdetail pPOJO, String pID){

		this.sDao.modify(pPOJO,this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public int OnDelete(String pID){

		this.sDao.deletereal(this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public List<Productlineorderdetail> getFindAll(){

		List<Productlineorderdetail> tmpLIST = this.sDao.findAll();

		return tmpLIST;
	}
	@Override
	public Productlineorderdetail OnNormal(String pId){

		List<Productlineorderdetail> tmpList = this.sDao.searchone(this.sApp_Code.ToInt32(pId,0));
		if (tmpList.size() <= 0) {
			return new Productlineorderdetail();
		}

		return (Productlineorderdetail) tmpList.get(0);
	}

	/* 生产单据完成 */
	@Override
	public int OnComplete(String pId){
		String tmpStrSql;
		List<Map<String,Object>> tmpData0;
		List<Map<String,Object>> tmpData1;
		Map<String,Object> tmpRowMap;
		Map<String,Object> tmpRowWarehouse;
		Productlineorderdetail tmpPojoProductlineorderdetail;
		Warehouseorder tmpPojoWarehouseorder;

		//查询单据
		tmpStrSql=" SELECT * FROM corenets_productlineorderdetail AS A WHERE 1=1 AND A.plodtID="+pId+" ";
		tmpData0=this.sDaoAuto.Search(tmpStrSql);
		if(tmpData0.size()<=0){
			return 1;
		}
		tmpRowMap=tmpData0.get(0);
		if(!this.sApp_Code.ObjectToString(tmpRowMap.get("plodtStatus")).equals("0")){
			return 1;
		}

		//查询仓库
		tmpStrSql=" SELECT * FROM corenets_warehouse AS A WHERE 1=1 ORDER BY A.whtID DESC LIMIT 0,1 ";
		tmpData1=this.sDaoAuto.Search(tmpStrSql);
		if(tmpData1.size()<=0){
			return 1;
		}
		tmpRowWarehouse=tmpData1.get(0);

		//新增入库单
		tmpPojoWarehouseorder=new Warehouseorder();
		tmpPojoWarehouseorder.setWhotType(0);
		tmpPojoWarehouseorder.setWhotCount(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRowMap.get("plodtCount")),0));
		tmpPojoWarehouseorder.setWhotWarehouseID(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRowWarehouse.get("whtID")),0));
		tmpPojoWarehouseorder.setWhotProductID(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRowMap.get("plodtProductID")),0));
		this.sServiceWarehouseorder.OnAdd(tmpPojoWarehouseorder);

		//新增出库单
		tmpPojoWarehouseorder=new Warehouseorder();
		tmpPojoWarehouseorder.setWhotType(1);
		tmpPojoWarehouseorder.setWhotCount(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRowMap.get("plodtCount")),0));
		tmpPojoWarehouseorder.setWhotWarehouseID(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRowWarehouse.get("whtID")),0));
		tmpPojoWarehouseorder.setWhotProductID(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRowMap.get("plodtProductID")),0));
		this.sServiceWarehouseorder.OnAdd(tmpPojoWarehouseorder);

		//设置单据状态
		tmpPojoProductlineorderdetail=new Productlineorderdetail();
		tmpPojoProductlineorderdetail.setPlodtStatus(1);
		this.sDao.modify(tmpPojoProductlineorderdetail,this.sApp_Code.ToInt32(pId,0));

		return 0;
	}
	


}
