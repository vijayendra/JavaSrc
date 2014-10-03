import java.io.*;
import java.net.*;
    
class UrlIO{
    public static void main(String [] args) throws Exception{
        URL u = new URL("http://www.egnyte.com");
        InputStream in = u.openStream();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(in));
        String inputLine;
        while ((inputLine = buffer.readLine()) != null){
            System.out.println(inputLine);
        }
    }
}

