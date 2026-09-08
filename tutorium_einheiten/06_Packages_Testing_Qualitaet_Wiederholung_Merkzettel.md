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
