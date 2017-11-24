package irvin.uc.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import irvin.api.bussiness.domain.ResponseResult;
import irvin.api.domain.UcUserBasic;
import irvin.uc.service.basic.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @Autowired
    UserService userService;

    @ApiOperation(value = "Create user basic info")
    @PostMapping(value = "/user-basic")
    public void createUserBasic(@RequestBody UcUserBasic ucUserBasic) {
        userService.createUserBasic(ucUserBasic);
    }

    @ApiOperation(value = "Update user basic info")
    @PutMapping(value = "/user-basic")
    public void updateUserBasic(@RequestBody UcUserBasic ucUserBasic) {
        userService.updateUserBasic(ucUserBasic);
    }

    @ApiOperation(value = "Find user basic info")
    @GetMapping(value = "/user-basic")
    public ResponseResult<List<UcUserBasic>> getUserBasic(@RequestParam(value = "pageNo", required = false) Integer pageNo,
                                                          @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        return userService.getUserBasic(pageNo, pageSize);
    }

    @ApiOperation(value = "Delete user basic info")
    @DeleteMapping(value = "/user-basic")
    public void deleteUserBasic(@RequestParam(value = "id") String id) {
        userService.deleteUserBasic(id);
    }
}
