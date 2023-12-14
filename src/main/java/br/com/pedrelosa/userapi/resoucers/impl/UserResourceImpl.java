package br.com.pedrelosa.userapi.resoucers.impl;

import br.com.pedrelosa.userapi.domain.User;
import br.com.pedrelosa.userapi.repositories.UserRepository;
import br.com.pedrelosa.userapi.resoucers.UserResouce;
import br.com.pedrelosa.userapi.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/users")
@RequiredArgsConstructor
public class UserResourceImpl implements UserResouce {

    private final UserService userService;
    private final Environment env;

    @Override
    public ResponseEntity<User> findById(Long id) {
        log.info("PAYROLL_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port");

        return ResponseEntity.ok().body(userService.findById(id));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(userService.findAll());
    }
}
