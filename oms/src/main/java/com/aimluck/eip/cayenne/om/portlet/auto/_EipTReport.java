package com.aimluck.eip.cayenne.om.portlet.auto;

import java.util.List;

/** Class _EipTReport was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTReport extends org.apache.cayenne.CayenneDataObject {

    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String END_DATE_PROPERTY = "endDate";
    public static final String NOTE_PROPERTY = "note";
    public static final String PARENT_ID_PROPERTY = "parentId";
    public static final String REPORT_NAME_PROPERTY = "reportName";
    public static final String START_DATE_PROPERTY = "startDate";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String USER_ID_PROPERTY = "userId";
    public static final String EIP_TREPORT_FILES_PROPERTY = "eipTReportFiles";
    public static final String EIP_TREPORT_MAP_PROPERTY = "eipTReportMap";
    public static final String EIP_TREPORT_MEMBER_MAP_PROPERTY = "eipTReportMemberMap";
    public static final String TURBINE_USER_PROPERTY = "turbineUser";

    public static final String REPORT_ID_PK_COLUMN = "REPORT_ID";

    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setEndDate(java.util.Date endDate) {
        writeProperty("endDate", endDate);
    }
    public java.util.Date getEndDate() {
        return (java.util.Date)readProperty("endDate");
    }
    
    
    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }
    
    
    public void setParentId(Integer parentId) {
        writeProperty("parentId", parentId);
    }
    public Integer getParentId() {
        return (Integer)readProperty("parentId");
    }
    
    
    public void setReportName(String reportName) {
        writeProperty("reportName", reportName);
    }
    public String getReportName() {
        return (String)readProperty("reportName");
    }
    
    
    public void setStartDate(java.util.Date startDate) {
        writeProperty("startDate", startDate);
    }
    public java.util.Date getStartDate() {
        return (java.util.Date)readProperty("startDate");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void setUserId(Integer userId) {
        writeProperty("userId", userId);
    }
    public Integer getUserId() {
        return (Integer)readProperty("userId");
    }
    
    
    public void addToEipTReportFiles(com.aimluck.eip.cayenne.om.portlet.EipTReportFile obj) {
        addToManyTarget("eipTReportFiles", obj, true);
    }
    public void removeFromEipTReportFiles(com.aimluck.eip.cayenne.om.portlet.EipTReportFile obj) {
        removeToManyTarget("eipTReportFiles", obj, true);
    }
    public List getEipTReportFiles() {
        return (List)readProperty("eipTReportFiles");
    }
    
    
    public void addToEipTReportMap(com.aimluck.eip.cayenne.om.portlet.EipTReportMap obj) {
        addToManyTarget("eipTReportMap", obj, true);
    }
    public void removeFromEipTReportMap(com.aimluck.eip.cayenne.om.portlet.EipTReportMap obj) {
        removeToManyTarget("eipTReportMap", obj, true);
    }
    public List getEipTReportMap() {
        return (List)readProperty("eipTReportMap");
    }
    
    
    public void addToEipTReportMemberMap(com.aimluck.eip.cayenne.om.portlet.EipTReportMemberMap obj) {
        addToManyTarget("eipTReportMemberMap", obj, true);
    }
    public void removeFromEipTReportMemberMap(com.aimluck.eip.cayenne.om.portlet.EipTReportMemberMap obj) {
        removeToManyTarget("eipTReportMemberMap", obj, true);
    }
    public List getEipTReportMemberMap() {
        return (List)readProperty("eipTReportMemberMap");
    }
    
    
    public void setTurbineUser(com.aimluck.eip.cayenne.om.security.TurbineUser turbineUser) {
        setToOneTarget("turbineUser", turbineUser, true);
    }

    public com.aimluck.eip.cayenne.om.security.TurbineUser getTurbineUser() {
        return (com.aimluck.eip.cayenne.om.security.TurbineUser)readProperty("turbineUser");
    } 
    
    
}
