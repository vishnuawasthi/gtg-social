package com.gtg.social.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// @RequestMapping("/")
public class FacebookLoginController {

	/*
	 * @Autowired private Facebook facebook;
	 * 
	 * @Autowired private ConnectionRepository connectionRepository;
	 */

	/*
	 * @GetMapping public String helloFacebook(Model model) {
	 * System.out.println("helloFacebook() - start"); if
	 * (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
	 * //return "redirect:/connect/facebook";
	 * 
	 * return new String ("facebookConnect1"); }
	 * 
	 * model.addAttribute("facebookProfile",
	 * facebook.userOperations().getUserProfile()); PagedList<Post> feed =
	 * facebook.feedOperations().getFeed(); model.addAttribute("feed", feed);
	 * return "hello"; }
	 */

	
	@GetMapping(value = "/")
		//@RequestMapping(value="/test")
		public String one(Model model) {
			return new String("facebookConnect1");
		}

	
	//@GetMapping(path = "/test")
	@RequestMapping(value="/test")
	public String show(Model model) {

		return new String("testView");
	}

}
