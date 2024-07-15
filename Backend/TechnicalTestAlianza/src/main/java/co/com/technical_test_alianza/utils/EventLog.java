package co.com.technical_test_alianza.utils;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@AllArgsConstructor
@Service
public class EventLog {
    public  void logEvent(String logLevel,String message) {
        try
        {
            String formattedDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            String msg = String.format("%s\t%s\t%s", logLevel, formattedDateTime, message);
            writeToFile(msg);
        }
        catch (Exception e)
        {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        }
    }

    public  static void  writeToFile(String content) {
        String name = "./target/logs/log_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + ".txt";
        try (FileWriter writer = new FileWriter(name, true)) {
            writer.write(content + "\n");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
