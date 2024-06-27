class A{
    int a,b,c;
}

enum students{
    Keerti,
    Ajay,
    Prinshi,
    Rohit;
    public void show(){
        System.out.println("Students are studying.....");
    }

    public String display(){
        return "Students...........";
    }
}

public class enumkey{
    public static void main(String[] args) {
        students obj = students.Keerti;
        obj.show();
        System.out.println(obj.display());

        // students obj1[] = students.values();

        // for(int i = 0; i < obj1.length; i++){
        //     System.out.println(obj1[i]);
        // }
        
        System.out.println("\nStudents List");
        for(students stu : students.values()){
            System.out.println(stu.ordinal()+1+". "+stu);
            // System.out.println(stu.name());
            // System.out.println(stu.toString());
            // System.out.println(stu.valueOf("Keerti"));
        }
    }
}