package exercises.Gr11.notes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AllEvenNum {
	public static void main(String[] args) {
		try {
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number : ");
			int num = Integer.parseInt(br1.readLine());
			System.out.println("Even Numbers:");
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0) {
					System.out.print(i + ",");
				}
			}
		} catch (Exception e) {
		}

	}
}