import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class HJ5 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // 注意 hasNext 和 hasNextLine 的区别
            while (in.hasNextLine()) {
                String moto = in.nextLine();
                int c = 0;
                for(int i = 0;i < moto.length()-2 ; i++)
                {
                    char mototo = moto.charAt(i+2);
                    int st = 0;
                    if(mototo >= '0' && mototo <= '9')
                    {
                        st = mototo - '0';
                    }
                    else if (mototo >= 'A' && mototo <= 'F')
                    {
                        st = mototo - 'A' + 10;
                    }
                    else if(mototo >= 'a' && mototo <= 'f')
                    {
                        st = mototo - 'a' + 10;
                    }
                    c += st * Math.pow(16,moto.length() -3 - i);
                }
                System.out.printf("%d",c);
            }
        }
    }
}