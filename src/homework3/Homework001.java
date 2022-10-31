package homework3;

public class Homework001 {

	public static void main(String[] args) {
		//bir dizide 13 var ise 13 ve bir sonraki eleman
		 //toplama eklenmeden toplam sonucu bulan kod
		  //çarşambaya gönderilecek


		 int nums[] = {1, 13, 13, 13, 2, 5, 13, 1};
		 int toplam=0;
		 for (int i = 0; i < nums.length; i++) {
			if (nums[i]==13) {
				i++;
			}else
				toplam=toplam+nums[i];
			 
			 
		}
		 System.out.println(toplam);
	}

}
