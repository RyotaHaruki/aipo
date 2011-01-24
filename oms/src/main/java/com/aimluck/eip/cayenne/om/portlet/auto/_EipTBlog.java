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

import java.util.List;

/** Class _EipTBlog was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTBlog extends org.apache.cayenne.CayenneDataObject {

    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String OWNER_ID_PROPERTY = "ownerId";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String EIP_TBLOG_ENTRYS_PROPERTY = "eipTBlogEntrys";
    public static final String EIP_TBLOG_FOOTMARK_MAPS_PROPERTY = "eipTBlogFootmarkMaps";

    public static final String BLOG_ID_PK_COLUMN = "BLOG_ID";

    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setOwnerId(Integer ownerId) {
        writeProperty("ownerId", ownerId);
    }
    public Integer getOwnerId() {
        return (Integer)readProperty("ownerId");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void addToEipTBlogEntrys(com.aimluck.eip.cayenne.om.portlet.EipTBlogEntry obj) {
        addToManyTarget("eipTBlogEntrys", obj, true);
    }
    public void removeFromEipTBlogEntrys(com.aimluck.eip.cayenne.om.portlet.EipTBlogEntry obj) {
        removeToManyTarget("eipTBlogEntrys", obj, true);
    }
    public List getEipTBlogEntrys() {
        return (List)readProperty("eipTBlogEntrys");
    }
    
    
    public void addToEipTBlogFootmarkMaps(com.aimluck.eip.cayenne.om.portlet.EipTBlogFootmarkMap obj) {
        addToManyTarget("eipTBlogFootmarkMaps", obj, true);
    }
    public void removeFromEipTBlogFootmarkMaps(com.aimluck.eip.cayenne.om.portlet.EipTBlogFootmarkMap obj) {
        removeToManyTarget("eipTBlogFootmarkMaps", obj, true);
    }
    public List getEipTBlogFootmarkMaps() {
        return (List)readProperty("eipTBlogFootmarkMaps");
    }
    
    
}
