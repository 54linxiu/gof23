package com.qht.chainOfResp;

public class Client {
	public static void main(String[] args) {
		
		Leader a = new Director("����");
		Leader b = new Manager("����");
		Leader b2 = new ViceGeneraManager("����");
		Leader c = new GeneraManager("��˼");
		//��֯����������
		a.setNextLeader(b);
		b.setNextLeader(b2);
		b2.setNextLeader(c);
		
		//��ʼ��ٲ���
		LeaveRequest req1 = new LeaveRequest("jiakechen", 15, "����ҵ�giaogiao");
		a.processingLeave(req1);
	}
}
