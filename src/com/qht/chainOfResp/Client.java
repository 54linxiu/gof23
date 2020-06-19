package com.qht.chainOfResp;

public class Client {
	public static void main(String[] args) {
		
		Leader a = new Director("李青");
		Leader b = new Manager("刘嵩");
		Leader b2 = new ViceGeneraManager("大器");
		Leader c = new GeneraManager("赵思");
		//组织责任链对象
		a.setNextLeader(b);
		b.setNextLeader(b2);
		b2.setNextLeader(c);
		
		//开始请假操作
		LeaveRequest req1 = new LeaveRequest("jiakechen", 15, "你给我的giaogiao");
		a.processingLeave(req1);
	}
}
