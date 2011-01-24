/*
 * Aipo is a groupware program developed by Aimluck,Inc.
 * Copyright (C) 2004-2011 Aimluck,Inc.
 * http://www.aipo.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.aimluck.eip.cayenne.om.portlet.auto;

/** Class _EipMMailNotifyConf was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipMMailNotifyConf extends org.apache.cayenne.CayenneDataObject {

    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String NOTIFY_FLG_PROPERTY = "notifyFlg";
    public static final String NOTIFY_TIME_PROPERTY = "notifyTime";
    public static final String NOTIFY_TYPE_PROPERTY = "notifyType";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String USER_ID_PROPERTY = "userId";

    public static final String NOTIFY_ID_PK_COLUMN = "NOTIFY_ID";

    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setNotifyFlg(Integer notifyFlg) {
        writeProperty("notifyFlg", notifyFlg);
    }
    public Integer getNotifyFlg() {
        return (Integer)readProperty("notifyFlg");
    }
    
    
    public void setNotifyTime(java.util.Date notifyTime) {
        writeProperty("notifyTime", notifyTime);
    }
    public java.util.Date getNotifyTime() {
        return (java.util.Date)readProperty("notifyTime");
    }
    
    
    public void setNotifyType(Integer notifyType) {
        writeProperty("notifyType", notifyType);
    }
    public Integer getNotifyType() {
        return (Integer)readProperty("notifyType");
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
    
    
}
