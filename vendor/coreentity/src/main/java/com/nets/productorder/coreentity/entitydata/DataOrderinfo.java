package com.nets.productorder.coreentity.entity;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Map;
import nets.unionnets.java_lib.util.Func.netsCode;

public class DataOrderinfo {
	public String sTableDir="Cms";
	public String sTableName="orderinfo";
	public String t="orderinfo";
	public String sColumnHead="shsot";
	public String sColumnHead1="";
	public String c="shsot";
	public String c1="";
	protected SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	protected netsCode sApp_Code=netsCode.getInstance();
	public Map<String,String> sColumnOther;

	/* column set */
	//shsotID
	private Integer shsotID;
	private Boolean shsotID_isset=false;
	private String shsotID_orderby;
	private Boolean shsotID_hascolumn=false;
	private String shsotID_operators;
	public Integer getShsotID() { return shsotID; }
	public void setShsotID(Integer shsotID) { this.shsotID=shsotID; this.shsotID_isset=true; }
	public void setShsotID_Fix(String shsotID) { this.shsotID=this.sApp_Code.ToInt32(shsotID,0); this.shsotID_isset=true; }
	//shsotNumCode
	private String shsotNumCode;
	private Boolean shsotNumCode_isset=false;
	private String shsotNumCode_orderby;
	private Boolean shsotNumCode_hascolumn=false;
	private String shsotNumCode_operators;
	public String getShsotNumCode() { return shsotNumCode; }
	public void setShsotNumCode(String shsotNumCode) { this.shsotNumCode=shsotNumCode; this.shsotNumCode_isset=true; }
	public void setShsotNumCode_Fix(String shsotNumCode) { this.shsotNumCode=shsotNumCode; this.shsotNumCode_isset=true; }
	//shsotCreateBy
	private Integer shsotCreateBy;
	private Boolean shsotCreateBy_isset=false;
	private String shsotCreateBy_orderby;
	private Boolean shsotCreateBy_hascolumn=false;
	private String shsotCreateBy_operators;
	public Integer getShsotCreateBy() { return shsotCreateBy; }
	public void setShsotCreateBy(Integer shsotCreateBy) { this.shsotCreateBy=shsotCreateBy; this.shsotCreateBy_isset=true; }
	public void setShsotCreateBy_Fix(String shsotCreateBy) { this.shsotCreateBy=this.sApp_Code.ToInt32(shsotCreateBy,0); this.shsotCreateBy_isset=true; }
	//shsotCreateTime
	private Date shsotCreateTime;
	private Boolean shsotCreateTime_isset=false;
	private String shsotCreateTime_orderby;
	private Boolean shsotCreateTime_hascolumn=false;
	private String shsotCreateTime_operators;
	public Date getShsotCreateTime() { return shsotCreateTime; }
	public void setShsotCreateTime(Date shsotCreateTime) { this.shsotCreateTime=shsotCreateTime; this.shsotCreateTime_isset=true; }
	public void setShsotCreateTime_Fix(String shsotCreateTime) { this.shsotCreateTime=this.sApp_Code.ToDatetime(shsotCreateTime,this.sDateFormat.format(new Date())); this.shsotCreateTime_isset=true; }
	//shsotModifyBy
	private Integer shsotModifyBy;
	private Boolean shsotModifyBy_isset=false;
	private String shsotModifyBy_orderby;
	private Boolean shsotModifyBy_hascolumn=false;
	private String shsotModifyBy_operators;
	public Integer getShsotModifyBy() { return shsotModifyBy; }
	public void setShsotModifyBy(Integer shsotModifyBy) { this.shsotModifyBy=shsotModifyBy; this.shsotModifyBy_isset=true; }
	public void setShsotModifyBy_Fix(String shsotModifyBy) { this.shsotModifyBy=this.sApp_Code.ToInt32(shsotModifyBy,0); this.shsotModifyBy_isset=true; }
	//shsotModifyTime
	private Date shsotModifyTime;
	private Boolean shsotModifyTime_isset=false;
	private String shsotModifyTime_orderby;
	private Boolean shsotModifyTime_hascolumn=false;
	private String shsotModifyTime_operators;
	public Date getShsotModifyTime() { return shsotModifyTime; }
	public void setShsotModifyTime(Date shsotModifyTime) { this.shsotModifyTime=shsotModifyTime; this.shsotModifyTime_isset=true; }
	public void setShsotModifyTime_Fix(String shsotModifyTime) { this.shsotModifyTime=this.sApp_Code.ToDatetime(shsotModifyTime,this.sDateFormat.format(new Date())); this.shsotModifyTime_isset=true; }




	/* column text extend */
	//shsotID_Text
	private String shsotID_Text;
	public String getShsotID_Text() { if(this.shsotID==null){ this.shsotID_Text=""; } if(this.shsotID_Text==null){ this.shsotID_Text=this.shsotID.toString(); } return this.shsotID_Text; }
	public void setShsotID_Text(String shsotID_Text) { this.shsotID_Text=shsotID_Text; }
	//shsotCreateBy_Text
	private String shsotCreateBy_Text;
	public String getShsotCreateBy_Text() { if(this.shsotCreateBy==null){ this.shsotCreateBy_Text=""; } if(this.shsotCreateBy_Text==null){ this.shsotCreateBy_Text=this.shsotCreateBy.toString(); } return this.shsotCreateBy_Text; }
	public void setShsotCreateBy_Text(String shsotCreateBy_Text) { this.shsotCreateBy_Text=shsotCreateBy_Text; }
	//shsotModifyBy_Text
	private String shsotModifyBy_Text;
	public String getShsotModifyBy_Text() { if(this.shsotModifyBy==null){ this.shsotModifyBy_Text=""; } if(this.shsotModifyBy_Text==null){ this.shsotModifyBy_Text=this.shsotModifyBy.toString(); } return this.shsotModifyBy_Text; }
	public void setShsotModifyBy_Text(String shsotModifyBy_Text) { this.shsotModifyBy_Text=shsotModifyBy_Text; }




	/* quick set */
	public int setValue(String pKey,String pValue){
		if(1==2){
		}else if(pKey.equals("ID")){ this.setShsotID_Fix(pValue);
		}else if(pKey.equals("NumCode")){ this.setShsotNumCode_Fix(pValue);
		}else if(pKey.equals("CreateBy")){ this.setShsotCreateBy_Fix(pValue);
		}else if(pKey.equals("CreateTime")){ this.setShsotCreateTime_Fix(pValue);
		}else if(pKey.equals("ModifyBy")){ this.setShsotModifyBy_Fix(pValue);
		}else if(pKey.equals("ModifyTime")){ this.setShsotModifyTime_Fix(pValue);




		}
		return 0;
	}
	public String getValue(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.getShsotID()+"";
		}else if(pKey.equals("NumCode")){ return this.getShsotNumCode()+"";
		}else if(pKey.equals("CreateBy")){ return this.getShsotCreateBy()+"";
		}else if(pKey.equals("CreateTime")){ return this.getShsotCreateTime()+"";
		}else if(pKey.equals("ModifyBy")){ return this.getShsotModifyBy()+"";
		}else if(pKey.equals("ModifyTime")){ return this.getShsotModifyTime()+"";




		}
		return "";
	}
	public Boolean getIsset(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.shsotID_isset;
		}else if(pKey.equals("NumCode")){ return this.shsotNumCode_isset;
		}else if(pKey.equals("CreateBy")){ return this.shsotCreateBy_isset;
		}else if(pKey.equals("CreateTime")){ return this.shsotCreateTime_isset;
		}else if(pKey.equals("ModifyBy")){ return this.shsotModifyBy_isset;
		}else if(pKey.equals("ModifyTime")){ return this.shsotModifyTime_isset;




		}
		return false;
	}
	public String getOrderBy(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.shsotID_orderby;
		}else if(pKey.equals("NumCode")){ return this.shsotNumCode_orderby;
		}else if(pKey.equals("CreateBy")){ return this.shsotCreateBy_orderby;
		}else if(pKey.equals("CreateTime")){ return this.shsotCreateTime_orderby;
		}else if(pKey.equals("ModifyBy")){ return this.shsotModifyBy_orderby;
		}else if(pKey.equals("ModifyTime")){ return this.shsotModifyTime_orderby;




		}
		return "";
	}
	public Boolean getHasColumn(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.shsotID_hascolumn;
		}else if(pKey.equals("NumCode")){ return this.shsotNumCode_hascolumn;
		}else if(pKey.equals("CreateBy")){ return this.shsotCreateBy_hascolumn;
		}else if(pKey.equals("CreateTime")){ return this.shsotCreateTime_hascolumn;
		}else if(pKey.equals("ModifyBy")){ return this.shsotModifyBy_hascolumn;
		}else if(pKey.equals("ModifyTime")){ return this.shsotModifyTime_hascolumn;




		}
		return false;
	}
	public String getOperators(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.shsotID_operators;
		}else if(pKey.equals("NumCode")){ return this.shsotNumCode_operators;
		}else if(pKey.equals("CreateBy")){ return this.shsotCreateBy_operators;
		}else if(pKey.equals("CreateTime")){ return this.shsotCreateTime_operators;
		}else if(pKey.equals("ModifyBy")){ return this.shsotModifyBy_operators;
		}else if(pKey.equals("ModifyTime")){ return this.shsotModifyTime_operators;




		}
		return "";
	}



	/***/
	

}
