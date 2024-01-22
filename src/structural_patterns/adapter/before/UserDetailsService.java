package structural_patterns.adapter.before;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
