import java.util.Scanner;
import java.io.*;

public class HJ106 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//hasNext 与 hasNextLine 一个检测空格（是否有非空字符）一个检测回车（是否有下一行，包括空行）
        while (in.hasNextLine()) {   
            String a = in.nextLine();  // .next 与 .nextLine 同样 注意区分
            char[] charArr = a.toCharArray();
            for (int i = a.length() - 1; i >= 0; i--) {
                System.out.printf("%c", charArr[i]);
            }
        }
    }
}