package com.ssmo.test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssmo.pojo.Staff;
import com.ssmo.service.StaffService;
import com.ssmo.util.Pager;

public class StaffTest {
	private StaffService staffService;
	@SuppressWarnings("resource")
	@Before
	public void init(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		staffService = ctx.getBean( StaffService.class);
		
		
	}
	
	
	@Test
	public void findByPager() {
	    Integer page = 2;
	    Integer rows = 5;
	    String ename="FORD";
	    
	    Integer pageno = (page - 1) * rows;
	    Integer pagesize = page * rows;
	    
	    Pager<Staff> pager=staffService.findPager(pageno, pagesize,  ename);
		for(Staff staff:pager.getRows()){
			System.out.println(staff);
		}
		System.out.println(pager.getTotal());
	}

}
