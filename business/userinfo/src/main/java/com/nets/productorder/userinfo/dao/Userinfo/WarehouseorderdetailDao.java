package com.nets.productorder.userinfo.dao.Userinfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nets.productorder.coreentity.entity.Warehouseorderdetail;

public interface WarehouseorderdetailDao {

	List<Warehouseorderdetail> findAll();
	List<Warehouseorderdetail> search(@Param("pPojo")Warehouseorderdetail pPojo);
	List<Warehouseorderdetail> searchone(@Param("pId")int pId);

	int add(@Param("pPojo")Warehouseorderdetail pPojo,@Param("pNumCodeHead")String pNumCodeHead);
	int modify(@Param("pPojo")Warehouseorderdetail pPojo,@Param("pId")int pId);
	int delete(@Param("pId")int pId);
	int deletereal(@Param("pId")int pId);

	/***/






}
