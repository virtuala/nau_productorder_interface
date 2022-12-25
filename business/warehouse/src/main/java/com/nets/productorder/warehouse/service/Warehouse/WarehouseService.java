package com.nets.productorder.warehouse.service.Warehouse;

import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Userrole;
import com.nets.productorder.coreentity.entity.Warehouse;
import nets.unionnets.java_lib.util.Entity.netsTokenEntity;

public interface WarehouseService {

	String getLastError();
	void setTokenEntity(netsTokenEntity pTokenEntity);

	int OnAdd(Warehouse pPOJO);
	int OnModify(Warehouse pPOJO, String pID);
	int OnDelete(String pID);
	List<Warehouse> getFindAll();
	Warehouse OnNormal(String pId);

	/***/
	List<Map<String,Object>> searchByFirstId();



}
