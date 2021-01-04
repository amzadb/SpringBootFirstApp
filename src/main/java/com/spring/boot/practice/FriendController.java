package com.spring.boot.practice;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendController {

	@GetMapping("/myFriends")
	public List<Friend> getFriendsList() {
		return Arrays.asList(new Friend(1, "Amzad", "Basha"),
				new Friend(2, "Mohammed Arshad", "Basha"),
				new Friend(3, "Mohammed Afsar", "Basha"),
				new Friend(4, "Nikhath", "Anjum"));		
	}

}
