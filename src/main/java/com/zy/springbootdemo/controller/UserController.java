package com.zy.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: UserController</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author ZY
 * <p> Just go on !!!</p>
 * @date 2019年11月17日  9:14
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getUser")
    public Map getUser() {
        Map map = new HashMap(3);
        map.put("name", "张三");
        map.put("age", 18);
        map.put("job", "科学家");
        return map;
    }

}


