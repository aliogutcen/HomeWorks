package gurayhocaninodevleri;

public class Homework002 {

	public static void main(String[] args) {
		String metin = "Bugün Java ile string konusunu işleyeceğiz ";

		/*
		int name = metin.indexOf('i');
		int lastName = metin.lastIndexOf('i');
		System.out.print("i'nin geçtiği yerler= ");
		while (name >= 0) {

			if (name < lastName) {
				System.out.print(name + ",");
				name = metin.indexOf('i', name + 1);
			} else if (name == lastName) {
				System.out.print(name);
				name = metin.indexOf('i', name + 1);
			}
		}
		
		*/
		
		
        int i=0;
        System.out.print("i harfinin geçtiği yerler:");
        while(i<metin.length()) {
            if(metin.charAt(i)=='i') {
                System.out.print(" "+i+",");
            }
            i++;
        }
		

	}

}
