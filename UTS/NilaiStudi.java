package UTS;
/*
    Nama    : Ricky
    NIM     : 03082200012
*/
public class NilaiStudi {
    MataKuliah matakuliah;
    char NilaiHuruf;

    NilaiStudi(MataKuliah mata,char Nilai){
        this.matakuliah=mata;
        this.NilaiHuruf=Nilai;
    }

    public int getSKS(){
        int sks = matakuliah.SKS;
        return sks;
    }

    public MataKuliah getMatakuliah() {
        return this.matakuliah;
    }

    public void setMatakuliah(MataKuliah matakuliah) {
        this.matakuliah = matakuliah;
    }

    public char getNilaiHuruf() {
        return this.NilaiHuruf;
    }

    public void setNilaiHuruf(char NilaiHuruf) {
        this.NilaiHuruf = NilaiHuruf;
    }

    public Double getNilaiAngka(char nilai){
        Double nilaiAngka = 0.0 ;
        if (nilai == 'A'){
            nilaiAngka = 4.0;
        }
        else if (nilai == 'B'){
            nilaiAngka = 3.0;
        }
        else if (nilai == 'C'){
            nilaiAngka = 2.0;
        }
        else if (nilai == 'D'){
            nilaiAngka = 1.0;
        }
        else{
            nilaiAngka = 0.0;
        }
        return nilaiAngka;
    }

    @Override
    public String toString() {
        return 
        "\t\t" + matakuliah.getKodeMatakuliah() + "\t\t\t" + matakuliah.getNamaMatakuliah() + "\t\t\t" +  matakuliah.SKS + "\t\t" + this.NilaiHuruf;
        
    } 

}
