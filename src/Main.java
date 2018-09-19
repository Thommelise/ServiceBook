public class Main {

    public static void main(String[] args) {

        var date = new Date(26  ,8,1991);

        var date1 = new Date(26,8,1991);

        var date2 = new Date(1,12,2018);

        var service = new Service(100000,date);

        var service1 = new Service(120000,date1);

        var service2 = new Service(150000, date2);

        var serviceBook = new Servicebook();

        serviceBook.addService(service);

        serviceBook.addService(service1);

        serviceBook.addService(service2);

        System.out.println(serviceBook.hasServiceOnDate(new Date(26,8,1991)));





    }
}
