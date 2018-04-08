package utils;

import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FtpConnection {

    public static void loadFileInFtp (String filePath, String fileName){

        File outArxFile=new File(filePath);
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect("127.0.0.1");
            ftpClient.login("user", "rassword");
            ftpClient.changeWorkingDirectory("in");
            InputStream in = new FileInputStream(outArxFile);
            ftpClient.appendFile(fileName, in);
            ftpClient.logout();
            ftpClient.disconnect();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
