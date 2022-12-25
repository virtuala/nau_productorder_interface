package com.nets.productorder.productline.service.Productline;

import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.Productlineorderdetail;
import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.coreentity.entity.Userrole;
import com.nets.productorder.productline.dao.Productline.ProductlineDao;
import com.nets.productorder.productline.dao.Productline.ProductlineorderdetailDao;
import nets.unionnets.java_lib.util.Entity.netsTokenEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nets.productorder.coreentity.entity.Productline;
import nets.unionnets.java_lib.util.Func.netsCode;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductlineServiceImpl implements ProductlineService{
	@Autowired
	private ProductlineDao sDao;
	@Autowired
	private ProductlineorderdetailDao sDaoOrderdetail;
	public Productline sPOJO;
	public String sysLastError="";
	protected netsCode sApp_Code=netsCode.getInstance();

	/***/
	@Value("${productorder.warehouse.name}")
	public String sConfigRestModule;
	@Autowired
	public RestTemplate sRestTemplate;
	public netsTokenEntity sTokenEntity;

	/* 取得最后的错误消息 */
	@Override
	public String getLastError(){ return this.sysLastError; }
	@Override
	public void setTokenEntity(netsTokenEntity pTokenEntity){ this.sTokenEntity=pTokenEntity; return; }

	@Override
	public int OnAdd(Productline pPOJO){

		this.sDao.add(pPOJO,"N_");

		return 0;
	}
	@Override
	public int OnModify(Productline pPOJO, String pID){

		this.sDao.modify(pPOJO,this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public int OnDelete(String pID){

		this.sDao.deletereal(this.sApp_Code.ToInt32(pID,0));

		return 0;
	}
	@Override
	public List<Productline> getFindAll(){

		List<Productline> tmpLIST = this.sDao.findAll();

		return tmpLIST;
	}
	@Override
	public Productline OnNormal(String pId){

		List<Productline> tmpList = this.sDao.searchone(this.sApp_Code.ToInt32(pId,0));
		if (tmpList.size() <= 0) {
			return new Productline();
		}

		return (Productline) tmpList.get(0);
	}

	/**/
	@Override
	public List<Map<String,Object>> searchWithProductlineorderdetail(){
		int Coun0;
		int tmpId;
		Map<String ,Object> tmpMapRow;
		List<Productlineorderdetail> tmpListOrderdetail;
		Productlineorderdetail tmpPojoOrderdetail;

		List<Map<String,Object>> tmpListReturn=this.sDao.searchWithProductlineorderdetail();

		Coun0=0;
		while(tmpListReturn.size()>Coun0){
			tmpMapRow=tmpListReturn.get(Coun0);
			tmpId=this.sApp_Code.ToInt32(tmpMapRow.get("pltID").toString(),0);
			tmpListOrderdetail=this.sDaoOrderdetail.searchLastComplete(tmpId);
			if(tmpListOrderdetail.size()>0) {
				tmpPojoOrderdetail=(Productlineorderdetail)tmpListOrderdetail.get(0);
				tmpMapRow.put("LastEndTime", this.sApp_Code.GetDString(this.sApp_Code.ObjectToString(tmpPojoOrderdetail.getPlodtCompleteTime()),"",3));
			}
			tmpListReturn.set(Coun0,tmpMapRow);
			Coun0++;
		}

		return tmpListReturn;
	}
	@Override
	public List<Map<String,Object>> searchById(int pId){
		return this.sDao.searchById(pId);
	}




}
