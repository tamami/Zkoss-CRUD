package id.or.linuxjak.controller.util;

import id.or.linuxjak.controller.domain.UserControllerDomain;
import id.or.linuxjak.domain.User;

import java.util.ArrayList;
import java.util.List;

public class DomaintoControllerDomain {
	public static UserControllerDomain domaintoController(User user) {
		UserControllerDomain ucd = new UserControllerDomain();
		ucd.setUsername(user.getUsername());
		// ucd.setPassword(password)
		ucd.setJob(user.getUserInfo().getJob());
		ucd.setAddress(user.getUserInfo().getAddress());
		ucd.setName(user.getUserInfo().getName());
		ucd.setLastName(user.getUserInfo().getLastName());
		ucd.setId(user.getUserId());
		return ucd;
	}

	public static List<UserControllerDomain> domaintoControllerList(
			List<User> list) {
		List<UserControllerDomain> listUcd = new ArrayList<UserControllerDomain>();
		for (User user : list) {
			listUcd.add(domaintoController(user));
		}
		return listUcd;

	}
}
