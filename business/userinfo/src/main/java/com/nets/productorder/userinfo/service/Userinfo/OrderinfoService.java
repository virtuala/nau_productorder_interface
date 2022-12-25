package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;

import com.nets.productorder.coreentity.entity.Orderinfo;
import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Userrole;

public interface OrderinfoService {

	String getLastError();

	int OnAdd(Orderinfo pPOJO);
	int OnModify(Orderinfo pPOJO, String pID);
	int OnDelete(String pID);
	List<Orderinfo> getFindAll();
	Orderinfo OnNormal(String pId);

	int OnAddJson(Object pJson);


}
