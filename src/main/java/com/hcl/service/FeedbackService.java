package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.dao.FeedbackRepo;
import com.hcl.model.Feedbacks;

@Service
@Transactional
public class FeedbackService {

	@Autowired
	public FeedbackRepo repos;
	
	public boolean addFeedback(String nm,String ttl, String feeds) {
		try {
			Feedbacks feed= new Feedbacks(nm,ttl,feeds);
			repos.save(feed);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<Feedbacks> listAllFeedback() {
		return (List<Feedbacks>) repos.findAll();
	}
	
	}
	


