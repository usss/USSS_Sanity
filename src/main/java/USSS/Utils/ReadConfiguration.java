package USSS.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ReadConfiguration {
    private static InputStream inputStream;
    private static Properties prop = new Properties();

    public ReadConfiguration(String confName) throws IOException {
        try {
            inputStream = new FileInputStream(confName);
            prop.load(inputStream);
        }catch (IOException e){
            throw new IOException("Configuration file not found \r\n" + e);
        }
    }
    public String getDataBase() { return prop.getProperty("DataBase"); }
    public String getHost() { return prop.getProperty("Host");}
    public String getPort() {return prop.getProperty("Port");}
    public String getUserName() {return prop.getProperty("UserName");}
    public String getUserPass() { return prop.getProperty("UserPass");  }

}
