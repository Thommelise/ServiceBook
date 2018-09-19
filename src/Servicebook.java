import java.util.ArrayList;
import java.util.List;



//making an Arraylist objekt
public class Servicebook {

   List<Service> services = new ArrayList<>();
// adding service to the list of services

   public void addService(Service service){
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

   public List<Service> getAllServices(Service service) {
      return services;
   }
    public int[] getAllServiceMileage(){

        int [] mileages = new int[services.size()];
        int i =0;

        for(Service service: services){
            mileages[i]=service.getMileage();
            i++;
        }
        return mileages;
    }

    public boolean hasServiceOnDate(Date date){

        for (Service service : services) {
            if (date.equals(service.getDate())){
                return true;
            }

        }
        return false;
    }

    public Service getMostRecent(){
       Service mostRecentService = services.get(0);
       for (Service service:services);
       if
    }

}
