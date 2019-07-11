package reader;

import constant.Constants;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    private static final Properties properties = new Properties();

    static {
        try {
            InputStream inputStream = ClassLoader.getSystemResourceAsStream(Constants.PROPERTIES_NAME);
            properties.load(inputStream);
            System.out.println("Property files has been loaded.");
        }
        catch (IOException ioe){
            ioe.getMessage();
        }
    }

    public static String getProperty(String key){
        if(properties.containsKey(key)){
            return (String) properties.get(key);
        }
        return null;
    }

}
