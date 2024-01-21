public class Teacher {

    String name;
    String middleName;
    String lastName;
    String subject;
    

   

    public Teacher(String lastName, String name, String middleName, String subject) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.subject = subject;
    }

    


    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return lastName + " " + name + " " + middleName +  " " + subject ;
    }

    
}
