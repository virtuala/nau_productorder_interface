package com.nets.productorder.coreentity.entity;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Map;
import nets.unionnets.java_lib.util.Func.netsCode;

public class Userrole {
	public String sTableDir="Cms";
	public String sTableName="userrole";
	public String t="userrole";
	public String sColumnHead="uirt";
	public String sColumnHead1="";
	public String c="uirt";
	public String c1="";
	protected SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	protected netsCode sApp_Code=netsCode.getInstance();
	public Map<String,String> sColumnOther;

	/* column set */
	//uirtID
	private Integer uirtID;
	private Boolean uirtID_isset=false;
	private String uirtID_orderby;
	private Boolean uirtID_hascolumn=false;
	private String uirtID_operators;
	public Integer getUirtID() { return uirtID; }
	public void setUirtID(Integer uirtID) { this.uirtID=uirtID; this.uirtID_isset=true; }
	public void setUirtID_Fix(String uirtID) { this.uirtID=this.sApp_Code.ToInt32(uirtID,0); this.uirtID_isset=true; }
	//uirtName
	private String uirtName;
	private Boolean uirtName_isset=false;
	private String uirtName_orderby;
	private Boolean uirtName_hascolumn=false;
	private String uirtName_operators;
	public String getUirtName() { return uirtName; }
	public void setUirtName(String uirtName) { this.uirtName=uirtName; this.uirtName_isset=true; }
	public void setUirtName_Fix(String uirtName) { this.uirtName=uirtName; this.uirtName_isset=true; }
	//uirtNumCode
	private String uirtNumCode;
	private Boolean uirtNumCode_isset=false;
	private String uirtNumCode_orderby;
	private Boolean uirtNumCode_hascolumn=false;
	private String uirtNumCode_operators;
	public String getUirtNumCode() { return uirtNumCode; }
	public void setUirtNumCode(String uirtNumCode) { this.uirtNumCode=uirtNumCode; this.uirtNumCode_isset=true; }
	public void setUirtNumCode_Fix(String uirtNumCode) { this.uirtNumCode=uirtNumCode; this.uirtNumCode_isset=true; }
	//uirtType
	private Integer uirtType;
	private Boolean uirtType_isset=false;
	private String uirtType_orderby;
	private Boolean uirtType_hascolumn=false;
	private String uirtType_operators;
	public Integer getUirtType() { return uirtType; }
	public void setUirtType(Integer uirtType) { this.uirtType=uirtType; this.uirtType_isset=true; }
	public void setUirtType_Fix(String uirtType) { this.uirtType=this.sApp_Code.ToInt32(uirtType,0); this.uirtType_isset=true; }
	//uirtPower
	private String uirtPower;
	private Boolean uirtPower_isset=false;
	private String uirtPower_orderby;
	private Boolean uirtPower_hascolumn=false;
	private String uirtPower_operators;
	public String getUirtPower() { return uirtPower; }
	public void setUirtPower(String uirtPower) { this.uirtPower=uirtPower; this.uirtPower_isset=true; }
	public void setUirtPower_Fix(String uirtPower) { this.uirtPower=uirtPower; this.uirtPower_isset=true; }
	//uirtCreateBy
	private Integer uirtCreateBy;
	private Boolean uirtCreateBy_isset=false;
	private String uirtCreateBy_orderby;
	private Boolean uirtCreateBy_hascolumn=false;
	private String uirtCreateBy_operators;
	public Integer getUirtCreateBy() { return uirtCreateBy; }
	public void setUirtCreateBy(Integer uirtCreateBy) { this.uirtCreateBy=uirtCreateBy; this.uirtCreateBy_isset=true; }
	public void setUirtCreateBy_Fix(String uirtCreateBy) { this.uirtCreateBy=this.sApp_Code.ToInt32(uirtCreateBy,0); this.uirtCreateBy_isset=true; }
	//uirtCreateTime
	private Date uirtCreateTime;
	private Boolean uirtCreateTime_isset=false;
	private String uirtCreateTime_orderby;
	private Boolean uirtCreateTime_hascolumn=false;
	private String uirtCreateTime_operators;
	public Date getUirtCreateTime() { return uirtCreateTime; }
	public void setUirtCreateTime(Date uirtCreateTime) { this.uirtCreateTime=uirtCreateTime; this.uirtCreateTime_isset=true; }
	public void setUirtCreateTime_Fix(String uirtCreateTime) { this.uirtCreateTime=this.sApp_Code.ToDatetime(uirtCreateTime,this.sDateFormat.format(new Date())); this.uirtCreateTime_isset=true; }
	//uirtModifyBy
	private Integer uirtModifyBy;
	private Boolean uirtModifyBy_isset=false;
	private String uirtModifyBy_orderby;
	private Boolean uirtModifyBy_hascolumn=false;
	private String uirtModifyBy_operators;
	public Integer getUirtModifyBy() { return uirtModifyBy; }
	public void setUirtModifyBy(Integer uirtModifyBy) { this.uirtModifyBy=uirtModifyBy; this.uirtModifyBy_isset=true; }
	public void setUirtModifyBy_Fix(String uirtModifyBy) { this.uirtModifyBy=this.sApp_Code.ToInt32(uirtModifyBy,0); this.uirtModifyBy_isset=true; }
	//uirtModifyTime
	private Date uirtModifyTime;
	private Boolean uirtModifyTime_isset=false;
	private String uirtModifyTime_orderby;
	private Boolean uirtModifyTime_hascolumn=false;
	private String uirtModifyTime_operators;
	public Date getUirtModifyTime() { return uirtModifyTime; }
	public void setUirtModifyTime(Date uirtModifyTime) { this.uirtModifyTime=uirtModifyTime; this.uirtModifyTime_isset=true; }
	public void setUirtModifyTime_Fix(String uirtModifyTime) { this.uirtModifyTime=this.sApp_Code.ToDatetime(uirtModifyTime,this.sDateFormat.format(new Date())); this.uirtModifyTime_isset=true; }




	/* column text extend */
	//uirtID_Text
	private String uirtID_Text;
	public String getUirtID_Text() { if(this.uirtID==null){ this.uirtID_Text=""; } if(this.uirtID_Text==null){ this.uirtID_Text=this.uirtID.toString(); } return this.uirtID_Text; }
	public void setUirtID_Text(String uirtID_Text) { this.uirtID_Text=uirtID_Text; }
	//uirtType_Text
	private String uirtType_Text;
	public String getUirtType_Text() { if(this.uirtType==null){ this.uirtType_Text=""; } if(this.uirtType_Text==null){ this.uirtType_Text=this.uirtType.toString(); } return this.uirtType_Text; }
	public void setUirtType_Text(String uirtType_Text) { this.uirtType_Text=uirtType_Text; }
	//uirtCreateBy_Text
	private String uirtCreateBy_Text;
	public String getUirtCreateBy_Text() { if(this.uirtCreateBy==null){ this.uirtCreateBy_Text=""; } if(this.uirtCreateBy_Text==null){ this.uirtCreateBy_Text=this.uirtCreateBy.toString(); } return this.uirtCreateBy_Text; }
	public void setUirtCreateBy_Text(String uirtCreateBy_Text) { this.uirtCreateBy_Text=uirtCreateBy_Text; }
	//uirtModifyBy_Text
	private String uirtModifyBy_Text;
	public String getUirtModifyBy_Text() { if(this.uirtModifyBy==null){ this.uirtModifyBy_Text=""; } if(this.uirtModifyBy_Text==null){ this.uirtModifyBy_Text=this.uirtModifyBy.toString(); } return this.uirtModifyBy_Text; }
	public void setUirtModifyBy_Text(String uirtModifyBy_Text) { this.uirtModifyBy_Text=uirtModifyBy_Text; }




	/* quick set */
	public int setValue(String pKey,String pValue){
		if(1==2){
		}else if(pKey.equals("ID")){ this.setUirtID_Fix(pValue);
		}else if(pKey.equals("Name")){ this.setUirtName_Fix(pValue);
		}else if(pKey.equals("NumCode")){ this.setUirtNumCode_Fix(pValue);
		}else if(pKey.equals("Type")){ this.setUirtType_Fix(pValue);
		}else if(pKey.equals("Power")){ this.setUirtPower_Fix(pValue);
		}else if(pKey.equals("CreateBy")){ this.setUirtCreateBy_Fix(pValue);
		}else if(pKey.equals("CreateTime")){ this.setUirtCreateTime_Fix(pValue);
		}else if(pKey.equals("ModifyBy")){ this.setUirtModifyBy_Fix(pValue);
		}else if(pKey.equals("ModifyTime")){ this.setUirtModifyTime_Fix(pValue);




		}
		return 0;
	}
	public String getValue(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.getUirtID()+"";
		}else if(pKey.equals("Name")){ return this.getUirtName()+"";
		}else if(pKey.equals("NumCode")){ return this.getUirtNumCode()+"";
		}else if(pKey.equals("Type")){ return this.getUirtType()+"";
		}else if(pKey.equals("Power")){ return this.getUirtPower()+"";
		}else if(pKey.equals("CreateBy")){ return this.getUirtCreateBy()+"";
		}else if(pKey.equals("CreateTime")){ return this.getUirtCreateTime()+"";
		}else if(pKey.equals("ModifyBy")){ return this.getUirtModifyBy()+"";
		}else if(pKey.equals("ModifyTime")){ return this.getUirtModifyTime()+"";




		}
		return "";
	}
	public Boolean getIsset(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.uirtID_isset;
		}else if(pKey.equals("Name")){ return this.uirtName_isset;
		}else if(pKey.equals("NumCode")){ return this.uirtNumCode_isset;
		}else if(pKey.equals("Type")){ return this.uirtType_isset;
		}else if(pKey.equals("Power")){ return this.uirtPower_isset;
		}else if(pKey.equals("CreateBy")){ return this.uirtCreateBy_isset;
		}else if(pKey.equals("CreateTime")){ return this.uirtCreateTime_isset;
		}else if(pKey.equals("ModifyBy")){ return this.uirtModifyBy_isset;
		}else if(pKey.equals("ModifyTime")){ return this.uirtModifyTime_isset;




		}
		return false;
	}
	public String getOrderBy(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.uirtID_orderby;
		}else if(pKey.equals("Name")){ return this.uirtName_orderby;
		}else if(pKey.equals("NumCode")){ return this.uirtNumCode_orderby;
		}else if(pKey.equals("Type")){ return this.uirtType_orderby;
		}else if(pKey.equals("Power")){ return this.uirtPower_orderby;
		}else if(pKey.equals("CreateBy")){ return this.uirtCreateBy_orderby;
		}else if(pKey.equals("CreateTime")){ return this.uirtCreateTime_orderby;
		}else if(pKey.equals("ModifyBy")){ return this.uirtModifyBy_orderby;
		}else if(pKey.equals("ModifyTime")){ return this.uirtModifyTime_orderby;




		}
		return "";
	}
	public Boolean getHasColumn(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.uirtID_hascolumn;
		}else if(pKey.equals("Name")){ return this.uirtName_hascolumn;
		}else if(pKey.equals("NumCode")){ return this.uirtNumCode_hascolumn;
		}else if(pKey.equals("Type")){ return this.uirtType_hascolumn;
		}else if(pKey.equals("Power")){ return this.uirtPower_hascolumn;
		}else if(pKey.equals("CreateBy")){ return this.uirtCreateBy_hascolumn;
		}else if(pKey.equals("CreateTime")){ return this.uirtCreateTime_hascolumn;
		}else if(pKey.equals("ModifyBy")){ return this.uirtModifyBy_hascolumn;
		}else if(pKey.equals("ModifyTime")){ return this.uirtModifyTime_hascolumn;




		}
		return false;
	}
	public String getOperators(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.uirtID_operators;
		}else if(pKey.equals("Name")){ return this.uirtName_operators;
		}else if(pKey.equals("NumCode")){ return this.uirtNumCode_operators;
		}else if(pKey.equals("Type")){ return this.uirtType_operators;
		}else if(pKey.equals("Power")){ return this.uirtPower_operators;
		}else if(pKey.equals("CreateBy")){ return this.uirtCreateBy_operators;
		}else if(pKey.equals("CreateTime")){ return this.uirtCreateTime_operators;
		}else if(pKey.equals("ModifyBy")){ return this.uirtModifyBy_operators;
		}else if(pKey.equals("ModifyTime")){ return this.uirtModifyTime_operators;




		}
		return "";
	}



	/***/
	

}
