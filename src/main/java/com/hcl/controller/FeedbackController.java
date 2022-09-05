package com.hcl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.hcl.model.Feedbacks;
import com.hcl.service.FeedbackService;



@RestController
public class FeedbackController {

	@Autowired
	public FeedbackService fbservice;
	

	@GetMapping("/addfeeds")
	public ModelAndView feedbackPage() {
		Feedbacks f1 = new Feedbacks();
		return new ModelAndView("index","form",f1);
	}
	
	@PostMapping("/addfeeds")
	public ModelAndView submitFeedback(@RequestParam("name")String nm,@RequestParam("ttl")String ttl,@RequestParam("feed")String feeds) {
		fbservice.addFeedback(nm,ttl,feeds);
		
		return new ModelAndView("feedbacksuccess");
	
	}
	

	@GetMapping("/loadfeeds")
	public ModelAndView listfeeds() {
		List<Feedbacks> fds = fbservice.listAllFeedback();
		return new ModelAndView("listfeeds","fd",fds);
	}

}
