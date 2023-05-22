package algorithm;

import java.util.Scanner;

public class algo_2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); //카드개수
		int m = sc.nextInt(); // 계산 최대값

		int[] arr = new int[n]; // 들어 가는 갯수를 배열에 넣어주고

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		} // 그 수만큼 입력 받아

		int result = 0;
		int temp = 0;
		for (int i = 0; i < n - 2; i++) { // 0번방
			for (int j = i + 1; j < n - 1; j++) { // 1번방
				for (int k = j + 1; k < n; k++) { // 2번방

					temp = arr[i] + arr[j] + arr[k]; // 세개를 더해서 temp 에 담지

					if (result <= temp && temp <= m) {  //0<= temp이고 temp이  입력받은 m 보다 작거나 같을 때  
						result = temp; //result 에 temp 를 담아  
					}
				}
			}
		}

			System.out.println(result); //값 출력 

	}

}
