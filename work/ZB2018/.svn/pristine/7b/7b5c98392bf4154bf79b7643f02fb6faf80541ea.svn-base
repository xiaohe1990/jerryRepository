package zb.com.util;


import java.util.List;
/**
 * 
* @ClassName: pageTool 
* @Description: TODO(分页工具类) 
* @author XW 
* @date 2017-3-15 下午4:34:16 
*
 */
public class PageTool {
	
	private int crrentPage = 1; //当前
	private int pageSize = 10; //每页几条
	private int total;//总记录数
	private int pageCount;//总页数

	private List<?> list ;
	
	public PageTool(){}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

	public int getCrrentPage() {
		if(this.crrentPage>=10){
			this.crrentPage=crrentPage/10 * 10;
		}
		return crrentPage;
	}
	public void setCrrentPage(int crrentPage) {
		this.crrentPage = crrentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getPageCount() {
		if (this.total!=0) {
			if (this.total%this.getPageSize()==0) {
				pageCount=total/pageSize;
			}else {
				pageCount=total/pageSize+1;
			}
		}
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}


	public List<?> getList() {
		return list;
	}


	public void setList(List<?> list) {
		this.list = list;
	}
}
