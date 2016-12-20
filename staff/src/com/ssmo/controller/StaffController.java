package com.ssmo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssmo.pojo.Staff;
import com.ssmo.service.StaffService;
import com.ssmo.util.Pager;

@Controller
public class StaffController {
	@Resource(name="staffService")
	private StaffService staffService;
	
	@RequestMapping("staffController_findPager")
	public String list(
			@RequestParam(value ="page",required = true) Integer page,
			ModelMap modelMap,
			HttpServletResponse response) {
		response.setContentType("text/html;charset=utf-8");
		 if(page<1){
		    	page=1;
		    }
	    Integer rows=5;
		String ename="FORD";
	    Integer pageno = (page - 1) * rows;
	    Integer pagesize = page * rows;
	    
	    Pager<Staff> pager=staffService.findPager(pageno, pagesize,  ename);
	    List<Staff> staffs=pager.getRows();
	    for(Staff staff:staffs){
	    	System.out.println(staff);
	    }
	    int total=pager.getTotal();
	    System.out.println(total);
	    int count=total/rows;
	    if(page>count){
	    	page=count;
	    }
	    modelMap.put("staffs", staffs);
	    modelMap.put("page", page);
	    modelMap.put("count", count);
	    return "stafflist";
	}
	

	
	
	
	

}
