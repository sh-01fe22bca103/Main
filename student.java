class student  extends course{
    String name;
    String usn;
    String dept;
    String sem;
    String program;

    public student(String name,String usn,String dept,String sem,String program){
        this.name =name;
        this.usn=usn;
        this.dept = dept;
        this.sem=sem;
        this.program = program;
    }

    void get_name(){
        System.out.println("Name: "+name);
    }
    void get_usn(){
        System.out.println("Usn: "+usn);
    }
    void get_dept(){
        System.out.println("Department: "+dept);
    }
    void get_sem(){
        System.out.println("Semester: "+sem);
    }
    void get_program(){
        System.out.println("Program: "+program);
    }

    public static void main(String[] args){
        student s1 = new student("Shaheen","01fe22bca103","BCA","Fourth","BCA");
    
        s1.get_name();
        s1.get_usn();
        s1.get_dept();
        s1.get_sem();
        s1.get_program();
        s1.get_course();
        System.out.println("Marks less than 40 :");
        s1.get_marks();

}
}

 class course
 {
    String[] Course = {"Machine_learning","Software_testing","C_Sharp","Devops"};
    float[] marks = {88,35,38,66};

  
    void get_course()
    {
    System.out.println("Courses Registered:");
        for(int i=0;i<Course.length;i++){
            
            System.out.println("\t"+Course[i]);
            
        }

    }
void get_marks()
{

        for(int i=0;i<Course.length;i++)
        {
            if(marks[i]<40)
            {

            System.out.println(Course[i] + "=" + marks[i]);
}
}
}
 }