package com.nets.productorder.warehouse.dao.Warehouse;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.nets.productorder.coreentity.entity.Warehouse;

public interface WarehouseDao {

	List<Warehouse> findAll();
	List<Warehouse> search(@Param("pPojo")Warehouse pPojo);
	List<Warehouse> searchone(@Param("pId")int pId);

	int add(@Param("pPojo")Warehouse pPojo,@Param("pNumCodeHead")String pNumCodeHead);
	int modify(@Param("pPojo")Warehouse pPojo,@Param("pId")int pId);
	int delete(@Param("pId")int pId);
	int deletereal(@Param("pId")int pId);

	/***/
	List<Map<String,Object>> searchByFirstId();





}
