package com.qht.chainOfResp;
/**
 * 抽象类
 * @author q
 *
 */
public abstract class Leader {
	protected String name;
	protected Leader nextLeader;//责任链上的后继对象
	public Leader(String name) {
		this.name = name;
	}
	//设定责任链上的后继对象
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	/**
	 * 处理请求核心代码
	 * @param nextLeader
	 */
	public abstract void processingLeave(LeaveRequest request);
}
