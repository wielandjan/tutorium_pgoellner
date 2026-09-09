# Einheit 6: Packages/Visibility/Stack&Heap, Testing, Softwarequalität + Wiederholung (Kapitel 4)

*Hinweis zu den Code-Kästen: Die Zahlen links sind nur Zeilennummern zur Orientierung (z.B. für Fragen wie "was steht in Zeile 5?") und kein Teil des Codes. Trage deine Lösung in die leeren Zeilen ein.*

---

## Aufgabe 1: Theorie — Packages (4 Punkte)

1. Nenne zwei Gründe, aus denen man Klassen in Packages organisieren sollte. [2 Punkte]


2. Was sind die Bestandteile eines Fully Qualified Class Name? Nenne ein Beispiel. [2 Punkte]


---

## Aufgabe 2: Theorie — Visibility (5 Punkte)

Fülle die Tabelle aus: Trägt sich der Zugriff auf ein `private`, `package` (default), `protected` bzw. `public` Element ein? Kreuze pro Zeile an, ob der jeweilige Zugriff erlaubt ist. [5 Punkte]

| Zugriffsart | private | package | protected | public |
|---|---|---|---|---|
| Innerhalb derselben Klasse | | | | |
| Von einer anderen Klasse im selben Package | | | | |
| Von einer Unterklasse in einem anderen Package | | | | |
| Von einer beliebigen Klasse (World) | | | | |

---

## Aufgabe 3: Theorie — Stack & Heap (4 Punkte)

1. Was wird im Stack der JVM gespeichert? Nenne zwei Beispiele. [2 Punkte]


2. Was wird im Heap gespeichert, und welcher Fehler tritt auf, wenn er überläuft? [2 Punkte]


---

## Aufgabe 4: Theorie — Software-Testing (6 Punkte)

1. Was sind statische Testverfahren? [2 Punkte]


2. Was sind dynamische Testverfahren? [2 Punkte]


3. Nenne zwei Beispiele für dynamische Testverfahren. [2 Punkte]


---

## Aufgabe 5: Theorie — Softwarequalität nach ISO 25010 (8 Punkte)

1. Nenne fünf Aspekte von Softwarequalität nach ISO 25010. [5 Punkte]

1.
2.
3.
4.
5.

2. Erkläre drei davon in je einem Satz. [3 Punkte]




---

## Aufgabe 6: Sammelaufgabe — Wiederholung über alle Kapitel (10 Punkte)

Vervollständige die untenstehende Klasse `Library` (analog zur Zoo-Aufgabe aus der Probeklausur):

1. `Library` soll ein Attribut `books` haben, auf das nur innerhalb der Klasse `Library` zugegriffen werden kann. `books` soll den Datentyp `Book`-Array haben und Platz für 20 `Book`-Objekte bieten (Wert darf direkt zugewiesen werden). [3 Punkte]
2. Vervollständige die Methode `printAllAvailable()`: Iteriere mit einer Schleife über alle Inhalte des Arrays `books`. [2 Punkte]
3. Überprüfe in jeder Iteration, ob das aktuelle Element nicht `null` ist **und** ob es vom Typ `EBook` ist (`EBook` erweitert `Book`). [3 Punkte]
4. Falls beides zutrifft, rufe die Methode `printInfo()` des Objekts auf. [2 Punkte]

Hinweis-Klassendiagramm: `Book` (Oberklasse, hat `printInfo()`) ← `EBook` (Unterklasse, überschreibt `printInfo()`).

```
 1  public class Library {
 2  
 3  
 4      public void printAllAvailable() {
 5  
 6  
 7  
 8  
 9  
10      }
11  
12  }
```

**Gesamtpunkte Einheit 6: 37**
