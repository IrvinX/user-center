package com.dbt.controller;


import irvin.common.domain.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @author irvin
 * @date Create in 下午12:19 2017/8/6
 * @description
 */
//@Api(value = "Login", description = "Login")
@Controller
public class LoginController {

	//    @ApiOperation(value = "登录", notes = "登录")
	@GetMapping(value = "/login")
	public String login() {
		return "login";
	}

	//    @ApiOperation(value = "登录", notes = "登录")
	@PostMapping("/loginUser")
	public String loginUser(String username, String password, HttpSession session) {
		UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
		Subject subject = SecurityUtils.getSubject();
		try {
			subject.login(usernamePasswordToken);   //完成登录
			User user = (User) subject.getPrincipal();
			session.setAttribute("user", user);
			return "index";
		} catch (Exception e) {
			return "login";//返回登录页面
		}

	}

	//    @ApiOperation(value = "登出", notes = "登出")
	@GetMapping("/logOut")
	public String logOut(HttpSession session) {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
//        session.removeAttribute("user");
		return "login";
	}

	@RequiresPermissions("delete")//随便写的
	@GetMapping("/success")
	public String test() {
		return "success";
	}

	@GetMapping("/index")
	public String index() {
		return "index";
	}
}
