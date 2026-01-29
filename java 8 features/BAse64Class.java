import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class BAse64Class {
    public static void main(String[] args) throws Exception {
        String name = "satyam";
        String encoding= Base64.getEncoder().encodeToString(name.getBytes("utf-8"));
        String encoding2= Base64.getEncoder().encodeToString(name.getBytes(StandardCharsets.UTF_8));
        System.out.println(encoding);

        byte[] decoding = Base64.getDecoder().decode(encoding);
        System.out.println("Name is "+ new String(decoding));
    }
}
