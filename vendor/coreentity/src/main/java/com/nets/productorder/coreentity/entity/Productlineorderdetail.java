package com.nets.productorder.coreentity.entity;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Map;
import nets.unionnets.java_lib.util.Func.netsCode;

public class Productlineorderdetail {
	public String sTableDir="Cms";
	public String sTableName="productlineorderdetail";
	public String t="productlineorderdetail";
	public String sColumnHead="plodt";
	public String sColumnHead1="";
	public String c="plodt";
	public String c1="";
	protected SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	protected netsCode sApp_Code=netsCode.getInstance();
	public Map<String,String> sColumnOther;

	/* column set */
	//plodtID
	private Integer plodtID;
	private Boolean plodtID_isset=false;
	private String plodtID_orderby;
	private Boolean plodtID_hascolumn=false;
	private String plodtID_operators;
	public Integer getPlodtID() { return plodtID; }
	public void setPlodtID(Integer plodtID) { this.plodtID=plodtID; this.plodtID_isset=true; }
	public void setPlodtID_Fix(String plodtID) { this.plodtID=this.sApp_Code.ToInt32(plodtID,0); this.plodtID_isset=true; }
	//plodtNumCode
	private String plodtNumCode;
	private Boolean plodtNumCode_isset=false;
	private String plodtNumCode_orderby;
	private Boolean plodtNumCode_hascolumn=false;
	private String plodtNumCode_operators;
	public String getPlodtNumCode() { return plodtNumCode; }
	public void setPlodtNumCode(String plodtNumCode) { this.plodtNumCode=plodtNumCode; this.plodtNumCode_isset=true; }
	public void setPlodtNumCode_Fix(String plodtNumCode) { this.plodtNumCode=plodtNumCode; this.plodtNumCode_isset=true; }
	//plodtProductID
	private Integer plodtProductID;
	private Boolean plodtProductID_isset=false;
	private String plodtProductID_orderby;
	private Boolean plodtProductID_hascolumn=false;
	private String plodtProductID_operators;
	public Integer getPlodtProductID() { return plodtProductID; }
	public void setPlodtProductID(Integer plodtProductID) { this.plodtProductID=plodtProductID; this.plodtProductID_isset=true; }
	public void setPlodtProductID_Fix(String plodtProductID) { this.plodtProductID=this.sApp_Code.ToInt32(plodtProductID,0); this.plodtProductID_isset=true; }
	//plodtProductlineID
	private Integer plodtProductlineID;
	private Boolean plodtProductlineID_isset=false;
	private String plodtProductlineID_orderby;
	private Boolean plodtProductlineID_hascolumn=false;
	private String plodtProductlineID_operators;
	public Integer getPlodtProductlineID() { return plodtProductlineID; }
	public void setPlodtProductlineID(Integer plodtProductlineID) { this.plodtProductlineID=plodtProductlineID; this.plodtProductlineID_isset=true; }
	public void setPlodtProductlineID_Fix(String plodtProductlineID) { this.plodtProductlineID=this.sApp_Code.ToInt32(plodtProductlineID,0); this.plodtProductlineID_isset=true; }
	//plodtOrderdetailID
	private Integer plodtOrderdetailID;
	private Boolean plodtOrderdetailID_isset=false;
	private String plodtOrderdetailID_orderby;
	private Boolean plodtOrderdetailID_hascolumn=false;
	private String plodtOrderdetailID_operators;
	public Integer getPlodtOrderdetailID() { return plodtOrderdetailID; }
	public void setPlodtOrderdetailID(Integer plodtOrderdetailID) { this.plodtOrderdetailID=plodtOrderdetailID; this.plodtOrderdetailID_isset=true; }
	public void setPlodtOrderdetailID_Fix(String plodtOrderdetailID) { this.plodtOrderdetailID=this.sApp_Code.ToInt32(plodtOrderdetailID,0); this.plodtOrderdetailID_isset=true; }
	//plodtStatus
	private Integer plodtStatus;
	private Boolean plodtStatus_isset=false;
	private String plodtStatus_orderby;
	private Boolean plodtStatus_hascolumn=false;
	private String plodtStatus_operators;
	public Integer getPlodtStatus() { return plodtStatus; }
	public void setPlodtStatus(Integer plodtStatus) { this.plodtStatus=plodtStatus; this.plodtStatus_isset=true; }
	public void setPlodtStatus_Fix(String plodtStatus) { this.plodtStatus=this.sApp_Code.ToInt32(plodtStatus,0); this.plodtStatus_isset=true; }
	//plodtCount
	private Integer plodtCount;
	private Boolean plodtCount_isset=false;
	private String plodtCount_orderby;
	private Boolean plodtCount_hascolumn=false;
	private String plodtCount_operators;
	public Integer getPlodtCount() { return plodtCount; }
	public void setPlodtCount(Integer plodtCount) { this.plodtCount=plodtCount; this.plodtCount_isset=true; }
	public void setPlodtCount_Fix(String plodtCount) { this.plodtCount=this.sApp_Code.ToInt32(plodtCount,0); this.plodtCount_isset=true; }
	//plodtCompleteTime
	private Date plodtCompleteTime;
	private Boolean plodtCompleteTime_isset=false;
	private String plodtCompleteTime_orderby;
	private Boolean plodtCompleteTime_hascolumn=false;
	private String plodtCompleteTime_operators;
	public Date getPlodtCompleteTime() { return plodtCompleteTime; }
	public void setPlodtCompleteTime(Date plodtCompleteTime) { this.plodtCompleteTime=plodtCompleteTime; this.plodtCompleteTime_isset=true; }
	public void setPlodtCompleteTime_Fix(String plodtCompleteTime) { this.plodtCompleteTime=this.sApp_Code.ToDatetime(plodtCompleteTime,this.sDateFormat.format(new Date())); this.plodtCompleteTime_isset=true; }
	//plodtCreateBy
	private Integer plodtCreateBy;
	private Boolean plodtCreateBy_isset=false;
	private String plodtCreateBy_orderby;
	private Boolean plodtCreateBy_hascolumn=false;
	private String plodtCreateBy_operators;
	public Integer getPlodtCreateBy() { return plodtCreateBy; }
	public void setPlodtCreateBy(Integer plodtCreateBy) { this.plodtCreateBy=plodtCreateBy; this.plodtCreateBy_isset=true; }
	public void setPlodtCreateBy_Fix(String plodtCreateBy) { this.plodtCreateBy=this.sApp_Code.ToInt32(plodtCreateBy,0); this.plodtCreateBy_isset=true; }
	//plodtCreateTime
	private Date plodtCreateTime;
	private Boolean plodtCreateTime_isset=false;
	private String plodtCreateTime_orderby;
	private Boolean plodtCreateTime_hascolumn=false;
	private String plodtCreateTime_operators;
	public Date getPlodtCreateTime() { return plodtCreateTime; }
	public void setPlodtCreateTime(Date plodtCreateTime) { this.plodtCreateTime=plodtCreateTime; this.plodtCreateTime_isset=true; }
	public void setPlodtCreateTime_Fix(String plodtCreateTime) { this.plodtCreateTime=this.sApp_Code.ToDatetime(plodtCreateTime,this.sDateFormat.format(new Date())); this.plodtCreateTime_isset=true; }
	//plodtModifyBy
	private Integer plodtModifyBy;
	private Boolean plodtModifyBy_isset=false;
	private String plodtModifyBy_orderby;
	private Boolean plodtModifyBy_hascolumn=false;
	private String plodtModifyBy_operators;
	public Integer getPlodtModifyBy() { return plodtModifyBy; }
	public void setPlodtModifyBy(Integer plodtModifyBy) { this.plodtModifyBy=plodtModifyBy; this.plodtModifyBy_isset=true; }
	public void setPlodtModifyBy_Fix(String plodtModifyBy) { this.plodtModifyBy=this.sApp_Code.ToInt32(plodtModifyBy,0); this.plodtModifyBy_isset=true; }
	//plodtModifyTime
	private Date plodtModifyTime;
	private Boolean plodtModifyTime_isset=false;
	private String plodtModifyTime_orderby;
	private Boolean plodtModifyTime_hascolumn=false;
	private String plodtModifyTime_operators;
	public Date getPlodtModifyTime() { return plodtModifyTime; }
	public void setPlodtModifyTime(Date plodtModifyTime) { this.plodtModifyTime=plodtModifyTime; this.plodtModifyTime_isset=true; }
	public void setPlodtModifyTime_Fix(String plodtModifyTime) { this.plodtModifyTime=this.sApp_Code.ToDatetime(plodtModifyTime,this.sDateFormat.format(new Date())); this.plodtModifyTime_isset=true; }




	/* column text extend */
	//plodtID_Text
	private String plodtID_Text;
	public String getPlodtID_Text() { if(this.plodtID==null){ this.plodtID_Text=""; } if(this.plodtID_Text==null){ this.plodtID_Text=this.plodtID.toString(); } return this.plodtID_Text; }
	public void setPlodtID_Text(String plodtID_Text) { this.plodtID_Text=plodtID_Text; }
	//plodtProductID_Text
	private String plodtProductID_Text;
	public String getPlodtProductID_Text() { if(this.plodtProductID==null){ this.plodtProductID_Text=""; } if(this.plodtProductID_Text==null){ this.plodtProductID_Text=this.plodtProductID.toString(); } return this.plodtProductID_Text; }
	public void setPlodtProductID_Text(String plodtProductID_Text) { this.plodtProductID_Text=plodtProductID_Text; }
	//plodtProductlineID_Text
	private String plodtProductlineID_Text;
	public String getPlodtProductlineID_Text() { if(this.plodtProductlineID==null){ this.plodtProductlineID_Text=""; } if(this.plodtProductlineID_Text==null){ this.plodtProductlineID_Text=this.plodtProductlineID.toString(); } return this.plodtProductlineID_Text; }
	public void setPlodtProductlineID_Text(String plodtProductlineID_Text) { this.plodtProductlineID_Text=plodtProductlineID_Text; }
	//plodtOrderdetailID_Text
	private String plodtOrderdetailID_Text;
	public String getPlodtOrderdetailID_Text() { if(this.plodtOrderdetailID==null){ this.plodtOrderdetailID_Text=""; } if(this.plodtOrderdetailID_Text==null){ this.plodtOrderdetailID_Text=this.plodtOrderdetailID.toString(); } return this.plodtOrderdetailID_Text; }
	public void setPlodtOrderdetailID_Text(String plodtOrderdetailID_Text) { this.plodtOrderdetailID_Text=plodtOrderdetailID_Text; }
	//plodtStatus_Text
	private String plodtStatus_Text;
	public String getPlodtStatus_Text() { if(this.plodtStatus==null){ this.plodtStatus_Text=""; } if(this.plodtStatus_Text==null){ this.plodtStatus_Text=this.plodtStatus.toString(); } return this.plodtStatus_Text; }
	public void setPlodtStatus_Text(String plodtStatus_Text) { this.plodtStatus_Text=plodtStatus_Text; }
	//plodtCount_Text
	private String plodtCount_Text;
	public String getPlodtCount_Text() { if(this.plodtCount==null){ this.plodtCount_Text=""; } if(this.plodtCount_Text==null){ this.plodtCount_Text=this.plodtCount.toString(); } return this.plodtCount_Text; }
	public void setPlodtCount_Text(String plodtCount_Text) { this.plodtCount_Text=plodtCount_Text; }
	//plodtCreateBy_Text
	private String plodtCreateBy_Text;
	public String getPlodtCreateBy_Text() { if(this.plodtCreateBy==null){ this.plodtCreateBy_Text=""; } if(this.plodtCreateBy_Text==null){ this.plodtCreateBy_Text=this.plodtCreateBy.toString(); } return this.plodtCreateBy_Text; }
	public void setPlodtCreateBy_Text(String plodtCreateBy_Text) { this.plodtCreateBy_Text=plodtCreateBy_Text; }
	//plodtModifyBy_Text
	private String plodtModifyBy_Text;
	public String getPlodtModifyBy_Text() { if(this.plodtModifyBy==null){ this.plodtModifyBy_Text=""; } if(this.plodtModifyBy_Text==null){ this.plodtModifyBy_Text=this.plodtModifyBy.toString(); } return this.plodtModifyBy_Text; }
	public void setPlodtModifyBy_Text(String plodtModifyBy_Text) { this.plodtModifyBy_Text=plodtModifyBy_Text; }




	/* quick set */
	public int setValue(String pKey,String pValue){
		if(1==2){
		}else if(pKey.equals("ID")){ this.setPlodtID_Fix(pValue);
		}else if(pKey.equals("NumCode")){ this.setPlodtNumCode_Fix(pValue);
		}else if(pKey.equals("ProductID")){ this.setPlodtProductID_Fix(pValue);
		}else if(pKey.equals("ProductlineID")){ this.setPlodtProductlineID_Fix(pValue);
		}else if(pKey.equals("OrderdetailID")){ this.setPlodtOrderdetailID_Fix(pValue);
		}else if(pKey.equals("Status")){ this.setPlodtStatus_Fix(pValue);
		}else if(pKey.equals("Count")){ this.setPlodtCount_Fix(pValue);
		}else if(pKey.equals("CompleteTime")){ this.setPlodtCompleteTime_Fix(pValue);
		}else if(pKey.equals("CreateBy")){ this.setPlodtCreateBy_Fix(pValue);
		}else if(pKey.equals("CreateTime")){ this.setPlodtCreateTime_Fix(pValue);
		}else if(pKey.equals("ModifyBy")){ this.setPlodtModifyBy_Fix(pValue);
		}else if(pKey.equals("ModifyTime")){ this.setPlodtModifyTime_Fix(pValue);




		}
		return 0;
	}
	public String getValue(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.getPlodtID()+"";
		}else if(pKey.equals("NumCode")){ return this.getPlodtNumCode()+"";
		}else if(pKey.equals("ProductID")){ return this.getPlodtProductID()+"";
		}else if(pKey.equals("ProductlineID")){ return this.getPlodtProductlineID()+"";
		}else if(pKey.equals("OrderdetailID")){ return this.getPlodtOrderdetailID()+"";
		}else if(pKey.equals("Status")){ return this.getPlodtStatus()+"";
		}else if(pKey.equals("Count")){ return this.getPlodtCount()+"";
		}else if(pKey.equals("CompleteTime")){ return this.getPlodtCompleteTime()+"";
		}else if(pKey.equals("CreateBy")){ return this.getPlodtCreateBy()+"";
		}else if(pKey.equals("CreateTime")){ return this.getPlodtCreateTime()+"";
		}else if(pKey.equals("ModifyBy")){ return this.getPlodtModifyBy()+"";
		}else if(pKey.equals("ModifyTime")){ return this.getPlodtModifyTime()+"";




		}
		return "";
	}
	public Boolean getIsset(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.plodtID_isset;
		}else if(pKey.equals("NumCode")){ return this.plodtNumCode_isset;
		}else if(pKey.equals("ProductID")){ return this.plodtProductID_isset;
		}else if(pKey.equals("ProductlineID")){ return this.plodtProductlineID_isset;
		}else if(pKey.equals("OrderdetailID")){ return this.plodtOrderdetailID_isset;
		}else if(pKey.equals("Status")){ return this.plodtStatus_isset;
		}else if(pKey.equals("Count")){ return this.plodtCount_isset;
		}else if(pKey.equals("CompleteTime")){ return this.plodtCompleteTime_isset;
		}else if(pKey.equals("CreateBy")){ return this.plodtCreateBy_isset;
		}else if(pKey.equals("CreateTime")){ return this.plodtCreateTime_isset;
		}else if(pKey.equals("ModifyBy")){ return this.plodtModifyBy_isset;
		}else if(pKey.equals("ModifyTime")){ return this.plodtModifyTime_isset;




		}
		return false;
	}
	public String getOrderBy(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.plodtID_orderby;
		}else if(pKey.equals("NumCode")){ return this.plodtNumCode_orderby;
		}else if(pKey.equals("ProductID")){ return this.plodtProductID_orderby;
		}else if(pKey.equals("ProductlineID")){ return this.plodtProductlineID_orderby;
		}else if(pKey.equals("OrderdetailID")){ return this.plodtOrderdetailID_orderby;
		}else if(pKey.equals("Status")){ return this.plodtStatus_orderby;
		}else if(pKey.equals("Count")){ return this.plodtCount_orderby;
		}else if(pKey.equals("CompleteTime")){ return this.plodtCompleteTime_orderby;
		}else if(pKey.equals("CreateBy")){ return this.plodtCreateBy_orderby;
		}else if(pKey.equals("CreateTime")){ return this.plodtCreateTime_orderby;
		}else if(pKey.equals("ModifyBy")){ return this.plodtModifyBy_orderby;
		}else if(pKey.equals("ModifyTime")){ return this.plodtModifyTime_orderby;




		}
		return "";
	}
	public Boolean getHasColumn(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.plodtID_hascolumn;
		}else if(pKey.equals("NumCode")){ return this.plodtNumCode_hascolumn;
		}else if(pKey.equals("ProductID")){ return this.plodtProductID_hascolumn;
		}else if(pKey.equals("ProductlineID")){ return this.plodtProductlineID_hascolumn;
		}else if(pKey.equals("OrderdetailID")){ return this.plodtOrderdetailID_hascolumn;
		}else if(pKey.equals("Status")){ return this.plodtStatus_hascolumn;
		}else if(pKey.equals("Count")){ return this.plodtCount_hascolumn;
		}else if(pKey.equals("CompleteTime")){ return this.plodtCompleteTime_hascolumn;
		}else if(pKey.equals("CreateBy")){ return this.plodtCreateBy_hascolumn;
		}else if(pKey.equals("CreateTime")){ return this.plodtCreateTime_hascolumn;
		}else if(pKey.equals("ModifyBy")){ return this.plodtModifyBy_hascolumn;
		}else if(pKey.equals("ModifyTime")){ return this.plodtModifyTime_hascolumn;




		}
		return false;
	}
	public String getOperators(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.plodtID_operators;
		}else if(pKey.equals("NumCode")){ return this.plodtNumCode_operators;
		}else if(pKey.equals("ProductID")){ return this.plodtProductID_operators;
		}else if(pKey.equals("ProductlineID")){ return this.plodtProductlineID_operators;
		}else if(pKey.equals("OrderdetailID")){ return this.plodtOrderdetailID_operators;
		}else if(pKey.equals("Status")){ return this.plodtStatus_operators;
		}else if(pKey.equals("Count")){ return this.plodtCount_operators;
		}else if(pKey.equals("CompleteTime")){ return this.plodtCompleteTime_operators;
		}else if(pKey.equals("CreateBy")){ return this.plodtCreateBy_operators;
		}else if(pKey.equals("CreateTime")){ return this.plodtCreateTime_operators;
		}else if(pKey.equals("ModifyBy")){ return this.plodtModifyBy_operators;
		}else if(pKey.equals("ModifyTime")){ return this.plodtModifyTime_operators;




		}
		return "";
	}



	/***/
	

}
