package com.qht.chainOfResp;
/**
 *���� 
 * 
*/
public class Director extends Leader{

	public Director(String name) {
		super(name);
	}

	@Override
	public void processingLeave(LeaveRequest request) {
		if(request.getLeaveDays()<3) {
			System.out.println(request.getEmpName()+"Ա�����"+request.getLeaveDays()+"��"+
					"����"+request.getReason());
			System.out.println(this.name+"��������");
		}else {
			if(this.nextLeader!=null) {
				this.nextLeader.processingLeave(request);
			}
		}
	}

}
