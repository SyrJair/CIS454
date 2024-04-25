package com.moomeditate.moomeditation;

import com.moomeditate.moomeditation.services.UserService;
import com.moomeditate.moomeditation.controllers.JwtAuthenticationController;
import com.moomeditate.moomeditation.dto.AuthenticationRequest;
import com.moomeditate.moomeditation.dto.AuthenticationResponse;
import com.moomeditate.moomeditation.security.JwtUtil;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(JwtAuthenticationController.class)
public class JwtAuthenticationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private AuthenticationManager authenticationManager;

    @Mock
    private UserService userService;

    @Mock
    private JwtUtil jwtTokenUtil;

    @InjectMocks
    private JwtAuthenticationController jwtAuthenticationController;

    @Test
    public void testAuthenticate_ValidCredentials() throws Exception {
        // Arrange
        String username = "testuser";
        String password = "PasswordTest";
        String jwt = "valid-jwt-token";

        UserDetails userDetails = mock(UserDetails.class);
        when(userDetails.getUsername()).thenReturn(username);

        when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class)))
            .thenReturn(new UsernamePasswordAuthenticationToken(username, password));

        when(userService.loadUserByUsername(username))
            .thenReturn(userDetails);

        when(jwtTokenUtil.generateToken(userDetails))
            .thenReturn(jwt);

        AuthenticationRequest request = new AuthenticationRequest(username, password);

        // Act & Assert
        mockMvc.perform(MockMvcRequestBuilders.post("/authenticate")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"username\":\"testuser\", \"password\":\"testpass\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.jwt").value(jwt));
    }

    @Test
    public void testAuthenticate_InvalidCredentials() throws Exception {
        // Arrange
        String username = "testuser";
        String password = "wrongpass";

        when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class)))
            .thenThrow(new BadCredentialsException("Incorrect username or password"));

        AuthenticationRequest request = new AuthenticationRequest(username, password);

        // Act & Assert
        mockMvc.perform(MockMvcRequestBuilders.post("/authenticate")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"username\":\"testuser\", \"password\":\"wrongpass\"}"))
                .andExpect(status().isUnauthorized())
                .andExpect(content().string("Incorrect username or password"));
    }
}
