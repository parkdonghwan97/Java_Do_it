package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		double[] num = new double[5];
		num[0] = 10.0;
		num[1] = 20.0;
		num[2] = 30.0;
//		num[3] = 10.0;
//		num[4] = 10.0;
		
		double sumtot = 0.0;
		for(int i=0;i<num.length;i++) {
			sumtot += num[i];
		}
		System.out.println(sumtot); //60
		double avgtot = 0.0;
		for(int i=0;i<num.length;i++) {
			avgtot *= num[i];
		}
		System.out.println(avgtot); //0   num[3]= 0 �̱� ������ ���ϸ� 0�� ����
		
		// ������ ������ŭ ����� �ϰ� ���� ���
		
		double[] num2 = new double[5];
		int size = 0 ;
		num2[0] = 10.0; size++;
		num2[1] = 20.0; size++;
		num2[2] = 30.0; size++;
		
		double avgtot2 = 1;
		for(int i=0;i<size;i++) {
			avgtot2 *= num2[i];
		}
		System.out.println(avgtot2);
		
		
		
		
	}

}
