package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;

import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Userrole;

public interface UserroleService {

	String getLastError();

	int OnAdd(Userrole pPOJO);
	int OnModify(Userrole pPOJO,String pID);
	int OnDelete(String pID);
	List<Userrole> getFindAll();
	Userrole OnNormal(String pId);



}
