package array;

public class BookArray {

	public static void main(String[] args) {
		
	// ��ü �迭
	Book[] library = new Book[5];
	
	for(int i=0;i<library.length;i++) {
		System.out.println(library[i]);
	}
	//��ü �迭�� �ϳ��ϳ� ������.
	library[0] = new Book("�¹���1","������");
	library[1] = new Book("�¹���2","������");
	library[2] = new Book("�¹���3","������");
	library[3] = new Book("�¹���4","������");
	library[4] = new Book("�¹���5","������");
	
	for(int i=0;i<library.length;i++) {
		library[i].showBookInfo();
	}
	
	
	//�迭 ����
	int[] arr1 = {10,20,30,40,50};
	int[] arr2 = {1,2,3,4,5};
	
	System.arraycopy(arr1, 0, arr2, 1, 4);
	
	for(int i=0;i<arr2.length;i++) {
		System.out.println(arr2[i]);  //1 10 20 30
	}
	
	
	
	
	
	}

}
