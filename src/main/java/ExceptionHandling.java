import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ExceptionHandling {

    public static void main(String[] args) {

        System.out.println("Beginning");
        try{
            int[] array = new int[4];
            array[5] = 20;
            System.out.println(array[5]);
            System.out.println("Inside try catch ");
        } catch (Exception e){
            System.out.println("Error occurred because: " +e.getMessage());
            e.printStackTrace();
            System.out.println("Inside catch");
        }
        System.out.println("Ending");

    }

}
