package opgave01;

import opgave01.models.Vault;

public class Opgave01 {
    public static void main(String[] args) {
        Vault integerVault = new Vault(42, "My password");
        Vault stringVault = new Vault("42", "My password");
        Vault doubleVault = new Vault(42.0, "My password");

        System.out.println(integerVault.getSecret("My password"));
        System.out.println(stringVault.getSecret("My password"));
        System.out.println(doubleVault.getSecret("My password"));
    }
}
