# Merkzettel (für dich als Tutor) — Einheit 4: Arrays & Rekursion

Das ist deine eigene Vorbereitung, keine Studierenden-Unterlage.

## Recap zu Beginn (10 Min)
- Was ist ein Array? (Container fester Größe für gleichartige Elemente)
- Wie greift man auf ein Element zu? (Index, beginnend bei 0!)
- Was ist eine rekursive Methode?

## Kernbegriffe, die du erklären musst
- **Index startet bei 0**: Das erste Element ist `array[0]`, das letzte `array[array.length - 1]`. Off-by-one-Fehler sind der häufigste Fehler bei Arrays.
- **Feste Größe**: Einmal mit `new Type[size]` instanziiert, kann die Größe nicht mehr verändert werden — das ist der "Hauptnachteil" aus Aufgabe 1.4.
- **`array.length`**: Attribut (kein Methodenaufruf, also ohne Klammern!) — anders als bei `String.length()`. Das verwirrt oft.
- **Rekursion — die zwei Pflichtbestandteile**:
  1. **Abbruchbedingung** (Base Case): Ohne sie → `StackOverflowError`
  2. **Rekursiver Aufruf**, der das Problem verkleinert (n → n-1)
  Empfehlung: An der Tafel den Call-Stack für ein kleines Beispiel (z.B. `sumUpTo(3)`) Schritt für Schritt aufmalen — hilft enorm beim Verständnis.
- **Rekursion vs. Iteration**: Kurz erwähnen, dass fast alles, was rekursiv geht, auch mit einer Schleife lösbar wäre — aber in der Klausur ist explizit "rekursiv implementieren" gefordert (siehe Aufgabe 12 in der Probeklausur), dann zählt eine Schleifen-Lösung nicht als richtig.

## Typische Fehler der Studierenden
- Bei Array-Aufgaben: `<=` statt `<` in der Schleifenbedingung (`ArrayIndexOutOfBoundsException`)
- Bei Rekursion: Abbruchbedingung vergessen oder falsch (z.B. `n == 0` statt `n <= 0`, was bei negativen Eingaben zur Endlosschleife führt)
- Bei Rekursion: Der rekursive Aufruf verkleinert das Problem nicht (z.B. `sumUpTo(n)` statt `sumUpTo(n - 1)` im rekursiven Aufruf — Endlosschleife)
- Verwechseln `return n + sumUpTo(n - 1);` mit `return sumUpTo(n - 1) + n;` — inhaltlich gleich, aber manche verstehen die Rückwärts-Auflösung des Stacks nicht und schreiben stattdessen fälschlich eine Ausgabe statt einer Rückgabe

## Roter Faden für die Erklärung
1. Arrays zuerst (Aufgabe 1–4) — konkreter und leichter zugänglich
2. Rekursion danach (Aufgabe 5–7) — abstrakter, braucht mehr Tafel-Erklärung
3. Bei Aufgabe 7 (`countDown`, mit Ausgabe UND Abbruch bei `n<=0`) explizit zeigen, dass die Abbruchbedingung auch "am Anfang" der Methode geprüft werden kann, nicht nur als Wächter vor dem rekursiven Aufruf

## Falls Zeit knapp wird (90 statt 120 Min)
Aufgabe 3 (`max()`) ist strukturell identisch zu Aufgabe 2 (`sum()`) — eine der beiden kann gestrichen/als Hausaufgabe mitgegeben werden. Bei Rekursion lieber beide Aufgaben behalten, da das Thema in der Klausur immer 8 Punkte wert ist.
