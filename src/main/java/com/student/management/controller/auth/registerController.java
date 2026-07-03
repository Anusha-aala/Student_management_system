package com.student.management.controller.auth;

import com.student.management.model.Role;
import com.student.management.model.User;
import com.student.management.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public  class registerController {

    @Autowired
    private userRepo userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public String registerPage() {

        return "register";

    }

    @PostMapping("/register")
    public String registerUser(

            @RequestParam String fullname,

            @RequestParam String collegename,

            @RequestParam String userEmail,

            @RequestParam String username,

            @RequestParam String password,

            @RequestParam String confirmPassword,

            Model model

    ) {

        // Password check
        if (!password.equals(confirmPassword)) {

            model.addAttribute("error",
                    "Passwords do not match.");

            return "register";

        }

        // Username duplicate
        if (userRepository.existsByUsername(username)) {

            model.addAttribute("error",
                    "Username already exists.");

            return "register";

        }

        // Email duplicate
        if (userRepository.existsByUserEmail(userEmail)) {

            model.addAttribute("error",
                    "Email already registered.");

            return "register";

        }

        User user = new User();

        user.setUserName(username);

        user.setUserEmail(userEmail);

        user.setPassword(passwordEncoder.encode(password));

        user.setRole(Role.ROLE_STUDENT);

        user.setFullName(fullname);

        user.setCollegename(collegename);

        userRepository.save(user);

        return "redirect:/login";

    }
}
