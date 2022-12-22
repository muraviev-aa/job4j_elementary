package ru.job4j.enumeration;

public class CarService {
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Статус Toyota: " + toyota);
        System.out.println("Статус Volvo: " + volvo);
        System.out.println("------------------------");
        Order order = new Order(1, "Mercedes-Benz GLS", Status.IN_WORK);
        System.out.println("Заказ-наряд №" + order.getId() + " на автомобиль "
        + order.getModel() + ", статус ремонта: " + order.getStatus());
        System.out.println("------------------------");
        System.out.println("Заказ-наряд №" + order.getId() + " на автомобиль "
                + order.getModel() + ", статус ремонта: " + order.getStatus().getInfo());
    }
}
