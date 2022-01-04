package com.solvd.socialNetwork.binary;

public class User {
    private long id;
    private String userName;
    private String password;
    private long profileId;
    private long friendId;

    public User() {
    }

    public User(int id, String userName, String password, long profileId, long friendId) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.profileId = profileId;
        this.friendId = friendId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getProfileId() {
        return profileId;
    }

    public void setProfileId(long profileId) {
        this.profileId = profileId;
    }

    public long getFriendId() {
        return friendId;
    }

    public void setFriendId(long friendId) {
        this.friendId = friendId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", profileId=" + profileId +
                ", friendId=" + friendId +
                '}';
    }
}
