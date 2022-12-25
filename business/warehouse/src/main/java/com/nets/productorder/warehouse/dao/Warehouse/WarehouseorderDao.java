package com.nets.productorder.warehouse.dao.Warehouse;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nets.productorder.coreentity.entity.Warehouseorder;

public interface WarehouseorderDao {

	List<Warehouseorder> findAll();
	List<Warehouseorder> search(@Param("pPojo")Warehouseorder pPojo);
	List<Warehouseorder> searchone(@Param("pId")int pId);

	int add(@Param("pPojo")Warehouseorder pPojo,@Param("pNumCodeHead")String pNumCodeHead);
	int modify(@Param("pPojo")Warehouseorder pPojo,@Param("pId")int pId);
	int delete(@Param("pId")int pId);
	int deletereal(@Param("pId")int pId);

	/***/






}
