package com.hellojalbajo.ott;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hellojalbajo.ott.comedy.ComedyService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
@RequestMapping("/")
public class MainController {
	@Autowired
	private MainService mainService;

	
	@GetMapping
	public String getMain() {
		return "index";
	}
	
	@GetMapping("/create")
	public String getCreate() {
		return "create";
	}
	
	@PostMapping
	@ResponseBody
	public void createMovie(@RequestBody Genre moive) {
		mainService.setMovieInfo(moive);
	}
	
	@PostMapping("/delete/{id}")
	public String deleteItem(@PathVariable("id") Integer id, Genre genre) {
		mainService.deleteItem(id);
		return "redirect:/";
	}
	

	
	
}
