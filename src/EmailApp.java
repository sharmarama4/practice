import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmailApp {
    public static void main(String[] args) {
        //All emails list
        List<Email> emails=new ArrayList<>();
        emails.add(new Email("a.com","info@.com","","Email Promo","Promo"));
        emails.add(new Email("b.com","b.com","","Email proposal","sub"));
        emails.add(new Email("s.com","b.com","","Email proposal","sub"));
        emails.add(new Email("a.com","b.com","","Email Cv","About my cv"));
        emails.add(new Email("c.com","b.com","","Email Reception","sub"));
        emails.add(new Email("c.com","b.com","","Email Reception","sb"));
        emails.add(new Email("c.com","b.com","","Email Other","sb"));
        emails.add(new Email("a.com","b.com","","Email Cv","sub"));
        emails.add(new Email("a.com","b.com","","Email Cv","sub"));
        //to store the particular list
        List<Email> spamList=new ArrayList<>();
        List<Email> proposalList=new ArrayList<>();
        List<Email> recepList=new ArrayList<>();
        List<Email> cvList=new ArrayList<>();

        emails.forEach(em->{
            if(em.getEmailText().contains("Promo") || em.getEmailText().contains("advertising"))
            {
                em.setTo("spam@parkshark.com");
                spamList.add(em);
               // forward mail /send em
            }
            else if(em.getEmailText().contains("proposal")){
                em.setTo("sales@parkshark.com");
              proposalList.add(em);
                // forward mail /send em
            }
            else if(em.getEmailText().contains("Cv")){
                em.setTo("recruitment@parkshark.com");
                cvList.add(em);
            }
            else{
                em.setTo("reception@parkshark.com");
              recepList.add(em);
            }

        });
        //delete all emails
      /*  emails.clear();
        System.out.println("Emails has has been successfully  deleted "+emails);
*/
        // sorting the email
        System.out.println("Sorting the email");
        Collections.sort(emails, new EmailSort());
        emails.forEach(s -> System.out.println(s));


      //  System.out.println("we have sorted the "+emails.size() +" Emails");
        System.out.println(recepList.size()+" to reception");

       // System.out.println("\nThis is the amount of proposal list");
        System.out.println(proposalList.size()+" to Advertisement");

       // System.out.println("\nThis the Amount of Cv list");
        System.out.println(cvList.size()+" to Recruitment");

       // System.out.println("\nThis is the  Amount of SpamList list");
        System.out.println(spamList.size()+" to spam");

    }
}
