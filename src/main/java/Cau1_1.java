import java.io.*;


public class Cau1_1 {
    public static void main(String[] args) {

            try {
                InputStream readfilecsv = new FileInputStream("src\\main\\java\\data.csv");
                BufferedReader br = new BufferedReader(new InputStreamReader(readfilecsv));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println("\n " + line);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

