

public class RotateRight {

    public static void main(String[] args) {

        int n = 16;
        int d = 2;
  
        int result =
                (n >> d) |
                (n << (32 - d));

        System.out.println(result);
    }
}
// class RotateRight {

//     public static void main(String[] args) {

//         var x = 10;

//         x = 20;

//         System.out.println(x);
//     }
// }