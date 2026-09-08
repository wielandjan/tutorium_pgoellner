# Merkzettel (für dich als Tutor) — Einheit 1: Verzweigungen, Schleifen, Datentypen & Casting

Das ist deine eigene Vorbereitung, keine Studierenden-Unterlage.

## Recap zu Beginn (10 Min) — diese Begriffe im Plenum abfragen
- Was ist ein Boolescher Ausdruck? (Ergibt immer `true`/`false`)
- Unterschied `if`/`else if`/`else` vs. `switch`
- Die drei Schleifentypen: `for`, `while`, `do-while` — wann nimmt man welche?
- Was bedeutet `break;` vs. `continue;`?

## Kernbegriffe, die du erklären musst
- **Boolesche Verknüpfungen**: `&&` (UND, beide müssen wahr sein), `||` (ODER, mind. eine wahr), `^` (XOR, genau eine wahr), `!` (Negation). Studierende verwechseln oft `&&`/`||` mit den Bit-Operatoren `&`/`|` — kurz erwähnen, dass es die auch gibt, aber hier nicht relevant sind.
- **`while` vs. `do-while`**: Der einzige Unterschied ist, WANN die Bedingung geprüft wird (vorher/nachher). Am besten mit einem Beispiel zeigen, bei dem die Bedingung von Anfang an `false` ist — bei `while` läuft der Rumpf 0×, bei `do-while` mindestens 1×.
- **Integer-Division**: `int a = 7 / 2;` ergibt `3`, nicht `3.5`! Das ist der häufigste Stolperstein in Einheit 1. Wichtig: Die Division wird zuerst als `int`-Division ausgeführt, BEVOR eine eventuelle Umwandlung zu `double` stattfindet (siehe Aufgabe 5.2 im Aufgabenblatt: `double a = 7 / 2;` → `3.0`, NICHT `3.5`).
- **Casting-Reihenfolge**: `(int)` wirkt nur auf den unmittelbar folgenden Ausdruck bzw. die Klammer danach — bei `(int) 2.5 + 2.5` wird nur `2.5` gecastet, bei `(int) (2.5 + 2.5)` die Summe.
- **Automatische Typumwandlung** funktioniert nur "aufwärts" (kleiner → größer: byte→short→int→long→float→double), niemals automatisch abwärts.

## Typische Fehler der Studierenden
- Vergessen von Semikolons/geschweiften Klammern (in der Klausur werden dafür Punkte abgezogen — deshalb im Tutorium konsequent korrigieren)
- `=` statt `==` in Bedingungen verwechseln
- Bei Aufgabe 7 (FizzBuzz-Variante): Reihenfolge der Bedingungen falsch (zuerst auf `%3==0 && %5==0` prüfen, sonst wird nie "FizzBuzz" erreicht, weil `%3==0` schon vorher greift)

## Roter Faden für die Erklärung
1. Boolesche Ausdrücke isoliert einführen (Aufgabe 1), bevor es in Verzweigungen geht
2. Verzweigung (Aufgabe 2) vor Schleifen (Aufgabe 3) behandeln — Studierende brauchen if/else als Baustein für die Schleifenkörper danach
3. Datentypen/Casting (Aufgabe 5/6) bewusst ans Ende — baut auf nichts anderem auf, kann bei Zeitdruck als Hausaufgabe mitgegeben werden

## Falls Zeit knapp wird (90 statt 120 Min)
Aufgabe 6 (Theorie Datentypen, reines Auswendigwissen) eignet sich am besten zum Streichen/als Hausaufgabe — sie erfordert keine Live-Erklärung, nur Nachlesen im Skript.
