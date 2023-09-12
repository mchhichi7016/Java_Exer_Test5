public class Student {
    public String name;
    public int score;
    public  int number;
    /*public static int number;*/

    public boolean equals(Object obj){

        Student student = (Student) obj;

        return (this.number == student.number) && (this.name == student.name) && (this.score == student.score);

    }
}
