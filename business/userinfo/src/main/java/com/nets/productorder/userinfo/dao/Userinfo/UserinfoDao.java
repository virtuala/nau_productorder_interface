package com.nets.productorder.userinfo.dao.Userinfo;

import java.util.List;

import com.nets.productorder.coreentity.entity.Userinfo;
import org.apache.ibatis.annotations.Param;

public interface UserinfoDao {

	List<Userinfo> findAll();
	List<Userinfo> search(@Param("pPojo")Userinfo pPojo);
	List<Userinfo> searchone(@Param("pId")int pId);

	int add(@Param("pPojo")Userinfo pPojo,@Param("pNumCodeHead")String pNumCodeHead);
	int modify(@Param("pPojo")Userinfo pPojo,@Param("pId")int pId);
	int delete(@Param("pId")int pId);
	int deletereal(@Param("pId")int pId);

	/* S.custom */
	List<Userinfo> selectByUserName(@Param("pName")String pName);
	List<Userinfo> selectByUserId(@Param("pId")String pId);
	/* E.custom */





}
