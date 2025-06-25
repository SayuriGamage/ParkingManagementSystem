package lk.ijse.apigateway.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ------------------------------------------------
 * Author: Sayuri Gamage
 * GitHub: https://github.com/sayuriGamage
 * Modified: 2025-06-25
 * ------------------------------------------------
 */


@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

   private String username;
   private String email;
   private String password;
   private String role;
}
