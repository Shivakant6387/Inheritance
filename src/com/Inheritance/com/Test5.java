package com.Inheritance.com;
class Paper{
	String getType() {
		return "Pramod";
	}
}
class RulePaper 
extends Paper{
	String getType() {
		return "Pradhan";
	}
}
public class Test5 {
public static void main(String args[]) {
	Paper paper=new RulePaper();
	System.out.println(paper.getType());
}
}
