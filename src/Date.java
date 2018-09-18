public class Date {
 // variables
int day;
int month;
int year;
 // constructor  and arguments
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public void setDay(int day) {
        this.day = day;
        }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date copy(){
        Date date = new Date(day,month,year);
        return date;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date1 = (Date) o;
        return day == date1.day &&
                month == date1.month &&
                year == date1.year;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Date{" +
                "date=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}










    












