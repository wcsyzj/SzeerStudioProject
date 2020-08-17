package com.qinhailin.web.mainpage.ctrl;

import com.qinhailin.common.base.BaseController;
import com.qinhailin.common.routes.ControllerBind;

@ControllerBind(path = "/mainpage")
public class MainpageController extends BaseController {
	public void index() {
		render("index.html");
	}
	
}
