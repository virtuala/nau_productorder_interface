package com.nets.productorder.coreentity.entity;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Map;
import nets.unionnets.java_lib.util.Func.netsCode;

public class DataProductline {
	public String sTableDir="Cms";
	public String sTableName="productline";
	public String t="productline";
	public String sColumnHead="plt";
	public String sColumnHead1="";
	public String c="plt";
	public String c1="";
	protected SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	protected netsCode sApp_Code=netsCode.getInstance();
	public Map<String,String> sColumnOther;

	/* column set */
	//pltID
	private Integer pltID;
	private Boolean pltID_isset=false;
	private String pltID_orderby;
	private Boolean pltID_hascolumn=false;
	private String pltID_operators;
	public Integer getPltID() { return pltID; }
	public void setPltID(Integer pltID) { this.pltID=pltID; this.pltID_isset=true; }
	public void setPltID_Fix(String pltID) { this.pltID=this.sApp_Code.ToInt32(pltID,0); this.pltID_isset=true; }
	//pltName
	private String pltName;
	private Boolean pltName_isset=false;
	private String pltName_orderby;
	private Boolean pltName_hascolumn=false;
	private String pltName_operators;
	public String getPltName() { return pltName; }
	public void setPltName(String pltName) { this.pltName=pltName; this.pltName_isset=true; }
	public void setPltName_Fix(String pltName) { this.pltName=pltName; this.pltName_isset=true; }
	//pltNumCode
	private String pltNumCode;
	private Boolean pltNumCode_isset=false;
	private String pltNumCode_orderby;
	private Boolean pltNumCode_hascolumn=false;
	private String pltNumCode_operators;
	public String getPltNumCode() { return pltNumCode; }
	public void setPltNumCode(String pltNumCode) { this.pltNumCode=pltNumCode; this.pltNumCode_isset=true; }
	public void setPltNumCode_Fix(String pltNumCode) { this.pltNumCode=pltNumCode; this.pltNumCode_isset=true; }
	//pltProductivity
	private Float pltProductivity;
	private Boolean pltProductivity_isset=false;
	private String pltProductivity_orderby;
	private Boolean pltProductivity_hascolumn=false;
	private String pltProductivity_operators;
	public Float getPltProductivity() { return pltProductivity; }
	public void setPltProductivity(Float pltProductivity) { this.pltProductivity=pltProductivity; this.pltProductivity_isset=true; }
	public void setPltProductivity_Fix(String pltProductivity) { this.pltProductivity=this.sApp_Code.ToFloat(pltProductivity,0.00F); this.pltProductivity_isset=true; }
	//pltCreateBy
	private Integer pltCreateBy;
	private Boolean pltCreateBy_isset=false;
	private String pltCreateBy_orderby;
	private Boolean pltCreateBy_hascolumn=false;
	private String pltCreateBy_operators;
	public Integer getPltCreateBy() { return pltCreateBy; }
	public void setPltCreateBy(Integer pltCreateBy) { this.pltCreateBy=pltCreateBy; this.pltCreateBy_isset=true; }
	public void setPltCreateBy_Fix(String pltCreateBy) { this.pltCreateBy=this.sApp_Code.ToInt32(pltCreateBy,0); this.pltCreateBy_isset=true; }
	//pltCreateTime
	private Date pltCreateTime;
	private Boolean pltCreateTime_isset=false;
	private String pltCreateTime_orderby;
	private Boolean pltCreateTime_hascolumn=false;
	private String pltCreateTime_operators;
	public Date getPltCreateTime() { return pltCreateTime; }
	public void setPltCreateTime(Date pltCreateTime) { this.pltCreateTime=pltCreateTime; this.pltCreateTime_isset=true; }
	public void setPltCreateTime_Fix(String pltCreateTime) { this.pltCreateTime=this.sApp_Code.ToDatetime(pltCreateTime,this.sDateFormat.format(new Date())); this.pltCreateTime_isset=true; }
	//pltModifyBy
	private Integer pltModifyBy;
	private Boolean pltModifyBy_isset=false;
	private String pltModifyBy_orderby;
	private Boolean pltModifyBy_hascolumn=false;
	private String pltModifyBy_operators;
	public Integer getPltModifyBy() { return pltModifyBy; }
	public void setPltModifyBy(Integer pltModifyBy) { this.pltModifyBy=pltModifyBy; this.pltModifyBy_isset=true; }
	public void setPltModifyBy_Fix(String pltModifyBy) { this.pltModifyBy=this.sApp_Code.ToInt32(pltModifyBy,0); this.pltModifyBy_isset=true; }
	//pltModifyTime
	private Date pltModifyTime;
	private Boolean pltModifyTime_isset=false;
	private String pltModifyTime_orderby;
	private Boolean pltModifyTime_hascolumn=false;
	private String pltModifyTime_operators;
	public Date getPltModifyTime() { return pltModifyTime; }
	public void setPltModifyTime(Date pltModifyTime) { this.pltModifyTime=pltModifyTime; this.pltModifyTime_isset=true; }
	public void setPltModifyTime_Fix(String pltModifyTime) { this.pltModifyTime=this.sApp_Code.ToDatetime(pltModifyTime,this.sDateFormat.format(new Date())); this.pltModifyTime_isset=true; }




	/* column text extend */
	//pltID_Text
	private String pltID_Text;
	public String getPltID_Text() { if(this.pltID==null){ this.pltID_Text=""; } if(this.pltID_Text==null){ this.pltID_Text=this.pltID.toString(); } return this.pltID_Text; }
	public void setPltID_Text(String pltID_Text) { this.pltID_Text=pltID_Text; }
	//pltCreateBy_Text
	private String pltCreateBy_Text;
	public String getPltCreateBy_Text() { if(this.pltCreateBy==null){ this.pltCreateBy_Text=""; } if(this.pltCreateBy_Text==null){ this.pltCreateBy_Text=this.pltCreateBy.toString(); } return this.pltCreateBy_Text; }
	public void setPltCreateBy_Text(String pltCreateBy_Text) { this.pltCreateBy_Text=pltCreateBy_Text; }
	//pltModifyBy_Text
	private String pltModifyBy_Text;
	public String getPltModifyBy_Text() { if(this.pltModifyBy==null){ this.pltModifyBy_Text=""; } if(this.pltModifyBy_Text==null){ this.pltModifyBy_Text=this.pltModifyBy.toString(); } return this.pltModifyBy_Text; }
	public void setPltModifyBy_Text(String pltModifyBy_Text) { this.pltModifyBy_Text=pltModifyBy_Text; }




	/* quick set */
	public int setValue(String pKey,String pValue){
		if(1==2){
		}else if(pKey.equals("ID")){ this.setPltID_Fix(pValue);
		}else if(pKey.equals("Name")){ this.setPltName_Fix(pValue);
		}else if(pKey.equals("NumCode")){ this.setPltNumCode_Fix(pValue);
		}else if(pKey.equals("Productivity")){ this.setPltProductivity_Fix(pValue);
		}else if(pKey.equals("CreateBy")){ this.setPltCreateBy_Fix(pValue);
		}else if(pKey.equals("CreateTime")){ this.setPltCreateTime_Fix(pValue);
		}else if(pKey.equals("ModifyBy")){ this.setPltModifyBy_Fix(pValue);
		}else if(pKey.equals("ModifyTime")){ this.setPltModifyTime_Fix(pValue);




		}
		return 0;
	}
	public String getValue(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.getPltID()+"";
		}else if(pKey.equals("Name")){ return this.getPltName()+"";
		}else if(pKey.equals("NumCode")){ return this.getPltNumCode()+"";
		}else if(pKey.equals("Productivity")){ return this.getPltProductivity()+"";
		}else if(pKey.equals("CreateBy")){ return this.getPltCreateBy()+"";
		}else if(pKey.equals("CreateTime")){ return this.getPltCreateTime()+"";
		}else if(pKey.equals("ModifyBy")){ return this.getPltModifyBy()+"";
		}else if(pKey.equals("ModifyTime")){ return this.getPltModifyTime()+"";




		}
		return "";
	}
	public Boolean getIsset(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.pltID_isset;
		}else if(pKey.equals("Name")){ return this.pltName_isset;
		}else if(pKey.equals("NumCode")){ return this.pltNumCode_isset;
		}else if(pKey.equals("Productivity")){ return this.pltProductivity_isset;
		}else if(pKey.equals("CreateBy")){ return this.pltCreateBy_isset;
		}else if(pKey.equals("CreateTime")){ return this.pltCreateTime_isset;
		}else if(pKey.equals("ModifyBy")){ return this.pltModifyBy_isset;
		}else if(pKey.equals("ModifyTime")){ return this.pltModifyTime_isset;




		}
		return false;
	}
	public String getOrderBy(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.pltID_orderby;
		}else if(pKey.equals("Name")){ return this.pltName_orderby;
		}else if(pKey.equals("NumCode")){ return this.pltNumCode_orderby;
		}else if(pKey.equals("Productivity")){ return this.pltProductivity_orderby;
		}else if(pKey.equals("CreateBy")){ return this.pltCreateBy_orderby;
		}else if(pKey.equals("CreateTime")){ return this.pltCreateTime_orderby;
		}else if(pKey.equals("ModifyBy")){ return this.pltModifyBy_orderby;
		}else if(pKey.equals("ModifyTime")){ return this.pltModifyTime_orderby;




		}
		return "";
	}
	public Boolean getHasColumn(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.pltID_hascolumn;
		}else if(pKey.equals("Name")){ return this.pltName_hascolumn;
		}else if(pKey.equals("NumCode")){ return this.pltNumCode_hascolumn;
		}else if(pKey.equals("Productivity")){ return this.pltProductivity_hascolumn;
		}else if(pKey.equals("CreateBy")){ return this.pltCreateBy_hascolumn;
		}else if(pKey.equals("CreateTime")){ return this.pltCreateTime_hascolumn;
		}else if(pKey.equals("ModifyBy")){ return this.pltModifyBy_hascolumn;
		}else if(pKey.equals("ModifyTime")){ return this.pltModifyTime_hascolumn;




		}
		return false;
	}
	public String getOperators(String pKey){
		if(1==2){
		}else if(pKey.equals("ID")){ return this.pltID_operators;
		}else if(pKey.equals("Name")){ return this.pltName_operators;
		}else if(pKey.equals("NumCode")){ return this.pltNumCode_operators;
		}else if(pKey.equals("Productivity")){ return this.pltProductivity_operators;
		}else if(pKey.equals("CreateBy")){ return this.pltCreateBy_operators;
		}else if(pKey.equals("CreateTime")){ return this.pltCreateTime_operators;
		}else if(pKey.equals("ModifyBy")){ return this.pltModifyBy_operators;
		}else if(pKey.equals("ModifyTime")){ return this.pltModifyTime_operators;




		}
		return "";
	}



	/***/
	

}
