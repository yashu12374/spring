package com.xworkz.coreapp;

import com.xworkz.coreapp.configuration.CoreConfiguration;
import com.xworkz.coreapp.dto.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class CoreRunner {
    public static void main(String[] args) {

        System.out.println("main started");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreConfiguration.class);

        System.out.println("_");
        Internet internet = applicationContext.getBean(Internet.class);
        internet.setId(1);
        internet.setName("JIO");
        System.out.println(internet);

        Integer id = applicationContext.getBean("getId",Integer.class);
        System.out.println(id);

        String name=applicationContext.getBean("getName",String.class);
        System.out.println(name);

        List<String> brand =applicationContext.getBean("Places",List.class);
        System.out.println(brand);

        List<String> list = applicationContext.getBean("getBrand" , List.class);
        System.out.println(list);

        List<UserDTO> userDTOS = applicationContext.getBean("getUser",List.class);
        userDTOS.stream().forEach(System.out::println);
        System.out.println("......................................................");

        List<CustomerDTO> customerDTOS = applicationContext.getBean("getCustomer",List.class);
        customerDTOS.stream().forEach(System.out::println);
        System.out.println(".......................................................");

        List<ProductDTO> productDTOS = applicationContext.getBean("getProducts",List.class);
        productDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<EmployeeDTO> employeeDTOS = applicationContext.getBean("getEmployees",List.class);
        employeeDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<OrderDTO> orders = applicationContext.getBean("getOrders",List.class);
        orders.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<VehicleDTO> vehicles = applicationContext.getBean("getVehicles",List.class);
        vehicles.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<StudentDTO> students = applicationContext.getBean("getStudents",List.class);
        students.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<TeacherDTO> teachers = applicationContext.getBean("getTeachers",List.class);
        teachers.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<HotelDTO> hotels = applicationContext.getBean("getHotels",List.class);
        hotels.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<TransactionDTO> transactionDTOS = applicationContext.getBean("getTransactions",List.class);
        transactionDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<AccountDTO> accountDTOS = applicationContext.getBean("getAccounts",List.class);
        accountDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<ShopDTO> shopDTOS = applicationContext.getBean("getShops",List.class);
        shopDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<BillDTO> billDTOS = applicationContext.getBean("getBills",List.class);
        billDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<MovieDTO> movieDTOS = applicationContext.getBean("getMovies",List.class);
        movieDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<FlightDTO> flightDTOS = applicationContext.getBean("getFlights",List.class);
        flightDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<TrainDTO> trainDTOS = applicationContext.getBean("getTrains",List.class);
        trainDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<CourseDTO> courseDTOS = applicationContext.getBean("getCourses",List.class);
        courseDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<LaptopDTO> laptopDTOS = applicationContext.getBean("getLaptops",List.class);
        laptopDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<MobileDTO> mobileDTOS = applicationContext.getBean("getMobiles",List.class);
        mobileDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<AddressDTO> addressDTOS = applicationContext.getBean("getAddresses",List.class);
        addressDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<FoodDTO> foodDTOS = applicationContext.getBean("getFoods",List.class);
        foodDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<MenuDTO> menuDTOS = applicationContext.getBean("getMenus",List.class);
        menuDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<DeliveryDTO> deliveryDTOS = applicationContext.getBean("getDeliveries",List.class);
        deliveryDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<FeedbackDTO> feedbackDTOS = applicationContext.getBean("getFeedbacks",List.class);
        feedbackDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<SupplierDTO> supplierDTOS = applicationContext.getBean("getSuppliers",List.class);
        supplierDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<DepartmentDTO> departmentDTOS = applicationContext.getBean("getDepartments",List.class);
        departmentDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<InsuranceDTO> insuranceDTOS = applicationContext.getBean("getInsurances",List.class);
        insuranceDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<BankDTO> bankDTOS = applicationContext.getBean("getBanks",List.class);
        bankDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<CardDTO> cardDTOS = applicationContext.getBean("getCards",List.class);
        cardDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<GameDTO> gameDTOS = applicationContext.getBean("getGames",List.class);
        gameDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<EventDTO> eventDTOS = applicationContext.getBean("getEvents",List.class);
        eventDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<WalletDTO> walletDTOS = applicationContext.getBean("getWallets",List.class);
        walletDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<LoanDTO> loanDTOS = applicationContext.getBean("getLoans",List.class);
        loanDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<TrainerDTO> trainerDTOS = applicationContext.getBean("getTrainers",List.class);
        trainerDTOS.stream().forEach(System.out::println);
        System.out.println("........................................................");

        List<RoomDTO> rooms = applicationContext.getBean("getRooms",List.class);
        rooms.stream().forEach(System.out::println);
        System.out.println("........................................................");


        System.out.println("main ended");
    }
}
