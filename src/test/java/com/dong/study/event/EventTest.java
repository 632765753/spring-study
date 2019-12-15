package com.dong.study.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(EventConfiguration.class);
		context.publishEvent(new DemoEvent("自定义事件"));
		context.close();
	}
}
