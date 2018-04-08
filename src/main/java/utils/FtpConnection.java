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
            ftpClient.connect("ftp04.temafon.ru");
            ftpClient.login("ftp_tkiosk_test", "LBZh#IVPjHoeRWB4t4e$Upxi");
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
