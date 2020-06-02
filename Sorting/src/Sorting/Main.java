package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String []args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str1 = "";
	    StringTokenizer st1 = null;
	    
	    int [][]array = new int[20][20];
	    int index1, index2;
	    
	    for(int i = 1; i <= 19; i++) {
	    	str1 = br.readLine();
    		st1 = new StringTokenizer(str1);
	    	for(int j = 1; j <= 19; j++) {
	    		array[i][j] = Integer.parseInt(st1.nextToken());
	    	}
	    }
	    
	    str1 = br.readLine();
	    st1 = new StringTokenizer(str1);
	    int count = Integer.parseInt(st1.nextToken());
	    
	    for(int i = 1; i <= count; i++) {
	    	str1 = br.readLine();
	    	st1 = new StringTokenizer(str1);
	    	index1 = Integer.parseInt(st1.nextToken());
	    	index2 = Integer.parseInt(st1.nextToken());
	    	for(int j = 1; j <= 19; j++) {
	    		if(array[index1][j] == 0) array[index1][j] = 1;
	    		else array[index1][j] = 0;
	    	}
	    	for(int j = 1; j <= 19; j++) {
	    		if(array[j][index2] == 0) array[j][index2] = 1;
	    		else array[j][index2] = 0;
	    	}
	    }
	    
	    for(int i = 1; i <= 19; i++) {
	    	for(int j = 1; j <= 19; j++) {
	    		System.out.printf("%d ", array[i][j]);
	    	}
	    	System.out.println();
	    }
	}
}
