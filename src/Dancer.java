public class Dancer extends Person{
    private String groupName;
    public Dancer (String name, String designation,String groupName){
        super(name,designation);
        this.groupName=groupName;
    }
    public  void dencing(){
        System.out.println("I can dancing");
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return super.toString() + "Dancer{" +
                "groupName='" + groupName + '\'' +
                '}';
    }
}
