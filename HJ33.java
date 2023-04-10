import java.util.Scanner;


public class HJ33 {
    private int N = 4;
    


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       HJ33 mm = new HJ33();
        while (in.hasNext()) { 
            String str = in.next();
            String res = mm.tenkan(str);
            System.out.println(res);
        }
        }
    public String tenkan(String str)
    {
        if(str.contains(".")){
            String[] arr = str.split("\\.");
            long result = 0;
            for(int i = 0; i < N; i++){
                result = result * 256 + Integer.parseInt(arr[i]);
            }
            return ""+result;
        }
        else{
            long aa = Long.valueOf(str);
            String result = "";
            for(int i = 0; i < N; i++){
                result = aa % 256 + "." + result;
                aa = aa / 256;
            }
            return result.substring(0,result.length()-1);
        }
    }
    
}
