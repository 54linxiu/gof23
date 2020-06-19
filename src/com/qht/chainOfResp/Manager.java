package com.qht.chainOfResp;
/**
 *经理
 * 
*/
public class Manager extends Leader{

	public Manager(String name) {
		super(name);
	}

	@Override
	public void processingLeave(LeaveRequest request) {
		if(request.getLeaveDays()<10) {
			System.out.println(request.getEmpName()+"员工请假"+request.getLeaveDays()+"天"+
					"理由"+request.getReason());
			System.out.println(this.name+"经理审批");
		}else {
			if(this.nextLeader!=null) {
				this.nextLeader.processingLeave(request);
			}
		}
	}

}
