public class demoMethods {
    public static void main(String[] args) {
        sum(120);
        getmax(2,23);
        System.out.println(getmax(2,32));
    }

    public static void sum(int i){
        int sum=0;
        for (int i1 = 0; i1 < i; i1++) {
            sum+=i1;
        }
        System.out.println(sum);
    }
    public static int getmax(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
}
