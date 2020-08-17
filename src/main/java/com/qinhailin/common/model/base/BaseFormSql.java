package com.qinhailin.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseFormSql<M extends BaseFormSql<M>> extends Model<M> implements IBean {

	/**
	 * 主键
	 */
	public M setId(java.lang.String id) {
		set("id", id);
		return (M)this;
	}
	
	/**
	 * 主键
	 */
	public java.lang.String getId() {
		return getStr("id");
	}

	/**
	 * 树id
	 */
	public M setTreeId(java.lang.String treeId) {
		set("tree_id", treeId);
		return (M)this;
	}
	
	/**
	 * 树id
	 */
	public java.lang.String getTreeId() {
		return getStr("tree_id");
	}

	/**
	 * sql编号
	 */
	public M setCode(java.lang.String code) {
		set("code", code);
		return (M)this;
	}
	
	/**
	 * sql编号
	 */
	public java.lang.String getCode() {
		return getStr("code");
	}

	/**
	 * sql名称
	 */
	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	/**
	 * sql名称
	 */
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	 * sql内容
	 */
	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}
	
	/**
	 * sql内容
	 */
	public java.lang.String getContent() {
		return getStr("content");
	}

	/**
	 * 创建时间
	 */
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}
	
	/**
	 * 创建时间
	 */
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	 * sql说明
	 */
	public M setDescp(java.lang.String descp) {
		set("descp", descp);
		return (M)this;
	}
	
	/**
	 * sql说明
	 */
	public java.lang.String getDescp() {
		return getStr("descp");
	}

}
