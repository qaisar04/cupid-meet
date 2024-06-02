package kz.baltabayev.userdetailsservice.controller;

import kz.baltabayev.userdetailsservice.model.dto.UserCreateRequest;
import kz.baltabayev.userdetailsservice.model.dto.UserInfoCreateRequest;
import kz.baltabayev.userdetailsservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<Void> init(@RequestBody UserCreateRequest request) {
        userService.create(request.id(), request.username());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/info/create")
    public ResponseEntity<Void> create(@RequestBody UserInfoCreateRequest request) {
        return ResponseEntity.ok().build();
    }
}