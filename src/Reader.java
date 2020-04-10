import java.io.*;

public class Reader {
    public void ReadFile(String pathFile) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String symbol = ",";
        try {
            file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrString = line.split(symbol);
                System.out.printf(arrString[5] + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
