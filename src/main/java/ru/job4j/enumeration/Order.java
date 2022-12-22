package ru.job4j.enumeration;

public class Order {
    private int id;
    private String model;
    private Status status;

    public Order(int id, String model, Status status) {
        this.id = id;
        this.model = model;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
