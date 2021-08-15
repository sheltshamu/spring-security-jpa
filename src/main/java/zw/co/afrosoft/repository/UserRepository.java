package zw.co.afrosoft.repository;

import org.springframework.data.jpa.repository.*;
import zw.co.afrosoft.domain.*;

import java.util.*;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUsername(String username);

}
