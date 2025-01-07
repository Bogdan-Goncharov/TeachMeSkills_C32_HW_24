package servlet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;


public class Logger {
    private static final String LOG_FILE = "resources/logs.txt";

    public static void log(String message) {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            String timeStamp = LocalDateTime.now().toString();
            bw.write(timeStamp + "-" + message);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
