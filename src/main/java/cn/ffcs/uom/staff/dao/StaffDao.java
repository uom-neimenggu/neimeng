package cn.ffcs.uom.staff.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.ffcs.uom.common.dao.BaseDao;
import cn.ffcs.uom.common.vo.PageInfo;
import cn.ffcs.uom.orgTreeCalc.model.TreeStaffSftRule;
import cn.ffcs.uom.organization.model.Organization;
import cn.ffcs.uom.party.model.Party;
import cn.ffcs.uom.party.model.PartyRole;
import cn.ffcs.uom.position.model.CtPosition;
import cn.ffcs.uom.position.model.Position;
import cn.ffcs.uom.staff.model.Staff;
import cn.ffcs.uom.staff.model.StaffAccount;
import cn.ffcs.uom.staff.model.StaffExtendAttr;
import cn.ffcs.uom.staff.model.StaffOrgTranTemp;
import cn.ffcs.uom.staff.model.StaffOrganizationTran;
import cn.ffcs.uom.systemconfig.model.AttrValue;

/**
 * StaffManagerdaoe接口 .
 * 
 * @版权：福富软件 版权所有 (c) 2011
 * @author Wong
 * @version Revision 1.0.0
 * @see:
 * @创建日期：2013-5-28
 * @功能说明：
 * 
 */
public interface StaffDao extends BaseDao {

	/**
	 * 新增员工 .
	 * 
	 * @author Wong 2013-5-28 Wong
	 */
	public Serializable addStaff(Staff staff);

	/**
	 * 根据ID删除员工 .
	 * 
	 * @author Wong 2013-5-28 Wong
	 */
	public void delStaff(Serializable id);

	/**
	 * 新增员工 .
	 * 
	 * @author Wong 2013-5-28 Wong
	 */
	public void delStaff(Staff staff);

	/**
	 * 修改员工 .
	 * 
	 * @author Wong 2013-5-28 Wong
	 */
	public void updateStaff(Staff staff);

	public String updateStaffList(List<Staff> staffList);

	/**
	 * 查询员工 .
	 * 
	 * @author Wong 2013-5-28 Wong
	 */
	public Staff queryStaff(Serializable id);

	/**
	 * 分页查询员工信息
	 * 
	 * @param staff
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public PageInfo forQuertyStaff(Staff staff, int currentPage, int pageSize);

	/**
	 * 分页查询员工信息(忽略status_cd)
	 * 
	 * @param staff
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public PageInfo forQuertyStaffNoStatus(Staff staff, int currentPage,
			int pageSize);

	/**
	 * 不分页查询员工信息
	 * 
	 * @param staff
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public List<Staff> quertyStaffNoPage(Staff staff);

	/**
	 * 分页查询失效员工信息
	 * 
	 * @param staff
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public PageInfo forQuertyStaffActivation(Staff staff, int currentPage,
			int pageSize);

	/**
	 * 分页查询中间表和员工信息
	 * 
	 * @param staff
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public PageInfo forQuertyCompareStaff(Staff staff, int currentPage,
			int pageSize);

	/**
	 * 查询生效的员工账号 .
	 * 
	 * @param id
	 * @param staffId
	 * @return
	 * @author Wong 2013-6-4 Wong
	 */
	public StaffAccount getStaffAccount(Serializable id, Long staffId);

	public String getPartyNameByStaffId(Serializable staffId);

	/**
	 * 获取员工岗位
	 * 
	 * @param staff
	 * @param current
	 * @param pageSize
	 * @return
	 */
	public PageInfo queryPageInfoByStaffPosition(Position queryPosition,
			Organization queryOrganization, Staff staff, int current,
			int pageSize);

	/**
	 * 员工组织业务关系 .
	 * 
	 * @param staff
	 * @param current
	 * @param pageSize
	 * @return
	 */
	public PageInfo queryPageInfoStaffOrgTran(Staff staff,
			StaffOrganizationTran staffOrganizationTran, int currentPage,
			int pageSize);

	/**
	 * 员工组织业务关系 .
	 * 
	 * @param staff
	 * @param current
	 * @param pageSize
	 * @return
	 */
	public PageInfo queryPageInfoStaffGridUnitTran(Staff staff,
			StaffOrganizationTran staffOrganizationTran, int currentPage,
			int pageSize);

	public List<StaffOrganizationTran> queryStaffOrgTranList(
			StaffOrganizationTran staffOrgTran);

	/**
	 * 新增员工组织业务关系 .
	 * 
	 * @author wangyong 2013-6-17 wangyong
	 */
	public void saveStaffOrgTran(StaffOrganizationTran staffOrgTran);

	/**
	 * 修改员工组织业务关系 .
	 * 
	 * @author wangyong 2013-6-17 wangyong
	 */
	public void updateStaffOrgTran(StaffOrganizationTran staffOrgTran);

	/**
	 * 删除员工组织业务关系 .
	 * 
	 * @author wangyong 2013-6-17 wangyong
	 */
	public void deleteStaffOrgTran(StaffOrganizationTran staffOrgTran);

	/**
	 * 员工的扩展属性 .
	 * 
	 * @return
	 * @author wangyong 2013-6-20 wangyong
	 */
	public List<StaffExtendAttr> getStaffExtendAttr(Long staffId);

	public String getSeqStaffCode();

	public String getSeqStaffNbr();

	/**
	 * 获取员工修复ID
	 * 
	 * @return
	 */
	public Long getSeqStaffFixId();

	/**
	 * 根据员工账号字符串获取员工账号对象列表
	 * 
	 * @param staffAccount
	 * @return 2013-7-19 faq
	 */
	public List<StaffAccount> getStaffAccountList(StaffAccount sa);

	/**
	 * 根据员工账号字符串获取员工账号对象列表[去除状态影响]
	 * 
	 * @param staffAccount
	 * @return 2013-7-19 faq
	 */
	public List<StaffAccount> getNoStatusStaffAccountList(StaffAccount sa);

	/**
	 * 根据员工账号获取员工账号实体
	 * 
	 * @param staffAccount
	 * @return 2013-7-23 faq
	 */
	public StaffAccount getStaffAccountByStaffAccount(String staffAccount);

	/**
	 * 判断是否存在员工工号
	 * 
	 * @param staffNbr
	 * @return
	 */
	public boolean isExistStaffNumber(String staffNbr);

	/**
	 * 根据参与人角色ID获取员工账号
	 * 
	 * @param prId
	 * @return
	 */
	public StaffAccount getStaffAccountByPartyRoleId(String prId);

	/**
	 * 根据参与人角色ID获取员工
	 * 
	 * @param prId
	 * @return
	 */
	public Staff getStaffByPartyRoleId(Long prId);

	/**
	 * 根据人力中间表更新员工工号和员工账号
	 * 
	 * @param staffs
	 * @return
	 */
	public void updateStaffByOperateHr(List<Staff> staffs);

	/**
	 * 获取无状态的参与人角色
	 * 
	 * @param partyRoleId
	 * @return
	 */
	public PartyRole getPartyRole(Long partyRoleId);

	/**
	 * 获取无状态的参与人
	 * 
	 * @param partyId
	 * @return
	 */
	public Party getParty(Long partyId);

	/**
	 * 根据参与人ID获取关联表的信息
	 * 
	 * @param clazz
	 *            partyId
	 * @return
	 */
	public List<?> getActivationObjNoStatusCd(Class<?> clazz, Long partyId);

	/**
	 * 
	 * 功能说明:根据树员工规则获取员工性质 创建人:俸安琪 创建时间:2014-6-16 下午3:02:31
	 * 
	 * @param tssr
	 * @return List<AttrValue>
	 * 
	 */
	public List<AttrValue> getStaffWorkprop(TreeStaffSftRule tssr);

	public List<AttrValue> getStaffWorkpropIbe(String str);

	List<StaffAccount> queryStaffAccountList(StaffAccount staffAccount);

	List<StaffAccount> queryStaffAccountListByStaffAccount(
			StaffAccount staffAccount);

	public List<Staff> queryStaffListByStaff(Staff staff);

	public Staff queryStaffByPartyId(Long partyId);

	public List<StaffOrgTranTemp> queryStaffOrgTranTempList(
			StaffOrgTranTemp staffOrgTranTemp);

	/**
	 * 根据组织查询组织下面所有的员工组织业务关系 .
	 * 
	 * @param organization
	 * @param staffOrganizationTran
	 * @param currentPage
	 * @param pageSize
	 * @return
	 * @author xiaof 2017年3月3日 xiaof
	 */
	public PageInfo queryPageInfoStaffOrgTran(Organization organization,
			StaffOrganizationTran staffOrganizationTran, int currentPage,
			int pageSize);

	public PageInfo queryPageInfoByStaffCtPosition(CtPosition queryPosition,
			Staff staff, int current, int pageSize);

	public List<Map<String, Object>> queryStaffGridUnitTranList(Staff staff,
			StaffOrganizationTran staffOrganizationTran);
	
	/**
     * 根据参与人证件号码查询员工账号信息
     * @param certNum
     * @return
     */
    public List<StaffAccount> queryStaffAccountByCertNum(String certNum);

}
