package com.research.user;

import com.research.user.dto.AuthResponse;
import com.research.user.dto.RegisterRequest;
import com.research.user.dto.UserResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;

    @Transactional
    public AuthResponse register(RegisterRequest request) throws Exception {
        String email = request.email().trim().toLowerCase();

        if (userRepository.existsByEmail(email)){
            throw new Exception("account with provided email is already exist");
        }

        if (CommonPasswords.LIST.contains(
                request.password().toLowerCase())){
            throw new Exception("password do not match");
        }

        User user = User.register(email, request.password(), request.fullName());

        user = userRepository.save(user);

        return toAuthResponse(user);
    }

    private AuthResponse toAuthResponse(User user){
        return new AuthResponse(
                "dummy access token",
                UserResponse.from(user)
        );
    }
}
