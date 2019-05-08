package com.mera.carshop.rest.service;

import com.mera.carshop.rest.entity.Car;
import com.mera.carshop.rest.entity.CarColor;
import com.mera.carshop.rest.entity.CarModel;
import com.mera.carshop.rest.entity.CarOption;
import com.mera.carshop.rest.entity.Order;
import com.mera.carshop.rest.entity.ShopCustomer;
import com.mera.carshop.rest.model.Status;
import com.mera.carshop.rest.repository.CarColorRepository;
import com.mera.carshop.rest.repository.CarModelRepository;
import com.mera.carshop.rest.repository.CarOptionRepository;
import com.mera.carshop.rest.repository.CarRepository;
import com.mera.carshop.rest.repository.OrderRepository;
import com.mera.carshop.rest.repository.ShopCustomerRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class InitService {

    private static final Logger logger = LogManager.getLogger(InitService.class);


    private CarColorRepository carColorRepository;
    private CarModelRepository carModelRepository;
    private CarOptionRepository carOptionRepository;
    private ShopCustomerRepository customerRepository;
    private OrderRepository orderRepository;
    private CarRepository carRepository;

    @Autowired
    public InitService(CarColorRepository carColorRepository,
                       CarModelRepository carModelRepository,
                       CarOptionRepository carOptionRepository,
                       ShopCustomerRepository customerRepository,
                       OrderRepository orderRepository,
                       CarRepository carRepository) {
        this.carColorRepository = carColorRepository;
        this.carModelRepository = carModelRepository;
        this.carOptionRepository = carOptionRepository;
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
        this.carRepository = carRepository;
    }

    @PostConstruct
    public void dataInit() {
        logger.info("start of data init");
        carColorInit();
        carModelInit();
        carOptionInit();
        customerInit();
        carInit();
        orderInit();
        logger.info("end of data init");
    }

    private void carInit() {
        List<Car> cars = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            cars.add(new Car(getCarModel(i), getCarOption(i), getCarColor(i), true));
        }
//        cars.add(new Car(getCarModel(1), getCarOption(1), getCarColor(1), true));
        save(cars, carRepository);
    }

    private CarColor getCarColor(int id) {
        return carColorRepository.getOne(id);
    }

    private CarModel getCarModel(int id) {
        return carModelRepository.getOne(id);
    }

    private CarOption getCarOption(int id) {
        return carOptionRepository.getOne(id);
    }

    private void orderInit() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 1, Status.ACCEPTED.toString(), new Date().toString()));
        orders.add(new Order(2, 2, Status.ACCEPTED.toString(), new Date().toString()));
        orders.add(new Order(3, 3, Status.ACCEPTED.toString(), new Date().toString()));
        save(orders, orderRepository);
    }

    private void customerInit() {
        List<ShopCustomer> customers = new ArrayList<>();
        customers.add(new ShopCustomer("name1", "address1", 111, "email1@mail.com"));
        customers.add(new ShopCustomer("name2", "address2", 222, "email2@mail.com"));
        customers.add(new ShopCustomer("name3", "address3", 333, "email3@mail.com"));
        customers.add(new ShopCustomer("name4", "address4", 444, "email4@mail.com"));
        customers.add(new ShopCustomer("name5", "address5", 555, "email5@mail.com"));
        customers.add(new ShopCustomer("name6", "address6", 777, "email6@mail.com"));
        save(customers, customerRepository);
    }

    private void carOptionInit() {
        List<CarOption> carOptions = new ArrayList<>();
        carOptions.add(new CarOption(true, false, false, false, false, false));
        carOptions.add(new CarOption(true, true, false, false, false, false));
        carOptions.add(new CarOption(true, true, true, false, false, false));
        carOptions.add(new CarOption(true, true, true, true, false, false));
        carOptions.add(new CarOption(true, true, true, true, true, false));
        carOptions.add(new CarOption(true, true, true, true, true, true));
        save(carOptions, carOptionRepository);
    }

    private void carColorInit() {
        List<CarColor> carColors = new ArrayList<>();
        carColors.add(new CarColor("white"));
        carColors.add(new CarColor("red"));
        carColors.add(new CarColor("black"));
        carColors.add(new CarColor("blue"));
        carColors.add(new CarColor("yellow"));
        carColors.add(new CarColor("green"));
        save(carColors, carColorRepository);
    }

    private void carModelInit() {
        List<CarModel> carModels = new ArrayList<>();
        carModels.add(new CarModel("Octavia", "SKODA"));
        carModels.add(new CarModel("X5", "BMW"));
        carModels.add(new CarModel("911", "PORSCHE"));
        carModels.add(new CarModel("Kalina", "LADA"));
        carModels.add(new CarModel("Avensis", "TOYOTA"));
        carModels.add(new CarModel("A3", "AUDI"));
        save(carModels, carModelRepository);
    }

    private <T> void save(List<T> objects, JpaRepository<T, ?> repository) {
        try {
            repository.saveAll(objects);
            logger.info("all data was saved for: " + objects.get(0).getClass().toString());
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }
}
