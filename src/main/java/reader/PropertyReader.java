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
            System.out.println("Info : Property files has been loaded.");
        }
        catch (NullPointerException | IOException e) {
            throw new RuntimeException("Problem occurred while loading properties file.");
        }
    }

    public static String getProperty(String key){
        if(!properties.containsKey(key)){
            throw new RuntimeException("Specified key = " + key + "is not available in properties file.");
        }
        return (String) properties.get(key);
    }

}
