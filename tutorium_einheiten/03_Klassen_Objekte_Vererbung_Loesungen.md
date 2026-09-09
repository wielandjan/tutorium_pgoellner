# Musterlösungen — Einheit 3: Klassen, Objekte, Kapselung, Vererbung, Klassendiagramme

**Aufgabe 1:**
1. **Falsch** — Konstruktoren werden NICHT vererbt (nur Attribute und Methoden). Eine Unterklasse muss immer einen eigenen Konstruktor haben (der aber den Konstruktor der Oberklasse über `super(...)` aufrufen kann).
2. Falsch (Java erlaubt keine Mehrfachvererbung von Klassen)
3. Falsch (private Attribute sind nur innerhalb der definierenden Klasse zugänglich)
4. Richtig (Method Overriding)
5. Falsch (sobald ein eigener Konstruktor existiert, ist der Standardkonstruktor nicht mehr automatisch vorhanden)
6. Richtig

**Aufgabe 2:**
```java
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.err.println("Ungültiger Preis: " + price);
        }
    }
}
```

**Aufgabe 3:**
1. Eine Referenz (einen "Link") auf das Objekt im Heap, nicht das Objekt selbst.
2. Ob beide Variablen auf dasselbe (identische) Objekt verweisen.
3. Mit der `equals()`-Methode.
4. `null`

**Aufgabe 4:**
```java
public class Car extends Vehicle {
    private String brand;

    public Car(int speed, String brand) {
        super(speed);
        this.brand = brand;
    }

    @Override
    public String describe() {
        return super.describe() + " (Marke: " + brand + ")";
    }
}
```

**Aufgabe 5:**
1. Die `work()`-Implementierung von `Manager` (Overriding).
2. Die `work()`-Implementierung von `Employee` (da `Developer` sie nicht überschreibt, wird die geerbte Methode verwendet).
3. Gültig — ein `Manager` IST EIN `Employee` (Polymorphie/Upcasting ist immer erlaubt).
4. Ungültig — nicht jeder `Employee` ist zwingend ein `Manager` (könnte auch ein `Developer` sein); ohne expliziten Cast kompiliert das nicht.
