package com.ssmo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ssmo.pojo.Staff;

/**
 * @author CrazyMage
 *
 */
@Repository("staffMapper")
public interface StaffMapper {
	
	
	/**
	 * 
	 * @param pageno 第几页
		 * @param pagesize 每页显示的数据数目
	 */
		List<Staff> findPager(
				@Param("pageno")Integer pageno,
				@Param("pagesize") Integer pagesize
				);
		/**
		 * 查询总记录数
		 * @param ename
		 * @return
		 */
		int findTotal(
				@Param("ename") String ename
				);
		
		
		
		

}
