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
	    double []data = new double[3];
	    double result = 1;
	    int i = 0;
	    
	    for(i = 0; i < 3; i++) {
	    	data[i] = Integer.parseInt(st.nextToken());
	    	result *= data[i];
	    }
	    
	    for(i = 0; i < 2; i++) {
	    	result /= 1024;
	    }
	    
	    result /= 8;
	    System.out.println(String.format("%.2f MB", result));
	}
}