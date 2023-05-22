package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algo_2231 {

	public static void main(String[] args) throws IOException {
		// 어떤 X 값 을 한글자씩 나눠서 더해 그리고 그게
		// 그 어떤 X 값이랑 더해서 나온 값이 입력값.

		// 그러니까 입력값을 알면 뭘 알 수 있는데.. .
		// 아 잠만 잠만 그러면 입력값 전에까지 포문돌려서 배열에 담어 문자로 왜냐면 숫자가 2글자 되면 분리해서 더해야하니까
		// 그리고 또 포문 돌려서 하나씩 더해서 넣고

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine(); // 값을 입력 받아. 근데 문자로
		int n = Integer.parseInt(str); // 문자인 값을 숫자로 바꿔서 포문 돌려

		 boolean flag = false; //생성자 찾았니 못찾았니 
		for (int i = 0; i < n; i++) { // 입력 값까지 포문 돌리는데
			String forstring = Integer.toString(i); // int i 값을 스트링으로 바꿔서
			String[] stringarr = forstring.split(""); // 스트링 배열에 한글자씩 분리해서 넣어 두자리수 세자리수 일 수도 있으니까

			int temp = 0; // 값 담을 변수 하나 만들고 포문 한번 돌때 마다 0으로 초기화
			for (int j = 0; j < stringarr.length; j++) { // 스트링 배열의 길이 만큼 포문돌려서 덧셈해
				temp += Integer.parseInt(stringarr[j]); // 숫자로 바꾸서
			}

			if (i + temp == n) { // 만약에 그 한글자 더한 거랑 합친 숫자랑 더해서 입력값이랑 같으면 프린트
				System.out.println(i);
				flag = true;
				break; 
			} 
		} 
		if (flag==false) { //계속 false 로 생성자 못찾았으면 
			System.out.println(0);
		}
		
	}
}
