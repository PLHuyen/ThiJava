import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Cau1_3 {

    public static void main(String[] args) {
//        ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();
        List<SinhVien> result = new ArrayList<>();
        try {
            InputStream readfilecsv = new FileInputStream("src\\main\\java\\data.csv");
            BufferedReader br = new BufferedReader(new InputStreamReader(readfilecsv));
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                SinhVien newSV = new SinhVien();
                String[] values = line.split(",");
                newSV.setId(Integer.parseInt(values[0]));
                newSV.setName(values[1]);
                newSV.setEmail(values[2]);
                newSV.setBonus(Integer.parseInt(values[3]));
                newSV.setReport(Integer.parseInt(values[4]));
                newSV.setApp(Integer.parseInt(values[5]));
                newSV.setLt(Double.parseDouble(values[6]));
                result.add(newSV);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Điểm tổng kết của sinh viên: ");
        System.out.println();
            for (int i = 0; i < SinhVien.size(); i++) {
                SinhVien.get(i).setDiemTongKet(Math.round((SinhVien.get(i).getBonus() * 0.1 + SinhVien.get(i).getReport() * 0.3 + SinhVien.get(i).getApp() * 0.15 + SinhVien.get(i).getLt() * 0.45) * 10) / 10.0);
                SinhVien.get(i).setDiemTongKet(Math.round(SinhVien.get(i).getDiemTongKet() * 2) / 2.0);
            }
        }
    }

