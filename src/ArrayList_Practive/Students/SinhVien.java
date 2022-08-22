package ArrayList_Practive.Students;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{
    private int maSinhVien = 0;
    private String hoVaTen = "A";
    private float diemTrungBinh;
    private int tuoi = 18;

    // constactur

    public SinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }



    public SinhVien(int maSinhVien, String hoVaTen, float diemTrungBinh, int tuoi) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.diemTrungBinh = diemTrungBinh;
        this.tuoi = tuoi;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien=" + maSinhVien +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                ", tuoi=" + tuoi +
                '}';
    }

    @Override
    public int compareTo(SinhVien o) {
        if (this.maSinhVien == o.maSinhVien){
            return 1;
        }else return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return maSinhVien == sinhVien.maSinhVien;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSinhVien);
    }
}
