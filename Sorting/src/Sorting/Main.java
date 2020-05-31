package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String []args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    StringTokenizer st = new StringTokenizer(str);
	    long []data = new long[3];
	    int i = 0;
	    int day = 1;
	    for(i = 0; i < 3; i++) {
	    	data[i] = Integer.parseInt(st.nextToken());
	    }
	    while(day % data[0] != 0 || day % data[1] != 0 || day % data[2] != 0)day++;
	    System.out.println(day);
	    
	}
}