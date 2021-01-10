package top.lenconda.design_pattern.market.store;

import top.lenconda.design_pattern.market.user.Manager;
import top.lenconda.design_pattern.market.user.User;

import java.util.ArrayList;

public class Goods {
    private String id;
    private String name;
    private GoodsCategory category;
    private String origin;
    private ArrayList<String> pictures;
    private String model;
    private String description;
    private int quantity;
    private ArrayList<User> managers;
    private ArrayList<User> stuffs;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public GoodsCategory getCategory() {
        return category;
    }

    public String getOrigin() {
        return origin;
    }

    public ArrayList<String> getPictures() {
        return pictures;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<User> getManagers() {
        return managers;
    }

    public void addManager(User manager, User operator) {
        if (
                !this.managers.contains(operator) || !(operator instanceof Manager) || !operator.department.getId().equals("sales")) {
            System.out.println("You have no permission to add manager");
            return;
        }
        this.managers.add(manager);
    }

    public void deleteManager(User manager, User operator) {
        if (!this.managers.contains(operator)) {
            System.out.println("You have no permission to remove manager");
            return;
        }
        this.managers.remove(manager);
    }

    public ArrayList<User> getStuffs() {
        return stuffs;
    }

    public void addStuff(User stuff, User operator) {
        if (!this.managers.contains(operator) || !operator.department.getId().equals("sales")) {
            System.out.println("You have no permission to add stuff");
            return;
        }
        this.stuffs.add(stuff);
    }

    public void removeStuff(User stuff, User operator) {
        if (!this.managers.contains(operator)) {
            System.out.println("You have no permission to remove stuff");
            return;
        }
        this.stuffs.remove(stuff);
    }

    public void setName(String name, User operator) {
        if (!this.managers.contains(operator) && !this.stuffs.contains(operator)) {
            System.out.println("You have no permission to set goods' name");
            return;
        }
        this.name = name;
    }

    public void setCategory(GoodsCategory category, User operator) {
        if (!this.managers.contains(operator) && !this.stuffs.contains(operator)) {
            System.out.println("You have no permission to set goods' category");
            return;
        }
        this.category = category;
    }

    public void setOrigin(String origin, User operator) {
        if (!this.managers.contains(operator) && !this.stuffs.contains(operator)) {
            System.out.println("You have no permission to set goods' origin");
            return;
        }
        this.origin = origin;
    }

    public void setPictures(ArrayList<String> pictures, User operator) {
        if (!this.managers.contains(operator) && !this.stuffs.contains(operator)) {
            System.out.println("You have no permission to set goods' pictures");
            return;
        }
        this.pictures = pictures;
    }

    public void setModel(String model, User operator) {
        if (!this.managers.contains(operator) && !this.stuffs.contains(operator)) {
            System.out.println("You have no permission to set goods' model");
            return;
        }
        this.model = model;
    }

    public void setDescription(String description, User operator) {
        if (!this.managers.contains(operator) && !this.stuffs.contains(operator)) {
            System.out.println("You have no permission to set goods' description");
            return;
        }
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void sale(int quantity, User operator) {
        if (!this.managers.contains(operator) && !this.stuffs.contains(operator)) {
            System.out.println("You have no permission to sale this goods");
            return;
        }
        this.quantity = quantity;
    }

    public void add(int quantity, User operator) {
        if (!operator.department.getId().equals("logistics")) {
            System.out.println("You have not permission to add goods");
            return;
        }
        this.quantity = this.quantity + quantity;
    }

    public String toString() {
        return "{"
                + "id: " + id
                + ", name: " + name
                + ", category: {"
                + "id: " + category.getId()
                + ", name: " + category.getName()
                + "}"
                + ", origin: " + origin
                + ", pictures: " + pictures.toString()
                + ", model: " + model
                + ", description: " + description
                + "}";
    }

    public String getInfo() {
        return this.toString();
    }
}
