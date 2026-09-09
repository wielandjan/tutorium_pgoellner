# Einheit 2: Methoden — Overloading, Overriding, Rückgabewerte, Programmverständnis (Kapitel 2, Teil 1)

*Hinweis zu den Code-Kästen: Die Zahlen links sind nur Zeilennummern zur Orientierung (z.B. für Fragen wie "was steht in Zeile 5?") und kein Teil des Codes. Trage deine Lösung in die leeren Zeilen ein.*

---

## Aufgabe 1: Theorie — Method Overloading vs. Overriding (4 Punkte)

Erkläre die Begriffe. Der Unterschied soll deutlich werden. [je 2 Punkte]

**Overloading:**




**Overriding:**




---

## Aufgabe 2: Theorie — Aufbau einer Methode (4 Punkte)

Benenne die vier markierten Bestandteile der folgenden Methodensignatur: [je 1 Punkt]

```java
public int putManyBeepers(int numberOfBeepers)
//  (1)   (2)             (3) (4)
```

(1):

(2):

(3):

(4):

Was passiert, wenn eine Methode als Rückgabetyp `void` deklariert, aber trotzdem `return 5;` verwendet? [1 Punkt zusätzlich, insgesamt 5]



---

## Aufgabe 3: Programmierung — Methode mit Rückgabewert (7 Punkte)

Erstelle die Methode `largest()`, die drei Ganzzahlen (`a`, `b`, `c`) als Übergabeparameter annimmt und den größten Wert zurückgibt. Es kann davon ausgegangen werden, dass immer drei unterschiedliche Werte übergeben werden.

Beispiele:
```
largest(3, 2, 1)   → 3
largest(-1, 7, 5)  → 7
largest(-7, -3, -1) → -1
```

```
 1  int largest(int a, int b, int c) {
 2  
 3  
 4  
 5  
 6  
 7  
 8  
 9  
10  }
```

---

## Aufgabe 4: Programmierung — Methode mit Rückgabewert (4 Punkte)

Entwickle die Methode `ceiling()`, welche eine positive Dezimalzahl (`double`) entgegennimmt und als Ergebnis die aufgerundete natürliche Zahl (`int`) zurückgibt (ohne `Math.ceil()` zu verwenden).

Beispiele:
```
ceiling(1.0) → 1
ceiling(3.2) → 4
ceiling(8.9) → 9
```

```
 1  int ceiling(double x) {
 2  
 3  
 4  
 5  
 6  
 7  }
```

---

## Aufgabe 5: Theorie — Call-by-Value (3 Punkte)

Java übergibt Parameter nach dem Call-by-Value-Prinzip.

1. Was bedeutet das? [2 Punkte]


2. Wird die Original-Variable in der aufrufenden Methode verändert, wenn die aufgerufene Methode den übergebenen Parameter innerhalb ihres Rumpfes verändert? [1 Punkt]


---

## Aufgabe 6: Programmverständnis — Aufruf-Reihenfolge (7 Punkte)

In welcher Reihenfolge werden die Buchstaben auf der Konsole ausgegeben, wenn `run()` aufgerufen wird? [5 Punkte]

Welche Voraussetzung muss erfüllt sein, damit zwei Methoden mit demselben Namen (wie `announce()` hier) gültiges Overloading sind? [2 Punkte]

```
 1  void run() {
 2      System.out.print("S");
 3      prepare(3);
 4      finish();
 5      System.out.print("H");
 6  }
 7  
 8  void prepare(int count) {
 9      checkStock(count);
10      announce();
11      System.out.print("P");
12  }
13  
14  void checkStock(int count) {
15      if (count > 2) {
16          System.out.print("T");
17      } else {
18          System.out.print("F");
19      }
20  }
21  
22  int getDefaultVolume() {
23      System.out.print("V");
24      return 42;
25  }
26  
27  void announce(int volume) {
28      System.out.print("A");
29  }
30  
31  void announce() {
32      announce(getDefaultVolume());
33      System.out.print("N");
34  }
35  
36  void finish() {
37      System.out.print("E");
38  }
```

Antwort (Reihenfolge der Buchstaben):



Voraussetzung für gültiges Overloading:



**Gesamtpunkte Einheit 2: 30**
