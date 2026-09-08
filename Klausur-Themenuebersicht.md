# Klausur-Themenübersicht (sortiert nach Vorlesungs-Reihenfolge)

Basis: Skripte Kapitel 1–4 + Probeklausur "Grundlagen der Programmierung" (17 Aufgaben, 100 Punkte, 120 Min, keine Hilfsmittel).

**Sortierung: chronologisch nach Kapitel 1 → 2 → 3 → 4**, weil das Tutorium jeweils direkt nach der zugehörigen Vorlesung stattfindet. Innerhalb jedes Kapitels stehen die Themen in der Reihenfolge, in der sie im Skript vorkommen.

Für jedes Thema: Typ (Theorie = erklären/auswendig, Programmierung = Code auf Papier schreiben, Programmverständnis = Code nachvollziehen ohne IDE), Referenz-Aufgabe(n) aus der Probeklausur, Übungsidee. Punktzahl = Gewicht in der Probeklausur (zur Priorisierung der Übungszeit *innerhalb* eines Tutoriumstermins).

---

## Nach Kapitel 1 (Grundlagen: Variablen, Kontrollstrukturen)

### 1.1 Verzweigungen (if/else/switch) & Boolesche Ausdrücke
- Typ: Programmierung
- Probeklausur-Referenz: Aufg. 2 (Variable deklarieren, if-Bedingung, Konsolenausgabe) — 5 Pkt
- Übungsidee: Kurze `run()`-Methode mit if/else nachbauen — auf Papier, Syntax muss exakt sitzen (Semikolons, Klammern)

### 1.2 Schleifen (for/while/do)
- Typ: Programmierung
- Probeklausur-Referenz: Aufg. 4 (for-Schleife für gerade Zahlen in einem Bereich) — 4 Pkt
- Übungsidee: Zahlenreihen/Bereiche mit for/while ausgeben lassen, Unterschied for/while/do-while abfragen

### 1.3 Variablen, Datentypen, Arithmetik, Casting/Typumwandlung
- Typ: Programmverständnis
- Probeklausur-Referenz: Aufg. 10 (Wert von `a` berechnen — int/double-Division, explizites Casting) — 5 Pkt
- Übungsidee: Ausdrücke wie `int a = 3 / 4;` vs. `double a = 7.0 / 2;` durchrechnen lassen — Integer-Division und Casting-Fallen sind Klassiker, unbedingt üben

**Kapitel-1-Summe: ~14 Punkte**

---

## Nach Kapitel 2 (Methoden, Klassen, Objekte, Vererbung)

### 2.1 Methoden: Overloading vs. Overriding + Programmverständnis (Aufruf-Reihenfolge)
- Typ: Theorie + Programmverständnis
- Probeklausur-Referenz: Aufg. 3 (Overloading vs. Overriding erklären, 4 Pkt), Aufg. 7 (verschachtelte Methodenaufrufe, Ausgabereihenfolge auf Konsole ermitteln, 6 Pkt) — 10 Pkt gesamt
- Übungsidee: Kleine Methodenketten mit `System.out.print()` geben, Studierende spielen die Ausgabereihenfolge "im Kopf" durch (wie Aufg. 7) — sehr gute Prüfung des Kontrollflussverständnisses

### 2.2 Methoden mit Rückgabewert / Parametern
- Typ: Programmierung
- Probeklausur-Referenz: Aufg. 8 (`smallest()` — kleinsten von 3 Werten zurückgeben) — 7 Pkt
- Übungsidee: Kleine Methoden mit klarer Signatur + Beispielen vorgeben (wie in der Klausur), Studierende schreiben nur den Methodenrumpf

### 2.3 Klassen, Objekte, Konstruktoren, Kapselung (Getter/Setter)
- Typ: Theorie + Programmierung
- Probeklausur-Referenz: kein direktes Pendant in der Probeklausur, aber Grundvoraussetzung für 2.4/3.x
- Übungsidee: Klasse mit privaten Attributen + Konstruktor + Getter/Setter von Hand schreiben lassen

### 2.4 Vererbung & Klassendiagramme (Grundlagen)
- Typ: Theorie + Programmverständnis
- Probeklausur-Referenz: Aufg. 1 (Richtig/Falsch, Vererbungs-Teil, ~4 Pkt), Aufg. 11 (Klassendiagramm lesen, Typen eines Objekts bestimmen — Grundlage, Vertiefung erst in Kapitel 3)
- Übungsidee: Einfaches Klassendiagramm (Ober-/Unterklasse) vorgeben, Studierende sollen Vererbungssyntax (`extends`) und überschriebene Methoden erkennen/schreiben

**Kapitel-2-Summe: ~21 Punkte (plus Anteil an Aufg. 1/11)**

---

## Nach Kapitel 3 (Arrays, Polymorphie, Interfaces, Rekursion, Exceptions)

### 3.1 Arrays: Deklaration, Iteration, Verarbeitung
- Typ: Programmierung
- Probeklausur-Referenz: Aufg. 5 (Array deklarieren/instanziieren, Nachteil nennen, 4 Pkt), Aufg. 16 (Durchschnitt aus Array berechnen, 5 Pkt), Aufg. 17 (Array-Attribut + Iteration, Teil von 10 Pkt)
- Übungsidee: Methoden schreiben, die ein Array durchlaufen und aggregieren (Summe, Max, Min, Durchschnitt, Zählen)

### 3.2 Polymorphie, Interfaces, Abstrakte Klassen
- Typ: Theorie + Programmverständnis
- Probeklausur-Referenz: Aufg. 11 (Anzahl Typen eines Objekts, `instanceof`/Casting-Codeblöcke bewerten, 8 Pkt), Aufg. 17 (`instanceof` + Polymorphie, Teil von 10 Pkt)
- Übungsidee: Klassendiagramm mit Vererbung + Interface vorgeben; Codeblöcke mit Casting als richtig/falsch bewerten lassen (wie Aufg. 11) — Klassiker-Fehlerquelle

### 3.3 Rekursion
- Typ: Theorie + Programmierung
- Probeklausur-Referenz: Aufg. 12 (Begriff erklären + Fakultät rekursiv implementieren) — 8 Pkt
- Übungsidee: Klassiker wie Fakultät, Summe, Fibonacci rekursiv auf Papier schreiben lassen; Abbruchbedingung explizit einfordern

### 3.4 Exceptions (Grundlagen, try/catch/throws, Checked vs. Unchecked)
- Typ: Theorie
- Probeklausur-Referenz: Aufg. 1 (Richtig/Falsch-Teil zu Exceptions, ~2 Pkt)
- Übungsidee: Richtig/Falsch-Statements selbst formulieren lassen (Studierende tauschen untereinander) — trainiert genau das Klausurformat

**Kapitel-3-Summe: ~25 Punkte (plus Anteile an Aufg. 1/17)**

---

## Nach Kapitel 4 (Packages, Testing, Softwarequalität)

### 4.1 Packages, Visibility, Stack & Heap
- Typ: Theorie
- Probeklausur-Referenz: Aufg. 13 (Gründe für Packages, Fully Qualified Class Name, Stack vs. Heap Inhalt) — 6 Pkt
- Übungsidee: Visibility-Tabelle (private/package/protected/public) auswendig abfragen; Stack-vs-Heap Merkmale gegenüberstellen; Aufg. 17 (Visibility-Attribut, Teil von 10 Pkt) hier mit einbauen

### 4.2 Software-Testing (statisch/dynamisch, Testarten)
- Typ: Theorie
- Probeklausur-Referenz: Aufg. 6 (statisch vs. dynamisch, zwei Beispiele für dynamische Tests) — 6 Pkt
- Übungsidee: Begriffe Unit-, Integration-, System-, Acceptance-, Regression-, Penetration-Test unterscheiden lassen

### 4.3 Softwarequalität (ISO 25010)
- Typ: Theorie (Auswendig-Wissen)
- Probeklausur-Referenz: Aufg. 9 (5 Aspekte nennen, 3 davon erklären) — 8 Pkt
- Übungsidee: Alle 8 Aspekte (Funktionale Eignung, Zuverlässigkeit, Benutzbarkeit, Effizienz, Sicherheit, Wartbarkeit, Übertragbarkeit, Kompatibilität) auswendig abfragen + je 1 Satz Erklärung

**Kapitel-4-Summe: ~20 Punkte**

---

## Hinweise für die Tutorium-Gestaltung
- **Format konsequent an Klausur anlehnen**: Aufgaben mit Punktangabe, auf Papier, ohne Skript/IDE — wie in den "Allgemeine Hinweise" der Probeklausur gefordert.
- **Zeitdruck simulieren**: 120 Min für 100 Punkte ≈ 1,2 Min/Punkt — als Richtwert für Übungsblätter nutzbar.
- **Aufgabe 17 (10 Pkt) ist eine Sammelaufgabe** (Visibility + Array + Schleife + `instanceof` + Polymorphie) — eignet sich gut als Abschlussübung nach Kapitel 4, wenn alle Themen bereits behandelt wurden.
- **Vorlage für Übungsaufgaben**: `docs/Skript_Übungen.md` und die Java-Projekte (KarelRobot, JavaZoo) liefern zusätzlichen Übungsstoff, sollten aber für die Klausur-Simulation auf Papier-Format reduziert werden (kein Copy-Paste von Code, sondern Verständnisfragen/kleine Implementierungen).
