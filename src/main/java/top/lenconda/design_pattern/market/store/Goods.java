package top.lenconda.design_pattern.market.store;

import top.lenconda.design_pattern.market.user.User;

import java.util.ArrayList;

public class Goods {
    public String id;
    public String name;
    public GoodsCategory category;
    public String origin;
    public ArrayList<String> pictures;
    public String model;
    public String description;
    public ArrayList<User> managers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GoodsCategory getCategory() {
        return category;
    }

    public void setCategory(GoodsCategory category) {
        this.category = category;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public ArrayList<String> getPictures() {
        return pictures;
    }

    public void setPictures(ArrayList<String> pictures) {
        this.pictures = pictures;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<User> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<User> managers) {
        this.managers = managers;
    }

    public void addManager(User manager) {
        this.managers.add(manager);
    }

    public void deleteManager(User manager) {
        this.managers.remove(manager);
    }
}
