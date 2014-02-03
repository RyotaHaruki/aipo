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

package com.aimluck.eip.wiki;

import java.util.Date;

import com.aimluck.commons.field.ALDateTimeField;
import com.aimluck.commons.field.ALNumberField;
import com.aimluck.commons.field.ALStringField;
import com.aimluck.eip.common.ALData;
import com.aimluck.eip.util.ALCommonUtils;
import com.aimluck.eip.util.ALEipUtils;

/**
 * 掲示板トピックのResultData <BR>
 * 
 */
public class WikiResultData implements ALData {

  /** トピック ID */
  private ALNumberField id;

  /** トピック名 */
  private ALStringField name;

  /** カテゴリ ID */
  private ALNumberField category_id;

  /** カテゴリ名 */
  private ALStringField category_name;

  /** 公開/非公開フラグ */
  private boolean is_public;

  /** 新着フラグ */
  private boolean new_wiki;

  /** メモ */
  private ALStringField note;

  /** 登録者名 */
  private ALStringField create_user;

  /** 更新者名 */
  private ALStringField update_user;

  /** 登録日 */
  private ALDateTimeField create_date;

  /** 更新日 */
  private ALDateTimeField update_date;

  /**
   *
   *
   */
  @Override
  public void initField() {
    id = new ALNumberField();
    name = new ALStringField();
    category_id = new ALNumberField();
    category_name = new ALStringField();

    note = new ALStringField();
    note.setTrim(false);
    create_user = new ALStringField();
    update_user = new ALStringField();
    create_date = new ALDateTimeField();
    update_date = new ALDateTimeField();

    is_public = true;
    new_wiki = false;
  }

  /**
   * @return
   */
  public ALNumberField getId() {
    return id;
  }

  /**
   * @param i
   */
  public void setId(long i) {
    id.setValue(i);
  }

  /**
   * @return
   */
  public String getName() {
    return name.toString();
  }

  public String getNameHtml() {
    return ALCommonUtils.replaceToAutoCR(name.toString());
  }

  /**
   * @param string
   */
  public void setName(String string) {
    name.setValue(string);
  }

  /**
   * @param i
   */
  public void setCategoryId(long i) {
    category_id.setValue(i);
  }

  /**
   * @param string
   */
  public void setCategoryName(String string) {
    category_name.setValue(string);
  }

  /**
   * @return
   */
  public ALNumberField getCategoryId() {
    return category_id;
  }

  /**
   * @return
   */
  public String getCategoryName() {
    return category_name.toString();
  }

  public String getCategoryNameHtml() {
    return ALCommonUtils.replaceToAutoCR(category_name.toString());
  }

  /**
   * @return
   */
  public String getNote() {
    return ALEipUtils.getMessageList(note.getValue());
  }

  /**
   * @param string
   */
  public void setNote(String string) {
    note.setValue(string);
  }

  /**
   * @return
   */
  public ALDateTimeField getCreateDate() {
    return ALEipUtils.getFormattedTime(create_date);
  }

  /**
   * @return
   */
  public ALDateTimeField getUpdateDate() {
    return ALEipUtils.getFormattedTime(update_date);
  }

  /**
   * @param string
   */
  public void setCreateDate(Date date) {
    create_date.setValue(date);
  }

  /**
   * @param string
   */
  public void setUpdateDate(Date date) {
    if (date == null) {
      return;
    }
    this.update_date.setValue(date);
  }

  public ALStringField getCreateUser() {
    return create_user;
  }

  public void setCreateUser(String str) {
    create_user.setValue(str);
  }

  public ALStringField getUpdateUser() {
    return update_user;
  }

  public void setUpdateUser(String str) {
    update_user.setValue(str);
  }

  /**
   * 公開/非公開フラグ．
   * 
   * @return
   */
  public boolean isPublic() {
    return is_public;
  }

  /**
   * @return
   */
  public void setPublicFlag(boolean bool) {
    is_public = bool;
  }

  public boolean isNew() {
    return new_wiki;
  }

  public void setNewFlag(boolean bool) {
    new_wiki = bool;
  }
}