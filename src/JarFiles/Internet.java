package JarFiles;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Internet {

    private static final String FLOWERS_FEED =
            "http://service.hanselandpetal.com/feeds/flowers.xml";

    public static void main(String[] args) throws IOException {

        InputStream stream = null;
        BufferedInputStream buf = null;

        try {
            URL url = new URL(FLOWERS_FEED);

            stream = url.openStream();
            buf = new BufferedInputStream(stream);

            StringBuilder sb = new StringBuilder();
            while(true) {
                int data = buf.read();

                if(data == -1) {
                    break;
                } else {
                    sb.append((char)data);
                }
            }

            System.out.println(sb);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            stream.close();
            buf.close();
        }
    }
}
