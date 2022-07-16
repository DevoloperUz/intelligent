package extraTasks.emailApp;

public class Email {
    private String subject;
    private String message;
    private User sender;  // jo'natuvchi
    private User receiver;  // qabul qiluvchi
    private boolean status; // true - unread; false - read;

    public Email(String subject, String message, User sender, User receiver, boolean status) {
        this.subject = subject;
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Email{" +
                "subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", status=" + status +
                '}';
    }
}
