package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;

import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Userrole;
import com.nets.productorder.coreentity.entity.Warehousestock;

public interface WarehousestockService {

	String getLastError();

	int OnAdd(Warehousestock pPOJO);
	int OnModify(Warehousestock pPOJO, String pID);
	int OnDelete(String pID);
	List<Warehousestock> getFindAll();
	Warehousestock OnNormal(String pId);



}
