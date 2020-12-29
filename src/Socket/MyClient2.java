package Socket;

    import java.net.*;  
    import java.io.*;  
    class MyClient2{  
    public static void main(String args[])throws Exception{  
    Socket s=new Socket("localhost",3333);  
    DataInputStream din=new DataInputStream(s.getInputStream());  
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
      
    String myMessage=""; 
    String recivedMessage="";
    while(!myMessage.equals("stop")){  
    myMessage=br.readLine();  
    dout.writeUTF(myMessage);  
    dout.flush();  
    recivedMessage=din.readUTF();  
    System.out.println("Server says: "+recivedMessage);  
    }  
      
    dout.close();  
    s.close();  
    }}  