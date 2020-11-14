package com.tourism.springboot.converters;

import java.util.ArrayList;
import java.util.List;

import com.tourism.springboot.dto.UserDto;
import com.tourism.springboot.entities.User;

public class UserConverter {

	public static User userDtoToUser(UserDto userDto) {
		User user = new User();
		if (userDto != null) {
			user.setId(userDto.getId());
			user.setUserName(userDto.getUserName());
			user.setPassword(userDto.getPassword());
			user.setCountry(userDto.getCountry());
		}
		try {
			userDto = null;
		} catch (NullPointerException ne) {
			System.out.println(ne);
		}
		return user;
	}

	public static List<UserDto> userToUserDto(List<User> userlist) {
		List<UserDto> listUserDto = new ArrayList<>();
		if (userlist != null) {
			for (User user : userlist) {
				UserDto userDto = new UserDto();
				userDto.setId(user.getId());
				userDto.setUserName(user.getUserName());
				userDto.setPassword(user.getPassword());
				userDto.setCountry(user.getCountry());
				listUserDto.add(userDto);
			}
			try {
				userlist = null;
			} catch (NullPointerException ne) {
				System.out.println(ne);
			}
		}
		return listUserDto;
	}

}
