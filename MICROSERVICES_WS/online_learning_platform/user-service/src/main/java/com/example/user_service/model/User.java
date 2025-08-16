package com.example.user_service.model;



//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "users")
//public class User {
//    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false, unique = true)
//    private String username;
//
//    @Column(nullable = false)
//    private String password;
//
//    @Column
//    private String role;
//
//	public void setRole(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public CharSequence getPassword() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void setPassword(String encode) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//    // getters and setters
//}




import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    private String role; // "STUDENT" or "TEACHER"
}