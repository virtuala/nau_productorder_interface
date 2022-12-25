package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;

import com.nets.productorder.coreentity.entity.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nets.productorder.userinfo.dao.Userinfo.UserroleDao;
import com.nets.productorder.coreentity.entity.Userrole;
import com.nets.productorder.userinfo.service.Userinfo.UserroleService;
import nets.unionnets.java_lib.util.Func.netsCode;

@Service
public class UserroleServiceImpl implements UserroleService{
	@Autowired
	private UserroleDao sDao;
	public Userrole sPOJO;
	public String sysLastError="";
	protected netsCode sApp_Code=netsCode.getInstance();

	/* 取得最后的错误消息 */
	@Override
	public String getLastError(){ return this.sysLastError; }

	@Override
	public int OnAdd(Userrole pPOJO){

		this.sDao.add(pPOJO,"N_");

		return 0;
	}
	@Override
	public int OnModify(Userrole pPOJO,String pID){

		this.sDao.modify(pPOJO,this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public int OnDelete(String pID){

		this.sDao.deletereal(this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public List<Userrole> getFindAll(){

		List<Userrole> tmpLIST = this.sDao.findAll();

		return tmpLIST;
	}
	@Override
	public Userrole OnNormal(String pId){

		List<Userrole> tmpList = this.sDao.searchone(this.sApp_Code.ToInt32(pId,0));
		if (tmpList.size() <= 0) {
			return new Userrole();
		}

		return (Userrole) tmpList.get(0);
	}
	


}
