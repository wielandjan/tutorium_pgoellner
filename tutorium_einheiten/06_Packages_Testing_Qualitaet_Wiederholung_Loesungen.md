# Musterlösungen — Einheit 6: Packages/Visibility/Stack&Heap, Testing, Softwarequalität + Wiederholung

**Aufgabe 1:**
1. Z.B.: Vermeidung von Namenskonflikten bei gleichnamigen Klassen; bessere Strukturierung/Übersichtlichkeit bei großen Projekten; ermöglicht package-private Visibility zur gezielten Kapselung.
2. Package-Name + Klassenname, durch Punkte getrennt. Beispiel: `java.util.List`

**Aufgabe 2:**

| Zugriffsart | private | package | protected | public |
|---|---|---|---|---|
| Innerhalb derselben Klasse | ✓ | ✓ | ✓ | ✓ |
| Von einer anderen Klasse im selben Package | ✗ | ✓ | ✓ | ✓ |
| Von einer Unterklasse in einem anderen Package | ✗ | ✗ | ✓ | ✓ |
| Von einer beliebigen Klasse (World) | ✗ | ✗ | ✗ | ✓ |

**Aufgabe 3:**
1. Ketten von Methodenaufrufen, Werte lokaler Variablen, Zwischenergebnisse von Berechnungen (keine Objekte selbst, nur Referenzen).
2. Alle Klassen und Objekte mit ihren Daten. Bei Überlauf: `OutOfMemoryError`.

**Aufgabe 4:**
1. Der Quellcode wird überprüft (manuell z.B. im Peer Review, oder automatisiert z.B. mittels Tools), ohne dass die Software tatsächlich ausgeführt wird.
2. Die Software wird tatsächlich ausgeführt; das tatsächliche Verhalten wird während Testfällen mit dem erwarteten Verhalten verglichen.
3. Z.B.: Unit-Test, Integration-Test (auch System-Test, Acceptance-Test, Regression-Test, Penetration-Test korrekt).

**Aufgabe 5:**
1. Funktionale Eignung, Zuverlässigkeit, Benutzbarkeit, Effizienz, Sicherheit, Wartbarkeit, Übertragbarkeit, Kompatibilität (fünf davon nennen).
2. Beispiele:
   - Funktionale Eignung: Erfüllt die Software korrekt alle ihre Aufgaben?
   - Zuverlässigkeit: Bleibt die Software auch in suboptimalen Szenarien stabil verwendbar?
   - Wartbarkeit: Ist die Software mit vertretbarem Aufwand änderbar/erweiterbar/testbar?

**Aufgabe 6:**
```java
public class Library {
    private Book[] books = new Book[20];

    public void printAllAvailable() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i] instanceof EBook) {
                books[i].printInfo();
            }
        }
    }
}
```
