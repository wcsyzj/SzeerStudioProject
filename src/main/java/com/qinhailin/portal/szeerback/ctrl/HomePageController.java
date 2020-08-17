package com.qinhailin.portal.szeerback.ctrl;

import com.jfinal.aop.Inject;
import com.jfinal.plugin.activerecord.Record;
import com.qinhailin.common.base.BaseController;
import com.qinhailin.common.routes.ControllerBind;
import com.qinhailin.portal.szeerback.service.HomePageService;

/*后面把这个地址换成根目录index*/
@ControllerBind(path = "/portal/szeerback")  
public class HomePageController extends BaseController {
	@Inject
	HomePageService hpService;

	public void index() {
		
		render("index.html");
	}
	
	public void list() {
		Record record = new Record();
		record.set("name", getPara("name"));
		renderJson(hpService.page(getParaToInt("pageNumber", 1), getParaToInt("pageSize", 10), record));
	}
	
}
