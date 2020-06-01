package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String []args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str1 = br.readLine();
	    String str2 = br.readLine();
	    StringTokenizer st1 = new StringTokenizer(str1);
	    StringTokenizer st2 = new StringTokenizer(str2);
	    int count = Integer.parseInt(st1.nextToken());
	    int []data = new int[count];
	    for(int i = 0; i < count; i++) {
	    	data[i] = Integer.parseInt(st2.nextToken());
	    }
	    int pivot = data[0];
	    for(int i = 1; i < count; i++) {
	    	if(pivot > data[i]) pivot = data[i];
	    }
	    System.out.println(pivot);
	}
}
