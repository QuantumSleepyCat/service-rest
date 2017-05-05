//package by.bsuir.cinema.entity;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Entity
//public class User implements Serializable{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_user")
//    private Long idUser;
//
//    @Column(unique = true, nullable = false)
//    private String login;
//
//    @Column(nullable = false)
//    private String password;
//
//    @Column(unique = true, nullable = false)
//    private String email;
//
//    @Column(nullable = false)
//    private Integer discount;
//
//    @Column(nullable = false)
//    private Boolean isNotify;
//
//    @Enumerated(EnumType.STRING)
//    private Role role;
//
//    public Boolean getNotify() {
//        return isNotify;
//    }
//
//    public void setNotify(Boolean notify) {
//        isNotify = notify;
//    }
//
//    public Long getIdUser() {
//        return idUser;
//    }
//
//    public void setIdUser(Long idUser) {
//        this.idUser = idUser;
//    }
//
//    public String getLogin() {
//        return login;
//    }
//
//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Integer getDiscount() {
//        return discount;
//    }
//
//    public void setDiscount(Integer discount) {
//        this.discount = discount;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        User user = (User) o;
//
//        if (idUser != null ? !idUser.equals(user.idUser) : user.idUser != null) return false;
//        if (login != null ? !login.equals(user.login) : user.login != null) return false;
//        if (password != null ? !password.equals(user.password) : user.password != null) return false;
//        if (email != null ? !email.equals(user.email) : user.email != null) return false;
//        if (discount != null ? !discount.equals(user.discount) : user.discount != null) return false;
//        if (isNotify != null ? !isNotify.equals(user.isNotify) : user.isNotify != null) return false;
//        return role == user.role;
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = idUser != null ? idUser.hashCode() : 0;
//        result = 31 * result + (login != null ? login.hashCode() : 0);
//        result = 31 * result + (password != null ? password.hashCode() : 0);
//        result = 31 * result + (email != null ? email.hashCode() : 0);
//        result = 31 * result + (discount != null ? discount.hashCode() : 0);
//        result = 31 * result + (isNotify != null ? isNotify.hashCode() : 0);
//        result = 31 * result + (role != null ? role.hashCode() : 0);
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "idUser=" + idUser +
//                ", login='" + login + '\'' +
//                ", password='" + password + '\'' +
//                ", email='" + email + '\'' +
//                ", discount=" + discount +
//                ", isNotify=" + isNotify +
//                ", role=" + role +
//                '}';
//    }
//}
