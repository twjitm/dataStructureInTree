package datastruct.advance;

import java.io.*;

/**
 *测试1
 * 2018.6.22
 */
public class TwjTest1 {

    private static final String GLOBAL_FILE = "E://advance.txt";

    public static void main(String[] args) {
        String[][] array = {
                {"k1=v1", "k2=v2"},
                {"A1=a1", "A2=a2", "A3=a3"}
        };
        store(array);
        load();
    }

    private static void store(String[][] array) {
        StringBuilder temp = new StringBuilder();
        for (String[] anArray : array) {
            for (int j = 0; j < anArray.length; j++) {
                if (j == 0) {
                    temp.append(anArray[j]);
                } else {
                    temp.append(";");
                    temp.append(anArray[j]);
                }
            }
            temp.append("\n");
        }
        try {
            File file = new File(GLOBAL_FILE);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(GLOBAL_FILE, true);
            writer.write(temp.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String[][] load() {
        try {
            StringBuilder result = new StringBuilder();
            FileReader reader = new FileReader(GLOBAL_FILE);
            int tag;
            tag = reader.read();
            while (tag != -1) {
                result.append((char) tag);
                tag = reader.read();
            }
            String[] row = result.toString().split("\\r?\\n");
            String[][] arr = new String[row.length][];
            for (int i = 0; i < row.length; i++) {
                String[] val = row[i].split(";");
                arr[i] = val;
            }
            reader.close();
            return arr;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
