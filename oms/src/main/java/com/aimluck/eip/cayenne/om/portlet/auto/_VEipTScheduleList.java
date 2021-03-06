package com.aimluck.eip.cayenne.om.portlet.auto;

/** Class _VEipTScheduleList was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _VEipTScheduleList extends org.apache.cayenne.CayenneDataObject {

    public static final String COMMON_CATEGORY_ID_PROPERTY = "commonCategoryId";
    public static final String CREATE_USER_ID_PROPERTY = "createUserId";
    public static final String EDIT_FLAG_PROPERTY = "editFlag";
    public static final String END_DATE_PROPERTY = "endDate";
    public static final String NAME_PROPERTY = "name";
    public static final String NOTE_PROPERTY = "note";
    public static final String OWNER_ID_PROPERTY = "ownerId";
    public static final String PARENT_ID_PROPERTY = "parentId";
    public static final String PLACE_PROPERTY = "place";
    public static final String PUBLIC_FLAG_PROPERTY = "publicFlag";
    public static final String REPEAT_PATTERN_PROPERTY = "repeatPattern";
    public static final String SCHEDULE_ID_PROPERTY = "scheduleId";
    public static final String START_DATE_PROPERTY = "startDate";
    public static final String STATUS_PROPERTY = "status";
    public static final String TYPE_PROPERTY = "type";
    public static final String USER_ID_PROPERTY = "userId";

    public static final String ID_PK_COLUMN = "ID";

    public void setCommonCategoryId(Integer commonCategoryId) {
        writeProperty("commonCategoryId", commonCategoryId);
    }
    public Integer getCommonCategoryId() {
        return (Integer)readProperty("commonCategoryId");
    }
    
    
    public void setCreateUserId(Integer createUserId) {
        writeProperty("createUserId", createUserId);
    }
    public Integer getCreateUserId() {
        return (Integer)readProperty("createUserId");
    }
    
    
    public void setEditFlag(String editFlag) {
        writeProperty("editFlag", editFlag);
    }
    public String getEditFlag() {
        return (String)readProperty("editFlag");
    }
    
    
    public void setEndDate(java.util.Date endDate) {
        writeProperty("endDate", endDate);
    }
    public java.util.Date getEndDate() {
        return (java.util.Date)readProperty("endDate");
    }
    
    
    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }
    
    
    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }
    
    
    public void setOwnerId(Integer ownerId) {
        writeProperty("ownerId", ownerId);
    }
    public Integer getOwnerId() {
        return (Integer)readProperty("ownerId");
    }
    
    
    public void setParentId(Integer parentId) {
        writeProperty("parentId", parentId);
    }
    public Integer getParentId() {
        return (Integer)readProperty("parentId");
    }
    
    
    public void setPlace(String place) {
        writeProperty("place", place);
    }
    public String getPlace() {
        return (String)readProperty("place");
    }
    
    
    public void setPublicFlag(String publicFlag) {
        writeProperty("publicFlag", publicFlag);
    }
    public String getPublicFlag() {
        return (String)readProperty("publicFlag");
    }
    
    
    public void setRepeatPattern(String repeatPattern) {
        writeProperty("repeatPattern", repeatPattern);
    }
    public String getRepeatPattern() {
        return (String)readProperty("repeatPattern");
    }
    
    
    public void setScheduleId(Integer scheduleId) {
        writeProperty("scheduleId", scheduleId);
    }
    public Integer getScheduleId() {
        return (Integer)readProperty("scheduleId");
    }
    
    
    public void setStartDate(java.util.Date startDate) {
        writeProperty("startDate", startDate);
    }
    public java.util.Date getStartDate() {
        return (java.util.Date)readProperty("startDate");
    }
    
    
    public void setStatus(String status) {
        writeProperty("status", status);
    }
    public String getStatus() {
        return (String)readProperty("status");
    }
    
    
    public void setType(String type) {
        writeProperty("type", type);
    }
    public String getType() {
        return (String)readProperty("type");
    }
    
    
    public void setUserId(Integer userId) {
        writeProperty("userId", userId);
    }
    public Integer getUserId() {
        return (Integer)readProperty("userId");
    }
    
    
}
