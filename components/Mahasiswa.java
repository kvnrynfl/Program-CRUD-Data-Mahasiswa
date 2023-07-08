package components;

public class Mahasiswa {
    private int id;
    private String namaLengkap;
    private int npm;
    private String programStudi;
    private String agama;
    private String noTelepon;
    private String alamat;
    private String tanggalLahir;

    public Mahasiswa(int id, String namaLengkap, int npm, String programStudi, String agama, String noTelepon, String alamat, String tanggalLahir) {
        this.id = id;
        this.namaLengkap = namaLengkap;
        this.npm = npm;
        this.programStudi = programStudi;
        this.agama = agama;
        this.noTelepon = noTelepon;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
    }

    public int getId() {
        return id;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public int getNpm() {
        return npm;
    }

    public void setNpm(int npm) {
        this.npm = npm;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
}
