package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.*;
import com.nets.productorder.userinfo.dao.Universal.UniversalDao;
import com.nets.productorder.userinfo.dao.Userinfo.*;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nets.productorder.userinfo.service.Userinfo.WarehouseorderService;
import nets.unionnets.java_lib.util.Func.netsCode;

@Service
public class WarehouseorderServiceImpl implements WarehouseorderService{
	@Autowired
	private UniversalDao sDaoAuto;
	@Autowired
	private WarehouseorderDao sDao;
	@Autowired
	private WarehousestockDao sDaoStock;
	public Warehouseorder sPOJO;
	public String sysLastError="";
	protected netsCode sApp_Code=netsCode.getInstance();

	/* 取得最后的错误消息 */
	@Override
	public String getLastError(){ return this.sysLastError; }

	@Override
	public int OnAdd(Warehouseorder pPOJO){
		int tmpId;
		int tmpIdStock;
		String tmpStrSql="";
		List<Map<String,Object>> tmpData0;
		Map<String,Object> tmpRow0;
		int tmpCount=0;

		Warehousestock tmpPojoStock=new Warehousestock();
		tmpPojoStock.setWhstWarehouseID(pPOJO.getWhotWarehouseID());
		tmpPojoStock.setWhstProductID(pPOJO.getWhotProductID());

		tmpStrSql=" SELECT * FROM corenets_warehousestock AS A WHERE 1=1 AND A.whstProductID="+tmpPojoStock.getWhstProductID().toString()+" AND A.whstWarehouseID="+tmpPojoStock.getWhstWarehouseID().toString()+" ";
		tmpData0=this.sDaoAuto.Search(tmpStrSql);
		if(tmpData0.size()<=0){
			//没有数据
			if(this.sApp_Code.ObjectToString(pPOJO.getWhotType()).equals("0")){
				//增加数据
				tmpPojoStock.setWhstCount(pPOJO.getWhotCount());
				this.sDaoStock.add(tmpPojoStock,"N_");
			}else{
				//减少数据-出错
				return 1;
			}
		}else {
			//有数据
			tmpRow0=tmpData0.get(0);
			tmpIdStock=this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRow0.get("whstID")),0);
			if(this.sApp_Code.ObjectToString(pPOJO.getWhotType()).equals("0")){
				//增加数据-出错
				tmpCount=this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRow0.get("whstCount")),0)+pPOJO.getWhotCount();
				tmpPojoStock.setWhstCount(tmpCount);
			}else{
				//减少数据
				if(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRow0.get("whstCount")),0)<pPOJO.getWhotCount()){
					return 1;
				}
				tmpCount=this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpRow0.get("whstCount")),0)-pPOJO.getWhotCount();
				tmpPojoStock.setWhstCount(tmpCount);
			}
			this.sDaoStock.modify(tmpPojoStock,tmpIdStock);
		}

		tmpId=this.sDao.add(pPOJO,"N_");

		return 0;
	}
	@Override
	public int OnModify(Warehouseorder pPOJO, String pID){

		this.sDao.modify(pPOJO,this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public int OnDelete(String pID){

		this.sDao.deletereal(this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public List<Warehouseorder> getFindAll(){

		List<Warehouseorder> tmpLIST = this.sDao.findAll();

		return tmpLIST;
	}
	@Override
	public Warehouseorder OnNormal(String pId){

		List<Warehouseorder> tmpList = this.sDao.searchone(this.sApp_Code.ToInt32(pId,0));
		if (tmpList.size() <= 0) {
			return new Warehouseorder();
		}

		return (Warehouseorder) tmpList.get(0);
	}
	


}
