package top.lenconda.design_pattern.market.user;

public class Stuff extends User {
    public Stuff(String name, String username, String password, String role) {
        super(name, username, password, role);
    }

    @Override
    public void addStuff(User stuff) {
        System.out.println("Stuff cannot add stuff");
    }

    @Override
    public void removeStuff(User stuff) {
        System.out.println("Cannot remove stuff");
    }

    @Override
    public User getStuffByIndex(int index) {
        System.out.println("Cannot find user");
        return null;
    }
}
