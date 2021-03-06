package com.imperialm.imiservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imperialm.imiservices.dao.MenuDAO;
import com.imperialm.imiservices.dto.MenuDTO;
import com.imperialm.imiservices.dto.request.InputRequest;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDAO menuDAO;

	@Override
	public List<MenuDTO> findMenuByRole(final InputRequest userRoleReq) {
		return this.menuDAO.findMenuByRole(userRoleReq);
	}
}
