package UTS;
/*
    Nama    : Ricky
    NIM     : 03082200012
*/
public class MataKuliah {
    String KodeMatakuliah;
    String NamaMatakuliah;
    int SKS;



    public String getKodeMatakuliah() {
        return this.KodeMatakuliah;
    }

    public void setKodeMatakuliah(String KodeMatakuliah) {
        this.KodeMatakuliah = KodeMatakuliah;
    }

    public String getNamaMatakuliah() {
        return this.NamaMatakuliah;
    }

    public void setNamaMatakuliah(String NamaMatakuliah) {
        this.NamaMatakuliah = NamaMatakuliah;
    }

    public int getSKS() {
        return this.SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    public MataKuliah(String kode,String nama,int sks){
        this.KodeMatakuliah=kode;
        this.NamaMatakuliah=nama;
        this.SKS=sks;
    }

    public MataKuliah(){

    }

}
