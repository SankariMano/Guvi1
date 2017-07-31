import java.io.*;
import java.util.*;
public class Maxheight {

public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter k value");
Integer x=Integer.parseInt(br.readLine());
ArrayList<Integer>li=new ArrayList<Integer>();
Integer arr[]=new Integer[50];
for(int i=0;i<arr.length;i++)
{
	arr[i]=Integer.parseInt(br.readLine());
	li.add(arr[i]);
}
Collections.sort(li);
Collections.reverse(li);
System.out.println(li.get(3));
System.out.println(li.get(x-1));
}
}
