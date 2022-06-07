package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		
		// R : RoundRobin
		// L : Leastjob
		// P : PriorityAllocation
		
		System.out.println("전화 상담 배분 방식을 선택하세요: R or L or P");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch =='R'|| ch=='r') {
			scheduler = new RoundRobin();
		}else if(ch =='L'|| ch=='l') {
			scheduler = new Leastjob();
		}else if(ch =='P'|| ch=='p') {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("지원하지 않는 기능");
			return ; 
		}
		
		scheduler.getNectCall();
		scheduler.sendCallToAgent();
		
	}

}
