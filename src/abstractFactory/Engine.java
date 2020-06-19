package abstractFactory;

public interface Engine {
	void run();
	void start();
}

class LuxuryEngine implements Engine{

	@Override
	public void run() {
		System.out.println("ת�ٿ�");
	}

	@Override
	public void start() {
		System.out.println("������!�����Զ���ͣ");
	}
	
}

class LowEngine implements Engine{

	@Override
	public void run() {
		System.out.println("ת����");
	}

	@Override
	public void start() {
		System.out.println("������!");
	}
	
}
