public class Email{

    private String to;
    private String from;
    private String cc;
    private String emailText;
    private String subject;

    public Email() {
    }

    public Email(String to, String from, String cc, String emailText, String subject) {
        this.to = to;
        this.from = from;
        this.cc = cc;
        this.emailText = emailText;
        this.subject = subject;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getEmailText() {
        return emailText;
    }

    public void setEmailText(String emailText) {
        this.emailText = emailText;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Email{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", cc='" + cc + '\'' +
                ", emailText='" + emailText + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }


}
