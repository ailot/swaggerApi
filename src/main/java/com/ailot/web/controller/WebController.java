package com.ailot.web.controller;

import com.ailot.web.model.User;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="testApi")
@RequestMapping(value="api")
public class WebController {
	
	@ApiOperation(value="新增",nickname="昵称",notes="注意")
	@RequestMapping(value="create",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestParam(value = "name") String name,
					   @RequestParam(value = "password") String password){
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
	@ResponseBody
	@RequestMapping(value="select",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public User select(@RequestBody User user){
		return null;
	}

}
