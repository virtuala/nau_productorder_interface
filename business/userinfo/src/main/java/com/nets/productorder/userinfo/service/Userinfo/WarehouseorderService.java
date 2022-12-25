package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;

import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Userrole;
import com.nets.productorder.coreentity.entity.Warehouseorder;

public interface WarehouseorderService {

	String getLastError();

	int OnAdd(Warehouseorder pPOJO);
	int OnModify(Warehouseorder pPOJO, String pID);
	int OnDelete(String pID);
	List<Warehouseorder> getFindAll();
	Warehouseorder OnNormal(String pId);



}
