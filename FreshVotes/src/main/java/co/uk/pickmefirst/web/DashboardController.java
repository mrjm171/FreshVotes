package co.uk.pickmefirst.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController 
{
	@GetMapping (value="/")
		public String rootView() {
			return "index";
	}
	
	 @GetMapping (value="/dashboard")
	  public String dashboard() {
	   return "dashboard";
	 }
}
