package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;

import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.coreentity.entity.Userrole;

public interface OrderinfodetailService {

	String getLastError();

	int OnAdd(Orderinfodetail pPOJO);
	int OnModify(Orderinfodetail pPOJO, String pID);
	int OnDelete(String pID);
	List<Orderinfodetail> getFindAll();
	Orderinfodetail OnNormal(String pId);



}
