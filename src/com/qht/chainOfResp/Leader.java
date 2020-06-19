package com.qht.chainOfResp;
/**
 * ������
 * @author q
 *
 */
public abstract class Leader {
	protected String name;
	protected Leader nextLeader;//�������ϵĺ�̶���
	public Leader(String name) {
		this.name = name;
	}
	//�趨�������ϵĺ�̶���
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	/**
	 * ����������Ĵ���
	 * @param nextLeader
	 */
	public abstract void processingLeave(LeaveRequest request);
}
