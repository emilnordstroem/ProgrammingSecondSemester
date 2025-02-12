package opgave01;

public class Person implements NameFormatter{
    private String firstName;
    private String middleName;
    private String surname;

    public Person(String firstName, String middleName, String surname) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
    }

    public void printName(NameFormatter formatter) {
        System.out.println(formatter.format(firstName, middleName, surname));
    }

    public char chatAt(int index){
        return 'K';
    }

    @Override
    public String format(String t1, String t2, String t3) {
        return String.format("%s %s %s",
                t1, t2, t3);
    }
}
