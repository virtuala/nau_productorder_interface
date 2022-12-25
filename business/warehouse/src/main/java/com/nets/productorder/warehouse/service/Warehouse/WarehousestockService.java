package com.nets.productorder.warehouse.service.Warehouse;

import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.Orderinfodetail;
import com.nets.productorder.coreentity.entity.Userrole;
import com.nets.productorder.coreentity.entity.Warehousestock;
import nets.unionnets.java_lib.util.Entity.netsTokenEntity;
import org.apache.ibatis.annotations.Param;

public interface WarehousestockService {

	String getLastError();
	void setTokenEntity(netsTokenEntity pTokenEntity);

	int OnAdd(Warehousestock pPOJO);
	int OnModify(Warehousestock pPOJO, String pID);
	int OnDelete(String pID);
	List<Warehousestock> getFindAll();
	Warehousestock OnNormal(String pId);

	/***/
	List<Map<String ,Object>> searchCount(int pProductID);
	List<Map<String ,Object>> searchByProductID(int pProductID);
	List<Map<String ,Object>> searchByProductIDWarehouseID(int pProductID,int pWarehouseID);

}
