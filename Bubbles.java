
import java.io.PrintWriter;
import java.util.logging.Logger;
import java.util.Arrays;
import java.io.FileNotFoundException;

public class Bubbles {
    /*
     * Реализуйте алгоритм сортировки пузырьком числового массива, 
     * результат после каждой итерации запишите в лог-файл.
     */
    private static Logger logger = Logger.getLogger(Bubbles.class.getName());
    public static void main(String[] args) {
        int arr[] ={5,6,4,7,3,8,2,9,1};
        int temp = 0;

        try(PrintWriter out = new PrintWriter("fileFolders.txt")) {

            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length-i; j++) {
                    if (arr[j-1] > arr[j]){
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                }
        }
            out.println(Arrays.toString(arr));
            logger.info("Содержимое записано в файл fileFolders.txt");
        } catch (FileNotFoundException e) {
            logger.info(e.getMessage());
        }

}
}
