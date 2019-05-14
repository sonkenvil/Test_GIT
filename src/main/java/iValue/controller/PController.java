package iValue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PController {
	
	@GetMapping("/value")
	public String a() {
		return "a";
	}

}
