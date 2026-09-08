# Musterlösungen — Einheit 5: Polymorphie, Interfaces, Abstrakte Klassen, Exceptions

**Aufgabe 1:**
1. 3 Typen: `Circle`, `Shape`, `Drawable`
2. Polymorphie
3.
   - Block A: **Korrekt** — `Circle` IST EIN `Shape` (Upcasting erlaubt).
   - Block B: **Korrekt** — `Square` implementiert `Drawable`.
   - Block C: **Falsch** — ein `Shape`-Objekt ist nicht garantiert ein `Circle`, das kompiliert nicht ohne expliziten Cast (und selbst mit Cast würde es hier zur Laufzeit fehlschlagen, da tatsächlich ein `Shape` erzeugt wird — zudem kann von einer abstrakten Klasse ohnehin kein Objekt erzeugt werden).
   - Block D: **Falsch** — `shape` verweist zur Laufzeit auf ein `Square`-Objekt, das kein `Circle` ist; der Cast kompiliert zwar, wirft aber eine `ClassCastException` zur Laufzeit.

**Aufgabe 2:**
1. Ein Interface enthält ausschließlich Methodensignaturen ohne Rümpfe und (üblicherweise) keine Instanzvariablen. Eine abstrakte Klasse darf sowohl vollständig implementierte Methoden als auch Instanzvariablen enthalten, zusätzlich zu abstrakten (nicht implementierten) Methoden.
2. Ja, eine Klasse kann beliebig viele Interfaces implementieren. Nein, eine Klasse kann in Java nur von maximal einer Klasse erben (keine Mehrfachvererbung von Klassen).

**Aufgabe 3:**
```java
public class Freelancer implements Payable {
    private int hoursWorked;
    private double hourlyRate;

    public Freelancer(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculatePayment() {
        return hoursWorked * hourlyRate;
    }
}
```

**Aufgabe 4:**
1. Nein, abstrakte Klassen können nicht direkt instanziiert werden.
2. Sie muss alle abstrakten Methoden der Mutterklasse implementieren (mit Methodenrumpf versehen).
3. Z.B.: Es ergibt fachlich keinen Sinn, ein Objekt des generischen/abstrakten Konzepts zu erzeugen (wie z.B. ein generisches `Bird`-Objekt); erzwingt, dass Unterklassen bestimmte Methoden selbst implementieren.

**Aufgabe 5:**
1. Richtig
2. Falsch (Unterklassen von `RuntimeException` sind "Unchecked Exceptions")
3. Richtig
4. Falsch (`finally` wird immer ausgeführt, unabhängig davon ob eine Exception auftrat)
5. Richtig
6. Richtig

**Aufgabe 6:**
```java
int readNumber() {
    try {
        return parseRiskyInput();
    } catch (NumberFormatException exception) {
        System.out.println("Ungültige Eingabe!");
        return -1;
    }
}
```
