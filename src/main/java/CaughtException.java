public class CaughtException {
    public static void main(String[] args) throws Exception  {

        int[] array = new int[4];
        try{
            array[5] = 20;
        }catch (Exception ex){
            System.out.println("Error occured");
            throw new Exception("Array size is not correct");
        }

        Thread.sleep(1000);
        Thread.sleep(1000);

        Thread.sleep(1000);
        System.out.println("Exception handled");

    }
}
