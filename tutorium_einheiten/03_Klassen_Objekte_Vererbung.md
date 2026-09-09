# Einheit 3: Klassen, Objekte, Kapselung, Vererbung, Klassendiagramme (Kapitel 2, Teil 2)

*Hinweis zu den Code-Kästen: Die Zahlen links sind nur Zeilennummern zur Orientierung (z.B. für Fragen wie "was steht in Zeile 5?") und kein Teil des Codes. Trage deine Lösung in die leeren Zeilen ein.*

---

## Aufgabe 1: Theorie — Richtig/Falsch zu Vererbung (6 Punkte)

Kreuze an, ob die Aussage richtig oder falsch ist. [je 1 Punkt]

| Aussage | Richtig | Falsch |
|---|---|---|
| 1. Unterklassen erben alle Attribute, Methoden und Konstruktoren von ihrer Oberklasse. | | |
| 2. Klassen können von beliebig vielen Klassen mittels `extends` erben (Mehrfachvererbung). | | |
| 3. Eine Unterklasse kann auf `private` Attribute der Oberklasse direkt zugreifen. | | |
| 4. Wenn eine Unterklasse eine Methode mit derselben Signatur wie die Oberklasse definiert, überschreibt sie diese automatisch. | | |
| 5. Der Standardkonstruktor einer Klasse bleibt auch dann nutzbar, wenn man einen eigenen Konstruktor schreibt. | | |
| 6. `this` referenziert innerhalb einer Instanzmethode das aktuelle Objekt selbst. | | |

---

## Aufgabe 2: Programmierung — Klasse mit Kapselung (8 Punkte)

Erstelle die Klasse `Product` mit folgenden Anforderungen:

1. Zwei private Instanzvariablen: `name` (`String`) und `price` (`double`). [2 Punkte]
2. Ein Konstruktor, der beide Werte beim Erzeugen setzt. [2 Punkte]
3. Eine Getter-Methode `getPrice()`. [1 Punkt]
4. Eine Setter-Methode `setPrice()`, die den neuen Preis nur setzt, wenn er größer oder gleich `0` ist. Sonst soll eine Fehlermeldung auf der Konsole ausgegeben werden (kein Absturz). [3 Punkte]

```
 1  public class Product {
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
12  
13  
14  
15  
16  
17  }
```

---

## Aufgabe 3: Theorie — Objektreferenzen (5 Punkte)

1. Was speichert eine Variable eines Referenztyps tatsächlich? [1 Punkt]


2. Was liefert der Operator `==` bei zwei Objekt-Variablen zurück? [2 Punkte]


3. Wie prüft man stattdessen, ob zwei Objekte inhaltlich gleich sind? [1 Punkt]


4. Was ist der Wert einer Objekt-Variable, die auf kein Objekt verweist? [1 Punkt]


---

## Aufgabe 4: Programmierung — Vererbung (7 Punkte)

Gegeben ist die Klasse `Vehicle`:

```java
public class Vehicle {
    private int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String describe() {
        return "Fahrzeug mit " + speed + " km/h";
    }
}
```

Erstelle die Klasse `Car`, die von `Vehicle` erbt: [7 Punkte]
1. `Car` soll einen Konstruktor haben, der `speed` sowie zusätzlich `brand` (`String`, privates Attribut) entgegennimmt. [3 Punkte]
2. `Car` soll die Methode `describe()` überschreiben, sodass zusätzlich die Marke ausgegeben wird, z.B. `"Fahrzeug mit 180 km/h (Marke: BMW)"`. Nutze dabei die geerbte Funktionalität von `Vehicle` wieder (kein Duplizieren des Textes). [4 Punkte]

```
 1  public class Car extends Vehicle {
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

## Aufgabe 5: Theorie & Programmverständnis — Klassendiagramm (6 Punkte)

Gegeben ist folgendes vereinfachtes Klassendiagramm (Pfeil = Vererbung):

```
        Employee
       /        \
  Manager      Developer
```

`Employee` hat die Methode `work()`. `Manager` überschreibt `work()`. `Developer` überschreibt `work()` nicht.

1. Welche `work()`-Implementierung wird ausgeführt, wenn `new Manager().work()` aufgerufen wird? [1 Punkt]


2. Welche `work()`-Implementierung wird ausgeführt, wenn `new Developer().work()` aufgerufen wird? [1 Punkt]


3. Ist folgende Zuweisung gültig? Begründe kurz. `Employee e = new Manager();` [2 Punkte]


4. Ist folgende Zuweisung gültig? Begründe kurz. `Manager m = new Employee();` [2 Punkte]


**Gesamtpunkte Einheit 3: 32**
