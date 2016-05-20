package com.ailot.web.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(value="testApi")
@RequestMapping(value="api")
public class WebController {
	
	@ApiOperation(value="新增",nickname="昵称",notes="注意")
	@RequestMapping(value="create",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void create(String name,String password){
	}
	
	@ApiOperation(value="修改",nickname="昵称",notes="注意")
	@RequestMapping(value="update",method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
	public void update(String name,String password){
	}
	
	@ApiOperation(value="删除",nickname="昵称",notes="注意")
	@RequestMapping(value="delete",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	public void delete(String name,String password){
	}
	
	@ApiOperation(value="查找",nickname="昵称",notes="注意")
	@RequestMapping(value="select",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public void select(String name,String password){
	}

}
