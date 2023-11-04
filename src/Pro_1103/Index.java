package Pro_1103;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("문자열 : ");
		String str = sc.nextLine(); //문자열 입력
		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0); //문자 입력(하나의 문자만 입력)
		
		char [] arr = new char[str.length()];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		int count=0;
		System.out.print(str+"에 " + ch+ "가 존재하는 위치 : " );
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch) {
				System.out.print(i+1 + " ");
				count ++;
			}
		}
		System.out.println("");
		System.out.println(ch+"의 개수 : " +count);
		
	}

}
