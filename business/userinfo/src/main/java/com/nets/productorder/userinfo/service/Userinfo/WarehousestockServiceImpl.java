package com.nets.productorder.userinfo.service.Userinfo;

import java.util.List;

import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.coreentity.entity.Userrole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nets.productorder.userinfo.dao.Userinfo.WarehousestockDao;
import com.nets.productorder.coreentity.entity.Warehousestock;
import com.nets.productorder.userinfo.service.Userinfo.WarehousestockService;
import nets.unionnets.java_lib.util.Func.netsCode;

@Service
public class WarehousestockServiceImpl implements WarehousestockService{
	@Autowired
	private WarehousestockDao sDao;
	public Warehousestock sPOJO;
	public String sysLastError="";
	protected netsCode sApp_Code=netsCode.getInstance();

	/* 取得最后的错误消息 */
	@Override
	public String getLastError(){ return this.sysLastError; }

	@Override
	public int OnAdd(Warehousestock pPOJO){

		this.sDao.add(pPOJO,"N_");

		return 0;
	}
	@Override
	public int OnModify(Warehousestock pPOJO, String pID){

		this.sDao.modify(pPOJO,this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public int OnDelete(String pID){

		this.sDao.deletereal(this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public List<Warehousestock> getFindAll(){

		List<Warehousestock> tmpLIST = this.sDao.findAll();

		return tmpLIST;
	}
	@Override
	public Warehousestock OnNormal(String pId){

		List<Warehousestock> tmpList = this.sDao.searchone(this.sApp_Code.ToInt32(pId,0));
		if (tmpList.size() <= 0) {
			return new Warehousestock();
		}

		return (Warehousestock) tmpList.get(0);
	}
	


}
