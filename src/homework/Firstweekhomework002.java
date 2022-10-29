package homework;
import java.util.Scanner;
public class Firstweekhomework002 {

	public static void main(String[] args) {
		// BMI Hesaplama
		Scanner scanner= new Scanner(System.in);
		
		float boy,kilo,bmi;
		System.out.println("Hoşgeldiniz BMI Hesaplama Programı");
		System.out.print("Boyunuzu giriniz=");
			boy= scanner.nextFloat();
		System.out.print("Kilonuzu giriniz=");
			kilo=scanner.nextFloat();
			bmi= kilo*10000/(boy*boy);
		System.out.println("Cinsiyeti Seçiniz=");
		System.out.print("1-Kadın"+" ");
		System.out.println("2-Erkek");
		System.out.print("Cevabınız= ");
			int kadin = scanner.nextInt();
			int erkek=2;
		
	if(kadin==1) {
		System.out.println("Kadına göre değerleriniz hesaplanıyor");
		if(bmi<19) {
				System.out.println("Zayıfsınız!!");
		}else if(19<=bmi && bmi<=24) {
			System.out.println("Normal Kilodasınız!!");
		}else if(25<=bmi && bmi<=30) {
			System.out.println("Şişmansınız!!");
		}else {
			System.out.println("Obezsiniz dikkat edin!!");
		}	
		}
	else if(erkek==2) {
			System.out.println("Erkeğe göre değerleriniz hesaplanıyor");
		if(bmi<19){
			System.out.println("Zayıfsınız!!");
		}else if(19<=bmi && bmi<=24) {
			System.out.println("Normal Kilodasınız!!");
		}else if(25<=bmi && bmi<=30) {
			System.out.println("Şişmansınız!!");
		}else {
			System.out.println("Obezsiniz!!");
		}			
		}	
	scanner.close();
	}

}
