# Einheit 4: Arrays & Rekursion (Kapitel 3, Teil 1)

*Hinweis zu den Code-Kästen: Die Zahlen links sind nur Zeilennummern zur Orientierung (z.B. für Fragen wie "was steht in Zeile 5?") und kein Teil des Codes. Trage deine Lösung in die leeren Zeilen ein.*

---

## Aufgabe 1: Programmierung — Array-Grundlagen (5 Punkte)

Vervollständige die untenstehende `run()`-Methode:

1. Deklariere und instanziiere ein Array, welches 50 `String`-Werte aufnehmen kann. [2 Punkte]
2. Speichere den bestehenden Text `greeting` an der ersten Index-Position des Arrays ab. [1 Punkt]
3. Was liefert ein Lesezugriff auf eine Array-Position zurück, an der noch kein Wert abgelegt wurde (bei einem Objekt-Array)? [1 Punkt]
4. Nenne einen Hauptnachteil von Arrays gegenüber flexibleren Datenstrukturen. [1 Punkt]

```
 1  String greeting = "Hallo";
 2  
 3  void run() {
 4  
 5  
 6  
 7  }
```

Antwort 3:

Antwort 4:

---

## Aufgabe 2: Programmierung — Array-Iteration & Aggregation (6 Punkte)

Entwickle die Methode `sum()`, die ein `int`-Array entgegennimmt und die Summe aller Zahlen als Rückgabewert liefert.

Beispiele:
```
sum([1, 2, 3])     → 6
sum([-1, 5, 4])    → 8
sum([0, 0])        → 0
```

```
 1  int sum(int[] numbers) {
 2  
 3  
 4  
 5  
 6  
 7  
 8  }
```

---

## Aufgabe 3: Programmierung — Array-Verarbeitung (7 Punkte)

Entwickle die Methode `max()`, die ein `int`-Array (mit Länge größer Null) entgegennimmt und den größten enthaltenen Wert zurückgibt.

Beispiele:
```
max([3, 7, 2])       → 7
max([-5, -1, -9])    → -1
max([4])             → 4
```

```
 1  int max(int[] numbers) {
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

## Aufgabe 4: Theorie — Array vs. ForEach (4 Punkte)

1. Schreibe die allgemeine Syntax einer ForEach-Schleife über ein Array `values` vom Typ `int[]`. [2 Punkte]

```
1  
2  
3  
```

2. Nenne einen Vorteil und einen Nachteil der ForEach-Schleife gegenüber der klassischen `for`-Schleife bei Arrays. [2 Punkte]



---

## Aufgabe 5: Theorie — Rekursion (2 Punkte)

Erkläre kurz, was eine rekursive Methode ist. [2 Punkte]



---

## Aufgabe 6: Programmierung — Rekursion (6 Punkte)

Implementiere die Methode `sumUpTo()` **rekursiv**, die die Summe aller natürlichen Zahlen von 1 bis n berechnet (n > 0).

Beispiele:
```
sumUpTo(1) → 1
sumUpTo(3) → 6   (1+2+3)
sumUpTo(5) → 15  (1+2+3+4+5)
```

```
1  int sumUpTo(int n) {
2  
3  
4  
5  
6  }
```

---

## Aufgabe 7: Programmierung — Rekursion (7 Punkte)

Implementiere die Methode `countDown()` **rekursiv**, die die Zahlen von `n` bis `1` absteigend auf der Konsole ausgibt (eine Zahl pro Zeile) und danach `"Start!"` ausgibt. Für `n <= 0` soll direkt nur `"Start!"` ausgegeben werden.

Beispiel für `countDown(3)`:
```
3
2
1
Start!
```

```
1  void countDown(int n) {
2  
3  
4  
5  
6  
7  
8  }
```

**Gesamtpunkte Einheit 4: 37**
