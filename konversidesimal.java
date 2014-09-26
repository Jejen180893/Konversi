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
public static int inpBil(){
    System.out.println("=========="
            + "\n Selamat datang "+kelamin+"  "+name+""+",");
    System.out.println("Silahkan memilih Menu Konversi "
            + "Bilangan ke : "+
            "\n1. Biner \n2. Hexa \n3. Oktal \n4. Exit"
            );
    System.out.print("Masukkan Angka Menunya = ");
    Scanner inputan = new Scanner(System.in);
    int pilmenu=inputan.nextInt();
    return pilmenu;
}
public static void menU(int pil){
    System.out.println("\033"); 
    switch(pil){
        case 1 : tampilBiner(); break;
        case 2 : tampilHexa(); break;
        case 3 : tampilOktal(); break;
        case 4 : System.out.println("Thx Dah mampir");
            System.exit(0); break;
        default : System.out.println("(Maaf. Pilih angka 1-4 saja yg tersedia)");
        break;
    }
    System.out.println("\033");
}
public static void main(String arg[]){
   
    name=JOptionPane.showInputDialog("Masukkan nama Anda : ");
        String[] choices = {"Cewek", "Cowok", "Exit?"};
        
        String Perempuan="Sista";
        String Laki="Agan";
        while (true) {
            int response = JOptionPane.showOptionDialog(
                               null                       
, "Apa jenis kelamin Anda ?"    
, "Jenis Kelamin"               
, JOptionPane.YES_NO_OPTION  
, JOptionPane.QUESTION_MESSAGE  
, null                       
, choices     
, "Exit?"    
                           );
        switch(response){
            case 0 : kelamin=Perempuan;
                break;
            case 1 : kelamin=Laki;
                break;
            default : kelamin="Tidak Ada";
        }
    do{
        menU(inpBil());
    }
    while(true);
        }
}
}