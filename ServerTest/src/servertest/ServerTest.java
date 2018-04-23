/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servertest;
import java.io.*; 
import java.net.*; 
/**
 *
 * @author Thane_Acheron
 */
public class ServerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServerSocket server = null; 
        String line; 
        DataInputStream in; 
        PrintStream os;
        Socket clientSocket = null; 
        System.out.println("Hello! starting"); 
        
            try {
                server = new ServerSocket(16000); 
            } catch (IOException e){
                System.out.println(e);
            }
            
            try { 
                //Appcept the packets
                clientSocket = server.accept(); 
                
                //Client Socket Created 
                in = new DataInputStream (clientSocket.getInputStream()); 
                BufferedReader is = new BufferedReader(new InputStreamReader(in));
                os = new PrintStream (clientSocket.getOutputStream()); 
                
                //Read from the input stream 
                line = is.readLine(); 
                System.out.println("Recieved from client : " +  line);
                
                //Clear the resources
                is.close(); 
                os.close(); 
                clientSocket.close(); 
                server.close(); 
            }
            catch (IOException e){
                System.out.println(e);
            }
        }
        
    }
