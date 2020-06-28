public class Mahasiswa {

    //atribut
    int id;
    String npm;
    String nama;
    double ipk;

    //behavior/method
    //method tanpa nilai balik / procedure
    void tampilData(){
        System.out.println("ID dari Mahasiswa :" + id);
        System.out.println(npm);
        System.out.println(nama);
        System.out.println(ipk);
    }

    void tampilDataDenganGaris(String karakter){
        System.out.println(karakter);
        System.out.println("ID \t:" + id);
        System.out.println("NPM \t: " + npm);
        System.out.println("Nama \t: " + nama);
        System.out.println("IPK \t: " + ipk);
        System.out.println(karakter);
    }

    void hitungluasPersegiPanjang(){
        double panjang = 5;
        double lebar = 2;
        System.out.println("Panjang \t: " + panjang);
        System.out.println("Lebar \t\t: " + lebar);
        System.out.println("Luas \t\t: " + panjang*lebar);
    }

    //method dengan nilai balik dengan argument/parameter
    double hitungluasPersegiPanjang(double panjang, double lebar){
        return panjang*lebar;
    }

    //method dengan nilai balik / function
    double getIpk(){
        return ipk;
    }
}
