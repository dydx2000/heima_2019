public class hellojava {
    public static void main(String[] args) {
        System.out.println("Day01 java");
        for (int i = 0; i < 5; i++) {
            System.out.print("*");

        }
        System.out.println();
        System.out.println(add(9,10));
        add(10,90);
        int j = add(32,3234);
        System.out.println(j);

    }
    public static int add(int x,int y){
        int result = x +y;
//        System.out.println(result);
        return result;

    }


}
