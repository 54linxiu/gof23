package com.qht.chainOfResp;
/**
 *主任 
 * 
*/
public class Director extends Leader{

	public Director(String name) {
		super(name);
	}

	@Override
	public void processingLeave(LeaveRequest request) {
		if(request.getLeaveDays()<3) {
			System.out.println(request.getEmpName()+"员工请假"+request.getLeaveDays()+"天"+
					"理由"+request.getReason());
			System.out.println(this.name+"主任审批");
		}else {
			if(this.nextLeader!=null) {
				this.nextLeader.processingLeave(request);
			}
		}
	}

}
