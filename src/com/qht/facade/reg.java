package com.qht.facade;
/**
 * 办理注册公司流程的门面对象
 * @author q
 *
 */
public class reg {
	public void register() {
		工商局 a = new 某某工商局();
		a.checkName();
		质监局 b = new 某某质监局();
		b.qualitycontrol();
		税务局 c = new 某某税务局();
		c.Tax();
		银行 d = new 某某银行();
		d.openCard();
	}
}
