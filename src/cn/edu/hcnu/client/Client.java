package cn.edu.hcnu.client;

//�����ҿͻ���
public class Client {
	//������:������¼�߳�
	public static void main(String[] args) throws Exception {
		Thread login = new LoginThread();
		login.start();
	}
}