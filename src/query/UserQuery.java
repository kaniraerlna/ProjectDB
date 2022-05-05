/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package query;

/**
 *
 * @author Miss KaNiRa
 */
public class UserQuery {
    
    public String regist = "INSERT INTO users (name, address, phone, " +
            "username, password) VALUES (?, ?, ?, ?, ?)";
    public String login = "SELECT * FROM users WHERE "
            + "username = ? AND password = ?";
    
}
