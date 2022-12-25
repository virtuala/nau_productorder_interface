package com.nets.productorder.userinfo.dao.Userinfo;

import java.util.List;

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






}
