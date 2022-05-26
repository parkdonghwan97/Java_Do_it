package array;

public class ObjectCopy {

	public static void main(String[] args) {
		//��ü �迭 ����
		
		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];

		bookArr1[0] = new Book("�¹���1","������");
		bookArr1[1] = new Book("�¹���2","������");
		bookArr1[2] = new Book("�¹���3","������");
		
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);
		
		for(int i=0;i<bookArr2.length;i++) {   
			bookArr2[i].showBookInfo(); //�¹���1,������			�¹���2,������			�¹���3,������
		}
		
		
		// �� ����
		bookArr1[0].setBookName("����");
		bookArr1[0].setAuthor("�ڿϼ�");	
		
		for(int i=0;i<bookArr1.length;i++) {   
			bookArr1[i].showBookInfo(); //  ����,�ڿϼ�			�¹���2,������			�¹���3,������
		}
		
		// �ٽ� bookArr2�� ����غ���.
		for(int i=0;i<bookArr2.length;i++) {   
			bookArr2[i].showBookInfo(); // ����,�ڿϼ�			�¹���2,������			�¹���3,������
			
			// bookArr2�� ���� �ٲ�� ���ȴ�.!   �̸� ���� ���� ������ Ī�Ѵ�. �̴� bookArr1�� �ּҸ� ����Ǿ��� �����̴�.
			
			// �ּҸ� �ٸ��� �ϰ� ������� �ν��Ͻ��� �ٽ� �����ؾ���			
		}
		// �ϵ� ����
		bookArr2[0]= new Book();   // ����Ʈ �����ڸ� �ҷ��� �ν��Ͻ��� ����
		bookArr2[1]= new Book();
		bookArr2[2]= new Book();
		
		for(int i=0;i<bookArr1.length;i++) {
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());
			bookArr2[i].setBookName(bookArr1[i].getBookName());
		}
		
		// �ٽ� bookArr1�� ���� �����ϰ� bookArr2�� ���� Ȯ���� ����.
		bookArr1[1].setBookName("�ڹ�������");
		bookArr1[1].setAuthor("���ü�");

		for(int i=0;i<bookArr1.length;i++) {   
			bookArr1[i].showBookInfo(); //  ����,�ڿϼ�			�ڹ�������,���ü�			�¹���3,������
		}
		
		
		for(int i=0;i<bookArr2.length;i++) {
			bookArr2[i].showBookInfo(); //  ����,�ڿϼ�			�¹���2,������			�¹���3,������    ���� �ٲ��� �ʾҴ�.
		}
		
		// ���� for��
		String[] strArr = {"Java","Android","C"};
		
		for(int i=0;i< strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		
		for(String s: strArr) {
			System.out.println(s); // Java			Android			C
		} 
		
		
		int[] arr = {1,2,3,4,5};
		for (int num :arr) {
			System.out.println(num); //1,2,3,4,5
		}
		
		
		
		
	}

}
