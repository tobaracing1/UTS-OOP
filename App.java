import UTS.*;
/*
    Nama    : Ricky
    NIM     : 03082200012
*/
import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        mahasiswa Mahasiswa = new mahasiswa("Udin");
        KartuHasilStudi kartuhasilstudi = new KartuHasilStudi(3, Mahasiswa);

        MataKuliah matakuliah = new MataKuliah("MK001","OOP",3);
        MataKuliah matakuliah1 = new MataKuliah("MK002","PKN",2);

        kartuhasilstudi.tambahkanNilai(matakuliah, 'A');
        kartuhasilstudi.tambahkanNilai(matakuliah1, 'A');


        int pilihan=0;
        while(pilihan != 2){
            System.out.println("\nMenu    :");
            System.out.println("1.Tampilkan KHS");
            System.out.println("2.Exit");
            System.out.println();
            System.out.print("Pilihan :");            
            pilihan = input.nextInt();          
            if(pilihan == 1){
                kartuhasilstudi.tampilkanKHS();
            }

            else if (pilihan == 2){
                break;
            }

            else{
                System.out.println("Maaf, anda memasukkan pilihan yang salah. Mohon input ulang");
            }
        }
        input.close();
    }
}
