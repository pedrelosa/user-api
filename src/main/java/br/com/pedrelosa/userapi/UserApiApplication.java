package br.com.pedrelosa.userapi;

import br.com.pedrelosa.userapi.domain.User;
import br.com.pedrelosa.userapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.saveAll(List.of(
                new User(null, "Pedro Elo", "pedrelosa@hotmail.com", "123", 20.0),
                new User(null, "Saulo Capistrano", "sauloc@gamil.com", "123", 20.0),
                new User(null, "Diego", "diego@yahoo.com", "123", 20.0),
                new User(null, "Renato", "renato@gmail.com", "123", 20.0)
        ));
    }
}
