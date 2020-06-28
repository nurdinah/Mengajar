public class Main {
    public static void main(String[] args) {
        //Enstance / pembuatan objek dari class
        //nameclass namaobjek = new constructor()
        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.id = 1;
        mahasiswa.nama = "Nurdinah";
        mahasiswa.npm = "18630412";
        mahasiswa.ipk = 3.54;
        mahasiswa.tampilData();

        double hasilReturnValue = mahasiswa.getIpk();
     //   System.out.println("Hasil return value : " + hasilReturnValue);

     //   mahasiswa.tampilDataDenganGaris("================");
     //   mahasiswa.tampilDataDenganGaris("================");
        mahasiswa.hitungluasPersegiPanjang();

    }
}
