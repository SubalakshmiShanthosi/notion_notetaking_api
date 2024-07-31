package com.notionclone.src.main.controller;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;


@RestController
@CrossOrigin(origins = "http://localhost:3000") 
public class Auth0TestController {
    @GetMapping("/public")
    public ResponseEntity<?> publicApi(){
        return ResponseEntity.ok("Public API call works!!");
    }

    @GetMapping("/protected")
    public ResponseEntity<?> protectedApi(){
        return ResponseEntity.ok("Protected API call works!!");
    }

}
