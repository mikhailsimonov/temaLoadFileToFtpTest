/*
package utils;

import java.io.File;

public class RenameFile {



    public static String randomFileName(){

        String symbols = "asd2342fsafslkf32888888dlskflk32424skfkdlsflewsdfk";
        StringBuilder randString = new StringBuilder();
        int count = (int)(Math.random()*30);
        for(int i=0;i<count;i++)
            randString.append(symbols.charAt((int)(Math.random()*symbols.length())));

        //System.out.println(randString);
        return randString.toString();
    }

    public static void rename(String filePath){
        //здесь указываем абсолютный путь к файлу
        File file = new File(filePath);
        File newFile = new File("src/main/resources/cbr/+"+randomFileName()+".cbr");
        fileCopy
        if(file.renameTo(newFile)){
            System.out.println("Файл переименован успешно");;
        }else{
            System.out.println("Файл не был переименован");
        }
    }

    public static void main(String[]args){
        randomFileName();
        rename("src/main/resources/cbr/archive_4481_62870.cb");
    }
}
*/
