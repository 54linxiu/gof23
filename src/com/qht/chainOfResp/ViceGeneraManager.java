package com.qht.chainOfResp;
/**
 *总经理
 * 
*/
public class ViceGeneraManager extends Leader{

	public ViceGeneraManager(String name) {
		super(name);
	}

	@Override
	public void processingLeave(LeaveRequest request) {
		if(request.getLeaveDays()<20) {
			System.out.println(request.getEmpName()+"员工请假"+request.getLeaveDays()+"天"+
					"理由"+request.getReason());
			System.out.println(this.name+"副总经理审批");
		}else {
			if(this.nextLeader!=null) {
				this.nextLeader.processingLeave(request);
			}
		}
	}

}
