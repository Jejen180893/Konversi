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