package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {
    private CarServiceImpl allCars = new CarServiceImpl();


    @GetMapping("/car")
    public String printCar(@RequestParam("count") int count,
                           Model model) {
        List<Car> cars = allCars.getCars()
                .stream()
                .limit(count)
                .collect(Collectors.toList());
        model.addAttribute("getcars", cars);

        return "car";
    }
}
