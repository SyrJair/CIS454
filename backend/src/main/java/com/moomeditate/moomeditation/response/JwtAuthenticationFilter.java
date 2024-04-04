// package com.moomeditate.moomeditation.response;

// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.AuthenticationException;
// import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

// import com.moomeditate.moomeditation.models.User;

// import jakarta.servlet.ServletException;

// import javax.servlet.FilterChain;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import java.io.IOException;

// public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
//     private AuthenticationManager authenticationManager;

//     public JwtAuthenticationFilter(AuthenticationManager authenticationManager) {
//         this.authenticationManager = authenticationManager;
//     }

//     @Override
//     public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
//         // Parse the username and password from the request
//         String username = obtainUsername(request);
//         String password = obtainPassword(request);
    
//         if (username == null) {
//             username = "";
//         }
    
//         if (password == null) {
//             password = "";
//         }
    
//         username = username.trim();
    
//         UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(username, password);
    
//         // Authenticate the user
//         return authenticationManager.authenticate(authRequest);
//     }
    

//     @Override
//     protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
//         // Get the principal (user) from the authentication result
//         User principal = (User) authResult.getPrincipal();
    
//         // Generate a JWT for the user
//         String jwt = generateJwtForUser(principal);
    
//         // Add the JWT to the response
//         response.addHeader("Authorization", "Bearer " + jwt);
//     }
// }