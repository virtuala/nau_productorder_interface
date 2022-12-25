package com.nets.productorder.orderinfo.service.Orderinfo;

import java.util.List;

import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.coreentity.entity.Userrole;
import nets.unionnets.java_lib.util.Entity.netsTokenEntity;

public interface OrderinfodetailService {

	String getLastError();
	void setTokenEntity(netsTokenEntity pTokenEntity);

	int OnAdd(Orderinfodetail pPOJO);
	int OnModify(Orderinfodetail pPOJO, String pID);
	int OnDelete(String pID);
	List<Orderinfodetail> getFindAll();
	Orderinfodetail OnNormal(String pId);



}
