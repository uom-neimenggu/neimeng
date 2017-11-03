package cn.ffcs.uom.organization.action.bean;

import lombok.Getter;
import lombok.Setter;

import org.zkoss.zul.Datebox;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Paging;
import org.zkoss.zul.Panel;

/**
 * Bean
 * 
 * @author
 **/
public class OrgDeptListboxBean {
	/**
	 *window.
	 **/
	@Getter
	@Setter
	private Panel orgDeptListboxPnl;
	/**
	 *Listbox.
	 **/
	@Getter
	@Setter
	private Listbox orgDeptListbox;
	/**
	 * 日期月份
	 */
	@Setter
	@Getter
	private Datebox date;
	/**
	 * 分页控件
	 */
	@Getter
	@Setter
	private Paging orgDeptListPaging;
}
