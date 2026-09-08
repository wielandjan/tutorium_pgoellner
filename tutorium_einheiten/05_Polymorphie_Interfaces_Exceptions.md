# Einheit 5: Polymorphie, Interfaces, Abstrakte Klassen, Exceptions (Kapitel 3, Teil 2)

Dauer: 90 Min | Format: Papier, ohne IDE/Skript, wie in der Klausur
Lösungen: siehe `05_Polymorphie_Interfaces_Exceptions_Loesungen.md`
Tutor-Vorbereitung: siehe `05_Polymorphie_Interfaces_Exceptions_Merkzettel.md`

---

## Aufgabe 1: Theorie & Programmverständnis — Polymorphie und Klassendiagramm (8 Punkte)

Gegeben ist folgendes Klassendiagramm (Hinweise: `Shape` ist eine abstrakte Klasse. `Drawable` ist ein Interface. `Circle` und `Square` erweitern `Shape` und implementieren `Drawable`):

```
        <<abstract>>            <<interface>>
          Shape                   Drawable
       /         \                    ^
   Circle       Square  ------implements-------/
```

1. Wie viele verschiedene Typen hat ein Objekt der Klasse `Circle` (ausgenommen `java.lang.Object`)? [1 Punkt]


2. Wie nennt man den Mechanismus, der ermöglicht, dass ein Objekt mehrere Typen gleichzeitig hat? [1 Punkt]


3. Bewerte, ob die folgenden Code-Blöcke jeweils korrekt sind (kompilieren) oder nicht. Betrachte jeden Block unabhängig. [je 1,5 Punkte, insgesamt 6 Punkte]

| Code-Block | Korrekt | Falsch |
|---|---|---|
| A: `Shape shape = new Circle();` | | |
| B: `Drawable d = new Square();` | | |
| C: `Circle c = new Shape();` | | |
| D: `Shape shape = new Square(); Circle circle = (Circle) shape;` | | |

---

## Aufgabe 2: Theorie — Interfaces vs. Abstrakte Klassen (5 Punkte)

1. Was ist der zentrale Unterschied zwischen einem Interface und einer abstrakten Klasse hinsichtlich Methodenrümpfen und Instanzvariablen? [3 Punkte]



2. Kann eine Klasse mehrere Interfaces gleichzeitig implementieren? Kann sie von mehreren Klassen gleichzeitig erben? [2 Punkte]


---

## Aufgabe 3: Programmierung — Interface & Implementierung (7 Punkte)

Gegeben ist folgendes Interface:

```java
public interface Payable {
    double calculatePayment();
}
```

Erstelle die Klasse `Freelancer`, die `Payable` implementiert: [7 Punkte]
1. Private Attribute `hoursWorked` (`int`) und `hourlyRate` (`double`). [2 Punkte]
2. Konstruktor, der beide Werte setzt. [2 Punkte]
3. Implementierung von `calculatePayment()`, die `hoursWorked * hourlyRate` zurückgibt. [3 Punkte]

```
 1  public class Freelancer implements Payable {
 2  
 3  
 4  
 5  
 6  
 7  
 8  
 9  
10  
11  
12  }
```

---

## Aufgabe 4: Theorie — Abstrakte Klassen (4 Punkte)

1. Kann von einer abstrakten Klasse direkt ein Objekt mittels `new` erzeugt werden? [1 Punkt]


2. Was muss eine konkrete (nicht-abstrakte) Unterklasse einer abstrakten Klasse zwingend tun, wenn diese eine abstrakte Methode enthält? [2 Punkte]


3. Nenne einen Grund, warum man eine Klasse als abstrakt markiert. [1 Punkt]


---

## Aufgabe 5: Theorie — Richtig/Falsch zu Exceptions (6 Punkte)

Kreuze an, ob die Aussage richtig oder falsch ist. [je 1 Punkt]

| Aussage | Richtig | Falsch |
|---|---|---|
| 1. Man behandelt Exceptions mit Try-Catch-Konstrukten. | | |
| 2. Unterklassen von `RuntimeException` bezeichnet man als "Checked Exceptions". | | |
| 3. Dass eine Methode eine Exception werfen kann, wird mittels des Keywords `throws` in der Signatur deklariert. | | |
| 4. Ein `finally`-Block wird nur ausgeführt, wenn eine Exception aufgetreten ist. | | |
| 5. Zu einem `try`-Block können mehrere `catch`-Blöcke für unterschiedliche Exception-Typen gehören. | | |
| 6. Wenn im `try`-Block eine Exception auftritt, die von keinem `catch`-Block abgefangen wird, wird sie an die aufrufende Methode weitergegeben. | | |

---

## Aufgabe 6: Programmierung — Exceptions (5 Punkte)

Vervollständige die Methode `readNumber()`, welche eine riskante Methode `parseRiskyInput()` aufruft, die eine `NumberFormatException` werfen kann. Falls diese Exception auftritt, soll auf der Konsole `"Ungültige Eingabe!"` ausgegeben und `-1` zurückgegeben werden. [5 Punkte]

```
1  int parseRiskyInput() throws NumberFormatException {
2      // gegeben, nicht verändern
3  }
4  
5  int readNumber() {
6  
7  
8  
9  
10  }
```

**Gesamtpunkte Einheit 5: 35**
