package com.qinhailin.web.demo.ctrl;

import com.alibaba.fastjson.JSONObject;
import com.qinhailin.common.base.BaseController;
import com.qinhailin.common.routes.ControllerBind;

@ControllerBind(path = "/web/demo")
public class DemoController extends BaseController {

	public void index() {
		renderText("Hello World!");
		//renderText("这是一个普通的helloworld页面");
		/*
		 * rander 为返回东西的方法
		 * randerText 返回文字
		 * 只能同时存在一个rendertext（？
		 */
	}
	
	public void getJSON1() {
		set("name","yunjunyun");
		set("course","摸鱼水中游");
		renderJson();
	}
	/*
	 *直接输出json里的乱七八糟的东西 
	 * */ 
	
	public void getJSON2() {
		JSONObject json = new JSONObject();
		json.put("name","yunjunyun");
		json.put("course","摸鱼水中游");
		renderJson(json);
		/*
		 * 任何序列号对象都可以传
		 * 这个传的东西就干净多 了
		 */	}
	
	public void returnpage1() {
	/*
		 * 用service查数据然后传输进去
	*/		
		set("name","yunjunyun");
		set("course","摸鱼水中游");
		render("demopage1.html");
	}
	
	//没用，不要管↓
	public void returnpage2() {
		set("name","云均匀");
		set("course","摸鱼水中游");
		render("demopage1.html");
	}
	
}
