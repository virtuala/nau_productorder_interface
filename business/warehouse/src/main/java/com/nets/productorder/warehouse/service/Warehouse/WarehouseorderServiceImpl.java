package com.nets.productorder.warehouse.service.Warehouse;

import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.*;
import com.nets.productorder.warehouse.dao.Warehouse.WarehouseorderDao;
import com.nets.productorder.warehouse.dao.Warehouse.WarehousestockDao;
import nets.unionnets.java_lib.util.Entity.netsTokenEntity;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nets.productorder.warehouse.service.Warehouse.WarehouseorderService;
import nets.unionnets.java_lib.util.Func.netsCode;
import org.springframework.web.client.RestTemplate;

@Service
public class WarehouseorderServiceImpl implements WarehouseorderService{
	@Autowired
	private WarehouseorderDao sDao;
	@Autowired
	private WarehousestockDao sDaoStock;
	public Warehouseorder sPOJO;
	public String sysLastError="";
	protected netsCode sApp_Code=netsCode.getInstance();

	/***/
	@Value("${productorder.warehouse.name}")
	public String sConfigRestModule;
	@Autowired
	public RestTemplate sRestTemplate;
	public netsTokenEntity sTokenEntity;

	/* 取得最后的错误消息 */
	@Override
	public String getLastError(){ return this.sysLastError; }
	@Override
	public void setTokenEntity(netsTokenEntity pTokenEntity){ this.sTokenEntity=pTokenEntity; return; }

	@Override
	public int OnAdd(Warehouseorder pPOJO){
		int tmpId;
		int tmpIdStock;
		List<Map<String,Object>> tmpData0;
		Map<String,Object> tmpRow0;
		int tmpCount=0;

		Warehousestock tmpPojoStock=new Warehousestock();
		tmpPojoStock.setWhstWarehouseID(pPOJO.getWhotWarehouseID());
		tmpPojoStock.setWhstProductID(pPOJO.getWhotProductID());

		tmpData0=this.sDaoStock.searchByProductIDWarehouseID(this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpPojoStock.getWhstProductID()),0),this.sApp_Code.ToInt32(this.sApp_Code.ObjectToString(tmpPojoStock.getWhstWarehouseID()),0));
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
