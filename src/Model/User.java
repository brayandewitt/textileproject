/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author braya
 */
public class User {
    
    private int userId;
    private String userUsername;
    private String userFname;
    private String userLname;

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the userUsername
     */
    public String getUserUsername() {
        return userUsername;
    }

    /**
     * @param userUsername the userUsername to set
     */
    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    /**
     * @return the userFname
     */
    public String getUserFname() {
        return userFname;
    }

    /**
     * @param userFname the userFname to set
     */
    public void setUserFname(String userFname) {
        this.userFname = userFname;
    }

    /**
     * @return the userLname
     */
    public String getUserLname() {
        return userLname;
    }

    /**
     * @param userLname the userLname to set
     */
    public void setUserLname(String userLname) {
        this.userLname = userLname;
    }
}
