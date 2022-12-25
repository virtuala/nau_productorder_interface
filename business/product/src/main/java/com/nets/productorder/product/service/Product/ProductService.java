package com.nets.productorder.product.service.Product;

import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Product;
import com.nets.productorder.coreentity.entity.Userrole;
import nets.unionnets.java_lib.util.Entity.netsTokenEntity;

public interface ProductService {

	String getLastError();
	void setTokenEntity(netsTokenEntity pTokenEntity);

	int OnAdd(Product pPOJO);
	int OnModify(Product pPOJO, String pID);
	int OnDelete(String pID);
	List<Product> getFindAll();
	Product OnNormal(String pId);

	/**/
	List<Map<String,Object>> searchWithWarehouse();

}
