package homework;
import java.util.Scanner;
public class homework1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		// Kullanıcıdan kilo verisi alarak bütün gezegenlerdeki değerlerini hesaplayıp yazdıran program
		// G = m * g 
		// 1- Ay  2- Mars  3- Venüs 4- Satürn
		// Ayın g=1,62  Saturn g =10,44 , Mars g=3,72 , Venüs g=8,87 
				

		 
			
			System.out.println("Hoşgeldiniz ");
			System.out.print("Kilonuzu Giriniz= ");
			float kilo= scanner.nextFloat();
			
			float dunyaCekimi=9.8f, ayCekimi=1.62f, marsCekimi=3.72f, venusCekimi=8.87f, saturnCekimi=14.44f;
			
			float ayDegeri=kilo/(dunyaCekimi/ayCekimi);
				System.out.println("Aydaki kilonuz= "+ayDegeri+"kg'dir.");
			float marsDegeri=kilo/(dunyaCekimi/marsCekimi);
				System.out.println("Marstaki kilonuz= "+marsDegeri+"kg'dir.");
			float venusDegeri=kilo/(dunyaCekimi/venusCekimi);
				System.out.println("Venüsteki kilonuz= "+venusDegeri+"kg'dir.");
			float saturnDegeri= kilo/(dunyaCekimi/saturnCekimi);
				System.out.println("Saturndeki kilonuz= "+saturnDegeri+"kg'dir.");
			
			
			System.out.println("******************* ÖDEVİN 2.KISMI İÇİN ***************************");
			
			System.out.print("Kilonuzu Giriniz= ");
			 kilo= scanner.nextFloat();
			System.out.println("Gezegeni seçiniz");
			System.out.print("1-Ay"+" ");
			System.out.print("2-Mars"+" ");
			System.out.print("3-Venüs"+" ");
			System.out.println("4-Satürn"+" ");
			System.out.print("Tercihini yapınız= ");
			
			int tercih=scanner.nextInt();
			
			if(tercih==1) {
				System.out.println("Aydaki kilonuz= "+ayDegeri+" kg'dir.");
			}else if(tercih==2) {
				System.out.println("Marstaki kilonuz= "+marsDegeri+" kg'dir.");
			}else if(tercih==3) {
				System.out.println("Venüsteki kilonuz= "+venusDegeri+" kg'dir.");	
			}else {
				System.out.println("Saturndeki kilonuz= "+saturnDegeri+" kg'dir.");
			}
			scanner.close();
		
	}

}
