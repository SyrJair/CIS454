package com.moomeditate.moomeditation.controllers;

import com.moomeditate.moomeditation.models.User;
import com.moomeditate.moomeditation.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestParam String username, @RequestParam String email, @RequestParam String password) {
        if (userService.existsByUsername(username)) {
            return ResponseEntity
                    .badRequest()
                    .body("Error: Username is already taken!");
        }

        if (userService.existsByEmail(email)) {
            return ResponseEntity
                    .badRequest()
                    .body("Error: Email is already in use!");
        }

        User user = userService.createUser(username, email, password);

        return ResponseEntity.ok("User registered successfully!");
    }

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@RequestParam String username, @RequestParam String password) {

        User user = userService.findByUsername(username);

        if(user == null || !passwordEncoder.matches(password, user.getPassword())){
            return ResponseEntity
                    .badRequest()
                    .body("Error: Invalid username or password!");
        }

        String jwt = generateJwt(user);

        return ResponseEntity.ok(jwt);
    }

    private String generateJwt(User user) {

        Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    
        long milNow = System.currentTimeMillis();
    
        long expMils = milNow + 3600000;
        Date exp = new Date(expMils);

        String jwt = Jwts.builder()
                .setSubject(user.getUsername())
                .setIssuedAt(new Date(milNow))
                .setExpiration(exp)
                .signWith(key)
                .compact();
    
        return jwt;
    }
    
}
