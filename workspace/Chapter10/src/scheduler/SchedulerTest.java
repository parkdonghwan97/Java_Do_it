package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		
		// R : RoundRobin
		// L : Leastjob
		// P : PriorityAllocation
		
		System.out.println("��ȭ ��� ��� ����� �����ϼ���: R or L or P");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch =='R'|| ch=='r') {
			scheduler = new RoundRobin();
		}else if(ch =='L'|| ch=='l') {
			scheduler = new Leastjob();
		}else if(ch =='P'|| ch=='p') {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("�������� �ʴ� ���");
			return ; 
		}
		
		scheduler.getNectCall();
		scheduler.sendCallToAgent();
		
	}

}
