package org.gs.ctrls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GroceryCtrl {

	@GetMapping(value = "/")
	public String getIndex() {
		return new String("index");
	}
	
}
