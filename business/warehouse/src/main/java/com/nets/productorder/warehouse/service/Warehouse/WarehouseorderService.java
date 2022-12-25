package com.nets.productorder.warehouse.service.Warehouse;

import java.util.List;

import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Userrole;
import com.nets.productorder.coreentity.entity.Warehouseorder;
import nets.unionnets.java_lib.util.Entity.netsTokenEntity;

public interface WarehouseorderService {

	String getLastError();
	void setTokenEntity(netsTokenEntity pTokenEntity);

	int OnAdd(Warehouseorder pPOJO);
	int OnModify(Warehouseorder pPOJO, String pID);
	int OnDelete(String pID);
	List<Warehouseorder> getFindAll();
	Warehouseorder OnNormal(String pId);



}
