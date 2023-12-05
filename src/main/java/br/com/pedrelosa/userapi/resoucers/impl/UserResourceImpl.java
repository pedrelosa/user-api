package br.com.pedrelosa.userapi.resoucers.impl;

import br.com.pedrelosa.userapi.domain.User;
import br.com.pedrelosa.userapi.repositories.UserRepository;
import br.com.pedrelosa.userapi.resoucers.UserResouce;
import br.com.pedrelosa.userapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/users")
@RequiredArgsConstructor
public class UserResourceImpl implements UserResouce {

    private final UserService userService;

    @Override
    public ResponseEntity<User> findById(Long id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(userService.findAll());
    }
}
