package array;

public class ObjectCopy {

	public static void main(String[] args) {
		//객체 배열 복사
		
		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];

		bookArr1[0] = new Book("태백산맥1","조정래");
		bookArr1[1] = new Book("태백산맥2","조정래");
		bookArr1[2] = new Book("태백산맥3","조정래");
		
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);
		
		for(int i=0;i<bookArr2.length;i++) {   
			bookArr2[i].showBookInfo(); //태백산맥1,조정래			태백산맥2,조정래			태백산맥3,조정래
		}
		
		
		// 값 변경
		bookArr1[0].setBookName("나목");
		bookArr1[0].setAuthor("박완서");	
		
		for(int i=0;i<bookArr1.length;i++) {   
			bookArr1[i].showBookInfo(); //  나목,박완서			태백산맥2,조정래			태백산맥3,조정래
		}
		
		// 다시 bookArr2를 출력해보자.
		for(int i=0;i<bookArr2.length;i++) {   
			bookArr2[i].showBookInfo(); // 나목,박완서			태백산맥2,조정래			태백산맥3,조정래
			
			// bookArr2도 같이 바뀌어 버렸다.!   이를 보통 얕은 복사라고 칭한다. 이는 bookArr1의 주소만 복사되었기 때문이다.
			
			// 주소를 다르게 하고 싶은경우 인스턴스를 다시 생성해야함			
		}
		// 하드 코피
		bookArr2[0]= new Book();   // 디폴트 생성자를 불러서 인스턴스만 생성
		bookArr2[1]= new Book();
		bookArr2[2]= new Book();
		
		for(int i=0;i<bookArr1.length;i++) {
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());
			bookArr2[i].setBookName(bookArr1[i].getBookName());
		}
		
		// 다시 bookArr1의 값을 변경하고 bookArr2의 값을 확인해 보자.
		bookArr1[1].setBookName("자바의정석");
		bookArr1[1].setAuthor("남궁성");

		for(int i=0;i<bookArr1.length;i++) {   
			bookArr1[i].showBookInfo(); //  나목,박완서			자바의정석,남궁성			태백산맥3,조정래
		}
		
		
		for(int i=0;i<bookArr2.length;i++) {
			bookArr2[i].showBookInfo(); //  나목,박완서			태백산맥2,조정래			태백산맥3,조정래    값이 바뀌지 않았다.
		}
		
		// 향상된 for문
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
