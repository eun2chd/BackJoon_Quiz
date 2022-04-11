package Chapter3;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;


public class case_07 {
	
	public static void main(String[] args) throws IOException{
		
		Scanner input = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 1; i <= n; i++) {

			st = new StringTokenizer(br.readLine()," ");
			bw.write("Case #"+i+": "+(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");

		}
		br.close();

		bw.flush();
		bw.close();
		
	}

}
