package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RuntimeCommandUtils {

    private RuntimeCommandUtils() {
    }

    public static String executeCurl(String cmd) {
        Process process;
        String result;
        try {
            process = Runtime.getRuntime().exec(cmd.split(" "));

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }
            result = builder.toString();
        } catch (IOException e) {
            throw new CurlRuntimeException(e);
        }
        return result;
    }
}

class CurlRuntimeException extends RuntimeException {
    public CurlRuntimeException(IOException e) {
        super(e);
    }
}
