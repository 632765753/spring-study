package com.dong.study.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<ApplicationEvent>{

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(String.format("当前线程[%s]", Thread.currentThread()));
		System.out.println(String.format("事件[%s]", event));
	}

}
