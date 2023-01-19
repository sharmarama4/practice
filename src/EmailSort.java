import java.util.Comparator;

public class EmailSort implements Comparator<Email> {
    @Override
    public int compare(Email o1, Email o2) {
        if(o1.getTo().contains("recruitment"))
            return -1111;
        if(o1.getTo().contains("spam"))
            return 1;
        if(o1.getTo().contains("sales"))
            return 2;
        else if (o1.getTo().contains("reception"))
            return 1000;
        else
         return o2.getEmailText().compareTo(o1.getEmailText());
    }
}
