package Day15;

public class Exception01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        try{
            System.out.println(arr[0]);
            System.out.println(arr[4]);

        }catch (Exception ex){
//            System.out.println(ex);
        }

        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("后续代码!");
    }
}
