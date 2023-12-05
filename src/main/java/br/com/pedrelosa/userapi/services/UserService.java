package br.com.pedrelosa.userapi.services;

import br.com.pedrelosa.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();

}
