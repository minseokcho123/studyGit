package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	
	@GetMapping("/greeting")
	public String greeting(Model model) {
		model.addAttribute("name", "고블린 슬레이어");
		
		return "greeting";   // 컨트롤러에서 return 값으로 String을 주면, viewResolver가 
							 // 템플릿에 있는 html 파일을 찾아간다.
	}
	
	@GetMapping("/greeting-mvc")
	public String greetingMvc(@RequestParam(value = "name", required = false) String name, Model model) {
		
		model.addAttribute("name", name);
		
		return "greeting-template";
	}
	
	@GetMapping("/greeting-string")
	@ResponseBody
	public String greetingString(@RequestParam(value = "name", required = false) String name) {
		
		
		return "greeting" + name;
	}
	
	@GetMapping("/greeting-api")
	@ResponseBody
	public Greeting greetingApi(@RequestParam(value = "name", required = false) String name) {
		Greeting greeting = new Greeting();
		greeting.setName(name);
		
		return greeting;
	}
	
	static class Greeting {
		private String name;
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
	}
}
