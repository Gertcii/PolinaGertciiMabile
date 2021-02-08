package setup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfProperties {
    final static Properties PROPERTIES = new Properties();

    static {
        try (FileInputStream fis =
                     new FileInputStream(
                             "src/test/resources/mobile.properties")) {
            PROPERTIES.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }

    public static String getEmail() {
        return getProperty("email");
    }

    public static String getUserName() {
        return getProperty("userName");
    }

    public static String getPassword() {
        return getProperty("password");
    }

    public static String getInputText() {
        return getProperty("inputText");
    }
}
