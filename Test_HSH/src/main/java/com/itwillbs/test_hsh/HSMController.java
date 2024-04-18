package com.itwillbs.test_hsh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HSMController {
	
	@RequestMapping
	public String HSMController1() {
		return "hsm";
	}
}
