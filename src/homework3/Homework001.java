package homework3;

public class Homework001 {

	public static void main(String[] args) {

		int nums[] = {1, 13, 13, 13, 2, 5, 13, 1};
		int toplam = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 13) {
				i++;
				while (nums[i] == 13) {
					i++;
				}

			} else
				toplam = toplam + nums[i];

		}
		System.out.println(toplam);
	}
}