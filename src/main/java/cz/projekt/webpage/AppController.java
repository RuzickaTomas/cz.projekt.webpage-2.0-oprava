package cz.projekt.webpage;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController  {
	
	Date date = new Date();
	
	@RequestMapping("/welcome")
	public void welcome(@RequestParam(value="date", required=false, defaultValue=" ") String date, Model model) {
		date = this.date.toString();
		model.addAttribute("date", date);
	
	}
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name",name);
		return "hello";
	}

}
