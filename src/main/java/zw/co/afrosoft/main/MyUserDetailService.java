package zw.co.afrosoft.main;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.*;
import zw.co.afrosoft.main.*;

import java.util.*;

@Service
public class MyUserDetailService implements UserDetailsService {

    private UserRepository userRepository;

    public MyUserDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(userName);

        user.orElseThrow(() -> new UsernameNotFoundException("NOt Found : " +userName));
        return user.map(MyUserDetails::new).get();
    }
}
