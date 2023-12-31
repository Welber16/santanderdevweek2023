package dio.me.santanderdevweek2023.domain.repository;

import dio.me.santanderdevweek2023.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
