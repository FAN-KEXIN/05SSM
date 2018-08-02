package cn.wh.util;


import java.util.List;

public class PageUtil<T> {
	public int getPageindex() {
		return pageindex;
	}

	public void setPageindex(int pageindex) {
		this.pageindex = pageindex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getTotalpages() {
		return totalpages;
	}

	public void setTotalpages(int totalpages) {
		this.totalpages = totalpages;
	}
	// 当前页面
	private int pageindex;
	// 每页的记录数据
	private int pageSize;
	// 总记录数
	private int totalRecords;
	// 总页数
	private int totalpages;
	// 数据本身
	private List<T> list;
	public List<T> getList() {
	 return list;
	 }
	 public void setList(List<T> list) {
	 this.list = list;
	 }
}
