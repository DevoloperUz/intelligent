package extraTasks.contact;

public class Contact {
    private int id;
    private int phoneNumber;
    private String name;
    private String adress;
    private String mail;

    public Contact(int id, int phoneNumber, String name, String adress, String mail) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.adress = adress;
        this.mail = mail;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public Contact() {
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getMail() {
        return mail;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
