public class Singer extends Person {
    private String bandName;

    public Singer(String name ,String designation, String bandName){
        super(name,designation);
        this.bandName=bandName;
    }
    public  void singing(){
        System.out.println("I can sing");
    }
    public  void  playGitar(){
        System.out.println("I can play gitar");
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return super.toString() + "Singer{" +
                "bandName='" + bandName + '\'' +
                '}';
    }
}
