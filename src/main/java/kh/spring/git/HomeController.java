package kh.spring.git;


import org.springframework.web.bind.annotation.RequestMapping;


public class HomeController {
	@RequestMapping(value = "/home")
	public String home() {		
		return "home";
	}
}
