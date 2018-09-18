import java.util.ArrayList;
import java.util.List;

public class Servicebook {
//making an Arraylist objekt
   List<Service> services = new ArrayList<>();
// adding service to the list of services

   public void addservice(Service service){
      services.add(service);
   }
   public int getNumberOfServices() {
      return services.size();
   }

    public Service getService(int index){
      if (index < services.size()){

         return services.get(index);

      }
      return null;
   }

   public List<Service> getAllServices(Service mileage) {
      return services;
   }

   public int getAllServiceMilage () {




   }

   public Date hasServiceOnDate()


}
