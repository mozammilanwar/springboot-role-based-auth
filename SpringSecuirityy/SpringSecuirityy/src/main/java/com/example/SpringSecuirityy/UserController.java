package com.example.SpringSecuirityy;

import com.example.SpringSecuirityy.model.AppUser;
import com.example.SpringSecuirityy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/add")
    public ResponseEntity<AppUser> addUser(@RequestBody AppUser user) {
        user.setPassword(passwordEncoder.encode(user.getPassword())); // encode password
        AppUser savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }
}

