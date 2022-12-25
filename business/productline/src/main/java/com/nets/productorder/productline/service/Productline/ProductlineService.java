package com.nets.productorder.productline.service.Productline;

import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.Productline;
import nets.unionnets.java_lib.util.Entity.netsTokenEntity;

public interface ProductlineService {

	String getLastError();
	void setTokenEntity(netsTokenEntity pTokenEntity);

	int OnAdd(Productline pPOJO);
	int OnModify(Productline pPOJO, String pID);
	int OnDelete(String pID);
	List<Productline> getFindAll();
	Productline OnNormal(String pId);

	/**/
	List<Map<String,Object>> searchWithProductlineorderdetail();
	List<Map<String,Object>> searchById(int pId);



}
