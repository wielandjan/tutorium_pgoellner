# Musterlösungen — Einheit 2: Methoden

**Aufgabe 1:**
- **Overloading**: Mehrere Methoden mit demselben Namen, aber unterschiedlicher Signatur (Anzahl, Reihenfolge oder Typ der Parameter). Sie befinden sich in derselben Klasse. Welche Methode aufgerufen wird, entscheidet sich anhand der übergebenen Parameter zur Compile-Zeit.
- **Overriding**: Eine Unterklasse definiert eine Methode mit exakt derselben Signatur wie eine Methode ihrer Oberklasse und überschreibt damit deren Verhalten. Welche Methode ausgeführt wird, entscheidet sich zur Laufzeit anhand des tatsächlichen Objekttyps.

**Aufgabe 2:**
1. Visibilität — 2. Rückgabetyp — 3. Name — 4. Übergabeparameter
Zusatz: Der Code kompiliert nicht — bei `void` darf kein Wert mit `return` zurückgegeben werden.

**Aufgabe 3:**
```java
int largest(int a, int b, int c) {
    int max = a;
    if (b > max) {
        max = b;
    }
    if (c > max) {
        max = c;
    }
    return max;
}
```

**Aufgabe 4:**
```java
int ceiling(double x) {
    int truncated = (int) x;
    if (x > truncated) {
        return truncated + 1;
    }
    return truncated;
}
```

**Aufgabe 5:**
1. Der Methode wird immer eine Kopie des übergebenen Wertes (nicht die Original-Variable selbst) bereitgestellt.
2. Nein — bei primitiven Datentypen wird die Original-Variable nicht verändert (bei Objekt-Referenzen wird zwar auch nur die Referenz kopiert, aber über die Kopie kann trotzdem das referenzierte Objekt verändert werden — reine Neuzuweisung der Referenz betrifft aber nie die Original-Variable).

**Aufgabe 6:**
Ablauf: `S` → `prepare(3)` → `checkStock(3)`: 3>2 → `T` → `announce()`: `getDefaultVolume()` → `V`, dann `announce(42)` → `A`, dann `N` → zurück in `prepare`: `P` → zurück in `run`: `finish()` → `E` → `H`

Ausgabe: **S T V A N P E H**

Voraussetzung für gültiges Overloading: Die Methoden müssen sich in Anzahl, Reihenfolge oder Typ der Parameter unterscheiden (nicht nur im Rückgabetyp oder Parameternamen).
