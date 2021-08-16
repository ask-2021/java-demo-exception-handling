//public class ApplicationException {
//     public static void main(String[] args)  {
//
//        int[] array = new int[4];
//        System.out.println("Before try block");
//        array[5] = 20;
//        System.out.println(array[5]);

//        int a= 10;
//        int b = 0;
//        if(b!=0){
//            int result1 = a/b;
//        }else {
//            System.out.println("Error occurred:  b is equals to 0, b: = " + b);
//            throw  new Exception("b is invalid, needs to be greater than 0, b: = "+ b);
//        }

//        System.out.println("Before try block");
//        try {
//            System.out.println("Beginning");
//            int result = 10 / 0;
//            System.out.println(result);
//            System.out.println("Inside try block");
//        } catch (Exception e) {
//            System.out.println("Error Occurred " + e.getMessage());
//            e.printStackTrace();
//        }
//        System.out.println("After try catch block");
//    }
//}
