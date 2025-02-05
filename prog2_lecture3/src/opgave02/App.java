package opgave02;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Filling customers with objects
        Customer[] customers = constructCustomers();

        // Sorting after overridden compareTo() method in Customer class
        insertionAlgorithm(customers);
        for(Customer customer : customers){
            System.out.println(customer.toString());
        }
        System.out.printf("==================================%nLast customer%n");
        Customer lastCustomer = lastCustomer(customers);
        System.out.println(lastCustomer.toString());

        System.out.printf("==================================%nAfter customer%n");
        Customer pointCustomer = customers[25];
        System.out.println(pointCustomer.toString());
        customers = afterCustomerAlternative(customers, pointCustomer);
        for(Customer customer : customers){
            System.out.println(customer.toString());
        }
    }


    public static Customer lastCustomer(Customer[] customers){
        int length = customers.length;
        return customers[length - 1];
    }
    //===============================================================================
    // Original answer
    public static Customer[] afterCustomer(Customer[] customers, Customer customer) {
        int customerAtIndex = binarySearchAlgorithm(customers, customer);
        Customer[] customersAfter = new Customer[customers.length - customerAtIndex];
        for(int index = 0; index < customersAfter.length; index++){
            customersAfter[index] = customers[customerAtIndex];
            customerAtIndex++;
        }
        return customersAfter;
    }

    private static int binarySearchAlgorithm(Customer[] customers, Customer customer) {
        int left = 0;
        int right = customers.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            Customer candidate = customers[middle];

            int comparison = candidate.compareTo(customer);
            if (comparison == 0) {
                return middle;
            } else if (comparison > 0) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    private static Customer[] insertionAlgorithm (Customer[] unsortedCustomers) {
        // I manipulate the argument passed directly
        for(int index = 1; index < unsortedCustomers.length; index++){
            Customer candidate = unsortedCustomers[index];
            int previousIndex = index - 1;
            while(previousIndex >= 0
                    && candidate.compareTo(unsortedCustomers[previousIndex]) < 0){ // Fix here
                unsortedCustomers[previousIndex + 1] = unsortedCustomers[previousIndex];
                previousIndex -= 1;
            }
            unsortedCustomers[previousIndex + 1] = candidate;
        }
        return unsortedCustomers;
    }
    //===========================================================================
    // Alternative version
    public static Customer[] afterCustomerAlternative(Customer[] customers, Customer customer){
        ArrayList<Customer> customersAfter = new ArrayList<>();
        for(Customer currentCustomer : customers){
            if(customer.compareTo(currentCustomer) > 0){
                customersAfter.add(currentCustomer);
            }
        }
        return customersAfter.toArray(new Customer[0]);
    }
    //============================================================================

    private static Customer[] constructCustomers(){
        Customer[] customers = new Customer[50];

        customers[0] = new Customer("Anna", "Jensen", "25");
        customers[1] = new Customer("Bent", "Nielsen", "32");
        customers[2] = new Customer("Carl", "Hansen", "41");
        customers[3] = new Customer("Dorte", "Larsen", "29");
        customers[4] = new Customer("Erik", "Pedersen", "35");
        customers[5] = new Customer("Frederik", "Madsen", "28");
        customers[6] = new Customer("Gitte", "Kristensen", "31");
        customers[7] = new Customer("Hans", "Andersen", "45");
        customers[8] = new Customer("Ida", "Olsen", "23");
        customers[9] = new Customer("Jens", "Thomsen", "50");
        customers[10] = new Customer("Karen", "Christiansen", "40");
        customers[11] = new Customer("Lars", "Knudsen", "38");
        customers[12] = new Customer("Mette", "Johansen", "27");
        customers[13] = new Customer("Niels", "Sørensen", "30");
        customers[14] = new Customer("Ole", "Rasmussen", "42");
        customers[15] = new Customer("Pernille", "Iversen", "36");
        customers[16] = new Customer("Rasmus", "Møller", "34");
        customers[17] = new Customer("Sofie", "Lund", "26");
        customers[18] = new Customer("Thomas", "Simonsen", "37");
        customers[19] = new Customer("Ulla", "Jørgensen", "44");
        customers[20] = new Customer("Viktor", "Holm", "39");
        customers[21] = new Customer("William", "Damgaard", "33");
        customers[22] = new Customer("Xenia", "Laursen", "24");
        customers[23] = new Customer("Yvonne", "Bach", "31");
        customers[24] = new Customer("Zander", "Bech", "29");
        customers[25] = new Customer("Alice", "Hermansen", "35");
        customers[26] = new Customer("Brian", "Dalgaard", "30");
        customers[27] = new Customer("Cecilie", "Rømer", "32");
        customers[28] = new Customer("Dennis", "Toft", "28");
        customers[29] = new Customer("Emilie", "Skov", "41");
        customers[30] = new Customer("Frank", "Brogaard", "27");
        customers[31] = new Customer("Grethe", "Leth", "45");
        customers[32] = new Customer("Henrik", "Lind", "39");
        customers[33] = new Customer("Isabella", "Sloth", "42");
        customers[34] = new Customer("Jakob", "Storm", "38");
        customers[35] = new Customer("Katrine", "Blom", "36");
        customers[36] = new Customer("Leo", "Vestergaard", "44");
        customers[37] = new Customer("Maja", "Søndergaard", "26");
        customers[38] = new Customer("Niklas", "Højbjerg", "31");
        customers[39] = new Customer("Oskar", "Nyborg", "34");
        customers[40] = new Customer("Pia", "Dahl", "37");
        customers[41] = new Customer("Rune", "Bonde", "29");
        customers[42] = new Customer("Stine", "Berg", "30");
        customers[43] = new Customer("Tobias", "Bruun", "33");
        customers[44] = new Customer("Ursula", "Kjær", "35");
        customers[45] = new Customer("Victor", "Lange", "40");
        customers[46] = new Customer("Winnie", "Nymann", "32");
        customers[47] = new Customer("Xander", "Lykke", "28");
        customers[48] = new Customer("Yasin", "Engholm", "27");
        customers[49] = new Customer("Zoe", "Ebbesen", "39");

        return customers;
    }
}
