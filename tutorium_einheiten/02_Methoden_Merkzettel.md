# Merkzettel (für dich als Tutor) — Einheit 2: Methoden

Das ist deine eigene Vorbereitung, keine Studierenden-Unterlage.

## Recap zu Beginn (10 Min)
- Aufbau einer Methodensignatur: Visibilität, Rückgabetyp, Name, Parameter
- Was ist der Unterschied zwischen Parameter (in der Signatur) und Argument (beim Aufruf)?
- Wofür steht `void`?

## Kernbegriffe, die du erklären musst
- **Overloading vs. Overriding** — der wichtigste Begriff dieser Einheit, kommt praktisch jedes Semester in der Klausur dran:
  - Overloading: gleicher Name, unterschiedliche Parameter, **gleiche Klasse**, Entscheidung zur Compile-Zeit
  - Overriding: gleicher Name, **gleiche** Signatur, **Ober-/Unterklasse**, Entscheidung zur Laufzeit
  - Merkhilfe: "Overloading = mehr Auswahl in derselben Klasse", "Overriding = ersetzt Verhalten in der Kindklasse"
- **Call-by-Value**: Java kopiert immer den Wert. Bei primitiven Typen ist das intuitiv. Bei Objekten wird zwar die Referenz kopiert (Missverständnis: "Objekte werden by reference übergeben" — das stimmt so nicht ganz, es wird eine Kopie der Referenz übergeben). Für diese Einheit reicht die einfache Erklärung mit primitiven Typen.
- **Methodenaufruf-Reihenfolge (Aufgabe 6)**: Das ist reines "Code im Kopf durchspielen". Empfehlung: An der Tafel wie einen Call-Stack durchgehen — welche Methode ruft was auf, wann kommt der `print`-Befehl dran. Das ist die schwierigste Aufgabe der Einheit, plane dafür mehr Erklärzeit ein.

## Typische Fehler der Studierenden
- Bei Aufgabe 6 (Programmverständnis) vergessen sie, dass ein `System.out.print()` sofort beim Erreichen der Zeile ausgeführt wird — nicht erst am Ende der Methode
- Verwechseln Overloading mit Overriding in der Definition (typische Klausur-Fangfrage)
- Bei Rückgabewert-Methoden (Aufgabe 3/4): `return` vergessen oder an falscher Stelle (z.B. nur im `if`-Zweig, nicht im `else`)

## Roter Faden für die Erklärung
1. Erst den Aufbau einer Methode wiederholen (Signatur/Rumpf) — Basis für alles Weitere
2. Overloading/Overriding als Theorie-Block klären (Aufgabe 1), bevor Programmieraufgaben kommen
3. Rückgabewert-Methoden üben (Aufgabe 3/4) — einfacher Einstieg
4. Die Programmverständnis-Aufgabe (Aufgabe 6) als Highlight/Abschluss — am besten gemeinsam an der Tafel lösen, nicht nur allein schreiben lassen

## Falls Zeit knapp wird (90 statt 120 Min)
Aufgabe 4 (`ceiling()`) ist strukturell fast identisch zu Aufgabe 3 (`largest()`) — kann bei Zeitdruck gestrichen oder als Hausaufgabe mitgegeben werden, ohne dass ein neues Konzept fehlt.
