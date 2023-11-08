import java.time.LocalDate;

public class Programmer extends Person {
    private String companyName;


    public Programmer (String name, String designation,String companyName){
        super(name,designation);
        this.companyName=companyName;
    }
    public void coding (){
        System.out.println("I can coding");
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return super.toString() + "Programmer{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}

