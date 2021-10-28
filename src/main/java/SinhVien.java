import java.util.Collections;
import java.util.Comparator;

public class SinhVien implements Comparable<SinhVien> {

    private int id;
    private String name;
    private String email;
    private int bonus;
    private int report;
    private int app;
    private double lt;
    private double diemTongKet;
    private int n = SinhVien.size();

    public SinhVien() {

    }

    protected static int size() {
        return 0;
    }


    public SinhVien(int id, String name, String email, int bonus, int report, int app, double lt, double diemTongKet) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.bonus = bonus;
        this.report = report;
        this.app = app;
        this.lt = lt;
        this.diemTongKet = diemTongKet;
    }

    public static void get(int i) {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getReport() {
        return report;
    }

    public void setReport(int report) {
        this.report = report;
    }

    public int getApp() {
        return app;
    }

    public void setApp(int app) {
        this.app = app;
    }

    public double getLt() {
        return lt;
    }

    public void setLt(double lt) {
        this.lt = lt;
    }

    public SinhVien(double diemTongKet) {
        this.diemTongKet = diemTongKet;
    }

    public double getDiemTongKet() {
        return diemTongKet;
    }

    public void setDiemTongKet(double diemTongKet) {
        this.diemTongKet = diemTongKet;
    }

    @Override
    public int compareTo(SinhVien o) {
        return Double.compare(this.lt, o.lt);
    }
}




