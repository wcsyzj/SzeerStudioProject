package com.qinhailin.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseWebdataHeader<M extends BaseWebdataHeader<M>> extends Model<M> implements IBean {

	/**
	 * header主键
	 */
	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	/**
	 * header主键
	 */
	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	 * 栏目名称
	 */
	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	/**
	 * 栏目名称
	 */
	public java.lang.String getName() {
		return getStr("name");
	}

	/**
	 * 栏目url
	 */
	public M setUrl(java.lang.String url) {
		set("url", url);
		return (M)this;
	}
	
	/**
	 * 栏目url
	 */
	public java.lang.String getUrl() {
		return getStr("url");
	}

}
