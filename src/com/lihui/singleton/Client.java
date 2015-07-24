package com.lihui.singleton;

public class Client {
	public static void main(String args[]) {
		// �����ĸ�LoadBalancer����
		LoadBalancer balancer1, balancer2, balancer3, balancer4;
		balancer1 = LoadBalancer.getLoadBalancer();
		balancer2 = LoadBalancer.getLoadBalancer();
		balancer3 = LoadBalancer.getLoadBalancer();
		balancer4 = LoadBalancer.getLoadBalancer();

		// �жϷ��������ؾ������Ƿ���ͬ
		if (balancer1 == balancer2 && balancer2 == balancer3
				&& balancer3 == balancer4) {
			System.out.println("���������ؾ���������Ψһ�ԣ�");
		}

		// ���ӷ�����
		balancer1.addServer("Server 1");
		balancer1.addServer("Server 2");
		balancer1.addServer("Server 3");
		balancer1.addServer("Server 4");

		// ģ��ͻ�������ķַ�
		for (int i = 0; i < 10; i++) {
			String server = balancer1.getServer();
			System.out.println("�ַ��������������� " + server);
		}
	}
}