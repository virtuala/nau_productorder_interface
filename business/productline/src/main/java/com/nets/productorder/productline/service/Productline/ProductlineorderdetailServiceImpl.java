package com.nets.productorder.productline.service.Productline;

import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.Warehouseorder;
import com.nets.productorder.productline.dao.Productline.ProductlineorderdetailDao;
import com.nets.productorder.productline.rest.Warehouse.WarehouseRestTemplate;
import com.nets.productorder.productline.rest.Warehouse.WarehouseorderRestTemplate;
import nets.unionnets.java_lib.util.Entity.netsTokenEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nets.productorder.coreentity.entity.Productlineorderdetail;
import nets.unionnets.java_lib.util.Func.netsCode;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductlineorderdetailServiceImpl implements ProductlineorderdetailService{
	@Autowired
	private ProductlineorderdetailDao sDao;
	public String sysLastError="";
	protected netsCode sApp_Code=netsCode.getInstance();

	/***/
	@Value("${productorder.warehouse.name}")
	public String sConfigModule;
	@Autowired
	public RestTemplate sRestTemplate;
	public netsTokenEntity sTokenEntity;

	WarehouseRestTemplate sRestWarehouse;
	WarehouseorderRestTemplate sRestWarehouseorder;

	/* 取得最后的错误消息 */
	@Override
	public String getLastError(){ return this.sysLastError; }
	@Override
	public void setTokenEntity(netsTokenEntity pTokenEntity){ this.sTokenEntity=pTokenEntity; return; }

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

		List<Productlineorderdetail> tmpList = this.sDao.findAll();

		return tmpList;
	}
	@Override
	public Productlineorderdetail OnNormal(String pId){

		List<Productlineorderdetail> tmpList = this.sDao.searchone(this.sApp_Code.ToInt32(pId,0));
		if (tmpList.size() <= 0) {
			return new Productlineorderdetail();
		}

		return tmpList.get(0);
	}

	/**
	 生产单据完成
	 */
	@Override
	public int OnComplete(String pId){
		List<Map<String,Object>> tmpData0;
		List<Map<String,Object>> tmpData1;
		Map<String,Object> tmpRowMap;
		Map<String,Object> tmpRowWarehouse;
		Productlineorderdetail tmpPojoProductlineorderdetail;
		Warehouseorder tmpPojoWarehouseorder;
		this.sRestWarehouse=new WarehouseRestTemplate();
		this.sRestWarehouseorder=new WarehouseorderRestTemplate();

		this.sRestWarehouse.Initail(this.sRestTemplate,this.sConfigModule,"warehouse","","");
		this.sRestWarehouse.InitailTokenEntity(this.sTokenEntity);
		this.sRestWarehouseorder.Initail(this.sRestTemplate,this.sConfigModule,"warehouseorder","","");
		this.sRestWarehouseorder.InitailTokenEntity(this.sTokenEntity);

		//查询单据
		tmpData0=this.sDao.searchById(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(pId),0));
		if(tmpData0.size()<=0){
			return 1;
		}
		tmpRowMap=tmpData0.get(0);
		if(!this.sApp_Code.ObjectToString(tmpRowMap.get("plodtStatus")).equals("0")){
			return 1;
		}

		//查询仓库
		tmpData1=this.sRestWarehouse.searchByFirstId();
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
		this.sRestWarehouseorder.OnAdd(tmpPojoWarehouseorder);

		//新增出库单
		tmpPojoWarehouseorder=new Warehouseorder();
		tmpPojoWarehouseorder.setWhotType(1);
		tmpPojoWarehouseorder.setWhotCount(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRowMap.get("plodtCount")),0));
		tmpPojoWarehouseorder.setWhotWarehouseID(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRowWarehouse.get("whtID")),0));
		tmpPojoWarehouseorder.setWhotProductID(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRowMap.get("plodtProductID")),0));
		this.sRestWarehouseorder.OnAdd(tmpPojoWarehouseorder);

		//设置单据状态
		tmpPojoProductlineorderdetail=new Productlineorderdetail();
		tmpPojoProductlineorderdetail.setPlodtStatus(1);
		this.sDao.modify(tmpPojoProductlineorderdetail,this.sApp_Code.ToInt32(pId,0));

		return 0;
	}

	/***/
	@Override
	public List<Productlineorderdetail> searchLastComplete(int pProductlineID){
		return this.sDao.searchLastComplete(pProductlineID);
	}




}
