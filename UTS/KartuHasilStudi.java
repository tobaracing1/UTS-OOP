package UTS;
/*
Nama    : Ricky
NIM     : 03082200012
 */
import java.util.ArrayList;
public class KartuHasilStudi{
    int Semester;
    mahasiswa Mahasiswa;
    ArrayList<NilaiStudi> ListNilaistudi = new ArrayList<NilaiStudi>();

    public KartuHasilStudi(int semester,mahasiswa maha){
        this.Semester=semester;
        this.Mahasiswa=maha;
    }

    public int getSemester() {
        return this.Semester;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }

    public mahasiswa getMahasiswa() {
        return this.Mahasiswa;
    }

    public void setMahasiswa(mahasiswa Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }

    public ArrayList<NilaiStudi> getListNilaistudi() {
        return this.ListNilaistudi;
    }

    public void setListNilaistudi(ArrayList<NilaiStudi> ListNilaistudi) {
        this.ListNilaistudi = ListNilaistudi;
    }

    public void tambahkanNilai(MataKuliah mata, char nilai){
        NilaiStudi baru = new NilaiStudi(mata, nilai);
        ListNilaistudi.add(baru);
    }

    public int totalSKS(){
        int total = 0;
        for(NilaiStudi nilai : ListNilaistudi){
            total += nilai.getSKS() ;
        }
        return total;
    }

    public Double IPK(){
        int TotalSks = totalSKS();
        Double TotalSksconvert = (double) TotalSks;

        Double Totalbawah = TotalSksconvert;
        Double Totalatas =0.0;
        for (NilaiStudi asd : ListNilaistudi){
            Totalatas += asd.getNilaiAngka(asd.NilaiHuruf) * asd.getSKS();
        }
        Double hasil = Totalatas/Totalbawah;
        return hasil;
    }

    public void tampilkanKHS(){
        int count = 1;
        System.out.println("Nama Mahasiswa\t:"+ Mahasiswa.nama);
        System.out.println("Semester   \t:"+ Semester);
        System.out.println("IPK     \t:" + IPK());
        System.out.println("Total SKS\t:" + totalSKS());
        System.out.println("");
        System.out.println("Nilai");
        System.out.println("No.\t\t" + "Kode Matakulaih\t\t" + "Nama Matakuliah\t\t" + "SKS\t\t" + "Nilai");
        for(NilaiStudi a : ListNilaistudi){
            System.out.print(count);
            System.out.println(a.toString());
            count++;
        }
    }

 }