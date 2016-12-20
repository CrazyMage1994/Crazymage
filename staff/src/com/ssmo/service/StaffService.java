package com.ssmo.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssmo.dao.StaffMapper;
import com.ssmo.pojo.Staff;
import com.ssmo.util.Pager;



@Service("staffService")
public class StaffService {
	@Resource(name="staffMapper")
	private StaffMapper staffMapper;
	

	public Pager<Staff> findPager(Integer pageno, Integer pagesize,String ename){
		Pager<Staff> pager=new Pager<Staff>();
		pager.setRows(staffMapper.findPager(pageno, pagesize));
		pager.setTotal(staffMapper.findTotal(ename));
		return pager;
	}
	
	
}
