package cn.ffcs.uom.rolePermission.action.bean;

import lombok.Getter;
import lombok.Setter;

import org.zkoss.zul.Button;
import org.zkoss.zul.Window;

import cn.ffcs.uom.rolePermission.component.RbacBusinessSystemRelationTreeBandboxExt;
import cn.ffcs.uom.rolePermission.component.RbacResourceRelationTreeBandboxExt;

public class RbacBusinessSystemResourceEditBean {

	@Getter
	@Setter
	private Window rbacBusinessSystemResourceEditWindow;

	@Getter
	@Setter
	private RbacBusinessSystemRelationTreeBandboxExt rbacBusinessSystemRelationTreeBandboxExt;

	@Getter
	@Setter
	private RbacResourceRelationTreeBandboxExt rbacResourceRelationTreeBandboxExt;

	@Getter
	@Setter
	private Button saveBtn;

	@Getter
	@Setter
	private Button cancelBtn;

}
