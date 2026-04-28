//package com.example.SPSProjectBackend.controller;
//
//import com.example.SPSProjectBackend.dto.LoginRequest;
//import com.example.SPSProjectBackend.model.SaUser;
//import com.example.SPSProjectBackend.service.SaUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import jakarta.servlet.http.HttpServletRequest;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
////@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
//@RequestMapping("/api/v1/auth")
//public class SaUserController {
//
//    private final SaUserService saUserService;
//
//
//    @Autowired
//    public SaUserController(SaUserService saUserService) {
//        this.saUserService = saUserService;
//    }
//
////    @PostMapping("/login")
////    public ResponseEntity<Map<String, Object>> login(@RequestBody LoginRequest loginRequest) {
////        try {
////            SaUser user = saUserService.login(loginRequest.getUserId(), loginRequest.getPassword());
////
////            Map<String, Object> response = new HashMap<>();
////            response.put("message", "Login successful");
////            response.put("userId", user.getUserId());
////            response.put("userName", user.getUserName());
////            response.put("userLevel", user.getUserLevel());
////
////            return ResponseEntity.ok(response);
////        } catch (RuntimeException e) {
////            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error", e.getMessage()));
////        }
////    }
//
//    //@PostMapping("/login")
////    public ResponseEntity<Map<String, Object>> login(@RequestBody LoginRequest loginRequest, HttpServletRequest request) {
////        String userId = loginRequest.getUserId();
////        String password = loginRequest.getPassword();
////
////        if (userId == null || userId.isEmpty() || password == null || password.isEmpty()) {
////            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", "User ID and password must not be empty"));
////        }
////
////        try {
////            SaUser user = saUserService.login(userId, password);
////
////            // Set session attributes
////            request.getSession().setAttribute("loggedUser", user.getUserId().toUpperCase());
////            request.getSession().setAttribute("loggedUserRole", user.getUserLevel());
////
////            Map<String, Object> response = new HashMap<>();
////            response.put("message", "Login successful");
////            response.put("userId", user.getUserId());
////            response.put("userName", user.getUserName());
////            response.put("userLevel", user.getUserLevel());
////
////            return ResponseEntity.ok(response);
////        } catch (RuntimeException e) {
////            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error", e.getMessage()));
////        }
////    }
//
////
//
//    @PostMapping("/login")
//    public ResponseEntity<Map<String, Object>> login(@RequestBody LoginRequest loginRequest, HttpServletRequest request) {
//        String userId = loginRequest.getUserId();
//        String password = loginRequest.getPassword();
//
//        if (userId == null || userId.isEmpty() || password == null || password.isEmpty()) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", "User ID and password must not be empty"));
//        }
//
//        try {
//            SaUser user = saUserService.login(userId, password);
//
//            request.getSession().setAttribute("loggedUser", user.getUserId().toUpperCase());
//            request.getSession().setAttribute("loggedUserRole", user.getUserLevel());
//            request.getSession().setAttribute("loggedusercostcenter", user.getRptUser());
//
//            Map<String, Object> response = new HashMap<>();
//            response.put("message", "Login successful");
//            response.put("userId", user.getUserId());
//            response.put("userName", user.getUserName());
//            response.put("userLevel", user.getUserLevel());
//            response.put("costcenter", user.getRptUser());
//
//            return ResponseEntity.ok(response);
//        } catch (RuntimeException e) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error", e.getMessage()));
//        }
//    }
//
//
//}

////NEW UPDATED CODES
//package com.example.SPSProjectBackend.controller;
//
//import com.example.SPSProjectBackend.dto.LoginRequest;
//import com.example.SPSProjectBackend.model.SaUser;
//import com.example.SPSProjectBackend.service.SaUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import jakarta.servlet.http.HttpServletRequest;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api/v1/auth")
//public class SaUserController {
//
//    private final SaUserService saUserService;
//
//    @Autowired
//    public SaUserController(SaUserService saUserService) {
//        this.saUserService = saUserService;
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<Map<String, Object>> login(@RequestBody LoginRequest loginRequest, HttpServletRequest request) {
//        String userId = loginRequest.getUserId();
//        String password = loginRequest.getPassword();
//
//        // CHANGED: Added more detailed validation
//        if (userId == null || userId.trim().isEmpty()) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", "User ID must not be empty"));
//        }
//        if (password == null || password.trim().isEmpty()) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", "Password must not be empty"));
//        }
//
//        try {
//            SaUser user = saUserService.login(userId, password);
//
//            // Set session attributes
//            request.getSession().setAttribute("loggedUser", user.getUserId().toUpperCase());
//            request.getSession().setAttribute("loggedUserRole", user.getUserLevel());
//            request.getSession().setAttribute("loggedusercostcenter", user.getRptUser());
//
//            Map<String, Object> response = new HashMap<>();
//            response.put("message", "Login successful");
//            response.put("userId", user.getUserId());
//            response.put("userName", user.getUserName());
//            response.put("userLevel", user.getUserLevel());
//            response.put("costcenter", user.getRptUser());
//
//            return ResponseEntity.ok(response);
//        } catch (RuntimeException e) {
//            // CHANGED: Return more specific error messages
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error", e.getMessage()));
//        } catch (Exception e) {
//            // CHANGED: Added general exception handling
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("error", "Internal server error during login"));
//        }
//    }
//}

//NEW CODES 2
package com.example.SPSProjectBackend.controller;

import com.example.SPSProjectBackend.dto.LoginRequest;
import com.example.SPSProjectBackend.model.SaUser;
import com.example.SPSProjectBackend.service.SaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
// @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
@RequestMapping("/api/v1/auth")
public class SaUserController {

    private final SaUserService saUserService;

    @Autowired
    public SaUserController(SaUserService saUserService) {
        this.saUserService = saUserService;
    }

    @Autowired
    private RestTemplate restTemplate;

    // @PostMapping("/login")
    // public ResponseEntity<Map<String, Object>> login(@RequestBody LoginRequest
    // loginRequest) {
    // try {
    // SaUser user = saUserService.login(loginRequest.getUserId(),
    // loginRequest.getPassword());
    //
    // Map<String, Object> response = new HashMap<>();
    // response.put("message", "Login successful");
    // response.put("userId", user.getUserId());
    // response.put("userName", user.getUserName());
    // response.put("userLevel", user.getUserLevel());
    //
    // return ResponseEntity.ok(response);
    // } catch (RuntimeException e) {
    // return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error",
    // e.getMessage()));
    // }
    // }

    // @PostMapping("/login")
    // public ResponseEntity<Map<String, Object>> login(@RequestBody LoginRequest
    // loginRequest, HttpServletRequest request) {
    // String userId = loginRequest.getUserId();
    // String password = loginRequest.getPassword();
    //
    // if (userId == null || userId.isEmpty() || password == null ||
    // password.isEmpty()) {
    // return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error",
    // "User ID and password must not be empty"));
    // }
    //
    // try {
    // SaUser user = saUserService.login(userId, password);
    //
    // // Set session attributes
    // request.getSession().setAttribute("loggedUser",
    // user.getUserId().toUpperCase());
    // request.getSession().setAttribute("loggedUserRole", user.getUserLevel());
    //
    // Map<String, Object> response = new HashMap<>();
    // response.put("message", "Login successful");
    // response.put("userId", user.getUserId());
    // response.put("userName", user.getUserName());
    // response.put("userLevel", user.getUserLevel());
    //
    // return ResponseEntity.ok(response);
    // } catch (RuntimeException e) {
    // return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error",
    // e.getMessage()));
    // }
    // }

    //


    //this is previous current working login without AD login
    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> login(@RequestBody LoginRequest loginRequest,
            HttpServletRequest request) {
        String userId = loginRequest.getUserId();
        String password = loginRequest.getPassword();

        if (userId == null || userId.isEmpty() || password == null || password.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(Map.of("error", "User ID and password must not be empty"));
        }

        try {
            SaUser user = saUserService.login(userId, password);

            String loggedUserId = user.getUserId() == null ? "" : user.getUserId().toUpperCase();
            String loggedUserLevel = user.getUserLevel() == null ? "" : user.getUserLevel();
            String loggedCostCenter = user.getRptUser() == null ? "" : user.getRptUser();

            request.getSession().setAttribute("loggedUser", loggedUserId);
            request.getSession().setAttribute("loggedUserRole", loggedUserLevel);
            request.getSession().setAttribute("loggedusercostcenter", loggedCostCenter);

            Map<String, Object> response = new HashMap<>();
            response.put("message", "Login successful");
            response.put("userId", loggedUserId);
            response.put("userName", user.getUserName() == null ? "" : user.getUserName());
            response.put("userLevel", loggedUserLevel);
            response.put("costcenter", loggedCostCenter);

            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error", e.getMessage()));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("error", "Unexpected error during login: " + e.getMessage()));
        }
    }

    //this is old loginwith ad method but not compare with epf numbers

//    @PostMapping("/loginWthAD")
//    public ResponseEntity<Map<String, Object>> loginWIthAD(@RequestBody LoginRequest loginRequest,
//                                                     HttpServletRequest request) {
//        String userId = loginRequest.getUserId();
//        String password = loginRequest.getPassword();
//
//        if (userId == null || userId.isEmpty() || password == null || password.isEmpty()) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//                    .body(Map.of("error", "User ID and password must not be empty"));
//        }
//
//        try {
//            // Step 1: Check if user exists in LDAP
//            String checkUrl = "http://smartceb.ceb:81/SMART_API/api/UserManagement/IsLDAPUserAvailable?user_name=" + userId;
//            ResponseEntity<Map> checkResponse = restTemplate.getForEntity(checkUrl, Map.class);
//
//            Map<String, Object> checkBody = checkResponse.getBody();
//            if (checkBody == null || !Boolean.TRUE.equals(checkBody.get("IsSuccess"))) {
//                return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
//                        .body(Map.of("error", "User not found or invalid"));
//            }
//
//            // Step 2: Validate credentials via AD login
//            String authUrl = "http://smartceb.ceb:81/SMART_API/api/UserManagement/ValidateADLogin";
//            Map<String, String> authRequest = new HashMap<>();
//            authRequest.put("ad_user_name", userId);
//            authRequest.put("ad_password", password);
//
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);
//            HttpEntity<Map<String, String>> entity = new HttpEntity<>(authRequest, headers);
//
//            ResponseEntity<Map> authResponse = restTemplate.exchange(
//                    authUrl,
//                    HttpMethod.POST,
//                    entity,
//                    Map.class
//            );
//
//            Map<String, Object> authBody = authResponse.getBody();
//            if (authBody == null || !Boolean.TRUE.equals(authBody.get("isSuccess"))) {
//                String errorMsg = authBody != null && authBody.containsKey("message")
//                        ? (String) authBody.get("message")
//                        : "Invalid credentials";
//                return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
//                        .body(Map.of("error", errorMsg));
//            }
//
//            // Extract user details from the nested "SmartCEBUser" object
//            Map<String, Object> smartUser = (Map<String, Object>) authBody.get("SmartCEBUser");
//            if (smartUser == null) {
//                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                        .body(Map.of("error", "Invalid response from authentication server"));
//            }
//
//            String adUsername = (String) smartUser.get("ad_username"); // This is the EPF number
//
//            // Step 3: Fetch the local user from SAUSERM table using EPF number
//            SaUser localUser;
//            try {
//                localUser = saUserService.getUserByEpfNo(adUsername);
//            } catch (RuntimeException e) {
//                // User not found or inactive in local DB
//                return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
//                        .body(Map.of("error", "Local user account not found or inactive: " + e.getMessage()));
//            }
//
//            // Step 4: Build response using local user data
//            Map<String, Object> response = new HashMap<>();
//            response.put("message", "Login successful");
//            response.put("userId", localUser.getUserId());
//            response.put("userName", localUser.getUserName());
//            response.put("userLevel", localUser.getUserLevel());
//            response.put("costcenter", localUser.getRptUser());
//
//            // Step 5: Set session attributes using local user's actual userId, role, and costcenter
//            request.getSession().setAttribute("loggedUser", localUser.getUserId().toUpperCase());
//            request.getSession().setAttribute("loggedUserRole", localUser.getUserLevel());
//            request.getSession().setAttribute("loggedusercostcenter", localUser.getRptUser());
//
//            return ResponseEntity.ok(response);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                    .body(Map.of("error", "Login service unavailable: " + e.getMessage()));
//        }
//    }

    @GetMapping("/users/dept/{deptId}")
    public ResponseEntity<?> getUsersByDept(@PathVariable String deptId) {
        try {
            List<String> users = saUserService.getUserIdsByDeptPrefix(deptId);
            return ResponseEntity.ok(users);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("error", e.getMessage()));
        }
    }

}