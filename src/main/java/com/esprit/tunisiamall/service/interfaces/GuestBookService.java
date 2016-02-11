package com.esprit.tunisiamall.service.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.esprit.tunisiamall.domain.GuestBook;

@Local
public interface GuestBookService {

	List<GuestBook> DisplayAll();
	Boolean removeFromGuestBook(GuestBook guestbook);
	
}
