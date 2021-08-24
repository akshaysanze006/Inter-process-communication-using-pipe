import java.io.IOException; 
import java.io.PipedInputStream; 
import java.io.PipedOutputStream 
public class PipeExample 
{
20 

public static void main(string[] args) throws IOException { 
final PipedOutputStream Output=new PipedOutputStream(); final PipedInputStream Input=new Thread(new Runnable() { 
 public void run() 
 { 
 try 
 { Output.write(“Hello world!”.getBytes()); 
 } 
} 
catch(IOException e) 
{ 
} 
}  
}); 
Thread thread2=new Thread(new Runnable()  
{ 
Public void run() 
{ 
try 
{ 
Int data=Input.read(); 
While(data!=-1){ 
System.out.println((char)data); 
}} 
Catch(IOException e){ 
}} 
}); 
tread1.start(); 
thread2.start(); 
} 
} 
