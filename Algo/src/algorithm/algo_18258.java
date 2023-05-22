package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class algo_18258 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		// Deque 양쪽에서 뽑는거
		Deque<Integer> queue = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			String str = st.nextToken();
			if (str.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				queue.add(num);
			} else if (str.equals("pop")) {
				int num = Integer.parseInt(st.nextToken());
				queue.remove(num);
				// poll : return 값이 generic
				if (!queue.isEmpty()) {
					num = -1;
				}
				sb.append(num).append("\n");
			} else if (str.equals("size")) {
				int size = queue.size();
				sb.append(size).append("\n");
			} else if (str.equals("empty")) {
				int num = 1;
				if (!queue.isEmpty()) {
					num = 0;
				}
				sb.append(num).append("\n");
			} else if (str.equals("front")) {
				int num = queue.peekFirst();
				if (queue.isEmpty()) {
					num = -1;
				}
				sb.append(num).append("\n");
			} else if (str.equals("back")) {
				int num = queue.peekLast();
				if (queue.isEmpty()) {
					num = -1;
				}
				sb.append(num).append("\n");
			}

			System.out.println(sb);

		}
	}
}
