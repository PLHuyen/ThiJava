import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Cau1_2 {

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

        listSV.sort((a,b) -> Double.compare(a.getLt(),b.getLt()));
        System.out.println("Top 10 Sinh Vien Co Diem Thi Cao Nhat");
        for(int i = 0 ; i < 10 ; i++)
        {
            int top = i + 1;
            System.out.println(" Top " + top + " : " + listSV.get(i).getName());
        }
    }
}
