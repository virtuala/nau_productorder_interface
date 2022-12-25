package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;

import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Userrole;
import com.nets.productorder.coreentity.entity.Warehouseorderdetail;

public interface WarehouseorderdetailService {

	String getLastError();

	int OnAdd(Warehouseorderdetail pPOJO);
	int OnModify(Warehouseorderdetail pPOJO, String pID);
	int OnDelete(String pID);
	List<Warehouseorderdetail> getFindAll();
	Warehouseorderdetail OnNormal(String pId);



}
