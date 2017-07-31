
import java.io.*;
public class Reverseword {
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s=br.readLine();
System.out.println("if I enter"+s);
String arr[]=new String[s.length()];
String[] x=s.split(" ");
for(int i=x.length-1;i>=0;i--)
{
	arr[i]=x[i];	
	System.out.print("I should get"+arr[i]+" ");
}	
}
}
