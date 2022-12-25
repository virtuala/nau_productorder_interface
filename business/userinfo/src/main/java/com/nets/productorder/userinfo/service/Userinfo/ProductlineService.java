package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Productline;
import com.nets.productorder.coreentity.entity.Userrole;

public interface ProductlineService {

	String getLastError();

	int OnAdd(Productline pPOJO);
	int OnModify(Productline pPOJO, String pID);
	int OnDelete(String pID);
	List<Productline> getFindAll();
	Productline OnNormal(String pId);

	/**/
	List<Map<String,Object>> searchWithProductlineorderdetail();



}
