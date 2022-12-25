package com.nets.productorder.userinfo.dao.Userinfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nets.productorder.coreentity.entity.Productlineorderdetail;

public interface ProductlineorderdetailDao {

	List<Productlineorderdetail> findAll();
	List<Productlineorderdetail> search(@Param("pPojo")Productlineorderdetail pPojo);
	List<Productlineorderdetail> searchone(@Param("pId")int pId);

	int add(@Param("pPojo")Productlineorderdetail pPojo,@Param("pNumCodeHead")String pNumCodeHead);
	int modify(@Param("pPojo")Productlineorderdetail pPojo,@Param("pId")int pId);
	int delete(@Param("pId")int pId);
	int deletereal(@Param("pId")int pId);

	/***/
	List<Productlineorderdetail> searchLastComplete(@Param("pProductlineID")int pProductlineID);






}
