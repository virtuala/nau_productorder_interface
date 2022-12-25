package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Product;
import com.nets.productorder.coreentity.entity.Userrole;

public interface ProductService {

	String getLastError();

	int OnAdd(Product pPOJO);
	int OnModify(Product pPOJO, String pID);
	int OnDelete(String pID);
	List<Product> getFindAll();
	Product OnNormal(String pId);

	/**/
	List<Map<String,Object>> searchWithWarehouse();

}
