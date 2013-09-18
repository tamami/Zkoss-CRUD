package id.or.linuxjak.controller.util;

import id.or.linuxjak.controller.domain.UserControllerDomain;
import id.or.linuxjak.domain.User;
import id.or.linuxjak.domain.UserInfo;

import java.util.Date;

public class DomainControllertoDomain {
	public static User UserControllertoUser(UserControllerDomain ucd) {
		User usr = new User();
		UserInfo usrInfo = new UserInfo();

		usrInfo.setName(ucd.getName());
		usrInfo.setLastName(ucd.getLastName());
		usrInfo.setJob(ucd.getJob());
		usrInfo.setListedDate(new Date());
		usrInfo.setAddress(ucd.getAddress());
		usrInfo.setUser(usr);

		usr.setUsername(ucd.getUsername());
		usr.setPassword(ucd.getPassword());
		usr.setUserInfo(usrInfo);

		return usr;

	}

}
