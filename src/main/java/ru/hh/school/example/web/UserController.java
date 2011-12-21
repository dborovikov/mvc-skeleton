package ru.hh.school.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.hh.school.example.EmailAlreadyBoundException;

@Controller
@RequestMapping(value = "/users")
public class UserController {

  private final UserFacade userFacade;

  @Autowired
  public UserController(UserFacade userFacade) {
    this.userFacade = userFacade;
  }

  @RequestMapping(method = RequestMethod.GET)
  public String list(Model model) {
    model.addAttribute("users", userFacade.listUsers());
    return "listUsers";
  }

  @RequestMapping(value = "register", method = RequestMethod.GET)
  public String create(Model model) {
    model.addAttribute("userForm", new UserForm());
    return "register";
  }

  @RequestMapping(method = RequestMethod.POST)
  public String doCreate(Model model, @ModelAttribute("userForm") UserForm userForm) {
    try {
      userFacade.registerUser(userForm.getEmail(), userForm.getPassword(), userForm.getFullName());
    } catch (EmailAlreadyBoundException e) {
      model.addAttribute("error", "Email already bound: " + e.getEmail());
      return "error";
    }
    return "redirect:/users";
  }
}
