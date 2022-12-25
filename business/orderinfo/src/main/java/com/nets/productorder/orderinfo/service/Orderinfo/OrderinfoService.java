package com.nets.productorder.orderinfo.service.Orderinfo;

import java.util.List;

import com.nets.productorder.coreentity.entity.Orderinfo;
import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Userrole;
import nets.unionnets.java_lib.util.Entity.netsTokenEntity;

public interface OrderinfoService {

	String getLastError();
	void setTokenEntity(netsTokenEntity pTokenEntity);

	int OnAdd(Orderinfo pPOJO);
	int OnModify(Orderinfo pPOJO, String pID);
	int OnDelete(String pID);
	List<Orderinfo> getFindAll();
	Orderinfo OnNormal(String pId);

	int OnAddJson(Object pJson);


}
