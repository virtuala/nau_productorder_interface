package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;

import com.nets.productorder.coreentity.entity.Userrole;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nets.productorder.userinfo.dao.Userinfo.UserinfoDao;
import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.userinfo.service.Userinfo.UserinfoService;
import nets.unionnets.java_lib.util.Func.netsCode;

@Service
public class UserinfoServiceImpl implements UserinfoService{
	@Autowired
	private UserinfoDao sDao;
	public Userinfo sPOJO;
	public String sysLastError="";
	protected netsCode sApp_Code=netsCode.getInstance();

	/* 取得最后的错误消息 */
	@Override
	public String getLastError(){ return this.sysLastError; }

	@Override
	public int OnAdd(Userinfo pPOJO){

		this.sDao.add(pPOJO,"N_");

		return 0;
	}
	@Override
	public int OnModify(Userinfo pPOJO, String pID){

		this.sDao.modify(pPOJO,this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public int OnDelete(String pID){

		this.sDao.deletereal(this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public List<Userinfo> getFindAll(){

		List<Userinfo> tmpLIST = this.sDao.findAll();

		return tmpLIST;
	}
	@Override
	public Userinfo OnNormal(String pId){

		List<Userinfo> tmpList = this.sDao.searchone(this.sApp_Code.ToInt32(pId,0));
		if (tmpList.size() <= 0) {
			return new Userinfo();
		}

		return (Userinfo) tmpList.get(0);
	}

	/* S.custom */
	@Override
	public Userinfo selectByUserName(String pName) {

		List<Userinfo> tmpList = this.sDao.selectByUserName(pName);
		if (tmpList.size() <= 0) {
			return new Userinfo();
		}

		return (Userinfo) tmpList.get(0);
	}
	@Override
	public Userinfo selectByUserId(String pId) {

		List<Userinfo> tmpList = this.sDao.selectByUserId(pId);
		if (tmpList.size() <= 0) {
			return new Userinfo();
		}

		return (Userinfo) tmpList.get(0);
	}

	/* E.custom */



}
