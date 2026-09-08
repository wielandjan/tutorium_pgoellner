# Merkzettel (für dich als Tutor) — Einheit 5: Polymorphie, Interfaces, Abstrakte Klassen, Exceptions

Das ist deine eigene Vorbereitung, keine Studierenden-Unterlage.

## Recap zu Beginn (10 Min)
- Was bedeutet Polymorphie ("Vielgestaltigkeit")?
- Was ist der Unterschied zwischen Interface und abstrakter Klasse (aus der Vorlesung)?
- Was ist eine Exception?

## Kernbegriffe, die du erklären musst
- **Polymorphie**: Ein Objekt kann gleichzeitig mehrere Typen "sein" — seine eigene Klasse, alle Oberklassen, und alle implementierten Interfaces. Die Variable links vom `=` bestimmt, WAS man aufrufen darf, das Objekt rechts bestimmt, WELCHES Verhalten tatsächlich läuft (bei überschriebenen Methoden).
- **Upcasting vs. Downcasting**:
  - Upcasting (spezifisch → allgemein, z.B. `Shape s = new Circle();`) ist immer sicher und passiert implizit.
  - Downcasting (allgemein → spezifisch, z.B. `Circle c = (Circle) shape;`) braucht einen expliziten Cast und kann zur Laufzeit mit `ClassCastException` scheitern, wenn das Objekt tatsächlich kein `Circle` ist. Vor einem riskanten Downcast sollte mit `instanceof` geprüft werden.
  - Das ist die zentrale Falle in Aufgabe 1.3 — dort unbedingt jeden Block gemeinsam durchgehen und begründen lassen, WARUM richtig/falsch.
- **Interface vs. abstrakte Klasse**:
  - Interface: nur Methodensignaturen, keine Implementierung, keine Instanzvariablen (Ausnahme: automatisch `static final`). Eine Klasse kann beliebig viele implementieren.
  - Abstrakte Klasse: kann fertige Methoden UND Instanzvariablen UND abstrakte (leere) Methoden haben. Eine Klasse kann nur von einer erben.
  - Merksatz: "Interface sagt WAS, Klasse sagt WIE" — abstrakte Klasse ist ein Mittelding.
- **Exceptions**: `try` = riskanter Code, `catch` = Fehlerbehandlung, `finally` = läuft IMMER (auch ohne Fehler, auch nach `return` im try/catch). Checked (Unterklasse von `Exception`) müssen behandelt/deklariert werden, Unchecked (Unterklasse von `RuntimeException`) nicht zwingend.

## Typische Fehler der Studierenden
- Verwechseln, wann ein Cast automatisch/implizit passiert und wann explizit nötig ist
- Glauben, `instanceof`-Prüfung sei bei jedem Cast Pflicht (ist sie nicht — nur empfohlen, um `ClassCastException` zu vermeiden)
- Bei Interfaces: schreiben versehentlich einen Methodenrumpf ins Interface
- Bei Exceptions: `finally` als "nur im Fehlerfall" missverstehen

## Roter Faden für die Erklärung
1. Polymorphie und Klassendiagramm zuerst (Aufgabe 1) — Basis für den Rest der Einheit, hier am meisten Zeit einplanen
2. Interfaces vs. abstrakte Klassen (Aufgabe 2+3+4) im Anschluss, direkt mit Praxisbeispiel (Aufgabe 3)
3. Exceptions (Aufgabe 5+6) als eigenständigen letzten Block — thematisch unabhängig vom Rest der Einheit

## Falls Zeit knapp wird (90 statt 120 Min)
Aufgabe 4 (Theorie abstrakte Klassen) überschneidet sich inhaltlich stark mit Aufgabe 2 — kann kompakt mündlich zusammengefasst werden, statt separat schriftlich bearbeitet zu werden.
