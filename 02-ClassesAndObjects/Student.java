// Zadania 7-11

// class Student{
//     String name;
//     int age;

//     public void sayHello(){
//         System.out.println("Hi!");
//     }

//     public void displayName(){
//         System.out.println("My names " + name);
//     }

//     public void displayAge(){
//         System.out.println("I'm " + age + " years old");
//     }

//     public static void main(String[] args) {
//         Student first_st = new Student();
//         first_st.name = "Alex";
//         first_st.age = 19;

//         Student second_st = new Student();
//         second_st.name = "Shrek";
//         second_st.age = 18;

//         first_st.sayHello();
//         second_st.sayHello();

//         first_st.displayName();
//         second_st.displayName();

//         first_st.displayAge();
//         second_st.displayAge();
//     }
// }

class Student{
    String name;
    String student_card;
    Boolean is_valid_card;
    int semestr;
    double average_gr;

    public void displayPublicInfo() {
        System.out.println("Name: " + name + " Semestr: " + semestr + " Average grade: " + average_gr);
    }

    public void changeCard(String new_id, Boolean valid){
        this.student_card = new_id;
        this.is_valid_card = valid;
    }

    public void displayPrivateInfo() {
        System.out.println("Name: " + name + " ID student card: " + student_card + (is_valid_card ? " Card is valid" : " Card is not valid"));
    }
    public static void main(String[] args) {
        
        //Firts Student
        Student first_st = new Student();
        first_st.name = "Alex";
        first_st.student_card = "223166";
        first_st.is_valid_card = true;
        first_st.semestr = 3;
        first_st.average_gr = 4.3;

        //Second Student
        Student second = new Student();
        second.name = "Shrek";
        second.student_card = "777555";
        second.is_valid_card = false;
        second.semestr = 1;
        second.average_gr = 3.3;

        // //Display Public Info
        // first_st.displayPublicInfo();
        // second.displayPublicInfo();

        // //Change Student Card
        // first_st.changeCard("111111", false);
        // first_st.displayPrivateInfo();

        // //Display Private Info
        // first_st.displayPrivateInfo();
        // second.displayPrivateInfo();

    }
}

