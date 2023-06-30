import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class hw_2_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int[] myArray = new int[10];
        String newMass = "";
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random()*(100+1));
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }

        for (int i = 0; i < myArray.length-1; i++) {
            for (int j = 0; j < myArray.length-i-1; j++) {
                if (myArray[j] > myArray[j+1]){
                    int min = myArray[j+1];
                    int max = myArray[j];
                    myArray[j] = min;
                    myArray[j+1] = max;
                }
            }
            for (int k = 0; k < myArray.length; k++) {
                // System.out.print(myArray[k]+" ");
                String s = String.valueOf(myArray[k]+" ");
                newMass += s;
                // writeFile("file.txt", myArray[k]);
            }
            newMass += "\n";
            System.out.println(newMass);
            writeFile("file.txt", newMass);
        }
        // System.out.println();
        // for (int i = 0; i < myArray.length; i++) {
        //     System.out.print(myArray[i]+" ");
        // }
    }


    static void writeFile(String fileName, String data){
        String filePath = "file.txt";
        String text = data;

        try {
            Files.write(Paths.get(filePath), text.getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

}
