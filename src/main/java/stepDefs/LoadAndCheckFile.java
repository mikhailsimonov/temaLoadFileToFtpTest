package stepDefs;


import org.junit.Before;
import org.junit.Test;

import static utils.FtpConnection.loadFileInFtp;

public class LoadAndCheckFile {

    @Before
    public void loadFile(){
      loadFileInFtp("src/main/resources/cbr/archive_87798888887979878.cbr","archive_87798888887979878.cbr");
    }

    @Test
    public void checkFile(){

    }

}
