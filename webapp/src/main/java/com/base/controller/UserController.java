package com.base.controller;

import java.time.LocalDateTime;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.base.pojo.User;
import com.base.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
  private static Logger logger = Logger.getLogger(UserController.class);
  @Resource
  private UserService userService;
  
  @RequestMapping("/show")
  public String show(Model model, int id) {
    User user = userService.selectUserById(id);
    model.addAttribute("user", user);
    System.out.println("come in");
    return "jsp/login";
  }
  
}
