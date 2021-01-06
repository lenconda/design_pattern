package top.lenconda.design_pattern.task3.task3_5;

public class UserInfo {
    private String email;
    private String name;
    private String phone;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User saveUser() {
        return new User(email, name, phone);
    }

    public void restoreUser(User user) {
        this.email = user.getAccount();
        this.name = user.getPassword();
        this.phone = user.getTelNo();
    }

    public String toString() {
        return "(email = " + this.email + ", name = " + this.name + ", phone = " + this.phone + ")";
    }
}
