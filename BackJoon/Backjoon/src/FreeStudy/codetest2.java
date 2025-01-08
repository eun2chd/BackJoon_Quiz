package FreeStudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

	public class codetest2{
	    public static void main(String[] args) {
	        A b = new B();
	        b.paint(); // bdc
	        b.draw();  // d
	    }
	}
	 
	class A {
	    public void paint() {
	        System.out.print("A");
	        draw();
	    }
	    public void draw() {
	        System.out.print("B"); // b
	        draw(); // dc
	    }
	}
	 
	class B extends A {
	    public void paint() {
	        super.draw(); // b
	        System.out.print("C"); // c
	        this.draw(); //d 
	    }
	    public void draw() {
	        System.out.print("D"); // dd
	    }
	}