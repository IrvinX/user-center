package irvin.uc.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @author irvin
 * @date Create in 上午12:52 2017/9/11
 * @description User Management
 */
@RestController
@RequestMapping("/user")
@Api(value = "User Management", description = "User Management CRUD")
public class UserController {

	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@ApiOperation(value = "Create user")
	@PostMapping(value = "/user-info")
	public void createUser() {
		logger.debug("Create user ...");
	}

	@ApiOperation(value = "Update user")
	@PutMapping(value = "/user-info")
	public void updateUser() {
		logger.debug("Update user ...");
	}

	@ApiOperation(value = "Find user")
	@GetMapping(value = "/user-info")
	public void getUser() {
		logger.debug("Find user ...");
	}

	@ApiOperation(value = "Delete user")
	@DeleteMapping(value = "/user-info")
	public void deleteUser() {
		logger.debug("Delete user ...");
	}
}
