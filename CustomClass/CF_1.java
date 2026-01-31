package CustomClass;
// Acc. to industries standard we make the variables in class as private so that no one can change/access them manually.

class Data{
    private Integer num;
    private String name;
    private InternalData internalData;
    Data(int _num, String _name, int _revenue) {
        this.num= _num;
        this.name= _name;
        this.internalData= new InternalData(_revenue);
    }
    public void setNum(Integer _num){
        this.num= _num;
    }
    public void setName(String _name){
        this.name= _name;
    }
    public Integer getNum(){
        return num;
    }
    public String getName(){
        return name;
    }
    public Integer getRevenue(){
        return internalData.revenue;
    }
}

class InternalData{
    public Integer revenue;
    InternalData(Integer _revenue){
        this.revenue= _revenue;
    }
}

public class CF_1 {
    static void main(String[] args) {
        Data obj1= new Data(9, "Deepanshu", 1000);
        Data obj2= new Data(9, "Sharma", 500);
        obj1.setName("Apeksha");
        System.out.println(obj1.getRevenue());
    }
}
