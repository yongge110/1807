package ssm;

import java.util.Arrays;

public class Test {
	String s="abc";
	char[] ch= {'a','a'};
	
	public void charge(String s,char[] ch) {
		s="sss";
		ch[0]='1';
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.charge(t.s, t.ch);
		System.out.println(t.s +"  "+Arrays.toString(t.ch));
	}
}
