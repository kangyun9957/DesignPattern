package structural_patterns.adapter.after;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
