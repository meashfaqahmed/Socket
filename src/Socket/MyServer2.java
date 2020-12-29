package Socket;

    import java.net.*;  
    import java.io.*;  
    class MyServer2{  
    public static void main(String args[])throws Exception{  
    ServerSocket ss=new ServerSocket(3333);  
    Socket s=ss.accept();  
    DataInputStream din=new DataInputStream(s.getInputStream());  
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
     // Scanner scan = new Scanner(System.in)
    String myMessage="";
    String recivedMessage = "";
    while(!myMessage.equals("stop")){  
    myMessage=din.readUTF();  
    System.out.println("client says: "+myMessage);  
    recivedMessage=br.readLine();  
    dout.writeUTF("Client Says: " + recivedMessage);  
    dout.flush();  
    }  
    din.close();  
    s.close();  
    ss.close();  
    }}  