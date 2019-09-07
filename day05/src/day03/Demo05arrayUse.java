package day03;

public class Demo05arrayUse {
    public static void main(String[] args) {
        int[] array =new int[3];
        System.out.println(array);
        System.out.println(array[0] );
        System.out.println(array[1]);
        System.out.println(array[2]);
        array[1]=123;
        System.out.println(array[1] );
        int[] arrayB = new int[]{12,34,56,78,32,35,56,7,8,999,1008,};
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i]+", ");

        }

    }


}
