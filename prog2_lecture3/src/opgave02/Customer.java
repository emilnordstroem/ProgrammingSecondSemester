package opgave02;

public class Customer implements Comparable<Customer>{
    private String fornavn;
    private String efternavn;
    private String alder;

    public Customer(String fornavn, String efternavn, String alder) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.alder = alder;
    }

    @Override
    public int compareTo(Customer customer) {
        int result = this.efternavn.compareTo(customer.getEfternavn());
        if(result == 0){
            return this.fornavn.compareTo(customer.getFornavn());
        } else {
            return result;
        }
    }

    @Override
    public String toString(){
        return String.format("%s %s (%s)%n",
                fornavn, efternavn, alder);
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public String getAlder() {
        return alder;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public void setAlder(String alder) {
        this.alder = alder;
    }
}
