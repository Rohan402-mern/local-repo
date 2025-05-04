package Inner;

public enum Days {
    SUNDAY("monday"),
    MONDAY("monday"),
    TUESDAY("monday"),
    WEDNESDAY("monday"),
    THUSDAY("monday"),
    FRIDAY("monday"),
    SATURDAY("monday");

    

    private Days(String lower){
        System.out.println("Our constructor was called");
        this.lower = lower;
    }

    public String getLower(){
        return lower;
    }

    private String lower;

    public void display(){
        System.out.println("Today is " + this.name() + " " + this.ordinal());
    }
}
