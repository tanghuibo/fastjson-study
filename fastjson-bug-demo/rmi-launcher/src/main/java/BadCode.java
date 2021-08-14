import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author tanghuibo
 * @date 2021/8/15上午1:44
 */
public class BadCode {

    static {
        try(FileOutputStream outputStream = new FileOutputStream("bedCodeInit.txt")) {
            outputStream.write("bad code init".getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
