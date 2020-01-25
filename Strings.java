package com;

public class Strings {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "Pooja"; 
String s1="Pooja";
s=s.concat("Prakash");
System.out.println(s);
System.out.println(s.contentEquals(s1));
System.out.println("Pooja".hashCode());
System.out.println(s.contains("Prakash"));
char ch=s.charAt(6);
System.out.println(ch);
System.out.println(s.endsWith("h"));
System.out.println(s.length());
String s2=s1.replace('a','s');
System.out.println(s2);
System.out.println(s.startsWith("P"));
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
	}

}
