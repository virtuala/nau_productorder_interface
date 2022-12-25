package com.nets.productorder.coreentity.entity;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Map;
import nets.unionnets.java_lib.util.Func.netsCode;

public class Warehouse {
	public String sTableDir="Cms";
	public String sTableName="warehouse";
	public String t="warehouse";
	public String sColumnHead="wht";
	public String sColumnHead1="";
	public String c="wht";
	public String c1="";
	protected SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	protected netsCode sApp_Code=netsCode.getInstance();
	public Map<String,String> sColumnOther;

	/* column set */
	//whtID
	private Integer whtID;
	private Boolean whtID_isset=false;
	private String whtID_orderby;
	private Boolean whtID_hascolumn=false;
	private String whtID_operators;
	public Integer getWhtID() { return whtID; }
	public void setWhtID(Integer whtID) { this.whtID=whtID; this.whtID_isset=true; }
	public void setWhtID_Fix(String whtID) { this.whtID=this.sApp_Code.ToInt32(whtID,0); this.whtID_isset=true; }
	//whtName
	private String whtName;
	private Boolean whtName_isset=false;
	private String whtName_orderby;
	private Boolean whtName_hascolumn=false;
	private String whtName_operators;
	public String getWhtName() { return whtName; }
	public void setWhtName(String whtName) { this.whtName=whtName; this.whtName_isset=true; }
	public void setWhtName_Fix(String whtName) { this.whtName=whtName; this.whtName_isset=true; }
	//whtNumCode
	private String whtNumCode;
	private Boolean whtNumCode_isset=false;
	private String whtNumCode_orderby;
	private Boolean whtNumCode_hascolumn=false;
	private String whtNumCode_operators;
	public String getWhtNumCode() { return whtNumCode; }
	public void setWhtNumCode(String whtNumCode) { this.whtNumCode=whtNumCode; this.whtNumCode_isset=true; }
	public void setWhtNumCode_Fix(String whtNumCode) { this.whtNumCode=whtNumCode; this.whtNumCode_isset=true; }
	//whtCreateBy
	private Integer whtCreateBy;
	private Boolean whtCreateBy_isset=false;
	private String whtCreateBy_orderby;
	private Boolean whtCreateBy_hascolumn=false;
	private String whtCreateBy_operators;
	public Integer getWhtCreateBy() { return whtCreateBy; }
	public void setWhtCreateBy(Integer whtCreateBy) { this.whtCreateBy=whtCreateBy; this.whtCreateBy_isset=true; }
	public void setWhtCreateBy_Fix(String whtCreateBy) { this.whtCreateBy=this.sApp_Code.ToInt32(whtCreateBy,0); this.whtCreateBy_isset=true; }
	//whtCreateTime
	private Date whtCreateTime;
	private Boolean whtCreateTime_isset=false;
	private String whtCreateTime_orderby;
	private Boolean whtCreateTime_hascolumn=false;
	private String whtCreateTime_operators;
	public Date getWhtCreateTime() { return whtCreateTime; }
	public void setWhtCreateTime(Date whtCreateTime) { this.whtCreateTime=whtCreateTime; this.whtCreateTime_isset=true; }
	public void setWhtCreateTime_Fix(String whtCreateTime) { this.whtCreateTime=this.sApp_Code.ToDatetime(whtCreateTime,this.sDateFormat.format(new Date())); this.whtCreateTime_isset=true; }
	//whtModifyBy
	private Integer whtModifyBy;
	private Boolean whtModifyBy_isset=false;
	private String whtModifyBy_orderby;
	private Boolean whtModifyBy_hascolumn=false;
	private String whtModifyBy_operators;
	public Integer getWhtModifyBy() { return whtModifyBy; }
	public void setWhtModifyBy(Integer whtModifyBy) { this.whtModifyBy=whtModifyBy; this.whtModifyBy_isset=true; }
	public void setWhtModifyBy_Fix(String whtModifyBy) { this.whtModifyBy=this.sApp_Code.ToInt32(whtModifyBy,0); this.whtModifyBy_isset=true; }
	//whtModifyTime
	private Date whtModifyTime;
	private Boolean whtModifyTime_isset=false;
	private String whtModifyTime_orderby;
	private Boolean whtModifyTime_hascolumn=false;
	private String whtModifyTime_operators;
	public Date getWhtModifyTime() { return whtModifyTime; }
	public void setWhtModifyTime(Date whtModifyTime) { this.whtModifyTime=whtModifyTime; this.whtModifyTime_isset=true; }
	public void setWhtModifyTime_Fix(String whtModifyTime) { this.whtModifyTime=this.sApp_Code.ToDatetime(whtModifyTime,this.sDateFormat.format(new Date())); this.whtModifyTime_isset=true; }




	/* column text extend */
	//whtID_Text
	private String whtID_Text;
	public String getWhtID_Text() { if(this.whtID==null){ this.whtID_Text=""; } if(this.whtID_Text==null){ this.whtID_Text=this.whtID.toString(); } return this.whtID_Text; }
	public void setWhtID_Text(String whtID_Text) { this.whtID_Text=whtID_Text; }
	//whtCreateBy_Text
	private String whtCreateBy_Text;
	public String getWhtCreateBy_Text() { if(this.whtCreateBy==null){ this.whtCreateBy_Text=""; } if(this.whtCreateBy_Text==null){ this.whtCreateBy_Text=this.whtCreateBy.toString(); } return this.whtCreateBy_Text; }
	public void setWhtCreateBy_Text(String whtCreateBy_Text) { this.whtCreateBy_Text=whtCreateBy_Text; }
	//whtModifyBy_Text
	private String whtModifyBy_Text;
	public String getWhtModifyBy_Text() { if(this.whtModifyBy==null){ this.whtModifyBy_Text=""; } if(this.whtModifyBy_Text==null){ this.whtModifyBy_Text=this.whtModifyBy.toString(); } return this.whtModifyBy_Text; }
	public void setWhtModifyBy_Text(String whtModifyBy_Text) { this.whtModifyBy_Text=whtModifyBy_Text; }




	/* quick set */
	public int setValue(String pKey,String pValue){
		if(1==2){
		}else if(pKey.equals("ID")){ this.setWhtID_Fix(pValue);
		}else if(pKey.equals("Name")){ this.setWhtName_Fix(pValue);
		}else if(pKey.equals("NumCode")){ this.setWhtNumCode_Fix(pValue);
		}else if(pKey.equals("CreateBy")){ this.setWhtCreateBy_Fix(pValue);
		}else if(pKey.equals("CreateTime")){ this.setWhtCreateTime_Fix(pValue);
		}else if(pKey.equals("ModifyBy")){ this.setWhtModifyBy_Fix(pValue);
		}else if(pKey.equals("ModifyTime")){ this.setWhtModifyTime_Fix(pValue);




		}
		return 0;
	}
	public String getValue(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.getWhtID()+"";
		}else if(pKey.equals("Name")){ return this.getWhtName()+"";
		}else if(pKey.equals("NumCode")){ return this.getWhtNumCode()+"";
		}else if(pKey.equals("CreateBy")){ return this.getWhtCreateBy()+"";
		}else if(pKey.equals("CreateTime")){ return this.getWhtCreateTime()+"";
		}else if(pKey.equals("ModifyBy")){ return this.getWhtModifyBy()+"";
		}else if(pKey.equals("ModifyTime")){ return this.getWhtModifyTime()+"";




		}
		return "";
	}
	public Boolean getIsset(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.whtID_isset;
		}else if(pKey.equals("Name")){ return this.whtName_isset;
		}else if(pKey.equals("NumCode")){ return this.whtNumCode_isset;
		}else if(pKey.equals("CreateBy")){ return this.whtCreateBy_isset;
		}else if(pKey.equals("CreateTime")){ return this.whtCreateTime_isset;
		}else if(pKey.equals("ModifyBy")){ return this.whtModifyBy_isset;
		}else if(pKey.equals("ModifyTime")){ return this.whtModifyTime_isset;




		}
		return false;
	}
	public String getOrderBy(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.whtID_orderby;
		}else if(pKey.equals("Name")){ return this.whtName_orderby;
		}else if(pKey.equals("NumCode")){ return this.whtNumCode_orderby;
		}else if(pKey.equals("CreateBy")){ return this.whtCreateBy_orderby;
		}else if(pKey.equals("CreateTime")){ return this.whtCreateTime_orderby;
		}else if(pKey.equals("ModifyBy")){ return this.whtModifyBy_orderby;
		}else if(pKey.equals("ModifyTime")){ return this.whtModifyTime_orderby;




		}
		return "";
	}
	public Boolean getHasColumn(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.whtID_hascolumn;
		}else if(pKey.equals("Name")){ return this.whtName_hascolumn;
		}else if(pKey.equals("NumCode")){ return this.whtNumCode_hascolumn;
		}else if(pKey.equals("CreateBy")){ return this.whtCreateBy_hascolumn;
		}else if(pKey.equals("CreateTime")){ return this.whtCreateTime_hascolumn;
		}else if(pKey.equals("ModifyBy")){ return this.whtModifyBy_hascolumn;
		}else if(pKey.equals("ModifyTime")){ return this.whtModifyTime_hascolumn;




		}
		return false;
	}
	public String getOperators(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.whtID_operators;
		}else if(pKey.equals("Name")){ return this.whtName_operators;
		}else if(pKey.equals("NumCode")){ return this.whtNumCode_operators;
		}else if(pKey.equals("CreateBy")){ return this.whtCreateBy_operators;
		}else if(pKey.equals("CreateTime")){ return this.whtCreateTime_operators;
		}else if(pKey.equals("ModifyBy")){ return this.whtModifyBy_operators;
		}else if(pKey.equals("ModifyTime")){ return this.whtModifyTime_operators;




		}
		return "";
	}



	/***/
	

}
