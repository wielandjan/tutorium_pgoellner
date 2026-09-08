# Einheit 1: Verzweigungen, Schleifen, Datentypen & Casting (Kapitel 1)

Dauer: 90 Min | Format: Papier, ohne IDE/Skript, wie in der Klausur
Lösungen: siehe `01_Verzweigungen_Schleifen_Datentypen_Loesungen.md`
Tutor-Vorbereitung: siehe `01_Verzweigungen_Schleifen_Datentypen_Merkzettel.md`

---

## Aufgabe 1: Theorie — Boolesche Ausdrücke (4 Punkte)

Gib jeweils an, ob der Ausdruck `true` oder `false` ergibt. [je 1 Punkt]

1. `5 > 3 && 2 == 2`
2. `4 <= 3 || 1 != 2`
3. `!(5 == 5)`
4. `3 < 2 ^ 4 > 1` (XOR)

---

## Aufgabe 2: Programmierung — Verzweigung (5 Punkte)

Vervollständige die Methode `run()`:

1. Deklariere eine Variable vom Typ `int` und weise ihr den Wert `23` zu. [1 Punkt]
2. Prüfe, ob die Variable größer als `20` ist. Falls ja, gib `"groß"` auf der Konsole aus. [2 Punkte]
3. Falls nein, prüfe ob sie gerade ist (Modulo). Falls ja, gib `"gerade"` aus, sonst `"ungerade"`. [2 Punkte]

```
 1  void run() {
 2  
 3  
 4  
 5  
 6  
 7  
 8  
 9  
10  
11  }
```

---

## Aufgabe 3: Programmierung — Schleifen (5 Punkte)

Vervollständige die Methode `run()`, sodass mit einer Schleife alle durch 3 teilbaren Zahlen zwischen 1 und 30 (jeweils einschließlich) auf der Konsole ausgegeben werden. [4 Punkte]

Verwende zur Ausgabe die bestehende Methode `printToConsole()`, die nicht verändert werden muss. [1 Punkt]

```
 1  void run() {
 2  
 3  
 4  
 5  
 6  
 7  }
 8  
 9  void printToConsole(int x) {
10      System.out.println(x + " ist durch 3 teilbar");
11  }
```

---

## Aufgabe 4: Theorie — Schleifentypen (3 Punkte)

1. Was ist der zentrale Unterschied zwischen einer `while`-Schleife und einer `do`-Schleife? [2 Punkte]
2. Was bewirkt das Keyword `continue;` innerhalb einer Schleife? [1 Punkt]

---

## Aufgabe 5: Programmverständnis — Arithmetik & Casting (6 Punkte)

Gib jeweils an, welcher Wert in die Variable `a` gespeichert wird. Jede Zeile ist unabhängig zu betrachten. [je 1 Punkt]

1. `int a = 7 / 2;`
2. `double a = 7 / 2;`
3. `double a = 7.0 / 2;`
4. `int a = (int) 4.9;`
5. `int a = (int) (2.5 + 2.5);`
6. `double a = 5 * (int) (1.9 + 1.9);`

---

## Aufgabe 6: Theorie — Datentypen (4 Punkte)

1. Nenne zwei primitive Ganzzahl-Datentypen in Java und ihre jeweilige Größe (in Bit). [2 Punkte]
2. Warum sollte für Berechnungen mit absoluter Genauigkeit (z.B. Finanzen) weder `float` noch `double` verwendet werden? [1 Punkt]
3. Was passiert bei der automatischen Typumwandlung (Beispiel: `int` → `double`)? [1 Punkt]

---

## Aufgabe 7: Programmierung — Verschachtelte Kontrollstrukturen (6 Punkte)

Vervollständige die Methode `run()`: Gib für jede Zahl von 1 bis 20 (einschließlich) mittels einer Schleife aus, ob sie durch 3, durch 5, durch beides oder durch keines von beidem teilbar ist:
- durch 3 und 5 teilbar → `"FizzBuzz"`
- nur durch 3 teilbar → `"Fizz"`
- nur durch 5 teilbar → `"Buzz"`
- sonst → die Zahl selbst

```
 1  void run() {
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
13  }
```

**Gesamtpunkte Einheit 1: 33**
