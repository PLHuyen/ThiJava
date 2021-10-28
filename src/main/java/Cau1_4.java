import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Cau1_4 {
    public static void main(String[] args) {
        ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();
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
                listSV.add(newSV);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



            Collections.sort(listSV, new Comparator<SinhVien>() {
                public int compare(SinhVien o1, SinhVien o2) {
                    return Double.compare(o1.getDiemTongKet(), o2.getDiemTongKet());
                }
            });
            for (int i = 0; i < 10; i++) {
                System.out.println(listSV.get(i).getName() + " " + listSV.get(i).getDiemTongKet());
            }
        System.out.println("Danh sách 10 sinh viên có điểm tổng kết thấp nhất: ");
        }
    }


