import java.io.*;
import java.util.*;


public class HJ23 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
               //好复杂啊，怎么记
            String aa = reader.readLine();
            char[] c = aa.toCharArray();
            int[] temp = new int[26];
            
            for(int i = 0; i < c.length; i++)
            {temp[c[i]-'a']++;}

            int min = 50;
            for(int i = 0; i < 26; i++)
            {
                if(temp[i] != 0)
                min = Math.min(min,temp[i]);
            }

            for(int i = 0; i < 26; i++)
            {
                char ch = (char)(i + 'a');
                if(temp[i] == min)
                aa = aa.replace(ch + "","");  //替换不会，是特殊用法吗？
            }
            System.out.println(aa);
        }
    }//字符串的键入和字符串的处理比较复杂需记忆

