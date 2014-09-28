import java.util.Scanner;
import javax.swing.JOptionPane;

public class konversidesimal {
    static String name;
    static String kelamin;
    static int bilDes; //Variabel
	
public static void Biner(int n){
    if(n>1){
		Biner(n/2);
    }
    System.out.print(n%2);//Proses Penghitungan Bil biner
}
public static void Hexa(int n){
    char[] daftarHexa={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    if(n>0){
        Hexa(n/16);
        System.out.print(daftarHexa[n%16]);//Proses Penghitungan bilangan Hexa
    }
}
public static void Oktal(int n){
    char[] daftarOktal={'0','1','2','3','4','5','6','7'};
    if(n>0){
        Oktal(n/8);
        System.out.print(daftarOktal[n%8]);//Proses Penghitungan bilangan Oktal
    }
}
public static void inputDes(){
    System.out.print("Masukkan Bilangan Desimal = ");
    Scanner inputan=new Scanner(System.in);
    bilDes=inputan.nextInt();
    
}
public static void tampilBiner(){
    inputDes();
    System.out.print("Binernya adalah ");
    Biner(bilDes);
}
public static void tampilHexa(){
    inputDes();
    System.out.print("Hexanya adalah ");
    Hexa(bilDes);
}
public static void tampilOktal(){
    inputDes();
    System.out.print("Oktalnya adalah ");
    Oktal(bilDes);
}