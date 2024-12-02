package Pool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				bw.write(" ");
			}
			for(int j=1; j <= 2*i-1; j++) {
				bw.write("★");
			}
			bw.write("\n");
		}
		for(int i = n-1; i >= 1; i--) {
			for(int j = 1; j <= n-i;j++) {
				bw.write(" ");
			}
			for(int j = 1; j <= 2*i-1;j++) {
				bw.write("★");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();

	}
}
