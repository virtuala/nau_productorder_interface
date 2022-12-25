package com.nets.productorder.coreentity.entity;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Map;
import nets.unionnets.java_lib.util.Func.netsCode;

public class DataUserinfo {
	public String sTableDir="Cms";
	public String sTableName="userinfo";
	public String t="userinfo";
	public String sColumnHead="uit";
	public String sColumnHead1="";
	public String c="uit";
	public String c1="";
	protected SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	protected netsCode sApp_Code=netsCode.getInstance();
	public Map<String,String> sColumnOther;

	/* column set */
	//uitID
	private Integer uitID;
	private Boolean uitID_isset=false;
	private String uitID_orderby;
	private Boolean uitID_hascolumn=false;
	private String uitID_operators;
	public Integer getUitID() { return uitID; }
	public void setUitID(Integer uitID) { this.uitID=uitID; this.uitID_isset=true; }
	public void setUitID_Fix(String uitID) { this.uitID=this.sApp_Code.ToInt32(uitID,0); this.uitID_isset=true; }
	//uitName
	private String uitName;
	private Boolean uitName_isset=false;
	private String uitName_orderby;
	private Boolean uitName_hascolumn=false;
	private String uitName_operators;
	public String getUitName() { return uitName; }
	public void setUitName(String uitName) { this.uitName=uitName; this.uitName_isset=true; }
	public void setUitName_Fix(String uitName) { this.uitName=uitName; this.uitName_isset=true; }
	//uitNumCode
	private String uitNumCode;
	private Boolean uitNumCode_isset=false;
	private String uitNumCode_orderby;
	private Boolean uitNumCode_hascolumn=false;
	private String uitNumCode_operators;
	public String getUitNumCode() { return uitNumCode; }
	public void setUitNumCode(String uitNumCode) { this.uitNumCode=uitNumCode; this.uitNumCode_isset=true; }
	public void setUitNumCode_Fix(String uitNumCode) { this.uitNumCode=uitNumCode; this.uitNumCode_isset=true; }
	//uitUserrole
	private Integer uitUserrole;
	private Boolean uitUserrole_isset=false;
	private String uitUserrole_orderby;
	private Boolean uitUserrole_hascolumn=false;
	private String uitUserrole_operators;
	public Integer getUitUserrole() { return uitUserrole; }
	public void setUitUserrole(Integer uitUserrole) { this.uitUserrole=uitUserrole; this.uitUserrole_isset=true; }
	public void setUitUserrole_Fix(String uitUserrole) { this.uitUserrole=this.sApp_Code.ToInt32(uitUserrole,0); this.uitUserrole_isset=true; }
	//uitPxd
	private String uitPxd;
	private Boolean uitPxd_isset=false;
	private String uitPxd_orderby;
	private Boolean uitPxd_hascolumn=false;
	private String uitPxd_operators;
	public String getUitPxd() { return uitPxd; }
	public void setUitPxd(String uitPxd) { this.uitPxd=uitPxd; this.uitPxd_isset=true; }
	public void setUitPxd_Fix(String uitPxd) { this.uitPxd=uitPxd; this.uitPxd_isset=true; }
	//uitMobile
	private String uitMobile;
	private Boolean uitMobile_isset=false;
	private String uitMobile_orderby;
	private Boolean uitMobile_hascolumn=false;
	private String uitMobile_operators;
	public String getUitMobile() { return uitMobile; }
	public void setUitMobile(String uitMobile) { this.uitMobile=uitMobile; this.uitMobile_isset=true; }
	public void setUitMobile_Fix(String uitMobile) { this.uitMobile=uitMobile; this.uitMobile_isset=true; }
	//uitEmail
	private String uitEmail;
	private Boolean uitEmail_isset=false;
	private String uitEmail_orderby;
	private Boolean uitEmail_hascolumn=false;
	private String uitEmail_operators;
	public String getUitEmail() { return uitEmail; }
	public void setUitEmail(String uitEmail) { this.uitEmail=uitEmail; this.uitEmail_isset=true; }
	public void setUitEmail_Fix(String uitEmail) { this.uitEmail=uitEmail; this.uitEmail_isset=true; }
	//uitCreateBy
	private Integer uitCreateBy;
	private Boolean uitCreateBy_isset=false;
	private String uitCreateBy_orderby;
	private Boolean uitCreateBy_hascolumn=false;
	private String uitCreateBy_operators;
	public Integer getUitCreateBy() { return uitCreateBy; }
	public void setUitCreateBy(Integer uitCreateBy) { this.uitCreateBy=uitCreateBy; this.uitCreateBy_isset=true; }
	public void setUitCreateBy_Fix(String uitCreateBy) { this.uitCreateBy=this.sApp_Code.ToInt32(uitCreateBy,0); this.uitCreateBy_isset=true; }
	//uitCreateTime
	private Date uitCreateTime;
	private Boolean uitCreateTime_isset=false;
	private String uitCreateTime_orderby;
	private Boolean uitCreateTime_hascolumn=false;
	private String uitCreateTime_operators;
	public Date getUitCreateTime() { return uitCreateTime; }
	public void setUitCreateTime(Date uitCreateTime) { this.uitCreateTime=uitCreateTime; this.uitCreateTime_isset=true; }
	public void setUitCreateTime_Fix(String uitCreateTime) { this.uitCreateTime=this.sApp_Code.ToDatetime(uitCreateTime,this.sDateFormat.format(new Date())); this.uitCreateTime_isset=true; }
	//uitModifyBy
	private Integer uitModifyBy;
	private Boolean uitModifyBy_isset=false;
	private String uitModifyBy_orderby;
	private Boolean uitModifyBy_hascolumn=false;
	private String uitModifyBy_operators;
	public Integer getUitModifyBy() { return uitModifyBy; }
	public void setUitModifyBy(Integer uitModifyBy) { this.uitModifyBy=uitModifyBy; this.uitModifyBy_isset=true; }
	public void setUitModifyBy_Fix(String uitModifyBy) { this.uitModifyBy=this.sApp_Code.ToInt32(uitModifyBy,0); this.uitModifyBy_isset=true; }
	//uitModifyTime
	private Date uitModifyTime;
	private Boolean uitModifyTime_isset=false;
	private String uitModifyTime_orderby;
	private Boolean uitModifyTime_hascolumn=false;
	private String uitModifyTime_operators;
	public Date getUitModifyTime() { return uitModifyTime; }
	public void setUitModifyTime(Date uitModifyTime) { this.uitModifyTime=uitModifyTime; this.uitModifyTime_isset=true; }
	public void setUitModifyTime_Fix(String uitModifyTime) { this.uitModifyTime=this.sApp_Code.ToDatetime(uitModifyTime,this.sDateFormat.format(new Date())); this.uitModifyTime_isset=true; }




	/* column text extend */
	//uitID_Text
	private String uitID_Text;
	public String getUitID_Text() { if(this.uitID==null){ this.uitID_Text=""; } if(this.uitID_Text==null){ this.uitID_Text=this.uitID.toString(); } return this.uitID_Text; }
	public void setUitID_Text(String uitID_Text) { this.uitID_Text=uitID_Text; }
	//uitUserrole_Text
	private String uitUserrole_Text;
	public String getUitUserrole_Text() { if(this.uitUserrole==null){ this.uitUserrole_Text=""; } if(this.uitUserrole_Text==null){ this.uitUserrole_Text=this.uitUserrole.toString(); } return this.uitUserrole_Text; }
	public void setUitUserrole_Text(String uitUserrole_Text) { this.uitUserrole_Text=uitUserrole_Text; }
	//uitCreateBy_Text
	private String uitCreateBy_Text;
	public String getUitCreateBy_Text() { if(this.uitCreateBy==null){ this.uitCreateBy_Text=""; } if(this.uitCreateBy_Text==null){ this.uitCreateBy_Text=this.uitCreateBy.toString(); } return this.uitCreateBy_Text; }
	public void setUitCreateBy_Text(String uitCreateBy_Text) { this.uitCreateBy_Text=uitCreateBy_Text; }
	//uitModifyBy_Text
	private String uitModifyBy_Text;
	public String getUitModifyBy_Text() { if(this.uitModifyBy==null){ this.uitModifyBy_Text=""; } if(this.uitModifyBy_Text==null){ this.uitModifyBy_Text=this.uitModifyBy.toString(); } return this.uitModifyBy_Text; }
	public void setUitModifyBy_Text(String uitModifyBy_Text) { this.uitModifyBy_Text=uitModifyBy_Text; }




	/* quick set */
	public int setValue(String pKey,String pValue){
		if(1==2){
		}else if(pKey.equals("ID")){ this.setUitID_Fix(pValue);
		}else if(pKey.equals("Name")){ this.setUitName_Fix(pValue);
		}else if(pKey.equals("NumCode")){ this.setUitNumCode_Fix(pValue);
		}else if(pKey.equals("Userrole")){ this.setUitUserrole_Fix(pValue);
		}else if(pKey.equals("Pxd")){ this.setUitPxd_Fix(pValue);
		}else if(pKey.equals("Mobile")){ this.setUitMobile_Fix(pValue);
		}else if(pKey.equals("Email")){ this.setUitEmail_Fix(pValue);
		}else if(pKey.equals("CreateBy")){ this.setUitCreateBy_Fix(pValue);
		}else if(pKey.equals("CreateTime")){ this.setUitCreateTime_Fix(pValue);
		}else if(pKey.equals("ModifyBy")){ this.setUitModifyBy_Fix(pValue);
		}else if(pKey.equals("ModifyTime")){ this.setUitModifyTime_Fix(pValue);




		}
		return 0;
	}
	public String getValue(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.getUitID()+"";
		}else if(pKey.equals("Name")){ return this.getUitName()+"";
		}else if(pKey.equals("NumCode")){ return this.getUitNumCode()+"";
		}else if(pKey.equals("Userrole")){ return this.getUitUserrole()+"";
		}else if(pKey.equals("Pxd")){ return this.getUitPxd()+"";
		}else if(pKey.equals("Mobile")){ return this.getUitMobile()+"";
		}else if(pKey.equals("Email")){ return this.getUitEmail()+"";
		}else if(pKey.equals("CreateBy")){ return this.getUitCreateBy()+"";
		}else if(pKey.equals("CreateTime")){ return this.getUitCreateTime()+"";
		}else if(pKey.equals("ModifyBy")){ return this.getUitModifyBy()+"";
		}else if(pKey.equals("ModifyTime")){ return this.getUitModifyTime()+"";




		}
		return "";
	}
	public Boolean getIsset(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.uitID_isset;
		}else if(pKey.equals("Name")){ return this.uitName_isset;
		}else if(pKey.equals("NumCode")){ return this.uitNumCode_isset;
		}else if(pKey.equals("Userrole")){ return this.uitUserrole_isset;
		}else if(pKey.equals("Pxd")){ return this.uitPxd_isset;
		}else if(pKey.equals("Mobile")){ return this.uitMobile_isset;
		}else if(pKey.equals("Email")){ return this.uitEmail_isset;
		}else if(pKey.equals("CreateBy")){ return this.uitCreateBy_isset;
		}else if(pKey.equals("CreateTime")){ return this.uitCreateTime_isset;
		}else if(pKey.equals("ModifyBy")){ return this.uitModifyBy_isset;
		}else if(pKey.equals("ModifyTime")){ return this.uitModifyTime_isset;




		}
		return false;
	}
	public String getOrderBy(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.uitID_orderby;
		}else if(pKey.equals("Name")){ return this.uitName_orderby;
		}else if(pKey.equals("NumCode")){ return this.uitNumCode_orderby;
		}else if(pKey.equals("Userrole")){ return this.uitUserrole_orderby;
		}else if(pKey.equals("Pxd")){ return this.uitPxd_orderby;
		}else if(pKey.equals("Mobile")){ return this.uitMobile_orderby;
		}else if(pKey.equals("Email")){ return this.uitEmail_orderby;
		}else if(pKey.equals("CreateBy")){ return this.uitCreateBy_orderby;
		}else if(pKey.equals("CreateTime")){ return this.uitCreateTime_orderby;
		}else if(pKey.equals("ModifyBy")){ return this.uitModifyBy_orderby;
		}else if(pKey.equals("ModifyTime")){ return this.uitModifyTime_orderby;




		}
		return "";
	}
	public Boolean getHasColumn(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.uitID_hascolumn;
		}else if(pKey.equals("Name")){ return this.uitName_hascolumn;
		}else if(pKey.equals("NumCode")){ return this.uitNumCode_hascolumn;
		}else if(pKey.equals("Userrole")){ return this.uitUserrole_hascolumn;
		}else if(pKey.equals("Pxd")){ return this.uitPxd_hascolumn;
		}else if(pKey.equals("Mobile")){ return this.uitMobile_hascolumn;
		}else if(pKey.equals("Email")){ return this.uitEmail_hascolumn;
		}else if(pKey.equals("CreateBy")){ return this.uitCreateBy_hascolumn;
		}else if(pKey.equals("CreateTime")){ return this.uitCreateTime_hascolumn;
		}else if(pKey.equals("ModifyBy")){ return this.uitModifyBy_hascolumn;
		}else if(pKey.equals("ModifyTime")){ return this.uitModifyTime_hascolumn;




		}
		return false;
	}
	public String getOperators(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.uitID_operators;
		}else if(pKey.equals("Name")){ return this.uitName_operators;
		}else if(pKey.equals("NumCode")){ return this.uitNumCode_operators;
		}else if(pKey.equals("Userrole")){ return this.uitUserrole_operators;
		}else if(pKey.equals("Pxd")){ return this.uitPxd_operators;
		}else if(pKey.equals("Mobile")){ return this.uitMobile_operators;
		}else if(pKey.equals("Email")){ return this.uitEmail_operators;
		}else if(pKey.equals("CreateBy")){ return this.uitCreateBy_operators;
		}else if(pKey.equals("CreateTime")){ return this.uitCreateTime_operators;
		}else if(pKey.equals("ModifyBy")){ return this.uitModifyBy_operators;
		}else if(pKey.equals("ModifyTime")){ return this.uitModifyTime_operators;




		}
		return "";
	}



	/***/
	

}
