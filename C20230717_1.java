package CPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C20230717_1 {
    public void readData(String filename) {
        BufferedReader reader = null;
        try { 
            reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                // 데이터 처리 로직
            }
        } catch (IOException e) {
            System.err.println("파일 읽기 오류: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("파일 닫기 오류: " + e.getMessage());
            }
        }
    }
}

