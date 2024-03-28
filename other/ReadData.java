import java.io.BufferedReader;
import java.io.FileReader;

import static java.lang.String.*;
import static java.lang.Thread.sleep;

public class ReadData {
    public static void main(String[] args) throws Exception {
        multiDimensionalArray();
        readSqlFile();
    }
    public static void readSqlFile() throws Exception {
        try (FileReader file = new FileReader("C:\\Users\\ICT\\Desktop\\tall\\sub.sql")) {
            int i = 0;
            while ((i = file.read()) != -1) {
                System.out.print((char) i);
                sleep(2);
            }
        }
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\ICT\\Desktop\\tall\\main.sql"))){
            while (br.read() != -1){
                System.out.print((char)br.read());
                sleep(1);
            }
        }
    }

    public static void multiDimensionalArray(){
        String[][] arr =new String[5][2];      // JAGGED ARRAY...
        arr[0]=new String[6];
        arr[1]=new String[7];
        arr[2]=new String[2];
        arr[3]=new String[4];
        arr[4]=new String[3];

        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               arr[i][j]=format("%02d",(int) ((Math.random()*100)));
           }
        }
        for(String []i : arr){
            for(String j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}