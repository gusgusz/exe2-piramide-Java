public class App {
    public static void main(String[] args) throws Exception {
        for(int i = 1;i < 10; i++){
            int u = 0;
            String res = "";
            while(u < i){
                res = res + i;
                u++;
            }
            System.out.println(res);
        }
    }
}
