package com.ssmo.util;

import java.util.List;

public class Pager<T> {
	private int total;//�ܼ�¼��
	private List<T> rows;//��ҳ���ݵļ���
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
	

}
