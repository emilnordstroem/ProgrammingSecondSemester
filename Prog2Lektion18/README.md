### Opgave 1

Implementer CondimentDecorator klasserne Milk, Mocha, Soy og Whip. Se klassediagrammet på side 92 i bogen. Tillægspriserne er:

- Milk: 0.10
- Mocha: 0.20
- Soy: 0.15
- Whip: 0.10

Se om du kan lave opgaven uden at se på løsningen side 97.

### Opgave 2

Metoden findPrimeNumbers i klassen SieveOfEratosthenes finder primtal og udskriver de sidste 100. 

Men den måler også tidsforbrug, hvilket ikke har så meget med primtal at gøre. Brud decorator pattern til at flytte tidsmålingen ud af metoden. 

Så den kode der ikke skal være i findPrimeNumbers er 

    Instant start = Instant.now();

og

    System.out.println();
    Instant finish = Instant.now();
    System.out.println(Duration.between(start, finish).toMillis() + " ms.");

### Opgave 3

Kajs biler skal have udviklet et IT-system til udlejning af biler og motorcykler. Der er allerede udviklet lidt, så man kan holde styr hvilke biler og motorcykler der er til rådighed. 

Nu skal vi have tilføjet attributterne til at holde styr på lejeprisen og hvorvidt de er udlejet eller ej. 

Vi har hørt om single responsibility princippet og tænker at udlejning detaljer ikke hører til i Vehicle klassen.
Brug decorator pattern til at tilføje de nye attributter. 