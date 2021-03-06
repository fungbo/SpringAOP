package com.tw;

import com.tw.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static final ApplicationContext context;
    private List<Food> foods = new ArrayList<Food>();
    @Autowired
    private Food noodle;
    @Autowired
    private Food rice;
    @Autowired
    private Food dumpling;

    static {
        context = new ClassPathXmlApplicationContext("spring.xml");
    }

    public static void main(String[] args) {
        App app = (App) context.getBean("app");
        app.prepareFoods();
        app.printFoods();
    }

    void prepareFoods() {
        foods.add(noodle);
        foods.add(rice);
        foods.add(dumpling);
    }

    void printFoods() {
        for (Food food : foods) {
            System.out.println(food.getName());
        }
    }
}
