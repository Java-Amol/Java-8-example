package com.java.extra8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(50);
		al.add(10);
		al.add(33);
		al.add(45);
		al.add(15);
		al.add(6);
		al.add(2);

	//	System.out.println(al);
		List<Integer> collect = al.stream().map(i->i+10).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> filter = al.stream().filter(i -> i%2==0).collect(Collectors.toList());

	System.out.println(filter);
	
	}

}
