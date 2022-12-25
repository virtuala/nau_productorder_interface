package com.nets.productorder.userinfo.dao.Userinfo;

import java.util.List;

import com.nets.productorder.coreentity.entity.Userrole;
import org.apache.ibatis.annotations.Param;

public interface UserroleDao {

	List<Userrole> findAll();
	List<Userrole> search(@Param("pPojo")Userrole pPojo);
	List<Userrole> searchone(@Param("pId")int pId);

	int add(@Param("pPojo")Userrole pPojo,@Param("pNumCodeHead")String pNumCodeHead);
	int modify(@Param("pPojo")Userrole pPojo,@Param("pId")int pId);
	int delete(@Param("pId")int pId);
	int deletereal(@Param("pId")int pId);

	/***/






}
