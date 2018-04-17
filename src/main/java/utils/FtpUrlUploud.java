package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class FtpUrlUploud {

    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {
        String ftpUrl = "ftp://%s:%s@%s/%s;type=i";
        String host = "ftp04.temafon.ru";
        String user = "ftp_tkiosk_test";
        String pass = "LBZh#IVPjHoeRWB4t4e$Upxi";
        String filePath = "src/main/resources/cbr/archive_87798888887979878.cbr";
        String uploadPath = "/_test/public/misha_kiosk";

        ftpUrl = String.format(ftpUrl, user, pass, host, uploadPath);
        System.out.println("Upload URL: " + ftpUrl);

        try {
            URL url = new URL(ftpUrl);
            URLConnection conn = url.openConnection();
            OutputStream outputStream = conn.getOutputStream();
            FileInputStream inputStream = new FileInputStream(filePath);

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            inputStream.close();
            outputStream.close();

            System.out.println("File uploaded");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
