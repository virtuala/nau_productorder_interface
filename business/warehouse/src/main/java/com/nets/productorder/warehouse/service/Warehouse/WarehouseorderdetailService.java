package com.nets.productorder.warehouse.service.Warehouse;

import java.util.List;

import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Userrole;
import com.nets.productorder.coreentity.entity.Warehouseorderdetail;
import nets.unionnets.java_lib.util.Entity.netsTokenEntity;

public interface WarehouseorderdetailService {

	String getLastError();
	void setTokenEntity(netsTokenEntity pTokenEntity);

	int OnAdd(Warehouseorderdetail pPOJO);
	int OnModify(Warehouseorderdetail pPOJO, String pID);
	int OnDelete(String pID);
	List<Warehouseorderdetail> getFindAll();
	Warehouseorderdetail OnNormal(String pId);



}
