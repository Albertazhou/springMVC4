package com.controllerm;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
	@RequestMapping("/hello")
	public ModelAndView hello(HttpServletRequest req,HttpServletResponse rep) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "hello mvc"); //��װҪ��ʾ����ͼ������
		mv.setViewName("hello"); //��ͼ��	
		return mv;
		//update
	}

}
