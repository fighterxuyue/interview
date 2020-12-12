package com.xuyue.replay;

import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller @ResponseBody
 * @author Tony Xu
 *
 */
@RestController
public class _3_RestController_Controller {
     public static void main(String[] args) {
		System.out.println("@RestController是复合注解，包含@Controller和@ResponseBody；"
				+ "\n单独使用@Controller常见于前后端不分离的情况，返回的是一个视图；@RestController一般用于前后端分离，属于RestFul的Web服务，返回的是XML或JSON数据\n");
	}
}
