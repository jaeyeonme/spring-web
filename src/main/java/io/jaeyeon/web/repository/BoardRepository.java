package io.jaeyeon.web.repository;

import io.jaeyeon.web.domain.Board;
import io.jaeyeon.web.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

    Board findByUser(User user);
}
