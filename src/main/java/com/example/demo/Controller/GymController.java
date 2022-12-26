package com.example.demo.Controller;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Mode.Card;
import com.example.demo.Mode.Gym;
import com.example.demo.Service.GymService;

@Controller
public class GymController {
	
	@Autowired
	private GymService gymservices;
	
	
	@RequestMapping("/")
	public String Index() {
			return "index.html";
	}
	
	@GetMapping("/ViewPlans")
	public String viewPlans() {
			return "ViewPlans";
	}
	
	@GetMapping("/ExploreGym")
	public String Explore() {
			return "ExploreGym";
	}
	
	@GetMapping("/AboutUs")
	public String About() {
			return "AboutUs";
	}
	

	
	@GetMapping("/CardPayment")
	public String CardPayment(Model model) {
		  Card NewCard = new Card();
		model.addAttribute("NewCard", NewCard);
			return "CardPayment";
	}
	
	@PostMapping("/CardPayment")
	public String addCard(@ModelAttribute Card NewCard) {
		this.gymservices.addCard(NewCard);
		return "redirect:";
		
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		Gym NewUsers = new Gym();
		model.addAttribute("NewUsers", NewUsers);	
		return "register.html";
		
	}
	
	@PostMapping("/register")
	public String addNewCustomerNow(@ModelAttribute Gym NewUsers) {
		this.gymservices.addCustomer(NewUsers);
		return "redirect:";
		
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam Integer CustomerId) {
		this.gymservices.deleteCustomer(CustomerId);
		return "redirect:";
		
	}
	
	@GetMapping("/Update/{CustomerId}")
	public String updateCustomer(@PathVariable Integer CustomerId , Model model) {
		Gym FoundCustomer = this.gymservices.getCustomerById(CustomerId);
		model.addAttribute("FoundCustomer", FoundCustomer);
		return "Update.html";
	
	}
	
	@PostMapping("/Update/{CustomerId}")
	public String updateCustomer(@PathVariable  Integer CustomerId, @ModelAttribute Gym updateCustomer) {
		this.gymservices.updateCustomer(CustomerId, updateCustomer);
		return "index";
		
		
		
	}
	
	@GetMapping("/Admin")
	public String Admin(Model model) {
		model.addAttribute("NewUserlist" , this.gymservices.getAllCustoemr());
		model.addAttribute("NewCardlist" , this.gymservices.getAllCustoemrCardInfo());
		return "Admin.html";
		
	}
	

	
	
	
	

}
