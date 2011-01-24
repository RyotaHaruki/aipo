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

/** Class _EipMMailAccount was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipMMailAccount extends org.apache.cayenne.CayenneDataObject {

    public static final String ACCOUNT_NAME_PROPERTY = "accountName";
    public static final String ACCOUNT_TYPE_PROPERTY = "accountType";
    public static final String AUTH_RECEIVE_FLG_PROPERTY = "authReceiveFlg";
    public static final String AUTH_SEND_FLG_PROPERTY = "authSendFlg";
    public static final String AUTH_SEND_USER_ID_PROPERTY = "authSendUserId";
    public static final String AUTH_SEND_USER_PASSWD_PROPERTY = "authSendUserPasswd";
    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String DEFAULT_FOLDER_ID_PROPERTY = "defaultFolderId";
    public static final String DEL_AT_POP3BEFORE_DAYS_PROPERTY = "delAtPop3BeforeDays";
    public static final String DEL_AT_POP3BEFORE_DAYS_FLG_PROPERTY = "delAtPop3BeforeDaysFlg";
    public static final String DEL_AT_POP3FLG_PROPERTY = "delAtPop3Flg";
    public static final String LAST_RECEIVED_DATE_PROPERTY = "lastReceivedDate";
    public static final String MAIL_ADDRESS_PROPERTY = "mailAddress";
    public static final String MAIL_USER_NAME_PROPERTY = "mailUserName";
    public static final String NON_RECEIVED_FLG_PROPERTY = "nonReceivedFlg";
    public static final String POP3ENCRYPTION_FLG_PROPERTY = "pop3EncryptionFlg";
    public static final String POP3PORT_PROPERTY = "pop3Port";
    public static final String POP3PASSWORD_PROPERTY = "pop3password";
    public static final String POP3SERVER_NAME_PROPERTY = "pop3serverName";
    public static final String POP3USER_NAME_PROPERTY = "pop3userName";
    public static final String SIGNATURE_PROPERTY = "signature";
    public static final String SMTP_ENCRYPTION_FLG_PROPERTY = "smtpEncryptionFlg";
    public static final String SMTP_PORT_PROPERTY = "smtpPort";
    public static final String SMTPSERVER_NAME_PROPERTY = "smtpserverName";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String USER_ID_PROPERTY = "userId";

    public static final String ACCOUNT_ID_PK_COLUMN = "ACCOUNT_ID";

    public void setAccountName(String accountName) {
        writeProperty("accountName", accountName);
    }
    public String getAccountName() {
        return (String)readProperty("accountName");
    }
    
    
    public void setAccountType(String accountType) {
        writeProperty("accountType", accountType);
    }
    public String getAccountType() {
        return (String)readProperty("accountType");
    }
    
    
    public void setAuthReceiveFlg(Short authReceiveFlg) {
        writeProperty("authReceiveFlg", authReceiveFlg);
    }
    public Short getAuthReceiveFlg() {
        return (Short)readProperty("authReceiveFlg");
    }
    
    
    public void setAuthSendFlg(Short authSendFlg) {
        writeProperty("authSendFlg", authSendFlg);
    }
    public Short getAuthSendFlg() {
        return (Short)readProperty("authSendFlg");
    }
    
    
    public void setAuthSendUserId(String authSendUserId) {
        writeProperty("authSendUserId", authSendUserId);
    }
    public String getAuthSendUserId() {
        return (String)readProperty("authSendUserId");
    }
    
    
    public void setAuthSendUserPasswd(byte[] authSendUserPasswd) {
        writeProperty("authSendUserPasswd", authSendUserPasswd);
    }
    public byte[] getAuthSendUserPasswd() {
        return (byte[])readProperty("authSendUserPasswd");
    }
    
    
    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setDefaultFolderId(Integer defaultFolderId) {
        writeProperty("defaultFolderId", defaultFolderId);
    }
    public Integer getDefaultFolderId() {
        return (Integer)readProperty("defaultFolderId");
    }
    
    
    public void setDelAtPop3BeforeDays(Integer delAtPop3BeforeDays) {
        writeProperty("delAtPop3BeforeDays", delAtPop3BeforeDays);
    }
    public Integer getDelAtPop3BeforeDays() {
        return (Integer)readProperty("delAtPop3BeforeDays");
    }
    
    
    public void setDelAtPop3BeforeDaysFlg(String delAtPop3BeforeDaysFlg) {
        writeProperty("delAtPop3BeforeDaysFlg", delAtPop3BeforeDaysFlg);
    }
    public String getDelAtPop3BeforeDaysFlg() {
        return (String)readProperty("delAtPop3BeforeDaysFlg");
    }
    
    
    public void setDelAtPop3Flg(String delAtPop3Flg) {
        writeProperty("delAtPop3Flg", delAtPop3Flg);
    }
    public String getDelAtPop3Flg() {
        return (String)readProperty("delAtPop3Flg");
    }
    
    
    public void setLastReceivedDate(java.util.Date lastReceivedDate) {
        writeProperty("lastReceivedDate", lastReceivedDate);
    }
    public java.util.Date getLastReceivedDate() {
        return (java.util.Date)readProperty("lastReceivedDate");
    }
    
    
    public void setMailAddress(String mailAddress) {
        writeProperty("mailAddress", mailAddress);
    }
    public String getMailAddress() {
        return (String)readProperty("mailAddress");
    }
    
    
    public void setMailUserName(String mailUserName) {
        writeProperty("mailUserName", mailUserName);
    }
    public String getMailUserName() {
        return (String)readProperty("mailUserName");
    }
    
    
    public void setNonReceivedFlg(String nonReceivedFlg) {
        writeProperty("nonReceivedFlg", nonReceivedFlg);
    }
    public String getNonReceivedFlg() {
        return (String)readProperty("nonReceivedFlg");
    }
    
    
    public void setPop3EncryptionFlg(Short pop3EncryptionFlg) {
        writeProperty("pop3EncryptionFlg", pop3EncryptionFlg);
    }
    public Short getPop3EncryptionFlg() {
        return (Short)readProperty("pop3EncryptionFlg");
    }
    
    
    public void setPop3Port(String pop3Port) {
        writeProperty("pop3Port", pop3Port);
    }
    public String getPop3Port() {
        return (String)readProperty("pop3Port");
    }
    
    
    public void setPop3password(byte[] pop3password) {
        writeProperty("pop3password", pop3password);
    }
    public byte[] getPop3password() {
        return (byte[])readProperty("pop3password");
    }
    
    
    public void setPop3serverName(String pop3serverName) {
        writeProperty("pop3serverName", pop3serverName);
    }
    public String getPop3serverName() {
        return (String)readProperty("pop3serverName");
    }
    
    
    public void setPop3userName(String pop3userName) {
        writeProperty("pop3userName", pop3userName);
    }
    public String getPop3userName() {
        return (String)readProperty("pop3userName");
    }
    
    
    public void setSignature(String signature) {
        writeProperty("signature", signature);
    }
    public String getSignature() {
        return (String)readProperty("signature");
    }
    
    
    public void setSmtpEncryptionFlg(Short smtpEncryptionFlg) {
        writeProperty("smtpEncryptionFlg", smtpEncryptionFlg);
    }
    public Short getSmtpEncryptionFlg() {
        return (Short)readProperty("smtpEncryptionFlg");
    }
    
    
    public void setSmtpPort(String smtpPort) {
        writeProperty("smtpPort", smtpPort);
    }
    public String getSmtpPort() {
        return (String)readProperty("smtpPort");
    }
    
    
    public void setSmtpserverName(String smtpserverName) {
        writeProperty("smtpserverName", smtpserverName);
    }
    public String getSmtpserverName() {
        return (String)readProperty("smtpserverName");
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
