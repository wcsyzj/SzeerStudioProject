package com.qinhailin.portal.szeerback.service;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Record;
import com.qinhailin.common.base.service.BaseService;
import com.qinhailin.common.model.WebdataHomepage;
import com.qinhailin.common.vo.Grid;


public class HomePageService extends BaseService {

	private WebdataHomepage homepagedao = new WebdataHomepage().dao();
	
	@Override
	public Model<?> getDao() {
		// TODO Auto-generated method stub
		return homepagedao;
	}

	public Grid page(int pageNumber, int pageSize, Record record) {
		Record rd = new Record();
		//先不写查询条件
		String sql= "select * from webdata_homepage";
		//不写逻辑判断
		rd.set("name =", record.getStr("name"));
		return queryForList(sql,pageNumber, pageSize, rd, null);

	}
}
