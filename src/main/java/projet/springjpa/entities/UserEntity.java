package projet.springjpa.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user", schema = "medicale", catalog = "")
public class UserEntity {
    private int id;
    private String username;
    private String email;
    private String roles;
    private String password;
    private String name;
    private String photouser;
    private String userResetpasstoken;
    private Timestamp userResetpassdate;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = true, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 180)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "roles", nullable = false, length = -1)
    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "photouser", nullable = true, length = 500)
    public String getPhotouser() {
        return photouser;
    }

    public void setPhotouser(String photouser) {
        this.photouser = photouser;
    }

    @Basic
    @Column(name = "user_resetpasstoken", nullable = true, length = 200)
    public String getUserResetpasstoken() {
        return userResetpasstoken;
    }

    public void setUserResetpasstoken(String userResetpasstoken) {
        this.userResetpasstoken = userResetpasstoken;
    }

    @Basic
    @Column(name = "user_resetpassdate", nullable = true)
    public Timestamp getUserResetpassdate() {
        return userResetpassdate;
    }

    public void setUserResetpassdate(Timestamp userResetpassdate) {
        this.userResetpassdate = userResetpassdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != that.id) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (roles != null ? !roles.equals(that.roles) : that.roles != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (photouser != null ? !photouser.equals(that.photouser) : that.photouser != null) return false;
        if (userResetpasstoken != null ? !userResetpasstoken.equals(that.userResetpasstoken) : that.userResetpasstoken != null)
            return false;
        if (userResetpassdate != null ? !userResetpassdate.equals(that.userResetpassdate) : that.userResetpassdate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (photouser != null ? photouser.hashCode() : 0);
        result = 31 * result + (userResetpasstoken != null ? userResetpasstoken.hashCode() : 0);
        result = 31 * result + (userResetpassdate != null ? userResetpassdate.hashCode() : 0);
        return result;
    }
}
