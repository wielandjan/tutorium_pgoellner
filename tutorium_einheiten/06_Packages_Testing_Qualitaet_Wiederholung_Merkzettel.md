# Merkzettel (für dich als Tutor) — Einheit 6: Packages/Visibility/Stack&Heap, Testing, Softwarequalität + Wiederholung

Das ist deine eigene Vorbereitung, keine Studierenden-Unterlage.

## Recap zu Beginn (10 Min)
- Wofür sind Packages da?
- Die vier Visibility-Stufen aufzählen lassen (private, package, protected, public)
- Stack vs. Heap — was liegt wo?

## Kernbegriffe, die du erklären musst
- **Visibility-Tabelle (Aufgabe 2)**: Das ist reines Auswendigwissen, aber am besten mit der Eselsbrücke "je öffentlicher das Keyword klingt, desto mehr darf zugreifen" erklären. Wichtig: `package` (default, kein Keyword) liegt zwischen `private` und `protected`.
- **Fully Qualified Class Name**: Package + Klassenname, z.B. `java.util.List` — wichtig um Namenskonflikte zu vermeiden (z.B. `java.util.List` vs. `java.awt.List`).
- **Stack vs. Heap**: Stack = Methodenaufrufe, lokale Variablen, Zwischenergebnisse (klein, pro Thread). Heap = alle Objekte (groß, geteilt). Merksatz: "Objekte leben im Heap, Referenzen darauf liegen im Stack."
- **Statisches vs. dynamisches Testen**: Statisch = Code wird NICHT ausgeführt (Review, Tools). Dynamisch = Code WIRD ausgeführt und Verhalten verglichen (Unit-, Integration-, System-, Acceptance-, Regression-, Penetration-Test).
- **ISO 25010 (Softwarequalität)**: 8 Aspekte — am besten eine Eselsbrücke oder Reihenfolge einüben, da "5 nennen" in der Klausur reines Auswendiglernen ist: Funktionale Eignung, Zuverlässigkeit, Benutzbarkeit, Effizienz, Sicherheit, Wartbarkeit, Übertragbarkeit, Kompatibilität.
- **Instanzvariable mit direkter Initialisierung**: `private Book[] books = new Book[20];` — Deklaration und Instanziierung in einer Zeile, direkt als Attribut (nicht im Konstruktor). Das wird in Aufgabe 6.1 der Sammelaufgabe gebraucht, taucht aber sonst in keiner Einheit als eigener Punkt auf — kurz zeigen, dass das bei Attributen genauso funktioniert wie bei lokalen Variablen.

## Typische Fehler der Studierenden
- Verwechseln `protected` und `package` (default) — beide erlauben Zugriff im selben Package, aber nur `protected` erlaubt zusätzlich Zugriff von Unterklassen in anderen Packages
- Denken, im Stack würden Objekte selbst gespeichert (falsch — nur Referenzen)
- Bei der Sammelaufgabe (Aufgabe 6): vergessen `instanceof` UND `!= null` zu kombinieren, oder falsche Reihenfolge der Bedingungen in der Schleife

## Roter Faden für die Erklärung
1. Packages/Visibility/Stack&Heap zuerst (Aufgabe 1–3) — reines Vorlesungs-Wiederholungswissen aus Kapitel 4
2. Testing/Softwarequalität danach (Aufgabe 4–5) — ebenfalls Theorie, aber inhaltlich unabhängig
3. Die Sammelaufgabe (Aufgabe 6) als Abschluss der GESAMTEN Tutoriumsreihe — hier kommen Visibility (Kap. 4), Arrays (Kap. 3), Schleifen (Kap. 1) und Polymorphie/`instanceof` (Kap. 3) zusammen. Nimm dir dafür bewusst mehr Zeit und lass die Studierenden laut erklären, welches Konzept aus welcher Einheit jeweils gebraucht wird — das ist die beste Generalprobe vor der echten Klausur.

## Falls Zeit knapp wird (90 statt 120 Min)
Aufgabe 3 (Stack & Heap) ist kurz und kann bei Zeitdruck mündlich im Recap-Block behandelt werden statt separat schriftlich — die Sammelaufgabe (Aufgabe 6) sollte dagegen auf keinen Fall gekürzt werden, da sie den gesamten Stoff zusammenführt.

## Weitere Kapitel-4-Themen (keine eigene Übung dazu, aber klausurfähig)
Kapitel 4 ist inhaltlich größer als die 6 Übungsaufgaben abdecken. Diese Punkte kamen in der Probeklausur nicht dran, stehen aber im Curriculum — kurz im Recap erwähnen, damit nichts fehlt, falls die echte Klausur andere Schwerpunkte setzt als die Probeklausur:

- **Imports**: `import package.Klasse;` bindet Klassen aus anderen Packages ein, damit sie mit ihrem einfachen Namen verwendet werden können. Alternative: voll-qualifizierter Name direkt im Code (unüblich, aber möglich bei Namenskonflikten).
- **JavaDoc**: Dokumentation von Klassen/Methoden/Variablen mittels spezieller Kommentar-Syntax (`/** ... */`), wird von der IDE beim Überfahren mit der Maus angezeigt. Wichtiger als reine Inline-Kommentare.
- **Debugging**: Breakpoints setzen, Programm im Debug-Modus schrittweise durchgehen, dabei Variablenwerte und Methodenaufrufe beobachten.
- **Refactoring**: Struktur des Codes verbessern OHNE die Funktionalität zu ändern (z.B. Umbenennen, Verschieben in andere Klasse). Bei Libraries/Frameworks besonders auf Rückwärtskompatibilität der public API achten.
- **Assertions**: `assert Condition: "Fehlertext";` — prüft eine Bedingung, Programm stürzt bei `false` ab. Muss beim Java-Start explizit aktiviert werden (`-ea`), sonst wirkungslos.
- **Unit-Tests & FIRST-Prinzip**: Gute Unit-Tests sind **F**ast, **I**ndependent, **R**epeatable, **S**elf-Validating, **T**imely (vor dem Code geschrieben).
- **Test-Struktur Given-When-Then** (Gherkin-Syntax): Given = Vorbedingungen/Testdaten, When = das zu testende Verhalten aufrufen, Then = Ergebnis prüfen.
- **Test Driven Development (TDD)**: Zyklus Test schreibt (rot, schlägt fehl) → Code anpassen bis Test grün wird → Refactoring (nur bei grünen Tests, nie gleichzeitig mit Test-Änderungen).
- **Clean Code Prinzipien**:
  - Boy-Scout-Rule: "Hinterlasse Code sauberer, als du ihn vorgefunden hast"
  - DRY (Don't Repeat Yourself): Redundanz vermeiden, z.B. wiederholte Werte als Konstante, wiederholte Anweisungsfolgen als Methode auslagern
  - S.O.L.I.D.: Single Responsibility, Open-Closed, Liskov Substitution, Interface Segregation, Dependency Inversion (fünf Design-Prinzipien für wartbaren Code — reicht, die Buchstaben und je ein Stichwort zu kennen)
  - KISS (Keep It Simple Stupid): möglichst einfache, unkomplizierte Lösungen bevorzugen
- **Software-Entwicklungsmodelle**: Sequenziell (Wasserfallmodell/V-Modell: Anforderung → Design → Implementierung → Test → Installation → Wartung, einmalig durchlaufen), iterativ-inkrementell (Spiralmodell: Teilprojekte, Phasen mehrfach durchlaufen), agil (Scrum: iterativ + Backlogs, TDD, Pair Programming, Continuous Integration).

Da diese Themen in den Papierübungen nicht vorkommen, reicht hier ein mündlicher Recap (Begriffe nennen lassen, kurz erklären) — keine eigene schriftliche Aufgabe nötig, außer die Gruppe wünscht sich das ausdrücklich.
