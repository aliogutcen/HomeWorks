package homework3;

public class Homework003 {

	public static void main(String[] args) {

		int nums[] = {13, 1, 13, 13, 13, 2, 5, 13, 1, 13, 5, 12, 2 ,13,2,4,};
		/*
		int toplam = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13) {
				if (i != nums.length - 1) {
					i++;
					if(nums[i]==nums[i-1]) {
						i--;
					}
				}
			} else {
				toplam += nums[i];
			}
		}
		System.out.println("Toplam : " + toplam);
*/
		
		
		int toplam = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 13) {
                while (nums[i] == 13) {
                    i++;
                }
            } else {
                toplam += nums[i];
                System.out.println(nums[i] + "Toplam = " + toplam);
            }
        }

        System.out.println("Toplam = " + toplam);
	}
}