package com.xu.drools.str;

import org.junit.Test;

import com.google.gson.Gson;
import com.xu.drools.bean.Person;

public class PersonTest {
	private Gson gson = new Gson();

	@Test
	public void toJson() {
		Person p=new Person(12,"张三","测试");
		System.out.println(gson.toJson(p));
	}
}
