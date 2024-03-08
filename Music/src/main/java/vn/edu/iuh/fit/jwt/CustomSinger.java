//package vn.edu.iuh.fit.jwt;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import vn.edu.iuh.fit.models.Singer;
//import vn.edu.iuh.fit.models.Song;
//
//import java.util.Collection;
//import java.util.Collections;
//
//@Data
//@AllArgsConstructor
//public class CustomSinger implements UserDetails {
//
//    Singer singer;
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities(){
//        return Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));
//    }
//
//    @Override
//    public String getPassword() {
//        return singer.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return singer.getName();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//}
