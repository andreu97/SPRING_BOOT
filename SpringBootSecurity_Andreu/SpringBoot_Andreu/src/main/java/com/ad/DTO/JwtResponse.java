package com.ad.DTO;

import java.util.List;

public class JwtResponse {
	public JwtResponse(Long id2, String username2, List<String> roles) {
		// TODO Auto-generated constructor stub
	}
	private String token;
	private String type="Bearer";
	private Long id;
	private String username;
}
