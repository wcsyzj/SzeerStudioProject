package com.qinhailin.pub.backstage.ctrl;

import com.qinhailin.common.base.BaseController;
import com.qinhailin.common.routes.ControllerBind;

@ControllerBind(path="/pub/backstage")
public class BackstageController extends BaseController {
	
	public void index() {
		render("index.html");
	}
}
