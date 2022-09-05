package com.hcl.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.model.Feedbacks;

@Repository
public interface FeedbackRepo extends CrudRepository<Feedbacks, Integer> {

}
