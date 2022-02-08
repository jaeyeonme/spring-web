package io.jaeyeon.web;

import io.jaeyeon.web.domain.Board;
import io.jaeyeon.web.domain.User;
import io.jaeyeon.web.repository.BoardRepository;
import io.jaeyeon.web.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;

@DataJpaTest
public class JpaMappingTest {

    private final String boardTestTitle = "Test";
    private final String email = "test@gmail.com";

    @Autowired UserRepository userRepository;
    @Autowired BoardRepository boardRepository;

    @BeforeEach
    void before() {
        final User user = userRepository.save(User
                .builder()
                .name("jaeyeon")
                .password("test")
                .email(email)
                .createdDate(LocalDateTime.now())
                .build());
    }


}
