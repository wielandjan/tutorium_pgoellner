# Merkzettel (für dich als Tutor) — Einheit 3: Klassen, Objekte, Kapselung, Vererbung, Klassendiagramme

Das ist deine eigene Vorbereitung, keine Studierenden-Unterlage.

## Recap zu Beginn (10 Min)
- Klasse = Bauplan, Objekt = konkrete Instanz davon
- Was macht ein Konstruktor? Kann eine Klasse mehrere Konstruktoren haben?
- Warum kapselt man Attribute (`private` + Getter/Setter) statt sie `public` zu machen?
- Unterschied Instanzvariable vs. Klassenvariable (`static`)

## Kernbegriffe, die du erklären musst
- **Referenz vs. Wert**: Objekt-Variablen speichern nur eine Referenz (Verweis) auf das Objekt im Heap, nicht das Objekt selbst. Zwei Variablen können auf dasselbe Objekt zeigen. Am besten mit einer einfachen Skizze zeigen (Variable → Pfeil → Objekt im Heap).
- **`==` vs. `equals()`**: `==` bei Objekten vergleicht, ob es sich um dasselbe Objekt handelt (Referenzgleichheit), nicht ob der Inhalt gleich ist. `equals()` prüft inhaltliche Gleichheit. Klassischer Klausur-Stolperstein.
- **Kapselung**: Nicht nur "Getter/Setter schreiben", sondern der SINN dahinter — Validierung im Setter verhindert ungültige Zustände (siehe Aufgabe 2: negativer Preis wird abgelehnt).
- **Vererbung (`extends`)**: "IST EIN"-Beziehung. Unterklasse erbt alles außer `private` Member. `super(...)` ruft den Konstruktor der Oberklasse auf — muss immer die erste Zeile im Unterklassen-Konstruktor sein, wenn verwendet.
- **Overriding im Kontext von Vererbung** (Aufgabe 5): Zur Laufzeit wird immer die Methode der "untersten" Klasse in der Vererbungshierarchie verwendet, die die Methode überschreibt (dynamisches Binden).
- **Statische Variablen/Methoden (`static`)**: Eine Instanzvariable existiert pro Objekt separat (jedes `Product` hat seinen eigenen `price`). Eine `static`-Variable existiert nur EINMAL für die gesamte Klasse, alle Objekte teilen sich denselben Wert. Statische Methoden können ohne `new`/ohne Objekt aufgerufen werden (z.B. `Math.max(...)`). Kommt aktuell in keiner Übungsaufgabe vor, ist aber laut Vorlesungs-Curriculum klausurrelevant — kurz mit einem Beispiel erklären (z.B. ein Zähler, der mitzählt wie viele Objekte insgesamt erzeugt wurden).
- **Konstruktor-Overloading**: Eine Klasse kann mehrere Konstruktoren haben, die sich (wie bei Method-Overloading) in Anzahl/Typ der Parameter unterscheiden — z.B. ein leerer Konstruktor und einer mit Werten.
- **Assoziation vs. Komposition**: Referenziert eine Klasse eine andere (z.B. `Zoo` hat eine Variable vom Typ `Duck`), nennt man das Assoziation. Komposition ist eine besondere Assoziation, bei der die Existenz der Teile von der Existenz des Ganzen abhängt (z.B. ein `Room` existiert nur im Kontext eines `House`).

## Typische Fehler der Studierenden
- Bei Aufgabe 2 vergessen sie, dass der Setter NICHT einfach zuweisen, sondern erst validieren soll
- Bei Aufgabe 4 (`Car extends Vehicle`) vergessen sie `super(speed)` im Konstruktor aufzurufen — Klassiker!
- Bei Aufgabe 4.2 schreiben sie den kompletten String neu, statt `super.describe()` wiederzuverwenden (Redundanz vermeiden ist Teil der Bewertung)
- Bei Aufgabe 5.3/5.4 (Ist die Zuweisung gültig?) verwechseln sie Ober-/Unterklasse-Richtung — Merkregel: "Die allgemeinere Klasse links ist immer ok (Upcasting), die spezifischere links braucht einen Cast und ist nicht garantiert sicher"

## Roter Faden für die Erklärung
1. Kurzer Reminder Klasse/Objekt/Konstruktor, dann direkt Aufgabe 1 (Richtig/Falsch) als Aufwärmen
2. Aufgabe 2 (Kapselung) — zeigt den Sinn von `private` + Validierung
3. Aufgabe 3 (Referenzen) dazwischen als Theorie-Pause
4. Aufgabe 4+5 (Vererbung) als Hauptteil, hier am meisten Zeit einplanen — das ist die Basis für Polymorphie in Einheit 5

## Falls Zeit knapp wird (90 statt 120 Min)
Aufgabe 3 (Theorie Objektreferenzen) kann kompakt im Plenum mündlich behandelt werden statt schriftlich bearbeitet zu werden — spart Zeit, ohne den Inhalt zu verlieren.
