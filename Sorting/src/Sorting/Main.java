package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String []args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = "";
	    StringTokenizer st = null;
	    
	    int [][]maze = new int[10][10];
	    int data = 0;
	    for(int i = 1; i <= 10; i++) {
	    	str = br.readLine();
	    	st = new StringTokenizer(str);
	    	for(int j = 1; j <= 10; j++) {
	    		data = Integer.parseInt(st.nextToken());
	    		maze[i - 1][j - 1] = data;
	    	}
	    }
	    
	    int index1 = 2; int index2 = 2;
	    while(true) {
	    	
	    	if(maze[index1 - 1][index2 - 1] == 2) {
	    		maze[index1 - 1][index2 - 1] = 9;
	    		break;
	    	}
	    	else maze[index1 - 1][index2 - 1] = 9;
	    	
	    	if(maze[index1 - 1][index2 - 1 + 1] == 1) {
	    		if(maze[index1 - 1 + 1][index2 - 1] == 1) break;
	    		else {
	    			index1++;
	    			if(maze[index1 - 1][index2 - 1] == 2) {
	    				maze[index1 - 1][index2 - 1] = 9;
	    				break;
	    			}
	    			maze[index1 - 1][index2 - 1] = 9;
	    		}
	    	}
	    	else {
	    		index2++;
	    		if(maze[index1 - 1][index2 - 1] == 2) {
	    			maze[index1 - 1][index2 - 1] = 9;
	    			break;
	    		}
	    		maze[index1 - 1][index2 - 1] = 9;
	    	}
	    }
	    
	    for(int i = 1; i <= 10; i++) {
	    	for(int j = 1; j <= 10; j++) {
	    		System.out.printf("%d ", maze[i - 1][j - 1]);
	    	}
	    	System.out.println();
	    }
	}
}
