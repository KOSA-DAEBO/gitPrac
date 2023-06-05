package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int cnt[] = new int[1000002];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			cnt[S] = cnt[S] + 1;
			cnt[E + 1] = cnt[E + 1] - 1;
		}
		int sum = 0;
		for (int i = 1; i <= 1000001; i++) {
			sum += cnt[i];
			cnt[i] = sum;
		}

		int Q = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < Q; i++) {
			int num = Integer.parseInt(st.nextToken());
			System.out.println(cnt[num]);
		}
	}
}
