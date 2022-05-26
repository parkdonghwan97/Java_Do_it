package array;

public class BookArray {

	public static void main(String[] args) {
		
	// 객체 배열
	Book[] library = new Book[5];
	
	for(int i=0;i<library.length;i++) {
		System.out.println(library[i]);
	}
	//객체 배열은 하나하나 설정함.
	library[0] = new Book("태백산맥1","조정래");
	library[1] = new Book("태백산맥2","조정래");
	library[2] = new Book("태백산맥3","조정래");
	library[3] = new Book("태백산맥4","조정래");
	library[4] = new Book("태백산맥5","조정래");
	
	for(int i=0;i<library.length;i++) {
		library[i].showBookInfo();
	}
	
	
	//배열 복사
	int[] arr1 = {10,20,30,40,50};
	int[] arr2 = {1,2,3,4,5};
	
	System.arraycopy(arr1, 0, arr2, 1, 4);
	
	for(int i=0;i<arr2.length;i++) {
		System.out.println(arr2[i]);  //1 10 20 30
	}
	
	
	
	
	
	}

}
