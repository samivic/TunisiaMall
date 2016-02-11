package com.esprit.tunisiamall.service.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.esprit.tunisiamall.domain.Offer;

@Local
public interface OfferService {

	Boolean createOffer(Offer offer);
	Float updatePrice(float price);
	Offer findOfferById(Integer id);
	List<Offer>findAllOffer();
}
