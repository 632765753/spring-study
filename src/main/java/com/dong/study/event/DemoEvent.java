package com.dong.study.event;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent{
	private static final long serialVersionUID = 2667276247191665989L;

	public DemoEvent(Object source) {
		super(source);
	}

}
