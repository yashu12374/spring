package com.xworkz.coreapp.configuration;

import com.xworkz.coreapp.dto.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.xworkz.coreapp")
public class CoreConfiguration {

    public CoreConfiguration() {
        System.out.println("Configuration is invoked..");
    }

    @Bean
    public String getName() {  //inbuilt
        return "jio";
    }

    @Bean
    public Integer getId() {
        return 1;
    }

    @Bean("Places")
    public List<String> getPlaces() {
        List<String> list = new ArrayList<>();
        list.add("bng");
        list.add("smg");
        return list;
    }

    @Bean
    public List<String> getBrand() {
        List<String> brand = new ArrayList<>();
        brand.add("h&M");
        brand.add("Nike");
        return brand;
    }

    @Bean
    public List<UserDTO> getUser() {
        List<UserDTO> userDTOS = new ArrayList<>();
        UserDTO user1 = new UserDTO(1, "Yashu", 22, "Female", "yashu12@gmail.com", "yashu@123", 7022665588L, "Bhadravathi");
        UserDTO user2 = new UserDTO(2, "Thanu", 22, "Female", "thanu@gmail.com", "thanu@123", 9874563210l, "Sullia");
        UserDTO user3 = new UserDTO(3, "Karthika", 21, "Female", "karthika@gmail.com", "karthika@123", 9874658123l, "Bengaluru");
        UserDTO user4 = new UserDTO(4, "Kavya", 32, "Female", "kavya@gmail.com", "kavya@123", 8874658123l, "Bengaluru");
        UserDTO user5 = new UserDTO(5, "Jamuna", 21, "Female", "jamuna@gmail.com", "jamuna@123", 7774658123l, "Shivmogga");
        UserDTO user6 = new UserDTO(6, "Sowmya", 23, "Female", "sowmya@gmail.com", "sowmya@123", 9874658158l, "Bengaluru");
        UserDTO user7 = new UserDTO(7, "Darshan", 24, "Male", "darshan@gmail.com", "darshan@123", 8798658123l, "Bengaluru");
        UserDTO user8 = new UserDTO(8, "Pooja", 21, "Female", "pooja@gmail.com", "pooja@123", 9745658123l, "Bengaluru");
        UserDTO user9 = new UserDTO(9, "Tishan", 23, "Male", "tishan@gmail.com", "tishan@123", 8074658123l, "Bengaluru");
        UserDTO user10 = new UserDTO(10, "Sanjana", 21, "Female", "sanjana@gmail.com", "sanjana@123", 7022658123l, "Bengaluru");
        UserDTO user11 = new UserDTO(11, "Impana", 21, "Female", "impana@gmail.com", "impana@123", 9874658123l, "Hassan");
        UserDTO user12 = new UserDTO(12, "Chandana", 29, "Female", "chandu@gmail.com", "chanu@123", 8625658123l, "Bengaluru");
        UserDTO user13 = new UserDTO(13, "Ranju", 30, "Female", "ranju@gmail.com", "ranju@123", 7784658123l, "Bengaluru");
        UserDTO user14 = new UserDTO(14, "Anjani", 28, "Female", "anju@gmail.com", "anju@123", 9591267456l, "Bhadravathi");
        UserDTO user15 = new UserDTO(15, "Hamsa", 25, "Female", "hamsa@gmail.com", "hamsa@123", 8844658123l, "Bengaluru");

        userDTOS.add(user1);
        userDTOS.add(user2);
        userDTOS.add(user3);
        userDTOS.add(user4);
        userDTOS.add(user5);
        userDTOS.add(user6);
        userDTOS.add(user7);
        userDTOS.add(user8);
        userDTOS.add(user9);
        userDTOS.add(user10);
        userDTOS.add(user11);
        userDTOS.add(user12);
        userDTOS.add(user13);
        userDTOS.add(user14);
        userDTOS.add(user15);
        return userDTOS;
    }

    @Bean
    public List<CustomerDTO> getCustomer() {
        List<CustomerDTO> customers = new ArrayList<>();

        CustomerDTO c1 = new CustomerDTO(1, "Manoj", 28, "Male", "manoj@gmail.com", 9988776655L, "Bengaluru");
        CustomerDTO c2 = new CustomerDTO(2, "Varsha", 26, "Female", "varsha@gmail.com", 9876543210L, "Mysuru");
        CustomerDTO c3 = new CustomerDTO(3, "Ajay", 30, "Male", "ajay@gmail.com", 9123456780L, "Shivamogga");
        CustomerDTO c4 = new CustomerDTO(4, "Deepika", 24, "Female", "deepika@gmail.com", 9874501236L, "Udupi");
        CustomerDTO c5 = new CustomerDTO(5, "Kiran", 27, "Male", "kiran@gmail.com", 9988445566L, "Mangaluru");
        CustomerDTO c6 = new CustomerDTO(6, "Nandini", 29, "Female", "nandini@gmail.com", 8866445512L, "Hassan");
        CustomerDTO c7 = new CustomerDTO(7, "Ravi", 32, "Male", "ravi@gmail.com", 9090909090L, "Tumakuru");
        CustomerDTO c8 = new CustomerDTO(8, "Sneha", 23, "Female", "sneha@gmail.com", 9123678450L, "Bengaluru");
        CustomerDTO c9 = new CustomerDTO(9, "Gopal", 35, "Male", "gopal@gmail.com", 9988771122L, "Davangere");
        CustomerDTO c10 = new CustomerDTO(10, "Roshni", 25, "Female", "roshni@gmail.com", 9887766554L, "Kolar");
        CustomerDTO c11 = new CustomerDTO(11, "Sudeep", 28, "Male", "sudeep@gmail.com", 9101010101L, "Belagavi");
        CustomerDTO c12 = new CustomerDTO(12, "Divya", 31, "Female", "divya@gmail.com", 9876501234L, "Hubballi");
        CustomerDTO c13 = new CustomerDTO(13, "Harsha", 29, "Male", "harsha@gmail.com", 9856741230L, "Bengaluru");
        CustomerDTO c14 = new CustomerDTO(14, "Meghana", 26, "Female", "meghana@gmail.com", 9000012345L, "Chikkamagaluru");
        CustomerDTO c15 = new CustomerDTO(15, "Ramesh", 33, "Male", "ramesh@gmail.com", 9123456700L, "Bengaluru");

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        customers.add(c6);
        customers.add(c7);
        customers.add(c8);
        customers.add(c9);
        customers.add(c10);
        customers.add(c11);
        customers.add(c12);
        customers.add(c13);
        customers.add(c14);
        customers.add(c15);

        return customers;
    }

    @Bean
    public List<ProductDTO> getProducts() {
        List<ProductDTO> products = new ArrayList<>();
        products.add(new ProductDTO(1, "Laptop", "Electronics", 75000, 10, "Dell", "Gaming Laptop"));
        products.add(new ProductDTO(2, "Mobile", "Electronics", 35000, 20, "Samsung", "Android Phone"));
        products.add(new ProductDTO(3, "Chair", "Furniture", 2500, 50, "Ikea", "Office Chair"));
        products.add(new ProductDTO(4, "Table", "Furniture", 4500, 30, "Ikea", "Dining Table"));
        products.add(new ProductDTO(5, "Headphones", "Electronics", 1500, 40, "Sony", "Wireless Headphones"));
        products.add(new ProductDTO(6, "Smartwatch", "Electronics", 5000, 25, "Apple", "Series 6"));
        products.add(new ProductDTO(7, "Printer", "Electronics", 8000, 15, "HP", "LaserJet"));
        products.add(new ProductDTO(8, "Sofa", "Furniture", 20000, 10, "Urban Ladder", "3-Seater"));
        products.add(new ProductDTO(9, "Monitor", "Electronics", 12000, 18, "LG", "Full HD"));
        products.add(new ProductDTO(10, "Keyboard", "Electronics", 1200, 30, "Logitech", "Mechanical"));
        products.add(new ProductDTO(11, "Mouse", "Electronics", 800, 50, "Logitech", "Wireless"));
        products.add(new ProductDTO(12, "Bed", "Furniture", 18000, 12, "Ikea", "Queen Size"));
        products.add(new ProductDTO(13, "Cupboard", "Furniture", 15000, 8, "Godrej", "Wooden"));
        products.add(new ProductDTO(14, "Router", "Electronics", 2500, 20, "TP-Link", "WiFi 6"));
        products.add(new ProductDTO(15, "Camera", "Electronics", 45000, 7, "Canon", "DSLR"));
        return products;
    }

    @Bean
    public List<EmployeeDTO> getEmployees() {
        List<EmployeeDTO> employees = new ArrayList<>();
        employees.add(new EmployeeDTO(1, "Thanu", "IT", "Developer", 60000, "thanu@gmail.com", 9876543210L));
        employees.add(new EmployeeDTO(2, "Yashu", "HR", "Manager", 75000, "yashu@gmail.com", 9876543211L));
        employees.add(new EmployeeDTO(3, "Sowmya", "Finance", "Analyst", 50000, "sowmya@gmail.com", 9876543212L));
        employees.add(new EmployeeDTO(4, "Sakshi", "IT", "Tester", 55000, "sakshi@gmail.com", 9876543213L));
        employees.add(new EmployeeDTO(5, "Darshan", "Marketing", "Executive", 40000, "darshan@gmail.com", 9876543214L));
        employees.add(new EmployeeDTO(6, "Gagana", "Sales", "Manager", 70000, "gagana@gmail.com", 9876543215L));
        employees.add(new EmployeeDTO(7, "Rajesh", "IT", "Developer", 65000, "rajesh@gmail.com", 9876543216L));
        employees.add(new EmployeeDTO(8, "Harshitha", "HR", "Assistant", 35000, "harshitha@gmail.com", 9876543217L));
        employees.add(new EmployeeDTO(9, "Usha", "Finance", "Clerk", 30000, "usha@gmail.com", 9876543218L));
        employees.add(new EmployeeDTO(10, "Ganu", "IT", "Support", 40000, "ganu@gmail.com", 9876543219L));
        employees.add(new EmployeeDTO(11, "Kavya", "Marketing", "Executive", 42000, "kavya@gmail.com", 9876543220L));
        employees.add(new EmployeeDTO(12, "Lekana", "Sales", "Executive", 38000, "lekana@gmail.com", 9876543221L));
        employees.add(new EmployeeDTO(13, "Mina", "Finance", "Analyst", 52000, "mina@gmail.com", 9876543222L));
        employees.add(new EmployeeDTO(14, "Jamuna", "IT", "Developer", 67000, "jamuna@gmail.com", 9876543223L));
        employees.add(new EmployeeDTO(15, "Bhumika", "HR", "Manager", 72000, "bhumika@gmail.com", 9876543224L));
        return employees;
    }

    @Bean
    public List<OrderDTO> getOrders() {
        List<OrderDTO> orders = new ArrayList<>();
        orders.add(new OrderDTO(1, "2025-01-01", "Alice", "Card", 2500, "Delivered", "Bengaluru"));
        orders.add(new OrderDTO(2, "2025-01-02", "Bob", "Cash", 5000, "Pending", "Mysuru"));
        orders.add(new OrderDTO(3, "2025-01-03", "Charlie", "UPI", 1500, "Delivered", "Bengaluru"));
        orders.add(new OrderDTO(4, "2025-01-04", "David", "Card", 3200, "Delivered", "Mysuru"));
        orders.add(new OrderDTO(5, "2025-01-05", "Eve", "UPI", 2800, "Pending", "Bengaluru"));
        orders.add(new OrderDTO(6, "2025-01-06", "Frank", "Cash", 4500, "Delivered", "Bengaluru"));
        orders.add(new OrderDTO(7, "2025-01-07", "Grace", "Card", 3600, "Pending", "Mysuru"));
        orders.add(new OrderDTO(8, "2025-01-08", "Hannah", "UPI", 4100, "Delivered", "Bengaluru"));
        orders.add(new OrderDTO(9, "2025-01-09", "Ian", "Card", 2200, "Delivered", "Mysuru"));
        orders.add(new OrderDTO(10, "2025-01-10", "Jack", "Cash", 3300, "Pending", "Bengaluru"));
        orders.add(new OrderDTO(11, "2025-01-11", "Kathy", "UPI", 2900, "Delivered", "Mysuru"));
        orders.add(new OrderDTO(12, "2025-01-12", "Leo", "Card", 3100, "Delivered", "Bengaluru"));
        orders.add(new OrderDTO(13, "2025-01-13", "Mia", "Cash", 2700, "Pending", "Mysuru"));
        orders.add(new OrderDTO(14, "2025-01-14", "Nina", "UPI", 3500, "Delivered", "Bengaluru"));
        orders.add(new OrderDTO(15, "2025-01-15", "Oscar", "Card", 4000, "Delivered", "Mysuru"));
        return orders;
    }

    @Bean
    public List<VehicleDTO> getVehicles() {
        List<VehicleDTO> vehicles = new ArrayList<>();
        vehicles.add(new VehicleDTO(1, "Swift", "VXI", "Maruti", 2020, 800000, "Petrol"));
        vehicles.add(new VehicleDTO(2, "Innova", "ZX", "Toyota", 2021, 2000000, "Diesel"));
        vehicles.add(new VehicleDTO(3, "Creta", "SX", "Hyundai", 2022, 1200000, "Petrol"));
        vehicles.add(new VehicleDTO(4, "Fortuner", "TX", "Toyota", 2021, 3500000, "Diesel"));
        vehicles.add(new VehicleDTO(5, "Baleno", "ZX", "Maruti", 2019, 650000, "Petrol"));
        vehicles.add(new VehicleDTO(6, "Polo", "GT", "Volkswagen", 2020, 900000, "Petrol"));
        vehicles.add(new VehicleDTO(7, "City", "V", "Honda", 2021, 1100000, "Petrol"));
        vehicles.add(new VehicleDTO(8, "Verna", "SX", "Hyundai", 2022, 1300000, "Diesel"));
        vehicles.add(new VehicleDTO(9, "EcoSport", "Titanium", "Ford", 2021, 1250000, "Diesel"));
        vehicles.add(new VehicleDTO(10, "Altroz", "XZ", "Tata", 2020, 800000, "Petrol"));
        vehicles.add(new VehicleDTO(11, "Scorpio", "S11", "Mahindra", 2021, 1700000, "Diesel"));
        vehicles.add(new VehicleDTO(12, "Kicks", "XL", "Nissan", 2022, 1400000, "Petrol"));
        vehicles.add(new VehicleDTO(13, "Harrier", "XZ", "Tata", 2021, 2200000, "Diesel"));
        vehicles.add(new VehicleDTO(14, "Santro", "GL", "Hyundai", 2019, 550000, "Petrol"));
        vehicles.add(new VehicleDTO(15, "Venue", "SX", "Hyundai", 2020, 950000, "Petrol"));
        return vehicles;
    }

    @Bean
    public List<StudentDTO> getStudents() {
        List<StudentDTO> students = new ArrayList<>();
        students.add(new StudentDTO(1, "Alice", 21, "BSc", "Physics", "alice@gmail.com", 9876543210L));
        students.add(new StudentDTO(2, "Bob", 22, "BCom", "Finance", "bob@gmail.com", 9876543211L));
        students.add(new StudentDTO(3, "Charlie", 23, "BA", "History", "charlie@gmail.com", 9876543212L));
        students.add(new StudentDTO(4, "David", 21, "BSc", "Chemistry", "david@gmail.com", 9876543213L));
        students.add(new StudentDTO(5, "Eve", 22, "BCom", "Accounting", "eve@gmail.com", 9876543214L));
        students.add(new StudentDTO(6, "Frank", 23, "BA", "Political Science", "frank@gmail.com", 9876543215L));
        students.add(new StudentDTO(7, "Grace", 21, "BSc", "Maths", "grace@gmail.com", 9876543216L));
        students.add(new StudentDTO(8, "Hannah", 22, "BCom", "Economics", "hannah@gmail.com", 9876543217L));
        students.add(new StudentDTO(9, "Ian", 23, "BA", "English", "ian@gmail.com", 9876543218L));
        students.add(new StudentDTO(10, "Jack", 21, "BSc", "Biology", "jack@gmail.com", 9876543219L));
        students.add(new StudentDTO(11, "Kathy", 22, "BCom", "Business", "kathy@gmail.com", 9876543220L));
        students.add(new StudentDTO(12, "Leo", 23, "BA", "Sociology", "leo@gmail.com", 9876543221L));
        students.add(new StudentDTO(13, "Mia", 21, "BSc", "Computer Science", "mia@gmail.com", 9876543222L));
        students.add(new StudentDTO(14, "Nina", 22, "BCom", "Finance", "nina@gmail.com", 9876543223L));
        students.add(new StudentDTO(15, "Oscar", 23, "BA", "Geography", "oscar@gmail.com", 9876543224L));
        return students;
    }

    @Bean
    public List<TeacherDTO> getTeachers() {
        List<TeacherDTO> teachers = new ArrayList<>();
        teachers.add(new TeacherDTO(1, "Mr. Smith", "Math", "MSc", 5, "smith@gmail.com", 45000));
        teachers.add(new TeacherDTO(2, "Ms. Jane", "Physics", "PhD", 8, "jane@gmail.com", 60000));
        teachers.add(new TeacherDTO(3, "Mr. John", "Chemistry", "MSc", 6, "john@gmail.com", 50000));
        teachers.add(new TeacherDTO(4, "Ms. Emily", "Biology", "PhD", 7, "emily@gmail.com", 55000));
        teachers.add(new TeacherDTO(5, "Mr. Alan", "History", "MA", 10, "alan@gmail.com", 52000));
        teachers.add(new TeacherDTO(6, "Ms. Kate", "English", "MA", 5, "kate@gmail.com", 48000));
        teachers.add(new TeacherDTO(7, "Mr. Mike", "Math", "MSc", 6, "mike@gmail.com", 47000));
        teachers.add(new TeacherDTO(8, "Ms. Laura", "Physics", "PhD", 7, "laura@gmail.com", 53000));
        teachers.add(new TeacherDTO(9, "Mr. Adam", "Chemistry", "MSc", 8, "adam@gmail.com", 51000));
        teachers.add(new TeacherDTO(10, "Ms. Rachel", "Biology", "PhD", 9, "rachel@gmail.com", 56000));
        teachers.add(new TeacherDTO(11, "Mr. Tom", "History", "MA", 6, "tom@gmail.com", 50000));
        teachers.add(new TeacherDTO(12, "Ms. Alice", "English", "MA", 7, "alice2@gmail.com", 49000));
        teachers.add(new TeacherDTO(13, "Mr. Bob", "Math", "MSc", 5, "bob2@gmail.com", 46000));
        teachers.add(new TeacherDTO(14, "Ms. Eve", "Physics", "PhD", 8, "eve2@gmail.com", 54000));
        teachers.add(new TeacherDTO(15, "Mr. Frank", "Chemistry", "MSc", 6, "frank2@gmail.com", 52000));
        return teachers;
    }

    @Bean
    public List<HotelDTO> getHotels() {
        List<HotelDTO> hotels = new ArrayList<>();
        hotels.add(new HotelDTO(1, "Grand Palace", "Bengaluru", 4.5, 50, "1234567890", "grand@gmail.com"));
        hotels.add(new HotelDTO(2, "Sunrise Inn", "Mysuru", 4.0, 30, "9876543210", "sunrise@gmail.com"));
        hotels.add(new HotelDTO(3, "Royal Stay", "Bengaluru", 4.2, 40, "8765432109", "royal@gmail.com"));
        hotels.add(new HotelDTO(4, "Lotus Hotel", "Mysuru", 3.9, 25, "7654321098", "lotus@gmail.com"));
        hotels.add(new HotelDTO(5, "Paradise Inn", "Bengaluru", 4.6, 55, "6543210987", "paradise@gmail.com"));
        hotels.add(new HotelDTO(6, "Sunset Hotel", "Mysuru", 4.1, 35, "5432109876", "sunset@gmail.com"));
        hotels.add(new HotelDTO(7, "Blue Lagoon", "Bengaluru", 4.0, 30, "4321098765", "bluelagoon@gmail.com"));
        hotels.add(new HotelDTO(8, "Ocean View", "Mysuru", 3.8, 20, "3210987654", "ocean@gmail.com"));
        hotels.add(new HotelDTO(9, "Mountain Inn", "Bengaluru", 4.3, 45, "2109876543", "mountain@gmail.com"));
        hotels.add(new HotelDTO(10, "City Lodge", "Mysuru", 3.9, 28, "1098765432", "city@gmail.com"));
        hotels.add(new HotelDTO(11, "Lake House", "Bengaluru", 4.4, 50, "1987654321", "lake@gmail.com"));
        hotels.add(new HotelDTO(12, "Green Hotel", "Mysuru", 4.2, 38, "1876543210", "green@gmail.com"));
        hotels.add(new HotelDTO(13, "Royal Garden", "Bengaluru", 4.1, 42, "1765432109", "garden@gmail.com"));
        hotels.add(new HotelDTO(14, "Sunshine Inn", "Mysuru", 3.7, 26, "1654321098", "sunshine@gmail.com"));
        hotels.add(new HotelDTO(15, "Emerald Hotel", "Bengaluru", 4.5, 55, "1543210987", "emerald@gmail.com"));
        return hotels;
    }

    @Bean
    public List<TransactionDTO> getTransactions() {
        List<TransactionDTO> transactions = new ArrayList<>();
        transactions.add(new TransactionDTO(1, "Credit", 5000, "2025-01-01", "Success", "ACC001", "ACC101"));
        transactions.add(new TransactionDTO(2, "Debit", 2500, "2025-01-02", "Success", "ACC002", "ACC102"));
        transactions.add(new TransactionDTO(3, "Credit", 10000, "2025-01-03", "Pending", "ACC003", "ACC103"));
        transactions.add(new TransactionDTO(4, "Debit", 7000, "2025-01-04", "Success", "ACC004", "ACC104"));
        transactions.add(new TransactionDTO(5, "Credit", 1500, "2025-01-05", "Success", "ACC005", "ACC105"));
        transactions.add(new TransactionDTO(6, "Debit", 3500, "2025-01-06", "Pending", "ACC006", "ACC106"));
        transactions.add(new TransactionDTO(7, "Credit", 8000, "2025-01-07", "Success", "ACC007", "ACC107"));
        transactions.add(new TransactionDTO(8, "Debit", 4500, "2025-01-08", "Success", "ACC008", "ACC108"));
        transactions.add(new TransactionDTO(9, "Credit", 12000, "2025-01-09", "Pending", "ACC009", "ACC109"));
        transactions.add(new TransactionDTO(10, "Debit", 6000, "2025-01-10", "Success", "ACC010", "ACC110"));
        transactions.add(new TransactionDTO(11, "Credit", 2000, "2025-01-11", "Success", "ACC011", "ACC111"));
        transactions.add(new TransactionDTO(12, "Debit", 4000, "2025-01-12", "Pending", "ACC012", "ACC112"));
        transactions.add(new TransactionDTO(13, "Credit", 9000, "2025-01-13", "Success", "ACC013", "ACC113"));
        transactions.add(new TransactionDTO(14, "Debit", 5500, "2025-01-14", "Success", "ACC014", "ACC114"));
        transactions.add(new TransactionDTO(15, "Credit", 3000, "2025-01-15", "Pending", "ACC015", "ACC115"));
        return transactions;
    }

    @Bean
    public List<AccountDTO> getAccounts() {
        List<AccountDTO> accounts = new ArrayList<>();
        accounts.add(new AccountDTO(1, "Alice", "ACC001", "Savings", 50000, "Bengaluru", "IFSC001"));
        accounts.add(new AccountDTO(2, "Bob", "ACC002", "Current", 75000, "Mysuru", "IFSC002"));
        accounts.add(new AccountDTO(3, "Charlie", "ACC003", "Savings", 60000, "Bengaluru", "IFSC003"));
        accounts.add(new AccountDTO(4, "David", "ACC004", "Current", 80000, "Mysuru", "IFSC004"));
        accounts.add(new AccountDTO(5, "Eve", "ACC005", "Savings", 55000, "Bengaluru", "IFSC005"));
        accounts.add(new AccountDTO(6, "Frank", "ACC006", "Current", 90000, "Bengaluru", "IFSC006"));
        accounts.add(new AccountDTO(7, "Grace", "ACC007", "Savings", 70000, "Mysuru", "IFSC007"));
        accounts.add(new AccountDTO(8, "Hannah", "ACC008", "Current", 65000, "Bengaluru", "IFSC008"));
        accounts.add(new AccountDTO(9, "Ian", "ACC009", "Savings", 72000, "Mysuru", "IFSC009"));
        accounts.add(new AccountDTO(10, "Jack", "ACC010", "Current", 80000, "Bengaluru", "IFSC010"));
        accounts.add(new AccountDTO(11, "Kathy", "ACC011", "Savings", 56000, "Bengaluru", "IFSC011"));
        accounts.add(new AccountDTO(12, "Leo", "ACC012", "Current", 68000, "Mysuru", "IFSC012"));
        accounts.add(new AccountDTO(13, "Mia", "ACC013", "Savings", 75000, "Bengaluru", "IFSC013"));
        accounts.add(new AccountDTO(14, "Nina", "ACC014", "Current", 82000, "Mysuru", "IFSC014"));
        accounts.add(new AccountDTO(15, "Oscar", "ACC015", "Savings", 60000, "Bengaluru", "IFSC015"));
        return accounts;
    }

    @Bean
    public List<ShopDTO> getShops() {
        List<ShopDTO> shops = new ArrayList<>();
        shops.add(new ShopDTO(1, "SuperMart", "Alice", "Grocery", "Bengaluru", "GST001", 9876543210L));
        shops.add(new ShopDTO(2, "TechStore", "Bob", "Electronics", "Mysuru", "GST002", 9876543211L));
        shops.add(new ShopDTO(3, "FashionHub", "Charlie", "Clothing", "Bengaluru", "GST003", 9876543212L));
        shops.add(new ShopDTO(4, "BookWorld", "David", "Books", "Mysuru", "GST004", 9876543213L));
        shops.add(new ShopDTO(5, "GadgetStore", "Eve", "Electronics", "Bengaluru", "GST005", 9876543214L));
        shops.add(new ShopDTO(6, "HomeDecor", "Frank", "Furniture", "Bengaluru", "GST006", 9876543215L));
        shops.add(new ShopDTO(7, "ToyLand", "Grace", "Toys", "Mysuru", "GST007", 9876543216L));
        shops.add(new ShopDTO(8, "Foodies", "Hannah", "Restaurant", "Bengaluru", "GST008", 9876543217L));
        shops.add(new ShopDTO(9, "PetCare", "Ian", "Pet Supplies", "Mysuru", "GST009", 9876543218L));
        shops.add(new ShopDTO(10, "SportsZone", "Jack", "Sports", "Bengaluru", "GST010", 9876543219L));
        shops.add(new ShopDTO(11, "Gourmet", "Kathy", "Restaurant", "Bengaluru", "GST011", 9876543220L));
        shops.add(new ShopDTO(12, "ElectroMart", "Leo", "Electronics", "Mysuru", "GST012", 9876543221L));
        shops.add(new ShopDTO(13, "ClothCenter", "Mia", "Clothing", "Bengaluru", "GST013", 9876543222L));
        shops.add(new ShopDTO(14, "ReadMore", "Nina", "Books", "Mysuru", "GST014", 9876543223L));
        shops.add(new ShopDTO(15, "FurniturePlus", "Oscar", "Furniture", "Bengaluru", "GST015", 9876543224L));
        return shops;
    }

    @Bean
    public List<BillDTO> getBills() {
        List<BillDTO> bills = new ArrayList<>();
        bills.add(new BillDTO(1, "BILL001", "2025-01-01", 2500, "Alice", "Card", "Paid"));
        bills.add(new BillDTO(2, "BILL002", "2025-01-02", 5000, "Bob", "Cash", "Pending"));
        bills.add(new BillDTO(3, "BILL003", "2025-01-03", 1500, "Charlie", "UPI", "Paid"));
        bills.add(new BillDTO(4, "BILL004", "2025-01-04", 3200, "David", "Card", "Paid"));
        bills.add(new BillDTO(5, "BILL005", "2025-01-05", 2800, "Eve", "UPI", "Pending"));
        bills.add(new BillDTO(6, "BILL006", "2025-01-06", 4500, "Frank", "Cash", "Paid"));
        bills.add(new BillDTO(7, "BILL007", "2025-01-07", 3600, "Grace", "Card", "Pending"));
        bills.add(new BillDTO(8, "BILL008", "2025-01-08", 4100, "Hannah", "UPI", "Paid"));
        bills.add(new BillDTO(9, "BILL009", "2025-01-09", 2200, "Ian", "Card", "Paid"));
        bills.add(new BillDTO(10, "BILL010", "2025-01-10", 3300, "Jack", "Cash", "Pending"));
        bills.add(new BillDTO(11, "BILL011", "2025-01-11", 2900, "Kathy", "UPI", "Paid"));
        bills.add(new BillDTO(12, "BILL012", "2025-01-12", 3100, "Leo", "Card", "Paid"));
        bills.add(new BillDTO(13, "BILL013", "2025-01-13", 2700, "Mia", "Cash", "Pending"));
        bills.add(new BillDTO(14, "BILL014", "2025-01-14", 3500, "Nina", "UPI", "Paid"));
        bills.add(new BillDTO(15, "BILL015", "2025-01-15", 4000, "Oscar", "Card", "Paid"));
        return bills;
    }

    @Bean
    public List<MovieDTO> getMovies() {
        List<MovieDTO> movies = new ArrayList<>();
        movies.add(new MovieDTO(1, "Avatar", "Sci-Fi", "English", 180, 8.5, "James Cameron"));
        movies.add(new MovieDTO(2, "Titanic", "Romance", "English", 195, 8.0, "James Cameron"));
        movies.add(new MovieDTO(3, "Inception", "Thriller", "English", 148, 8.8, "Christopher Nolan"));
        movies.add(new MovieDTO(4, "Interstellar", "Sci-Fi", "English", 169, 8.6, "Christopher Nolan"));
        movies.add(new MovieDTO(5, "The Dark Knight", "Action", "English", 152, 9.0, "Christopher Nolan"));
        movies.add(new MovieDTO(6, "Joker", "Drama", "English", 122, 8.4, "Todd Phillips"));
        movies.add(new MovieDTO(7, "Avengers", "Action", "English", 143, 8.1, "Joss Whedon"));
        movies.add(new MovieDTO(8, "Frozen", "Animation", "English", 102, 7.5, "Chris Buck"));
        movies.add(new MovieDTO(9, "Moana", "Animation", "English", 107, 7.6, "Ron Clements"));
        movies.add(new MovieDTO(10, "The Lion King", "Animation", "English", 88, 8.5, "Roger Allers"));
        movies.add(new MovieDTO(11, "Parasite", "Thriller", "Korean", 132, 8.6, "Bong Joon-ho"));
        movies.add(new MovieDTO(12, "Spirited Away", "Animation", "Japanese", 125, 8.6, "Hayao Miyazaki"));
        movies.add(new MovieDTO(13, "1917", "War", "English", 119, 8.3, "Sam Mendes"));
        movies.add(new MovieDTO(14, "Jaws", "Thriller", "English", 124, 8.0, "Steven Spielberg"));
        movies.add(new MovieDTO(15, "E.T.", "Sci-Fi", "English", 115, 7.9, "Steven Spielberg"));
        return movies;
    }

    @Bean
    public List<FlightDTO> getFlights() {
        List<FlightDTO> flights = new ArrayList<>();
        flights.add(new FlightDTO(1, "AI101", "Air India", "Bengaluru", "Mumbai", 5000, 2.0));
        flights.add(new FlightDTO(2, "6E202", "Indigo", "Mysuru", "Delhi", 7000, 3.0));
        flights.add(new FlightDTO(3, "SG303", "SpiceJet", "Bengaluru", "Chennai", 4000, 1.5));
        flights.add(new FlightDTO(4, "AI104", "Air India", "Mysuru", "Kolkata", 6000, 2.5));
        flights.add(new FlightDTO(5, "6E205", "Indigo", "Bengaluru", "Hyderabad", 4500, 1.2));
        flights.add(new FlightDTO(6, "SG306", "SpiceJet", "Mysuru", "Pune", 5000, 2.0));
        flights.add(new FlightDTO(7, "AI107", "Air India", "Bengaluru", "Goa", 3500, 1.0));
        flights.add(new FlightDTO(8, "6E208", "Indigo", "Mysuru", "Bhubaneswar", 6500, 3.5));
        flights.add(new FlightDTO(9, "SG309", "SpiceJet", "Bengaluru", "Ahmedabad", 4800, 2.0));
        flights.add(new FlightDTO(10, "AI110", "Air India", "Mysuru", "Jaipur", 5200, 2.5));
        flights.add(new FlightDTO(11, "6E211", "Indigo", "Bengaluru", "Chandigarh", 6000, 3.0));
        flights.add(new FlightDTO(12, "SG312", "SpiceJet", "Mysuru", "Lucknow", 5500, 2.8));
        flights.add(new FlightDTO(13, "AI113", "Air India", "Bengaluru", "Kochi", 4300, 1.7));
        flights.add(new FlightDTO(14, "6E214", "Indigo", "Mysuru", "Trivandrum", 4800, 2.0));
        flights.add(new FlightDTO(15, "SG315", "SpiceJet", "Bengaluru", "Goa", 3500, 1.0));
        return flights;
    }

    @Bean
    public List<TrainDTO> getTrains() {
        List<TrainDTO> trains = new ArrayList<>();
        trains.add(new TrainDTO(1, "12345", "Shatabdi Express", "Bengaluru", "Mumbai", "06:00", "Superfast"));
        trains.add(new TrainDTO(2, "23456", "Rajdhani Express", "Mysuru", "Delhi", "08:00", "Superfast"));
        trains.add(new TrainDTO(3, "34567", "Garib Rath", "Bengaluru", "Chennai", "09:00", "Express"));
        trains.add(new TrainDTO(4, "45678", "Duronto", "Mysuru", "Kolkata", "07:30", "Superfast"));
        trains.add(new TrainDTO(5, "56789", "Jan Shatabdi", "Bengaluru", "Hyderabad", "10:00", "Express"));
        trains.add(new TrainDTO(6, "67890", "Express", "Mysuru", "Pune", "11:00", "Express"));
        trains.add(new TrainDTO(7, "78901", "Mail", "Bengaluru", "Goa", "12:00", "Express"));
        trains.add(new TrainDTO(8, "89012", "Intercity", "Mysuru", "Bhubaneswar", "13:00", "Superfast"));
        trains.add(new TrainDTO(9, "90123", "Superfast", "Bengaluru", "Ahmedabad", "14:00", "Superfast"));
        trains.add(new TrainDTO(10, "01234", "Express", "Mysuru", "Jaipur", "15:00", "Express"));
        trains.add(new TrainDTO(11, "11223", "Shatabdi", "Bengaluru", "Chandigarh", "16:00", "Superfast"));
        trains.add(new TrainDTO(12, "22334", "Rajdhani", "Mysuru", "Lucknow", "17:00", "Superfast"));
        trains.add(new TrainDTO(13, "33445", "Express", "Bengaluru", "Kochi", "18:00", "Express"));
        trains.add(new TrainDTO(14, "44556", "Intercity", "Mysuru", "Trivandrum", "19:00", "Superfast"));
        trains.add(new TrainDTO(15, "55667", "Express", "Bengaluru", "Goa", "20:00", "Express"));
        return trains;
    }

    @Bean
    public List<CourseDTO> getCourses() {
        List<CourseDTO> courses = new ArrayList<>();
        courses.add(new CourseDTO(1, "Java", "6 Months", 15000, "Mr. Smith", "Programming", "Java Basics to Advanced"));
        courses.add(new CourseDTO(2, "Python", "4 Months", 12000, "Ms. Jane", "Programming", "Python for Beginners"));
        courses.add(new CourseDTO(3, "C++", "5 Months", 14000, "Mr. John", "Programming", "C++ from Scratch"));
        courses.add(new CourseDTO(4, "Web Dev", "3 Months", 10000, "Ms. Emily", "Web", "HTML, CSS, JS"));
        courses.add(new CourseDTO(5, "Data Science", "6 Months", 18000, "Mr. Alan", "Data", "DS with Python"));
        courses.add(new CourseDTO(6, "AI", "6 Months", 20000, "Ms. Kate", "AI", "AI Concepts"));
        courses.add(new CourseDTO(7, "ML", "5 Months", 17000, "Mr. Mike", "AI", "Machine Learning Basics"));
        courses.add(new CourseDTO(8, "Cyber Sec", "4 Months", 15000, "Ms. Laura", "Security", "Cyber Security Essentials"));
        courses.add(new CourseDTO(9, "Blockchain", "3 Months", 14000, "Mr. Adam", "Blockchain", "Blockchain Basics"));
        courses.add(new CourseDTO(10, "DevOps", "4 Months", 16000, "Ms. Rachel", "DevOps", "CI/CD Concepts"));
        courses.add(new CourseDTO(11, "Cloud", "5 Months", 18000, "Mr. Tom", "Cloud", "AWS & Azure"));
        courses.add(new CourseDTO(12, "Big Data", "6 Months", 20000, "Ms. Alice", "Data", "Hadoop & Spark"));
        courses.add(new CourseDTO(13, "React", "3 Months", 12000, "Mr. Bob", "Web", "ReactJS Fundamentals"));
        courses.add(new CourseDTO(14, "Angular", "3 Months", 12000, "Ms. Eve", "Web", "Angular Basics"));
        courses.add(new CourseDTO(15, "NodeJS", "4 Months", 14000, "Mr. Frank", "Web", "NodeJS Backend"));
        return courses;
    }
    @Bean
    public List<LaptopDTO> getLaptops() {
        List<LaptopDTO> laptops = new ArrayList<>();
        laptops.add(new LaptopDTO(1,"Dell","Inspiron","i5",8,55000,512));
        laptops.add(new LaptopDTO(2,"HP","Pavilion","i7",16,75000,1024));
        laptops.add(new LaptopDTO(3,"Lenovo","ThinkPad","i5",8,60000,512));
        laptops.add(new LaptopDTO(4,"Asus","ROG","i7",16,85000,1024));
        laptops.add(new LaptopDTO(5,"Acer","Aspire","i3",4,40000,256));
        laptops.add(new LaptopDTO(6,"Apple","MacBook Air","M1",8,95000,512));
        laptops.add(new LaptopDTO(7,"MSI","GF63","i5",8,70000,512));
        laptops.add(new LaptopDTO(8,"Razer","Blade","i7",16,120000,1024));
        laptops.add(new LaptopDTO(9,"HP","EliteBook","i5",8,65000,512));
        laptops.add(new LaptopDTO(10,"Dell","XPS","i7",16,110000,1024));
        laptops.add(new LaptopDTO(11,"Lenovo","Yoga","i5",8,60000,512));
        laptops.add(new LaptopDTO(12,"Asus","ZenBook","i7",16,90000,1024));
        laptops.add(new LaptopDTO(13,"Acer","Nitro","i5",8,70000,512));
        laptops.add(new LaptopDTO(14,"Apple","MacBook Pro","M2",16,130000,1024));
        laptops.add(new LaptopDTO(15,"MSI","Stealth","i7",16,120000,1024));
        return laptops;
    }
    @Bean
    public List<MobileDTO> getMobiles() {
        List<MobileDTO> mobiles = new ArrayList<>();
        mobiles.add(new MobileDTO(1,"Apple","iPhone 14",6,128,80000,4500));
        mobiles.add(new MobileDTO(2,"Samsung","Galaxy S23",8,256,75000,5000));
        mobiles.add(new MobileDTO(3,"OnePlus","11",12,256,65000,4800));
        mobiles.add(new MobileDTO(4,"Xiaomi","12 Pro",8,128,40000,4600));
        mobiles.add(new MobileDTO(5,"Realme","10",6,128,25000,4500));
        mobiles.add(new MobileDTO(6,"Oppo","Reno 9",8,256,35000,4700));
        mobiles.add(new MobileDTO(7,"Vivo","V27",8,128,30000,4600));
        mobiles.add(new MobileDTO(8,"Google","Pixel 7",8,128,60000,4350));
        mobiles.add(new MobileDTO(9,"Apple","iPhone 13",4,64,60000,4300));
        mobiles.add(new MobileDTO(10,"Samsung","Galaxy S22",8,128,50000,4400));
        mobiles.add(new MobileDTO(11,"OnePlus","10 Pro",12,256,70000,4800));
        mobiles.add(new MobileDTO(12,"Xiaomi","11T",8,128,30000,4500));
        mobiles.add(new MobileDTO(13,"Realme","9 Pro",6,128,28000,4500));
        mobiles.add(new MobileDTO(14,"Oppo","F21",4,64,20000,4300));
        mobiles.add(new MobileDTO(15,"Vivo","Y77",4,128,25000,4400));
        return mobiles;
    }
    @Bean
    public List<AddressDTO> getAddresses() {
        List<AddressDTO> addresses = new ArrayList<>();
        addresses.add(new AddressDTO(1,"101","MG Road","Bengaluru","Karnataka",560001,"India"));
        addresses.add(new AddressDTO(2,"102","Brigade Road","Bengaluru","Karnataka",560002,"India"));
        addresses.add(new AddressDTO(3,"103","Church Street","Bengaluru","Karnataka",560003,"India"));
        addresses.add(new AddressDTO(4,"104","Jayanagar","Bengaluru","Karnataka",560004,"India"));
        addresses.add(new AddressDTO(5,"105","Indiranagar","Bengaluru","Karnataka",560005,"India"));
        addresses.add(new AddressDTO(6,"106","Whitefield","Bengaluru","Karnataka",560006,"India"));
        addresses.add(new AddressDTO(7,"107","Koramangala","Bengaluru","Karnataka",560007,"India"));
        addresses.add(new AddressDTO(8,"108","HSR Layout","Bengaluru","Karnataka",560008,"India"));
        addresses.add(new AddressDTO(9,"109","Rajajinagar","Bengaluru","Karnataka",560009,"India"));
        addresses.add(new AddressDTO(10,"110","Banashankari","Bengaluru","Karnataka",560010,"India"));
        addresses.add(new AddressDTO(11,"111","Malleshwaram","Bengaluru","Karnataka",560011,"India"));
        addresses.add(new AddressDTO(12,"112","Kammanahalli","Bengaluru","Karnataka",560012,"India"));
        addresses.add(new AddressDTO(13,"113","Kengeri","Bengaluru","Karnataka",560013,"India"));
        addresses.add(new AddressDTO(14,"114","Yelahanka","Bengaluru","Karnataka",560014,"India"));
        addresses.add(new AddressDTO(15,"115","Chickpet","Bengaluru","Karnataka",560015,"India"));
        return addresses;
    }

    @Bean
    public List<FoodDTO> getFoods() {
        List<FoodDTO> foods = new ArrayList<>();
        foods.add(new FoodDTO(1,"Pizza","Fast Food",250,2,"Dominos","Cheese Burst"));
        foods.add(new FoodDTO(2,"Burger","Fast Food",150,1,"McDonalds","Veggie Burger"));
        foods.add(new FoodDTO(3,"Pasta","Italian",200,1,"Little Italy","White Sauce"));
        foods.add(new FoodDTO(4,"Biryani","Indian",300,2,"Paradise","Chicken Biryani"));
        foods.add(new FoodDTO(5,"Sandwich","Fast Food",120,1,"Subway","Veg Sandwich"));
        foods.add(new FoodDTO(6,"Dosa","South Indian",80,1,"MTR","Masala Dosa"));
        foods.add(new FoodDTO(7,"Idli","South Indian",50,2,"MTR","Steamed Idli"));
        foods.add(new FoodDTO(8,"Vada","South Indian",40,2,"MTR","Medu Vada"));
        foods.add(new FoodDTO(9,"Sushi","Japanese",500,1,"Sushi Bar","Salmon Sushi"));
        foods.add(new FoodDTO(10,"Ramen","Japanese",350,1,"Sushi Bar","Chicken Ramen"));
        foods.add(new FoodDTO(11,"Cake","Dessert",600,1,"Cake Shop","Chocolate Cake"));
        foods.add(new FoodDTO(12,"Ice Cream","Dessert",200,2,"Creamy","Vanilla Ice Cream"));
        foods.add(new FoodDTO(13,"Paneer Tikka","Indian",250,1,"BBQ Nation","Spicy Paneer"));
        foods.add(new FoodDTO(14,"Chole Bhature","North Indian",180,2,"Sita Ram","Delicious Chole"));
        foods.add(new FoodDTO(15,"Falafel","Middle Eastern",150,2,"Falafel King","Vegan Falafel"));
        return foods;
    }

    @Bean
    public List<MenuDTO> getMenus() {
        List<MenuDTO> menus = new ArrayList<>();
        menus.add(new MenuDTO(1,"Cheese Pizza","Fast Food",250,"Cheese Burst","Available","Dominos"));
        menus.add(new MenuDTO(2,"Veg Burger","Fast Food",150,"Veggie Burger","Available","McDonalds"));
        menus.add(new MenuDTO(3,"White Pasta","Italian",200,"Creamy White Sauce","Available","Little Italy"));
        menus.add(new MenuDTO(4,"Chicken Biryani","Indian",300,"Spicy Chicken Biryani","Available","Paradise"));
        menus.add(new MenuDTO(5,"Veg Sandwich","Fast Food",120,"Healthy Veg Sandwich","Available","Subway"));
        menus.add(new MenuDTO(6,"Masala Dosa","South Indian",80,"Crispy Dosa","Available","MTR"));
        menus.add(new MenuDTO(7,"Steamed Idli","South Indian",50,"Soft Idlis","Available","MTR"));
        menus.add(new MenuDTO(8,"Medu Vada","South Indian",40,"Crispy Vada","Available","MTR"));
        menus.add(new MenuDTO(9,"Salmon Sushi","Japanese",500,"Fresh Sushi","Available","Sushi Bar"));
        menus.add(new MenuDTO(10,"Chicken Ramen","Japanese",350,"Spicy Ramen","Available","Sushi Bar"));
        menus.add(new MenuDTO(11,"Chocolate Cake","Dessert",600,"Delicious Cake","Available","Cake Shop"));
        menus.add(new MenuDTO(12,"Vanilla Ice Cream","Dessert",200,"Creamy Ice Cream","Available","Creamy"));
        menus.add(new MenuDTO(13,"Paneer Tikka","Indian",250,"Spicy Paneer","Available","BBQ Nation"));
        menus.add(new MenuDTO(14,"Chole Bhature","North Indian",180,"Tasty Chole","Available","Sita Ram"));
        menus.add(new MenuDTO(15,"Falafel","Middle Eastern",150,"Vegan Falafel","Available","Falafel King"));
        return menus;
    }

    @Bean
    public List<DeliveryDTO> getDeliveries() {
        List<DeliveryDTO> deliveries = new ArrayList<>();
        deliveries.add(new DeliveryDTO(1,"DL001","Ramesh","2025-01-01","10:00","Delivered","Bengaluru"));
        deliveries.add(new DeliveryDTO(2,"DL002","Suresh","2025-01-02","11:00","Pending","Mysuru"));
        deliveries.add(new DeliveryDTO(3,"DL003","Mahesh","2025-01-03","12:00","Delivered","Bengaluru"));
        deliveries.add(new DeliveryDTO(4,"DL004","Raju","2025-01-04","13:00","Delivered","Mysuru"));
        deliveries.add(new DeliveryDTO(5,"DL005","Kiran","2025-01-05","14:00","Pending","Bengaluru"));
        deliveries.add(new DeliveryDTO(6,"DL006","Vikram","2025-01-06","15:00","Delivered","Mysuru"));
        deliveries.add(new DeliveryDTO(7,"DL007","Ajay","2025-01-07","16:00","Delivered","Bengaluru"));
        deliveries.add(new DeliveryDTO(8,"DL008","Anil","2025-01-08","17:00","Pending","Mysuru"));
        deliveries.add(new DeliveryDTO(9,"DL009","Rohit","2025-01-09","18:00","Delivered","Bengaluru"));
        deliveries.add(new DeliveryDTO(10,"DL010","Sanjay","2025-01-10","19:00","Delivered","Mysuru"));
        deliveries.add(new DeliveryDTO(11,"DL011","Rakesh","2025-01-11","20:00","Pending","Bengaluru"));
        deliveries.add(new DeliveryDTO(12,"DL012","Rajesh","2025-01-12","21:00","Delivered","Mysuru"));
        deliveries.add(new DeliveryDTO(13,"DL013","Sunil","2025-01-13","22:00","Delivered","Bengaluru"));
        deliveries.add(new DeliveryDTO(14,"DL014","Praveen","2025-01-14","23:00","Pending","Mysuru"));
        deliveries.add(new DeliveryDTO(15,"DL015","Manoj","2025-01-15","08:00","Delivered","Bengaluru"));
        return deliveries;
    }
    @Bean
    public List<FeedbackDTO> getFeedbacks() {
        List<FeedbackDTO> feedbacks = new ArrayList<>();
        feedbacks.add(new FeedbackDTO(1,"Asha","Good service",5,"2025-01-01","asha@gmail.com","Delivery"));
        feedbacks.add(new FeedbackDTO(2,"Ravi","Average",3,"2025-01-02","ravi@gmail.com","Support"));
        feedbacks.add(new FeedbackDTO(3,"Kiran","Excellent",5,"2025-01-03","kiran@gmail.com","Product"));
        feedbacks.add(new FeedbackDTO(4,"Suma","Poor experience",2,"2025-01-04","suma@gmail.com","Service"));
        feedbacks.add(new FeedbackDTO(5,"Manu","Good",4,"2025-01-05","manu@gmail.com","Order"));
        feedbacks.add(new FeedbackDTO(6,"Nisha","Fast delivery",5,"2025-01-06","nisha@gmail.com","Delivery"));
        feedbacks.add(new FeedbackDTO(7,"Rakesh","Helpful staff",4,"2025-01-07","rakesh@gmail.com","Support"));
        feedbacks.add(new FeedbackDTO(8,"Priya","Good quality",5,"2025-01-08","priya@gmail.com","Product"));
        feedbacks.add(new FeedbackDTO(9,"Sanju","Late delivery",2,"2025-01-09","sanju@gmail.com","Delivery"));
        feedbacks.add(new FeedbackDTO(10,"Arun","Recommended",5,"2025-01-10","arun@gmail.com","Product"));
        feedbacks.add(new FeedbackDTO(11,"Latha","Not satisfied",2,"2025-01-11","latha@gmail.com","Service"));
        feedbacks.add(new FeedbackDTO(12,"Deepak","Very helpful",4,"2025-01-12","deepak@gmail.com","Support"));
        feedbacks.add(new FeedbackDTO(13,"Renu","Nice experience",4,"2025-01-13","renu@gmail.com","Delivery"));
        feedbacks.add(new FeedbackDTO(14,"Chaitra","Could be better",3,"2025-01-14","chaitra@gmail.com","Product"));
        feedbacks.add(new FeedbackDTO(15,"Harsha","Fantastic",5,"2025-01-15","harsha@gmail.com","Service"));
        return feedbacks;
    }
    @Bean
    public List<SupplierDTO> getSuppliers() {
        List<SupplierDTO> suppliers = new ArrayList<>();
        suppliers.add(new SupplierDTO(1,"Ravi Traders","RT Pvt Ltd","ravi@gmail.com",9876543210L,"Bengaluru","GST001"));
        suppliers.add(new SupplierDTO(2,"Kiran Supplies","KS Ltd","kiran@gmail.com",9876543211L,"Mysuru","GST002"));
        suppliers.add(new SupplierDTO(3,"Suma Enterprises","SE Pvt Ltd","suma@gmail.com",9876543212L,"Hubli","GST003"));
        suppliers.add(new SupplierDTO(4,"Bharath Distributors","BD Ltd","bharath@gmail.com",9876543213L,"Davanagere","GST004"));
        suppliers.add(new SupplierDTO(5,"Vikas Traders","VT Pvt Ltd","vikas@gmail.com",9876543214L,"Shivamogga","GST005"));
        suppliers.add(new SupplierDTO(6,"Manju Suppliers","MS Pvt Ltd","manju@gmail.com",9876543215L,"Udupi","GST006"));
        suppliers.add(new SupplierDTO(7,"Nithya Traders","NT Pvt Ltd","nithya@gmail.com",9876543216L,"Mangaluru","GST007"));
        suppliers.add(new SupplierDTO(8,"Harsha Distributors","HD Pvt Ltd","harsha@gmail.com",9876543217L,"Bengaluru","GST008"));
        suppliers.add(new SupplierDTO(9,"Renu Supplies","RS Lt","renu@gmail.com",9876543218L,"Hassan","GST009"));
        suppliers.add(new SupplierDTO(10,"Lakshmi Traders","LT Pvt Ltd","lakshmi@gmail.com",9876543219L,"Tumkur","GST010"));
        suppliers.add(new SupplierDTO(11,"Anil Enterprises","AE Pvt Ltd","anil@gmail.com",9876543220L,"Mandya","GST011"));
        suppliers.add(new SupplierDTO(12,"Kavya Supplies","KS Pvt Ltd","kavya@gmail.com",9876543221L,"Bengaluru","GST012"));
        suppliers.add(new SupplierDTO(13,"Gowda Traders","GT Pvt Ltd","gowda@gmail.com",9876543222L,"Mysuru","GST013"));
        suppliers.add(new SupplierDTO(14,"Roshni Distributors","RD Pvt Ltd","roshni@gmail.com",9876543223L,"Shimoga","GST014"));
        suppliers.add(new SupplierDTO(15,"Chandru Suppliers","CS Pvt Ltd","chandru@gmail.com",9876543224L,"Chitradurga","GST015"));
        return suppliers;
    }
    @Bean
    public List<DepartmentDTO> getDepartments() {
        List<DepartmentDTO> departments = new ArrayList<>();
        departments.add(new DepartmentDTO(1,"HR","Suma",20,"Bengaluru","hr@company.com",9876543210L));
        departments.add(new DepartmentDTO(2,"Finance","Ravi",15,"Mysuru","finance@company.com",9876543211L));
        departments.add(new DepartmentDTO(3,"IT","Kiran",50,"Bengaluru","it@company.com",9876543212L));
        departments.add(new DepartmentDTO(4,"Sales","Arun",30,"Mangaluru","sales@company.com",9876543213L));
        departments.add(new DepartmentDTO(5,"Marketing","Priya",25,"Hubli","marketing@company.com",9876543214L));
        departments.add(new DepartmentDTO(6,"Admin","Manoj",10,"Hassan","admin@company.com",9876543215L));
        departments.add(new DepartmentDTO(7,"Security","Rakesh",40,"Tumkur","security@company.com",9876543216L));
        departments.add(new DepartmentDTO(8,"Support","Nisha",35,"Bengaluru","support@company.com",9876543217L));
        departments.add(new DepartmentDTO(9,"Operations","Latha",45,"Mandya","operations@company.com",9876543218L));
        departments.add(new DepartmentDTO(10,"Transport","Sanjay",18,"Bengaluru","transport@company.com",9876543219L));
        departments.add(new DepartmentDTO(11,"Procurement","Harsha",22,"Shivamogga","procurement@company.com",9876543220L));
        departments.add(new DepartmentDTO(12,"Logistics","Nithya",32,"Udupi","logistics@company.com",9876543221L));
        departments.add(new DepartmentDTO(13,"Quality","Deepak",27,"Mysuru","quality@company.com",9876543222L));
        departments.add(new DepartmentDTO(14,"Testing","Renu",14,"Bengaluru","testing@company.com",9876543223L));
        departments.add(new DepartmentDTO(15,"Production","Kavya",60,"Mangaluru","production@company.com",9876543224L));
        return departments;
    }
    @Bean
    public List<InsuranceDTO> getInsurances() {
        List<InsuranceDTO> insurances = new ArrayList<>();
        insurances.add(new InsuranceDTO(1,"POL001","Ravi","Health",5000,200000,"2026-01-01"));
        insurances.add(new InsuranceDTO(2,"POL002","Kiran","Life",8000,500000,"2030-01-01"));
        insurances.add(new InsuranceDTO(3,"POL003","Suma","Vehicle",3000,150000,"2027-01-01"));
        insurances.add(new InsuranceDTO(4,"POL004","Arun","Home",4000,300000,"2029-01-01"));
        insurances.add(new InsuranceDTO(5,"POL005","Priya","Health",5500,250000,"2027-02-01"));
        insurances.add(new InsuranceDTO(6,"POL006","Manoj","Life",9000,600000,"2031-01-01"));
        insurances.add(new InsuranceDTO(7,"POL007","Nisha","Vehicle",3500,120000,"2026-05-01"));
        insurances.add(new InsuranceDTO(8,"POL008","Rakesh","Home",4500,350000,"2028-01-01"));
        insurances.add(new InsuranceDTO(9,"POL009","Deepak","Health",6000,280000,"2026-03-01"));
        insurances.add(new InsuranceDTO(10,"POL010","Latha","Life",7500,450000,"2032-01-01"));
        insurances.add(new InsuranceDTO(11,"POL011","Sanju","Vehicle",3200,130000,"2027-04-01"));
        insurances.add(new InsuranceDTO(12,"POL012","Renu","Home",4200,320000,"2028-05-01"));
        insurances.add(new InsuranceDTO(13,"POL013","Kavya","Health",5800,260000,"2026-06-01"));
        insurances.add(new InsuranceDTO(14,"POL014","Harsha","Life",8200,520000,"2033-01-01"));
        insurances.add(new InsuranceDTO(15,"POL015","Nithya","Vehicle",3100,100000,"2027-07-01"));
        return insurances;
    }
    @Bean
    public List<BankDTO> getBanks() {
        List<BankDTO> banks = new ArrayList<>();
        banks.add(new BankDTO(1,"SBI","Main Branch","SBI0001",9876543210L,"sbi@gmail.com","Bengaluru"));
        banks.add(new BankDTO(2,"HDFC","Indiranagar","HDFC0002",9876543211L,"hdfc@gmail.com","Bengaluru"));
        banks.add(new BankDTO(3,"ICICI","Whitefield","ICICI0003",9876543212L,"icici@gmail.com","Bengaluru"));
        banks.add(new BankDTO(4,"Canara","Jayanagar","CNRB0004",9876543213L,"canara@gmail.com","Mysuru"));
        banks.add(new BankDTO(5,"Axis","Koramangala","AXIS0005",9876543214L,"axis@gmail.com","Bengaluru"));
        banks.add(new BankDTO(6,"SBI","Malleshwaram","SBI0006",9876543215L,"sbi_m@gmail.com","Bengaluru"));
        banks.add(new BankDTO(7,"Kotak","BTM","KKBK0007",9876543216L,"kotak@gmail.com","Bengaluru"));
        banks.add(new BankDTO(8,"IDFC","HSR","IDFC0008",9876543217L,"idfc@gmail.com","Bengaluru"));
        banks.add(new BankDTO(9,"BOB","Rajajinagar","BOB0009",9876543218L,"bob@gmail.com","Bengaluru"));
        banks.add(new BankDTO(10,"PNB","KR Puram","PNB0010",9876543219L,"pnb@gmail.com","Bengaluru"));
        banks.add(new BankDTO(11,"Union Bank","Banashankari","UBIN0011",9876543220L,"union@gmail.com","Bengaluru"));
        banks.add(new BankDTO(12,"SBI","Yelahanka","SBI0012",9876543221L,"sbi_yk@gmail.com","Bengaluru"));
        banks.add(new BankDTO(13,"HDFC","MG Road","HDFC0013",9876543222L,"hdfc_mg@gmail.com","Bengaluru"));
        banks.add(new BankDTO(14,"ICICI","Majestic","ICICI0014",9876543223L,"icici_mj@gmail.com","Bengaluru"));
        banks.add(new BankDTO(15,"Canara","Hebbal","CNRB0015",9876543224L,"canara_hb@gmail.com","Bengaluru"));
        return banks;
    }
    @Bean
    public List<CardDTO> getCards() {
        List<CardDTO> cards = new ArrayList<>();
        cards.add(new CardDTO(1,"4111111111111111","Arun","Credit","12/26","SBI",50000));
        cards.add(new CardDTO(2,"4222222222222222","Kiran","Debit","10/25","HDFC",30000));
        cards.add(new CardDTO(3,"4333333333333333","Suma","Credit","11/27","ICICI",45000));
        cards.add(new CardDTO(4,"4444444444444444","Ravi","Credit","09/26","Axis",60000));
        cards.add(new CardDTO(5,"4555555555555555","Priya","Debit","05/25","SBI",20000));
        cards.add(new CardDTO(6,"4666666666666666","Harsha","Credit","07/28","Kotak",70000));
        cards.add(new CardDTO(7,"4777777777777777","Nisha","Debit","03/27","HDFC",15000));
        cards.add(new CardDTO(8,"4888888888888888","Deepak","Credit","02/29","ICICI",55000));
        cards.add(new CardDTO(9,"4999999999999999","Sanjay","Debit","01/25","Axis",18000));
        cards.add(new CardDTO(10,"4111222233334444","Renu","Credit","04/28","SBI",65000));
        cards.add(new CardDTO(11,"4222333344445555","Latha","Debit","06/26","HDFC",25000));
        cards.add(new CardDTO(12,"4333444455556666","Arjun","Credit","05/27","ICICI",70000));
        cards.add(new CardDTO(13,"4444555566667777","Manoj","Debit","08/26","Axis",30000));
        cards.add(new CardDTO(14,"4555666677778888","Nithya","Credit","09/27","Kotak",80000));
        cards.add(new CardDTO(15,"4666777788889999","Chandru","Debit","12/25","SBI",35000));
        return cards;
    }
    @Bean
    public List<GameDTO> getGames() {
        List<GameDTO> games = new ArrayList<>();
        games.add(new GameDTO(1,"GTA V","Action","PC",2000,5,"Rockstar"));
        games.add(new GameDTO(2,"FIFA 23","Sports","PS5",4000,4,"EA Sports"));
        games.add(new GameDTO(3,"Minecraft","Adventure","PC",1500,5,"Mojang"));
        games.add(new GameDTO(4,"PUBG","Battle Royale","Mobile",0,4,"Tencent"));
        games.add(new GameDTO(5,"Fortnite","Battle Royale","PC",0,4,"Epic Games"));
        games.add(new GameDTO(6,"NFS Heat","Racing","PC",3000,4,"EA"));
        games.add(new GameDTO(7,"Valorant","Shooter","PC",0,5,"Riot Games"));
        games.add(new GameDTO(8,"Call of Duty","Shooter","PS5",5000,5,"Activision"));
        games.add(new GameDTO(9,"WWE 2K22","Sports","Xbox",4500,4,"2K"));
        games.add(new GameDTO(10,"Spiderman","Action","PS5",4500,5,"Sony"));
        games.add(new GameDTO(11,"BGMI","Battle Royale","Mobile",0,4,"Krafton"));
        games.add(new GameDTO(12,"Assassin’s Creed","Action","PC",3500,5,"Ubisoft"));
        games.add(new GameDTO(13,"Far Cry","Shooter","PC",3000,4,"Ubisoft"));
        games.add(new GameDTO(14,"Watch Dogs","Action","PC",3200,4,"Ubisoft"));
        games.add(new GameDTO(15,"Candy Crush","Puzzle","Mobile",0,4,"King"));
        return games;
    }
    @Bean
    public List<EventDTO> getEvents() {
        List<EventDTO> events = new ArrayList<>();
        events.add(new EventDTO(1,"Music Fest","2025-01-01","18:00","Arun","Stadium",500));
        events.add(new EventDTO(2,"Food Carnival","2025-01-02","10:00","Kiran","Ground",300));
        events.add(new EventDTO(3,"Tech Expo","2025-01-03","09:00","Ravi","Convention Center",800));
        events.add(new EventDTO(4,"Job Fair","2025-01-04","08:00","Suma","College",0));
        events.add(new EventDTO(5,"Art Exhibition","2025-01-05","11:00","Priya","Gallery",200));
        events.add(new EventDTO(6,"Startup Pitch","2025-01-06","12:00","Manoj","Auditorium",1000));
        events.add(new EventDTO(7,"Yoga Camp","2025-01-07","06:00","Nisha","Park",100));
        events.add(new EventDTO(8,"Marathon","2025-01-08","05:00","Harsha","City Road",300));
        events.add(new EventDTO(9,"Dance Show","2025-01-09","17:00","Arjun","Hall",400));
        events.add(new EventDTO(10,"Fashion Show","2025-01-10","19:00","Latha","Resort",600));
        events.add(new EventDTO(11,"Coding Hackathon","2025-01-11","09:00","Deepak","Tech Park",1000));
        events.add(new EventDTO(12,"Robotics Event","2025-01-12","10:00","Renu","Mall",800));
        events.add(new EventDTO(13,"Science Fair","2025-01-13","08:00","Sanju","School",150));
        events.add(new EventDTO(14,"Carnival Night","2025-01-14","20:00","Kavya","Beach",700));
        events.add(new EventDTO(15,"Charity Run","2025-01-15","06:00","Chandra","City Center",200));
        return events;
    }
    @Bean
    public List<WalletDTO> getWallets() {
        List<WalletDTO> wallets = new ArrayList<>();
        wallets.add(new WalletDTO(1,"W001","Arun",5000,"Paytm","2025-01-01","Active"));
        wallets.add(new WalletDTO(2,"W002","Kiran",3000,"PhonePe","2025-01-02","Active"));
        wallets.add(new WalletDTO(3,"W003","Suma",7000,"GPay","2025-01-03","Inactive"));
        wallets.add(new WalletDTO(4,"W004","Ravi",6000,"Paytm","2025-01-04","Active"));
        wallets.add(new WalletDTO(5,"W005","Priya",8000,"PhonePe","2025-01-05","Active"));
        wallets.add(new WalletDTO(6,"W006","Manoj",2000,"GPay","2025-01-06","Active"));
        wallets.add(new WalletDTO(7,"W007","Nisha",1000,"Paytm","2025-01-07","Inactive"));
        wallets.add(new WalletDTO(8,"W008","Harsha",9000,"GPay","2025-01-08","Active"));
        wallets.add(new WalletDTO(9,"W009","Deepak",4500,"PhonePe","2025-01-09","Active"));
        wallets.add(new WalletDTO(10,"W010","Renu",3000,"Paytm","2025-01-10","Inactive"));
        wallets.add(new WalletDTO(11,"W011","Latha",7500,"GPay","2025-01-11","Active"));
        wallets.add(new WalletDTO(12,"W012","Sanju",500,"PhonePe","2025-01-12","Active"));
        wallets.add(new WalletDTO(13,"W013","Kavya",9500,"Paytm","2025-01-13","Inactive"));
        wallets.add(new WalletDTO(14,"W014","Harsha",8500,"GPay","2025-01-14","Active"));
        wallets.add(new WalletDTO(15,"W015","Chandra",6000,"PhonePe","2025-01-15","Active"));
        return wallets;
    }
    @Bean
    public List<LoanDTO> getLoans() {
        List<LoanDTO> loans = new ArrayList<>();
        loans.add(new LoanDTO(1,"L001","Arun",200000,7.5,24,"Home","Approved"));
        loans.add(new LoanDTO(2,"L002","Ravi",150000,8.0,36,"Personal","Pending"));
        loans.add(new LoanDTO(3,"L003","Kiran",300000,6.8,48,"Home","Approved"));
        loans.add(new LoanDTO(4,"L004","Suma",100000,9.0,12,"Vehicle","Rejected"));
        loans.add(new LoanDTO(5,"L005","Priya",500000,7.2,60,"Home","Approved"));
        loans.add(new LoanDTO(6,"L006","Harsha",75000,10.0,24,"Personal","Pending"));
        loans.add(new LoanDTO(7,"L007","Nisha",90000,9.5,18,"Vehicle","Approved"));
        loans.add(new LoanDTO(8,"L008","Manoj",200000,8.2,36,"Personal","Rejected"));
        loans.add(new LoanDTO(9,"L009","Deepak",350000,7.1,48,"Home","Approved"));
        loans.add(new LoanDTO(10,"L010","Renu",120000,9.8,24,"Vehicle","Pending"));
        loans.add(new LoanDTO(11,"L011","Latha",450000,6.9,60,"Home","Approved"));
        loans.add(new LoanDTO(12,"L012","Sanju",130000,8.4,30,"Personal","Approved"));
        loans.add(new LoanDTO(13,"L013","Kavya",180000,9.1,36,"Vehicle","Rejected"));
        loans.add(new LoanDTO(14,"L014","Harsha",200000,8.8,48,"Home","Pending"));
        loans.add(new LoanDTO(15,"L015","Chandra",160000,7.9,24,"Personal","Approved"));
        return loans;
    }
    @Bean
    public List<TrainerDTO> getTrainers() {
        List<TrainerDTO> trainers = new ArrayList<>();

        trainers.add(new TrainerDTO(1, "Ramesh", "Java", 5, "MCA", "ramesh@gmail.com", 9876543210L, "Bengaluru"));
        trainers.add(new TrainerDTO(2, "Suresh", "Python", 4, "B.Tech", "suresh@gmail.com", 9876543211L, "Mysuru"));
        trainers.add(new TrainerDTO(3, "Mahesh", "C Programming", 6, "BE", "mahesh@gmail.com", 9876543212L, "Bengaluru"));
        trainers.add(new TrainerDTO(4, "Rajesh", "JavaScript", 3, "MSc", "rajesh@gmail.com", 9876543213L, "Hubli"));
        trainers.add(new TrainerDTO(5, "Kiran", "Spring Boot", 7, "MCA", "kiran@gmail.com", 9876543214L, "Shivamogga"));
        trainers.add(new TrainerDTO(6, "Vikram", "ReactJS", 4, "BSc", "vikram@gmail.com", 9876543215L, "Udupi"));
        trainers.add(new TrainerDTO(7, "Ajay", "HTML & CSS", 2, "Diploma", "ajay@gmail.com", 9876543216L, "Mangaluru"));
        trainers.add(new TrainerDTO(8, "Anil", "SQL", 5, "BE", "anil@gmail.com", 9876543217L, "Tumkur"));
        trainers.add(new TrainerDTO(9, "Rohit", "Angular", 3, "BCA", "rohit@gmail.com", 9876543218L, "Bengaluru"));
        trainers.add(new TrainerDTO(10, "Sanjay", "Data Science", 4, "M.Tech", "sanjay@gmail.com", 9876543219L, "Mysuru"));
        trainers.add(new TrainerDTO(11, "Rakesh", "Machine Learning", 6, "MSc", "rakesh@gmail.com", 9876543201L, "Dharwad"));
        trainers.add(new TrainerDTO(12, "Praveen", "DevOps", 5, "BE", "praveen@gmail.com", 9876543202L, "Belagavi"));
        trainers.add(new TrainerDTO(13, "Sunil", "Cloud Computing", 7, "M.Tech", "sunil@gmail.com", 9876543203L, "Bengaluru"));
        trainers.add(new TrainerDTO(14, "Manoj", "Cyber Security", 4, "B.Tech", "manoj@gmail.com", 9876543204L, "Shimoga"));
        trainers.add(new TrainerDTO(15, "Deepak", "AI & ML", 3, "MCA", "deepak@gmail.com", 9876543205L, "Chikkamagaluru"));

        return trainers;
    }
    @Bean
    public List<RoomDTO> getRooms() {
        List<RoomDTO> rooms = new ArrayList<>();

        rooms.add(new RoomDTO(1, 101, "Single", 1500.0, 1, "Available", 1));
        rooms.add(new RoomDTO(2, 102, "Double", 2500.0, 2, "Booked", 1));
        rooms.add(new RoomDTO(3, 103, "Suite", 4500.0, 3, "Available", 1));
        rooms.add(new RoomDTO(4, 201, "Single", 1600.0, 1, "Maintenance", 2));
        rooms.add(new RoomDTO(5, 202, "Double", 2600.0, 2, "Available", 2));
        rooms.add(new RoomDTO(6, 203, "Suite", 4800.0, 3, "Booked", 2));
        rooms.add(new RoomDTO(7, 301, "Single", 1700.0, 1, "Booked", 3));
        rooms.add(new RoomDTO(8, 302, "Double", 2700.0, 2, "Available", 3));
        rooms.add(new RoomDTO(9, 303, "Suite", 5000.0, 3, "Available", 3));
        rooms.add(new RoomDTO(10, 401, "Single", 1800.0, 1, "Booked", 4));
        rooms.add(new RoomDTO(11, 402, "Double", 2800.0, 2, "Booked", 4));
        rooms.add(new RoomDTO(12, 403, "Suite", 5200.0, 3, "Available", 4));
        rooms.add(new RoomDTO(13, 501, "Single", 1900.0, 1, "Available", 5));
        rooms.add(new RoomDTO(14, 502, "Double", 2900.0, 2, "Maintenance", 5));
        rooms.add(new RoomDTO(15, 503, "Suite", 5400.0, 3, "Booked", 5));

        return rooms;
    }






}

