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


public class Printer {
    private int jmlCetak;
    private String nama;
    
    public int getJmlCetak(){
        return jmlCetak;
    }
    
    public void setJmlCetak(int jmlCetak){
        this.jmlCetak = jmlCetak;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void cetak(String nama){
        System.out.println("Nama Anda : " +getNama());
    }
    
    public void cetak(int jmlCetak, String nama){
        System.out.println("Hasil Cetak : ");
        for (int i = 1; i <= getJmlCetak(); i++){
            System.out.println(i+". "+getNama());
        }
    }
    
}
