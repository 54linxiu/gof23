package com.qht.chainOfResp;
/**
 *�ܾ���
 * 
*/
public class GeneraManager extends Leader{

	public GeneraManager(String name) {
		super(name);
	}

	@Override
	public void processingLeave(LeaveRequest request) {
		if(request.getLeaveDays()<30) {
			System.out.println(request.getEmpName()+"Ա�����"+request.getLeaveDays()+"��"+
					"����"+request.getReason());
			System.out.println(this.name+"�ܾ�������");
		}else {
			System.out.println("������");
		}
	}

}
