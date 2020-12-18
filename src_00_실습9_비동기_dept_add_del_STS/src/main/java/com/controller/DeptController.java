package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.Dept;
import com.service.DeptService;


@Controller
public class DeptController {

	@Autowired
	DeptService service;
	
	//목록보기
	@RequestMapping(value="/",
			method=RequestMethod.GET)	
	@CrossOrigin	
	public  @ResponseBody List<Dept> list() {
		System.out.println("list>>>>>>>>>>>>>>> 호출됨  get방식 ");
		return  service.list();
	}
	
	//저장하기
	@RequestMapping(value="/add",
			method=RequestMethod.POST)	
	@CrossOrigin
	public @ResponseBody void add(@RequestBody Dept xxx) {
		System.out.println("add>>>>>>>>>>>>>>>POST");
		 service.insert(xxx);
	}
	@RequestMapping(value="/add",
			method=RequestMethod.GET)
	@CrossOrigin
	public @ResponseBody void add2(Dept xxx) {
		System.out.println("add>>>>>>>>>>>>>>>GET");
		 service.insert(xxx);
	}
	//삭제하기
	@RequestMapping(value="/del",
			method=RequestMethod.DELETE)	 
	@CrossOrigin
	public @ResponseBody void del(int deptno) {
		service.delete(deptno);
	}
	@RequestMapping(value="/del2/{deptno}",
			method=RequestMethod.DELETE)	
	@CrossOrigin
	public @ResponseBody void del2(@PathVariable int deptno) {
		System.out.println("@PathVariable>> del");
		service.delete(deptno);
	}
	//조회하기
	@RequestMapping(value="/select",
			method=RequestMethod.GET)
	@CrossOrigin
	public @ResponseBody Dept select(@RequestParam int deptno) {
		System.out.println("select>>>>>>>>>>>>>>>GET");
		 return service.select(deptno);
	}
	
	//수정하기
	@RequestMapping(value="/update",
			method=RequestMethod.PUT)
	@CrossOrigin
	public @ResponseBody void update(@RequestBody Dept xxx) {
		System.out.println("select>>>>>>>>>>>>>>>GET");
		 service.update(xxx);
	}
}
