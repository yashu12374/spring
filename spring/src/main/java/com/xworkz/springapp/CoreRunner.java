package com.xworkz.springapp;

import com.xworkz.springapp.component.*;
import com.xworkz.springapp.coreConfiguration.CoreConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CoreRunner {

    public static void main(String[] args) {

        System.out.println("main started");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreConfiguration.class);

        Institute institute = applicationContext.getBean(Institute.class);
        institute.setId(1);
        institute.setName("X-workz");

        Trainee trainee = institute.getTrainee();
        trainee.setTraineeId(1);
        trainee.setTraineeName("Yashaswini");
        System.out.println(institute);
        System.out.println(trainee);
        System.out.println("...........................................................");

        Company company = applicationContext.getBean(Company.class);
        company.setCompanyId(2);
        company.setCompanyName("IBM");

        Employee employee = company.getEmployee();
        employee.setEmployeeId(1);
        employee.setEmployeeName("Yashaswini");
        System.out.println(company);
        System.out.println(employee);
        System.out.println("...........................................................");

        Hospital hospital = applicationContext.getBean(Hospital.class);
        hospital.setHospitalId(3);
        hospital.setHospitalName("ESI");

        Doctor doctor = hospital.getDoctor();
        doctor.setDoctorId(1);
        doctor.setDoctorName("Yashaswini");
        System.out.println(hospital);
        System.out.println(doctor);
        System.out.println("...........................................................");

        School school = applicationContext.getBean(School.class);
        school.setSchoolId(4);
        school.setSchoolName("SAV");

        Teacher teacher = school.getTeacher();
        teacher.setTeacherId(1);
        teacher.setTeacherName("Manjula");
        System.out.println(school);
        System.out.println(teacher);
        System.out.println("...........................................................");

        Bank bank = applicationContext.getBean(Bank.class);
        bank.setBankID(5);
        bank.setBankName("SBI");

        Account account = bank.getAccount();
        account.setAccountID(1);
        account.setAccountName("SavingAccount");
        System.out.println(bank);
        System.out.println(account);
        System.out.println("...........................................................");

        Library library = applicationContext.getBean(Library.class);
        library.setLibraryId(6);
        library.setLibraryName("CollegeLibrary");

        BookLibrary book = library.getBook();
        book.setBookId(1);
        book.setBookName("Kanuru Heggaditi");
        System.out.println(library);
        System.out.println(book);
        System.out.println("...........................................................");

        Hotel hotel = applicationContext.getBean(Hotel.class);
        hotel.setHotelId(7);
        hotel.setHotelName("Durga");

        Room room = hotel.getRoom();
        room.setRoomId(1);
        room.setRoomType("Single");
        System.out.println(hotel);
        System.out.println(room);
        System.out.println("...........................................................");

        Airport airport = applicationContext.getBean(Airport.class);
        airport.setAirportId(8);
        airport.setAirportName("Shivmogga");

        Flight flight = airport.getFlight();
        flight.setFlightId(1);
        flight.setFlightName("IndiGo");
        System.out.println(airport);
        System.out.println(flight);
        System.out.println("...........................................................");

        Restaurant restaurant = applicationContext.getBean(Restaurant.class);
        restaurant.setRestaurantId(9);
        restaurant.setRestaurantName("Vidyarthi Bhavan");

        Chef chef = restaurant.getChef();
        chef.setChefId(1);
        chef.setChefName("Yashu");
        System.out.println(restaurant);
        System.out.println(chef);
        System.out.println("...........................................................");

        Court court = applicationContext.getBean(Court.class);
        court.setCourtId(10);
        court.setCourtName("City Civil Court Complex");

        Judge judge = court.getJudge();
        judge.setJudgeId(1);
        judge.setJudgeName("Darshan");
        System.out.println(court);
        System.out.println(judge);
        System.out.println("...........................................................");

        Mall mall = applicationContext.getBean(Mall.class);
        mall.setMallId(11);
        mall.setMallName("Orian Mall");

        Shop shop = mall.getShop();
        shop.setShopId(1);
        shop.setShopName("Dress Shop");
        System.out.println(mall);
        System.out.println(shop);
        System.out.println("...........................................................");

        Factory factory = applicationContext.getBean(Factory.class);
        factory.setFactoryId(12);
        factory.setFactoryName("Aerospace & Defense");

        Machine machine = factory.getMachine();
        machine.setMachineId(1);
        machine.setMachineName("Bosch");
        System.out.println(factory);
        System.out.println(machine);
        System.out.println("...........................................................");


        Cinema cinema = applicationContext.getBean(Cinema.class);
        cinema.setCinemaId(13);
        cinema.setCinemaName("Devil");

        Screen screen = cinema.getScreen();
        screen.setScreenNo(12);
        screen.setScreenType("Full Screen");
        System.out.println(cinema);
        System.out.println(screen);
        System.out.println("...........................................................");

        Stadium stadium = applicationContext.getBean(Stadium.class);
        stadium.setStadiumId(14);
        stadium.setStadiumName("Chinnaswamy Stadium");

        Player player = stadium.getPlayer();
        player.setPlayerId(1);
        player.setPlayerName("Pooja");
        System.out.println(stadium);
        System.out.println(player);
        System.out.println("...........................................................");

        PoliceStation policeStation = applicationContext.getBean(PoliceStation.class);
        policeStation.setStationId(15);
        policeStation.setStationName("Old police Station");

        Officer officer = policeStation.getOfficer();
        officer.setOfficerId(1);
        officer.setOfficerName("Pooja");
        System.out.println(policeStation);
        System.out.println(officer);
        System.out.println("...........................................................");

        CompanyBranch companyBranch = applicationContext.getBean(CompanyBranch.class);
        companyBranch.setBranchId(16);
        companyBranch.setBranchName("Google");

        Manager manager = companyBranch.getManager();
        manager.setManagerId(1);
        manager.setManagerName("Thanu");
        System.out.println(companyBranch);
        System.out.println(manager);
        System.out.println("...........................................................");

        TrainingCenter trainingCenter = applicationContext.getBean(TrainingCenter.class);
        trainingCenter.setCenterId(17);
        trainingCenter.setCenterName("X-workz");

        Trainer trainer = trainingCenter.getTrainer();
        trainer.setTrainerId(1);
        trainer.setTrainerName("Dev sir");
        System.out.println(trainingCenter);
        System.out.println(trainer);
        System.out.println("...........................................................");

        Apartment apartment = applicationContext.getBean(Apartment.class);
        apartment.setApartmentId(18);
        apartment.setApartmentName("Phoenix One Bangalore West");

        Owner owner = apartment.getOwner();
        owner.setOwnerId(1);
        owner.setOwnerName("Karthika");
        System.out.println(apartment);
        System.out.println(owner);
        System.out.println("...........................................................");

        ITCompany itCompany = applicationContext.getBean(ITCompany.class);
        itCompany.setCompanyId(19);
        itCompany.setCompanyName("Wipro");

        Developer developer = itCompany.getDeveloper();
        developer.setDeveloperId(1);
        developer.setDeveloperName("Yashaswini");
        System.out.println(itCompany);
        System.out.println(developer);
        System.out.println("...........................................................");

        University university = applicationContext.getBean(University.class);
        university.setUniversityId(20);
        university.setUniversityName("VTU");

        Professor professor = university.getProfessor();
        professor.setProfessorId(1);
        professor.setProfessorName("Yashaswini");
        System.out.println(university);
        System.out.println(professor);
        System.out.println("...........................................................");


        BusStand busStand = applicationContext.getBean(BusStand.class);
        busStand.setStandId(21);
        busStand.setStandName("Shivmogga Bus stand");

        Bus bus = busStand.getBus();
        bus.setBusNumber(0304);
        bus.setBusType("sleeper");
        System.out.println(busStand);
        System.out.println(bus);
        System.out.println("...........................................................");

        RailwayStation railwayStation = applicationContext.getBean(RailwayStation.class);
        railwayStation.setStationId(22);
        railwayStation.setStationName("KSR Bengaluru City Junction");

        Train train = railwayStation.getTrain();
        train.setTrainNo(12300);
        train.setTrainName("Vande Bharat Express");
        System.out.println(railwayStation);
        System.out.println(train);
        System.out.println("...........................................................");

        Warehouse warehouse = applicationContext.getBean(Warehouse.class);
        warehouse.setWarehouseId(23);
        warehouse.setWarehouseLocation("Bengaluru");

        Product product = warehouse.getProduct();
        product.setProductId(1);
        product.setProductName("Electronics");
        System.out.println(warehouse);
        System.out.println(product);
        System.out.println("...........................................................");

        SuperMarket superMarket = applicationContext.getBean(SuperMarket.class);
        superMarket.setMarketId(24);
        superMarket.setMarketName("Lulu Hypermarket Bengaluru");

        Customer customer = superMarket.getCustomer();
        customer.setCustomerId(1);
        customer.setCustomerName("Pooja");
        System.out.println(superMarket);
        System.out.println(customer);
        System.out.println("...........................................................");

        Garage garage = applicationContext.getBean(Garage.class);
        garage.setGarageId(25);
        garage.setGarageName("Lakshmi Garage");

        Vehicle vehicle = garage.getVehicle();
        vehicle.setVehicleId(1);
        vehicle.setVehicleType("Car");
        System.out.println(garage);
        System.out.println(vehicle);
        System.out.println("...........................................................");

        Farm farm = applicationContext.getBean(Farm.class);
        farm.setFarmId(26);
        farm.setFarmLocation("Mandya");

        Crop crop = farm.getCrop();
        crop.setCropId(101);
        crop.setCropName("Sugarcane");
        System.out.println(farm);
        System.out.println(crop);
        System.out.println("...........................................................");

        PowerPlant plant = applicationContext.getBean(PowerPlant.class);
        plant.setPlantId(27);
        plant.setPlantName("Sharavathi Power Plant");

        Turbine turbine = plant.getTurbine();
        turbine.setTurbineId(9001);
        turbine.setTurbineType("Hydro Turbine");
        System.out.println(plant);
        System.out.println(turbine);
        System.out.println("...........................................................");

        NewsChannel channel = applicationContext.getBean(NewsChannel.class);
        channel.setChannelId(28);
        channel.setChannelName("TV9 Kannada");

        Reporter reporter = channel.getReporter();
        reporter.setReporterId(501);
        reporter.setReporterName("Ravi Kumar");
        System.out.println(channel);
        System.out.println(reporter);
        System.out.println("...........................................................");

        Studio studio = applicationContext.getBean(Studio.class);
        studio.setStudioId(29);
        studio.setStudioName("Sun Studio");

        Camera camera = studio.getCamera();
        camera.setCameraId(7001);
        camera.setCameraType("4K Digital");
        System.out.println(studio);
        System.out.println(camera);
        System.out.println("...........................................................");

        MobileStore mobileStore = applicationContext.getBean(MobileStore.class);
        mobileStore.setStoreId(30);
        mobileStore.setStoreName("Reliance Digital");

        Mobile mobile = mobileStore.getMobile();
        mobile.setMobileId(101);
        mobile.setMobileBrand("Samsung");
        System.out.println(mobileStore);
        System.out.println(mobile);
        System.out.println("...........................................................");

        ServiceCenter serviceCenter = applicationContext.getBean(ServiceCenter.class);
        serviceCenter.setCenterId(31);
        serviceCenter.setCenterName("AutoCare Service");

        Technician technician = serviceCenter.getTechnician();
        technician.setTechnicianId(201);
        technician.setTechnicianName("Ramesh");
        System.out.println(serviceCenter);
        System.out.println(technician);
        System.out.println("...........................................................");

        HotelBranch hotelBranch = applicationContext.getBean(HotelBranch.class);
        hotelBranch.setBranchId(32);
        hotelBranch.setBranchName("Taj MG Road");

        Receptionist receptionist = hotelBranch.getReceptionist();
        receptionist.setReceptionistId(301);
        receptionist.setReceptionistName("Anita");
        System.out.println(hotelBranch);
        System.out.println(receptionist);
        System.out.println("...........................................................");

        Museum museum = applicationContext.getBean(Museum.class);
        museum.setMuseumId(33);
        museum.setMuseumName("Karnataka Museum");

        Artifact artifact = museum.getArtifact();
        artifact.setArtifactId(501);
        artifact.setArtifactName("Ancient Vase");

        System.out.println(museum);
        System.out.println(artifact);
        System.out.println("...........................................................");

        Zoo zoo = applicationContext.getBean(Zoo.class);
        zoo.setZooId(34);
        zoo.setZooName("Mysore Zoo");

        Animal animal = zoo.getAnimal();
        animal.setAnimalId(601);
        animal.setAnimalType("Lion");

        System.out.println(zoo);
        System.out.println(animal);
        System.out.println("...........................................................");

        Bakery bakery = applicationContext.getBean(Bakery.class);
        bakery.setBakeryId(35);
        bakery.setBakeryName("Iyengar Bakery");

        Cake cake = bakery.getCake();
        cake.setCakeId(701);
        cake.setCakeType("Chocolate");
        System.out.println(bakery);
        System.out.println(cake);
        System.out.println("...........................................................");

        Theatre theatre = applicationContext.getBean(Theatre.class);
        theatre.setTheatreId(36);
        theatre.setTheatreName("PVR Cinema");

        Ticket ticket = theatre.getTicket();
        ticket.setTicketId(801);
        ticket.setSeatNo("A10");
        System.out.println(theatre);
        System.out.println(ticket);
        System.out.println("...........................................................");

        Hostel hostel = applicationContext.getBean(Hostel.class);
        hostel.setHostelId(37);
        hostel.setHostelName("Sunshine Hostel");

        Warden warden = hostel.getWarden();
        warden.setWardenId(901);
        warden.setWardenName("Ravi");
        System.out.println(hostel);
        System.out.println(warden);
        System.out.println("...........................................................");

        CoachingCenter coachingCenter = applicationContext.getBean(CoachingCenter.class);
        coachingCenter.setCenterId(38);
        coachingCenter.setCenterName("X-workz Coaching");

        Mentor mentor = coachingCenter.getMentor();
        mentor.setMentorId(1001);
        mentor.setMentorName("Suresh");

        System.out.println(coachingCenter);
        System.out.println(mentor);
        System.out.println("...........................................................");

        ConstructionSite constructionSite = applicationContext.getBean(ConstructionSite.class);
        constructionSite.setSiteId(39);
        constructionSite.setSiteName("Metro Rail Project");

        Engineer engineer = constructionSite.getEngineer();
        engineer.setEngineerId(4101);
        engineer.setEngineerName("Ravi Kumar");

        System.out.println(constructionSite);
        System.out.println(engineer);
        System.out.println("...........................................................");

        DeliveryHub deliveryHub = applicationContext.getBean(DeliveryHub.class);
        deliveryHub.setHubId(40);
        deliveryHub.setHubName("BlueDart Hub");

        Parcel parcel = deliveryHub.getParcel();
        parcel.setParcelId(4201);
        parcel.setParcelType("Electronics");

        System.out.println(deliveryHub);
        System.out.println(parcel);
        System.out.println("...........................................................");


        CloudCompany cloudCompany = applicationContext.getBean(CloudCompany.class);
        cloudCompany.setCompanyId(41);
        cloudCompany.setCompanyName("AWS");

        Server server = cloudCompany.getServer();
        server.setServerId(4301);
        server.setServerType("Cloud Server");

        System.out.println(cloudCompany);
        System.out.println(server);
        System.out.println("...........................................................");


        DataCenter dataCenter = applicationContext.getBean(DataCenter.class);
        dataCenter.setCenterId(42);
        dataCenter.setCenterName("Google Data Center");

        Database database = dataCenter.getDatabase();
        database.setDatabaseId(4401);
        database.setDatabaseName("SQL");

        System.out.println(dataCenter);
        System.out.println(database);
        System.out.println("...........................................................");


        ECommerce eCommerce = applicationContext.getBean(ECommerce.class);
        eCommerce.setEcommerceId(43);
        eCommerce.setEcommerceName("Amazon");

        Order order = eCommerce.getOrder();
        order.setOrderId(4501);
        order.setOrderType("Delivered");

        System.out.println(eCommerce);
        System.out.println(order);
        System.out.println("...........................................................");

        PaymentGateway paymentGateway = applicationContext.getBean(PaymentGateway.class);
        paymentGateway.setGatewayId(44);
        paymentGateway.setGatewayName("PhonePe");

        Transaction transaction = paymentGateway.getTransaction();
        transaction.setTransactionId(4601);
        transaction.setTransactionMode("UPI");

        System.out.println(paymentGateway);
        System.out.println(transaction);
        System.out.println("...........................................................");

        SoftwareFirm softwareFirm = applicationContext.getBean(SoftwareFirm.class);
        softwareFirm.setFirmId(45);
        softwareFirm.setFirmName("Infosys");

        Tester tester = softwareFirm.getTester();
        tester.setTesterId(4701);
        tester.setTesterName("Kiran");

        System.out.println(softwareFirm);
        System.out.println(tester);
        System.out.println("...........................................................");

        MediaHouse mediaHouse = applicationContext.getBean(MediaHouse.class);
        mediaHouse.setHouseId(46);
        mediaHouse.setHouseName("Times Group");

        Editor editor = mediaHouse.getEditor();
        editor.setEditorId(4801);
        editor.setEditorName("Anusha");

        System.out.println(mediaHouse);
        System.out.println(editor);
        System.out.println("...........................................................");

        FinanceCompany financeCompany = applicationContext.getBean(FinanceCompany.class);
        financeCompany.setCompanyId(47);
        financeCompany.setCompanyName("HDFC Finance");

        Auditor auditor = financeCompany.getAuditor();
        auditor.setAuditorId(4901);
        auditor.setAuditorName("Srinivas");

        System.out.println(financeCompany);
        System.out.println(auditor);
        System.out.println("...........................................................");


        InsuranceOffice insuranceOffice = applicationContext.getBean(InsuranceOffice.class);
        insuranceOffice.setOfficeId(48);
        insuranceOffice.setOfficeName("LIC Office");

        Agent agent = insuranceOffice.getAgent();
        agent.setAgentId(5001);
        agent.setAgentName("Ramesh");

        System.out.println(insuranceOffice);
        System.out.println(agent);
        System.out.println("...........................................................");


        TravelAgency travelAgency = applicationContext.getBean(TravelAgency.class);
        travelAgency.setAgencyId(201);
        travelAgency.setAgencyName("Wonders Travel Agency");

        Guide guide = travelAgency.getGuide();
        guide.setGuideId(1);
        guide.setGuideName("John Doe");

        System.out.println(travelAgency);
        System.out.println(guide);
        System.out.println("-----------------------------------------------------");


        SportsAcademy sportsAcademy = applicationContext.getBean(SportsAcademy.class);
        sportsAcademy.setAcademyId(51);
        sportsAcademy.setAcademyName("National Sports Academy");

        Coach coach = sportsAcademy.getCoach();
        coach.setCoachId(5101);
        coach.setCoachName("Anil");

        System.out.println(sportsAcademy);
        System.out.println(coach);
        System.out.println("...........................................................");

        FitnessCenter fitnessCenter = applicationContext.getBean(FitnessCenter.class);
        fitnessCenter.setCenterId(52);
        fitnessCenter.setCenterName("Fit Zone");

        Instructor instructor = fitnessCenter.getInstructor();
        instructor.setInstructorId(5201);
        instructor.setInstructorName("Sneha");

        System.out.println(fitnessCenter);
        System.out.println(instructor);
        System.out.println("...........................................................");

        Gym gym = applicationContext.getBean(Gym.class);
        gym.setGymId(53);
        gym.setGymName("Power Gym");

        Equipment equipment = gym.getEquipment();
        equipment.setEquipmentId(5301);
        equipment.setEquipmentName("Treadmill");

        System.out.println(gym);
        System.out.println(equipment);
        System.out.println("...........................................................");

        Movie movie = applicationContext.getBean(Movie.class);
        movie.setMovieId(60);
        movie.setMovieName("Devil");

        Hero hero = movie.getHero();
        hero.setHeroName("Darshan");
        hero.setMovieName("Devil");
        System.out.println(movie);
        System.out.println(hero);
        System.out.println("...........................................................");

        ResearchLab researchLab = applicationContext.getBean(ResearchLab.class);
        researchLab.setLabId(54);
        researchLab.setLabName("ISRO Research Lab");

        Scientist scientist = researchLab.getScientist();
        scientist.setScientistId(5401);
        scientist.setScientistName("Dr. Rao");

        System.out.println(researchLab);
        System.out.println(scientist);
        System.out.println("...........................................................");

        SpaceCenter spaceCenter = applicationContext.getBean(SpaceCenter.class);
        spaceCenter.setCenterId(55);
        spaceCenter.setCenterName("ISRO");

        Satellite satellite = spaceCenter.getSatellite();
        satellite.setSatelliteId(5501);
        satellite.setSatelliteName("Chandrayaan");

        System.out.println(spaceCenter);
        System.out.println(satellite);
        System.out.println("...........................................................");

        ShippingCompany shippingCompany = applicationContext.getBean(ShippingCompany.class);
        shippingCompany.setCompanyId(56);
        shippingCompany.setCompanyName("Maersk");

        Container container = shippingCompany.getContainer();
        container.setContainerId(5601);
        container.setContainerType("Refrigerated");

        System.out.println(shippingCompany);
        System.out.println(container);
        System.out.println("...........................................................");

        Port port = applicationContext.getBean(Port.class);
        port.setPortId(57);
        port.setPortName("Chennai Port");

        Ship ship = port.getShip();
        ship.setShipId(5701);
        ship.setShipName("INS Vikrant");

        System.out.println(port);
        System.out.println(ship);
        System.out.println("...........................................................");

        TelecomOffice telecomOffice = applicationContext.getBean(TelecomOffice.class);
        telecomOffice.setOfficeId(58);
        telecomOffice.setOfficeName("Jio Office");

        Network network = telecomOffice.getNetwork();
        network.setNetworkId(5801);
        network.setNetworkType("5G");

        System.out.println(telecomOffice);
        System.out.println(network);
        System.out.println("...........................................................");

        LogisticsHub logisticsHub = applicationContext.getBean(LogisticsHub.class);
        logisticsHub.setHubId(59);
        logisticsHub.setHubName("Delhivery Hub");

        Driver driver = logisticsHub.getDriver();
        driver.setDriverId(5901);
        driver.setDriverName("Suresh");

        System.out.println(logisticsHub);
        System.out.println(driver);
        System.out.println("...........................................................");



        System.out.println("main ended");
    }
}
