package Ann.com;

public class Student {
    String name;
    int english;
    int math;
    public Student(String name){
        this.name=name;
    }
    public Student(String name,int english,int math){
        this(name);
        this.english=english;
        this.math=math;
    }
    public void print(){
        System.out.print(name+"\t"+english+"\t"+math+"\t"+getAverage());
        if(getAverage()<60){
            System.out.print("*");
        }
        System.out.println();
    }
    public int getAverage(){
        return(english+math)/2;
    }
}
