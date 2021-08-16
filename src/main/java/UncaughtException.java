public class UncaughtException {

    public static void main(String[] args) throws Exception{

        int[] array = new int[4];
        try{
            array[5] = 20;
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Error occured");
            throw new Exception("Array size is not correct");
        }

    }
}
