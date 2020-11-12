/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan Cetak Nama
 */
package pboif2.pkg10119059.latihan45.cetaknama;
/**
 *
 * @author Corazon
 */
import java.util.Scanner;
public class PBOIF210119059Latihan45CetakNama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Printer printer = new Printer();
        
        System.out.println("======= Aplikasi Pencetak Nama =======");
        System.out.print("Masukkan Nama Anda : ");
        printer.setNama(input.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJmlCetak(input.nextInt());
        
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}
