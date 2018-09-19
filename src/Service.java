import java.util.Objects;

public class Service {

    int mileage;
    Date date;

    public Service(int mileage,Date date){
        this.mileage = mileage;
        this.date = date;
    }

    public Date getDate()
    {
        return date;
    }

    public int getMileage()
    {
        return mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return mileage == service.mileage &&
                Objects.equals(date, service.date);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Service{" +
                "mileage=" + mileage +
                ", date=" + date +
                '}';
    }

}

