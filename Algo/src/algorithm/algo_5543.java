package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class algo_5543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상근날드
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.sort(null);
        
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(sc.nextInt());
		list2.add(sc.nextInt());
		list2.sort(null);
		
		System.out.println((list.get(0) +list2.get(0))-50);

	}

}