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
	 * @param pageno �ڼ�ҳ
		 * @param pagesize ÿҳ��ʾ��������Ŀ
	 */
		List<Staff> findPager(
				@Param("pageno")Integer pageno,
				@Param("pagesize") Integer pagesize
				);
		/**
		 * ��ѯ�ܼ�¼��
		 * @param ename
		 * @return
		 */
		int findTotal(
				@Param("ename") String ename
				);
		
		
		
		

}
