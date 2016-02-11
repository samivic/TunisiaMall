package com.esprit.tunisiamall.service.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.esprit.tunisiamall.domain.Request;

@Local
public interface RequestService {

	List<Request> DisplayAllRequest();
	Boolean acceptRequest(Request request);
	Boolean rejectRequest(Request request);
	
}
