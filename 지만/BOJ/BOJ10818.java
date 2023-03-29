import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		String[] strs = bf.readLine().split(" ");
		int min=Integer.parseInt(strs[0]),max=0;
		for (int i = 0; i < N; i++) {
			if(Integer.parseInt(strs[i])>max) {
				max = Integer.parseInt(strs[i]);
			}
			if(Integer.parseInt(strs[i])<min) {
				min = Integer.parseInt(strs[i]);
			}
			
		}
		System.out.print(min+" "+max);
	}

}