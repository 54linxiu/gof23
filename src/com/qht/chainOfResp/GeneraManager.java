package com.qht.chainOfResp;
/**
 *总经理
 * 
*/
public class GeneraManager extends Leader{

	public GeneraManager(String name) {
		super(name);
	}

	@Override
	public void processingLeave(LeaveRequest request) {
		if(request.getLeaveDays()<30) {
			System.out.println(request.getEmpName()+"员工请假"+request.getLeaveDays()+"天"+
					"理由"+request.getReason());
			System.out.println(this.name+"总经理审批");
		}else {
			System.out.println("不审批");
		}
	}

}
