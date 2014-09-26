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