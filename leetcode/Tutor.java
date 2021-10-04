public class Tutor {
    private int id;
    private String name;
    private String department;
    private String address;
    public Tutor(int id, String name, String department, String address) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public String getAddress() {
        return address;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getTutor() {
        return "Id: "+getId()+"; name: "+getName()+"; address: "+getAddress()+"; department: "+getDepartment() ;
    }
}
