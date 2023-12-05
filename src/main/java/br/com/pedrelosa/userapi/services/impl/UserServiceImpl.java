package br.com.pedrelosa.userapi.services.impl;

import br.com.pedrelosa.userapi.domain.User;
import br.com.pedrelosa.userapi.repositories.UserRepository;
import br.com.pedrelosa.userapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
