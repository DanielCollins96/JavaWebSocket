package app;
import java.io.*;
import java.net.*;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        String sentence;
        String modifiedSentence;

        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

        Socket clientSocket = new Socket("10.7.42.78", 6789);
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
    }
}
