package com.nets.productorder.productline.service.Productline;

import java.util.List;

import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Productlineorderdetail;
import com.nets.productorder.coreentity.entity.Userrole;
import nets.unionnets.java_lib.util.Entity.netsTokenEntity;
import org.apache.ibatis.annotations.Param;

public interface ProductlineorderdetailService {

	String getLastError();
	void setTokenEntity(netsTokenEntity pTokenEntity);

	int OnAdd(Productlineorderdetail pPOJO);
	int OnModify(Productlineorderdetail pPOJO, String pID);
	int OnDelete(String pID);
	List<Productlineorderdetail> getFindAll();
	Productlineorderdetail OnNormal(String pId);

	/***/
	int OnComplete(String pId);
	List<Productlineorderdetail> searchLastComplete(int pProductlineID);




}
