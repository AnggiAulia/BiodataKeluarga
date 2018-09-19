
package tugas1;


public class testbiodata {

    public static void main(String[] args) {
         biodata n = new biodata();
        n.setNamaAyah("Mustaqim");
        n.setNamaIbu("Ernawati");
        n.setNamaSaudara("Hilmi Rahmaniar Khonsa dan Naufal Brilliansyah Islam");
        n.setNamaSaya("Anggi Aulia Putri");
        n.setAlamat("Jl.BalongRaweBaru");
        n.setTempatLahir("Mojokerto");
        n.setTanggalLahir("3 Maret 2003");
        n.setHobi("bermain alat musik");
        n.setCitaCita("Arsitek");
        n.setNoTelepon("083830611956");
        
        System.out.println("Nama Ayah : "+ n.getNamaAyah());
        System.out.println("Nama Ibu : "+ n.getNamaIbu());
        System.out.println("Nama Saya : " + n.getNamaSaya());
        System.out.println("Nama Saudara : "+ n.getNamaSaudara());
        System.out.println("Alamat : "+ n.getAlamat());
        System.out.println("Tempat Lahir : "+ n.getTempatLahir());
        System.out.println("Tanggal Lahir : "+ n.getTanggalLahir());
        System.out.println("Hobi : "+ n.getHobi());
        System.out.println("Cita Cita : "+ n.getCitaCita());
        System.out.println("No Telepon : "+ n.getNoTelepon());
    }
    
}
