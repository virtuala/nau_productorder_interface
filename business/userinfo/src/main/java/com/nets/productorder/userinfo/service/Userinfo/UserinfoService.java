package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;

import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.coreentity.entity.Userrole;

public interface UserinfoService {

	String getLastError();

	int OnAdd(Userinfo pPOJO);
	int OnModify(Userinfo pPOJO, String pID);
	int OnDelete(String pID);
	List<Userinfo> getFindAll();
	Userinfo OnNormal(String pId);

	/* S.custom */
	Userinfo selectByUserName(String pName);
	Userinfo selectByUserId(String pId);

	/* E.custom */

}
