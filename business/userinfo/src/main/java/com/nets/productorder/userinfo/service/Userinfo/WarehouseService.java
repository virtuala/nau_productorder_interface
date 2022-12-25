package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;

import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Userrole;
import com.nets.productorder.coreentity.entity.Warehouse;

public interface WarehouseService {

	String getLastError();

	int OnAdd(Warehouse pPOJO);
	int OnModify(Warehouse pPOJO, String pID);
	int OnDelete(String pID);
	List<Warehouse> getFindAll();
	Warehouse OnNormal(String pId);



}
