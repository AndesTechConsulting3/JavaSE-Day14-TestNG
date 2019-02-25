package org.andestech.learning.rfb18.g2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Utils {

    public static Object[][] getLoginsfromDisk(String filename)
    {
        Object[][] datas = null;

        ArrayList<Object[]> list = new ArrayList<>();
        String[] arr;

        try(FileInputStream fis = new FileInputStream(filename) ) {

            Scanner scanner = new Scanner(fis);
            scanner.useDelimiter("\r\n");
            while (scanner.hasNext())
            {
                String dataString = scanner.next();
                // System.out.println(scanner.next());
                if(dataString.startsWith("#") || dataString.isEmpty()) continue;

                arr = new String[3];
                String[] stArray = dataString.split(",");
                for (int i=0; i<3; i++)
                {
                    arr[i] = stArray[i].trim().toUpperCase();

                }

                list.add(arr);
                System.out.println(Arrays.toString(arr));



            }

           int N = list.size();
           datas = new Object[N][3];
           for(int i =0; i<N; i++) datas[i] = list.get(i);


           // return (Object[][])list.toArray(); not convertable
            return datas;

        }
        catch (IOException  ex){ex.printStackTrace();}




        return null;
    }
}
