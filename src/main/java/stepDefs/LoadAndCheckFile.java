package stepDefs;


import org.junit.Before;
import org.junit.Test;

import static utils.FtpConnection.loadFileInFtp;

public class LoadAndCheckFile {

    @Before
    public void loadFile(){
      loadFileInFtp("","");
    }

    @Test
    public void checkFile(){

    }

}
