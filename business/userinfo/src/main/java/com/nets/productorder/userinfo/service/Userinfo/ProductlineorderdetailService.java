package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;

import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Productlineorderdetail;
import com.nets.productorder.coreentity.entity.Userrole;

public interface ProductlineorderdetailService {

	String getLastError();

	int OnAdd(Productlineorderdetail pPOJO);
	int OnModify(Productlineorderdetail pPOJO, String pID);
	int OnDelete(String pID);
	List<Productlineorderdetail> getFindAll();
	Productlineorderdetail OnNormal(String pId);

	int OnComplete(String pId);




}
