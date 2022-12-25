package com.nets.productorder.userinfo.dao.Userinfo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.nets.productorder.coreentity.entity.Warehousestock;

public interface WarehousestockDao {

	List<Warehousestock> findAll();
	List<Warehousestock> search(@Param("pPojo")Warehousestock pPojo);
	List<Warehousestock> searchone(@Param("pId")int pId);

	int add(@Param("pPojo")Warehousestock pPojo,@Param("pNumCodeHead")String pNumCodeHead);
	int modify(@Param("pPojo")Warehousestock pPojo,@Param("pId")int pId);
	int delete(@Param("pId")int pId);
	int deletereal(@Param("pId")int pId);

	/***/
	List<Map<String ,Object>> searchCount(@Param("pProductID")int pProductID);






}
