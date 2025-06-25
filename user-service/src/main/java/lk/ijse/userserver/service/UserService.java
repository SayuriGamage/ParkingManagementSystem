package lk.ijse.userserver.service;

import lk.ijse.userserver.dto.BookingResponse;
import lk.ijse.userserver.dto.LoginRequest;
import lk.ijse.userserver.dto.RegisterRequest;
import lk.ijse.userserver.dto.UserProfileResponse;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

/**
 * ------------------------------------------------
 * Author: Sayuri Gamage
 * GitHub: https://github.com/sayuriGamage
 * Modified: 2025-06-25
 * ------------------------------------------------
 */


public interface UserService {
    void register(RegisterRequest request);
    String login(LoginRequest request);
    UserProfileResponse getProfile(String email);
    List<BookingResponse> getUserBookings(String email);
    UserProfileResponse getUserById(Long id);
    public UserDetails loadUserByUsername(String username) ;

}
