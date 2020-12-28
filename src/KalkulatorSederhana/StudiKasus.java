package KalkulatorSederhana;
import java.util.Scanner;
/**
 *
 * @author COMPAC
 */
public class StudiKasus {
    public static void main(String[] args) {
    double result = 0;
    
    System.out.println("==== Aplikasi Kalkulator Sederhana ====");
    System.out.println("Pilihan Operasi:\n"
                    + " 1. Penjumlahan\n"
                    + " 2. Pengurangan\n"
                    + " 3. Pekalian\n"
                    + " 4. Pembagian\n");
    System.out.print("Masukkan pilihan: ");
    Scanner operation = new Scanner(System.in);
    int option = operation.nextInt();
    
    //input bilangan
    System.out.print("Bilangan Pertama  : ");
    Scanner val1 = new Scanner(System.in);
    double bil1 = val1.nextDouble();
    System.out.print("Bilangan Kedua    : ");
    Scanner val2 = new Scanner(System.in);
    double bil2 = val1.nextDouble();
    
    //switch case operasi
    switch(option) {
        case 1:
            System.out.println("\nPenjumlahan");
            result = bil1 + bil2;
            System.out.format("Hasil: %.2f\n", result);
        break;

        case 2:
            System.out.println("\nPengurangan");
            result = bil1 - bil2;
            System.out.format("Hasil: %.2f\n", result);
        break;
        
        case 3:
            System.out.println("\nPerkalian");
            result = bil1 * bil2;
            System.out.format("Hasil: %.2f\n", result);
        break;
        
        case 4:
            System.out.println("\nPembagian");
            result = bil1/bil2;
            System.out.format("Hasil: %.2f\n", result);
        break;
    }
}
    
}


