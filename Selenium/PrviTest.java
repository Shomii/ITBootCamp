package saPosla;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Scanner;

import org.testng.annotations.AfterMethod;

public class PrviTest {
	
	//int a,b,c;
	double r, o;
	Scanner scan = new Scanner(System.in);
	final double PI = 3.14;
	
	
  @Test
  public void f() {
	  o = 2*r*PI;
  }
  @BeforeMethod
  public void beforeMethod() {
//	  a=5;
//	  b=6;
//	  System.out.println("a= " + a);
//	  System.out.println("b= " + b);
	  System.out.println("Unesite poluprecnik kruga: ");
	  r = scan.nextDouble();
  }

  @AfterMethod
  public void afterMethod() {
//	  c=a+b;
//	  System.out.println("c = " + a+ " + " + b + " = "+c);
	  System.out.println("Obim kruga je " + o);
  }

}
