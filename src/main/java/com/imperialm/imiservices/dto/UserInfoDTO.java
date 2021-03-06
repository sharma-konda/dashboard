package com.imperialm.imiservices.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity @Setter @Getter
public class UserInfoDTO implements Serializable {
	@Id private String userId;
	@Id private String name;
	@Id private String email;
	@Id private String programCode;
	@Id private int roleId;
	@Id private String territoy;
	private String error;
}

