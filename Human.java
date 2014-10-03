class Human{
    public int age;
    public String name;
    
    // static variables are class variables
    public static int numberOfHumans = 0;

    public static void output(String text){
        System.out.println(text);
    }
    
    public void introduce(){
        output("I'm "+ name + " and I'm "+ age + " years old.");
    }
    public Human(int age, String name){
        // this is passed implicitly in non-static method
        this.age = age;
        this.name = name;
        Human.numberOfHumans++;
    }
    public void copy(Human other){
        this.age = other.age;
        this.name = other.name;
    }
    public static void main(String [] args){
        // this is my main method of execution.
        // this variable does not get pass in static method
        // because static methods are class methods
        Human vijay = new Human(30, "Vijayendra Bapte");
        vijay.introduce();
        Human tushar = new Human(25, "Tushar Bapte");
        tushar.introduce();
        tushar.copy(vijay);
        tushar.introduce();
        output("Total Humans: " + Human.numberOfHumans);
    }
}
