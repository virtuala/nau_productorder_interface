package com.nets.productorder.orderinfo.dao.Orderinfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nets.productorder.coreentity.entity.Orderinfodetail;

public interface OrderinfodetailDao {

	List<Orderinfodetail> findAll();
	List<Orderinfodetail> search(@Param("pPojo")Orderinfodetail pPojo);
	List<Orderinfodetail> searchone(@Param("pId")int pId);

	int add(@Param("pPojo")Orderinfodetail pPojo,@Param("pNumCodeHead")String pNumCodeHead);
	int modify(@Param("pPojo")Orderinfodetail pPojo,@Param("pId")int pId);
	int delete(@Param("pId")int pId);
	int deletereal(@Param("pId")int pId);

	/***/






}
