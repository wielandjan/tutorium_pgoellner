ÜBUNGEN

Allgemeine Hinweise
Wenngleich die nachfolgenden Übungen nicht direkt klausurrelevant
sind, ist es dringend empfohlen sich mit ihnen in Hinblick auf die
Klausur zu befassen.
Es handelt sich dabei weniger um Hausaufgaben im Sinne einer
kontrollierten Zusatzleistung, sondern soll hauptsächlich dem Einüben
der erlernten Inhalte dienen.
Sofern die einzelnen Schritte einer Aufgabe in nummerierter
Reihenfolge angegeben sind, ist diese Ordnung bei der Bearbeitung
einzuhalten.
Es bietet sich an, wenn man Aufgaben am Computer bearbeitet, die
Lösung sofort im Internet zu suchen. Alle nachfolgenden Aufgaben
sind damit sehr einfach zu lösen, allerdings sind während der Klausur
keine internetfähigen Hilfsmittel erlaubt.
Aus diesem Grund sein gesagt, dass alle Aufgaben zunächst nur mit
Hilfe des Skriptes probiert werden sollten. Sollte sich nach längerem
Nachdenken kein Erfolg einstellen, können auch andere Mitglieder des
Kurses gefragt werden.
Bei hartnäckigen Zweifeln hilft der Dozent gerne weiter.
DHBW Ravensburg – Phillip Goellner 2

IntelliJ IDE Shortcuts
Die IntelliJ IDE bietet viele beim Programmieren nützliche Komfortfunktionen an.
Zu den wichtigsten und am häufigsten verwendeten gehören:
| Funktion | Tastenkürzel | Beschreibung |
| -------- | ------------ | ------------ |
Go To Hyperlink Ctrl + B Gehe zu dem Codeabschnitt, an welchem das angeklickte Element (z.B. Methode, Variable)
|     | (Ctrl + Mausklick) | definiert ist. |
| --- | ------------------ | -------------- |
Format Code Ctrl + Alt + L Formatiere den Code entsprechend des definierten Formatters (dieser kann pro Sprache
individuell angepasst werden).
Rename (Refactor) Shift + F6 Benenne das markierte Element (z.B. Variable, Methode, Klasse) um.
| Organize Imports | Ctrl + Alt + O | Füge alle nötigen Imports hinzu und entferne unnötige. |
| ---------------- | -------------- | ------------------------------------------------------ |
Open Resource 2x Shift Öffne ein Suchfeld um im gesamten Projekt nach etwas zu suchen.
Find Ctrl + F Öffne ein einfaches Finden Fenster, um in der aktuellen Datei etwas zu suchen.
| Replace | Ctrl + R | Öffne ein einfaches Finden/Ersetzen Fenster. |
| ------- | -------- | -------------------------------------------- |
Quick Outline Ctrl + O Zeige ein Popup-Menü mit allen Methoden/Variablen der aktuellen Klasse an.
| Copy, | Ctrl + C, | Kopiere den markierten Bereich in die Zwischenablage. |
| ----- | --------- | ----------------------------------------------------- |
Cut, Ctrl + X, Schneide den markierten Bereich aus, in die Zwischenablage.
Paste, Ctrl + V, Füge den in der Zwischenablage enthaltenen Bereich hier ein.
| Select All | Ctrl + A | Markiere alles. |
| ---------- | -------- | --------------- |
DHBW Ravensburg – Phillip Goellner 3

Karels Aufgaben
Aufgabe 1: BeeperCarryKarel
Es soll der Beeper aufgehoben und rechts auf dem Podest abgelegt werden.
Der Java Quellcode Erwartetes Ergebnis
DHBW Ravensburg – Phillip Goellner 4

Aufgabe 2: CollectNewspaperKarel
Der Beeper vor der Tür (Zeitung) soll abgeholt und an den Ausgangspunkt gelegt werden.
Erwartetes Ergebnis
DHBW Ravensburg – Phillip Goellner 5

Aufgabe 3: PartyCleanupKarel
Nach einer Party muss Karel seine Wohnung aufräumen (alle Beeper aufsammeln).
Erwartetes Ergebnis
DHBW Ravensburg – Phillip Goellner 6

Aufgabe 4: FloorIsLavaKarel
Karel soll entlang des Pfades zum blauen Feld laufen und dort stehen bleiben.
Hinweis:Die roten Felder drüfen dabei nicht betreten werden!
Erwartetes Ergebnis
DHBW Ravensburg – Phillip Goellner 7

Aufgabe 5: SimpleRaceTrackKarel
Es sollen unendlich viele Runden auf der einfachen Rennstrecke gedreht werden.
Hinweis:Es sollte eine Endlosschleife verwendet werden.
Syntax:
while(true) {
/* ... */
}
DHBW Ravensburg – Phillip Goellner 8

Aufgabe 6: AdvancedRaceTrackKarel
Es sollen unendlich viele Runden auf der erweiterten Rennstrecke gedreht werden.
DHBW Ravensburg – Phillip Goellner 9

Aufgabe 7: SpiralRunKarel
Die Beeper, die in einem Spiralenmuster ausliegen, sollen alle aufgesammelt werden.
Versuche die Aufgabe mit so wenig Anweisungen wie möglich zu lösen.
Erwartetes Ergebnis
DHBW Ravensburg – Phillip Goellner 10

Aufgabe 8: BeeperCollectingKarel
Es sollen alle Beeper auf dem Spielfeld aufgesammelt werden und in der
unteren rechten Ecke abgelegt werden.
Wichtig: Das Programm soll so geschrieben sein, dass es auch mit
einer anderen Verteilung der Beeper oder einer anderen Spielfeldgröße
funktioniert.
Hinweise: Um mehrere Beeper abzulegen, muss putBeeper() mehrmals
aufgerufen werden.
Karel merkt sich nicht von alleine wie viele Beeper aufgesammelt
worden sind.
Erwartetes Ergebnis
DHBW Ravensburg – Phillip Goellner 11

Aufgabe 9: CalculatorKarel
Die Beeper auf den blauen Feldern sollen aufgesammelt und auf
dem roten Feld abgelegt werden. Die Anzahl der abgelegten Beeper
soll gleich der Summe der Beeper auf den blauen Feldern sein.
Wichtig: Das Programm soll so geschrieben sein, dass es auch mit
unterschiedlich vielen Beepern auf den blauen Feldern funktioniert.
Erwartetes Ergebnis
DHBW Ravensburg – Phillip Goellner 12

Aufgabe 10: SprialEscapeKarel
Karel soll den Weg aus dem Labyrinth zum roten Feld finden und dabei
alle auf dem Spielfeld vorhandenen Beeper aufsammeln. Alle
aufgesammelten Beeper sollen anschließend auf das rote Feld
gelegt werden.
DHBW Ravensburg – Phillip Goellner 13

Aufgabe 11: SlalomKarel
Karel soll unendlich viele Runden auf der Slalom-Strecke drehen.
Bei jeder Überquerung des roten Feldes soll dort ein Beeper
abgelegt werden.
Hinweis: Es ist nicht die Farbe eines Feldes entscheidend, sondern ob
dort ein Beeper liegt
Zusatzaufgabe: Immer wenn Karel auf dem roten Feld steht, soll er
seine Laufrichtung wechseln.
DHBW Ravensburg – Phillip Goellner 14

Aufgabe 12: MidpointFindingKarel
Karel soll genau die Mitte der untersten Zeile finden und zu ihr gehen.
Hinweis:Das Programm soll so geschrieben sein, dass Karel die Mitte
findet, egal wie viele Spalten das Spielfeld hat. Bei gerader
Spaltenzahl ist eine der beiden mittleren Spalten ok.
Erwartetes Ergebnis
Zusatzaufgabe: Zusätzlich soll neben der horizontalen Mitte auch die
vertikale gefunden werden.
DHBW Ravensburg – Phillip Goellner 15

Aufgabe 13: PyramidKarel
Es soll eine Pyramide gebaut werden, die genau vom linken zum
rechten Spielfeldrand reicht.
Hinweis:Das Programm soll so geschrieben sein, dass die Pyramide
mindestens für die folgenden Spielfeldgrößen korrekt
erstellt wird (BxH): 11x10, 15x10, 5x15, 3x5.
Erwartetes Ergebnis
DHBW Ravensburg – Phillip Goellner 16

Aufgabe 14: StoneMasonKarel
Die vier Säulen sollen wieder aufgebaut werden, indem an den
fehlenden Stellen jeweils ein Beeper platziert wird
Hinweise: Das Gesamtproblem lässt sich in zwei Teilprobleme
zerlegen, die mit separaten Methoden gelöst werden
können: makeColumn() und moveToNextColumn()
Für das Verständnis ist es einfacher, wenn
makeColumn() so implementiert ist, dass Karel nach
dem Methodenaufruf am selben Platz steht (und in
dieselbe Richtung blickt) wie vor dem Methodenaufruf.
Der Abstand der Säulen und die Abmessungen des
Spielfelds können als konstant angenommen werden.
Erwartetes Ergebnis
Zusatzaufgabe: Karel soll das Muster mit möglichst wenig Schritten erstellt.
DHBW Ravensburg – Phillip Goellner 17

Aufgabe 15: CheckerboardKarel
Karel soll mit Beepern ein Schachbrettmuster auf der gesamten
Spielfläche auslegen
Hinweis:Das Programm soll so geschrieben sein, dass es auch
mit einer anderen Spielfeldgröße funktioniert.
Erwartetes Ergebnis
Zusatzaufgabe: Karel soll das Muster mit möglichst wenig Schritten erstellt.
DHBW Ravensburg – Phillip Goellner 18

Aufgabe 16: HurdleJumpingKarel
Karel soll jede Hürde einzeln überspringen und so die untere
rechte Ecke erreichen.
Hinweis:Das Programm soll so geschrieben sein, dass es auch
mit einem anderen Aufbau der Hürden oder einer anderen
Spielfeldgröße funktioniert. Daher muss Karel den
Spielfeldrand zuverlässig erkennen können.
Erwartetes Ergebnis
DHBW Ravensburg – Phillip Goellner 19

Aufgabe 17: FibonacciKarel
Es soll mit Beepern eine berechnete Fibonacci-Folge erstellt
werden, die vom linken bis zum rechten Spielfeldrand reicht.
Hinweise: Die Aufgabe kann mittels eines iterativen oder eines
rekursiven Algorithmus gelöst werden.
Das Programm soll so geschrieben sein, dass es auch
mit einer anderen Spielfeldgröße funktioniert.
Erwartetes Ergebnis
DHBW Ravensburg – Phillip Goellner 20

Aufgabe 18: DeflectionKarel
Karel soll sich unentwegt geradeaus über das Spielfeld
bewegen. Immer wenn er eine Wand trifft, kehrt er um (180°).
Bei jedem 10. Schritt legt Karel einen Beeper (außer dort
liegt schon einer). Immer wenn Karel einen Beeper trifft,
hebt er diesen auf, dreht sich zufällig [Math.random()] nach
rechts oder links (90°) und geht dann weiter.
DHBW Ravensburg – Phillip Goellner 21

Aufgabe 19: LabyrinthKarel
Karel soll den Weg durch das Labyrinth, zum Beeper finden.
Für Einsteigende: Man kann auch erstmal mit dem
TinyLabyrinthKarel anfangen.
Für Fortgeschrittene: Das Programm soll auch die folgenden
komplexen Levels/Worlds lösen:
- MediumLabyrinthKarel
- LargeLabyrinthKarel
- MadLabyrinthKarel
Erwartetes Ergebnis
DHBW Ravensburg – Phillip Goellner 22

Aufgabe 20: ChristmasTreeKarel
Es soll ein großer Weihnachtsbaum aus Beepern gelegt werden.
Hinweis:Das freie Spielfeld hat eine Größe von 15x15.
Erwartetes Ergebnis
Zusatzaufgabe: Der Code soll unverändert mit jeder beliebigen
Spielfeldgröße funktionieren und den Baum
entsprechend skalieren.
DHBW Ravensburg – Phillip Goellner 23

Aufgabe 21: DiamondKarel
Gegeben ist ein Programm, das bei einem quadratischen
Feld (Größe von 9x9) eine Raute aus Beepern legt.
Allerdings ist der Code sehr unübersichtlich und schwer
zu verstehen. Daher soll er so verändert werden, dass er
seine Funktionalität behält, aber eine bessere Struktur erhält.
Zusatzaufgabe: Ändere den Code anschließend so ab, dass er auch mit
nicht-quadratischen Feldern funktioniert.
DHBW Ravensburg – Phillip Goellner 24

Eigenständige Java-Projekte
FizzBuzz
FizzBuzz ist eine einfache Einstiegs-Aufgabe, die gelegentlich bei Einstellungsgesprächen
gestellt wird. Sie dient hier der Einübung von Verzweigungen und bool‘schen Ausdrücken.
Ein FizzBuzz-Programm gibt eine Zahlenfolge natürlicher Zahlen aus, jedoch werden alle
Zahlen, die durch 3 teilbar sind, durch Fizz ersetzt, alle durch 5 teilbaren Zahlen durch Buzz,
und alle Zahlen, die sowohl durch 3 als auch durch 5 teilbar sind, durch FizzBuzz.
Die ersten 15 Ausgaben eines FizzBuzz-Programms sehen wie folgt aus:
1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz
BBeeiissppiieellaauussggaabbee
1. Erzeuge die Klasse FizzBuzzRunner. Sie hat keine Attribute. Ein paar Beispiele für das Verhalten der fizzBuzz-Methode:
2. Erstelle eine Methode String fizzBuzz(int number). In ihr soll die
übergebene Zahl number geprüft werden. Eingabe Ausgabe
• Ist die Zahl durch 3 teilbar, soll “Fizz” zurückgegeben werden 1 “1”
• Ist die Zahl durch 5 teilbar, soll “Buzz” zurückgegeben werden
2 “2”
• Ist die Zahl durch 3 und durch 5 teilbar, soll “FizzBuzz”
zurückgegeben werden
3 “Fizz”
• In allen anderen Fällen soll die Zahl als String zurückgegeben werden
(“” + number)
6 “Fizz”
3. Erstelle eine Mainmethode, die in einer Schleife fizzBuzz() mit
aufsteigenden Zahlen aufruft (z.B. 1 - 25).
5 “Buzz”
15 “FizzBuzz”
DHBW Ravensburg – Phillip Goellner 25

Vollkommene Zahlen
In der Mathematik ist eine Zahl dann als vollkommen definiert, wenn sie gleich der Summe
aller ihrer Teiler (außer sich selbst) ist. Die beiden kleinsten vollkommenen Zahlen sind:
6 = 1 + 2 + 3
28 = 1 + 2 + 4 + 7 + 14
Es soll eine Methode hierzu entwickelt werden, die prüft, ob eine übergebene Zahl
vollkommen ist.
1. Erzeuge Klasse PerfectNumberChecker. Sie hat keine Attribute. 4. Erstelle eine Schleife, die die Zahlen von 1 bis number-1 durchläuft
(eine for-Schleife eignet sich hier am besten).
2. Erstelle eine Methode boolean isPerfectNumber(int number). Diese
Methode soll true zurückliefern, wenn die übergebene Zahl number eine 5. Bei jeder Schleifen-Iteration, prüfe, ob der Counter ein Teiler von number ist
vollkommene Zahl ist, und andernfalls false. (hier wird der Module-Operator benötigt). Falls das der Fall ist, addiere den
Counter zu sum.
3. Deklariere eine int Variable sum, welche als Zwischenergebnis in der
Methode dienen soll. 6. Nach der Schleife, prüfe, ob sum gleich number ist. Wenn ja, gib true zurück,
ansonsten false.
DHBW Ravensburg – Phillip Goellner 26

Schaltjahre
Bekannterweise decken sich ein Kalenderjahr von 365 Tagen und ein astronomisches Jahr nicht exakt. Aus diesem Grund wurde im Julianischen
Kalender Model jedes 4. Jahr ein Schaltjahr eingefügt mit einem weiteren Tag (dem 29. Februar). Das wurde dann im Gregorianischen Kalender noch
weiter verbessert.
Diese Übung soll eine Methode implementieren, die in der Lage ist anhand eines übergebenen Jahres zu bestimmen, ob dieses ein Schaltjahr ist oder
nicht. Die Methodensignatur soll in etwa so aussehen: boolean isLeapYear(int year)
Die Ermittlung soll nach den folgenden Regeln erfolgen:
● Ist ein Jahr durch 400 teilbar, dann ist es ein Schaltjahr
● Ist ein Jahr durch 100 aber nicht durch 400 teilbar, dann ist es kein Schaltjahr
● Ist ein Jahr durch 4 aber nicht durch 100 teilbar, dann ist es ein Schaltjahr
● In allen anderen Fällen ist das Jahr kein Schaltjahr
Versuche diese Aufgabe ohne weitere Hilfestellungen umzusetzen.
DHBW Ravensburg – Phillip Goellner 27

SkyMasters
SkyMasters bildet ein Supertrumpf-Kartenspiel nach.
1. Erzeuge die Klasse Airplane. Sie hat das String-Attribut name 6. Füge dem Programm weitere Klassen von Flugobjekten hinzu, z.B.:
sowie die double-Attribute maxSpeed (km/h) , maxAltitude (m) Helicopter, Airship, Rocket, UFO.
und price (USD). Erzeuge die zugehörigen Akzessoren sowie Alle Flubobjekt-Klassen sollen von der Mutterklasse FlyingMachine
den Konstruktor und die toString-Methode. erben. Jede der Unterklassen muss die Methode fly() implementieren,
welche auf der Konsole ausgibt, auf welchem Prinzip das Flugobjekt
basiert (z.B. Tragflächen, Rotor, Aerostatik, Rückstoß, Levitation). Rufe
2. Erzeuge die Klasse Sky. In ihrer Main-Medhode, erzeuge
diese Methode immer bei beiden ausgewählten Objekten aus.
mindestens 2 verschiedene Airplane-Objekte, mit jeweils
unterschiedlichen Attributen (z.B. SR-71 Blackbird, NA-X15, 7. Erzeuge in Sky enstsprechende Objekte, z.B. S-64 Skycrane (Helicopter),
An-225, 777-Worldliner, B2-Spirit, F22-Raptor). Eurocopter X3 (Helicopter), Hindenburg (Airship), Zeppelin NT
(Airship),
Saturn V (Rocket), Falcon 9 (Rocket), I-Day Attacker (UFO),
3. Vergleiche zwei Airplanes anhand eines fest vorgegebenen
Cylon Raider (UFO).
double-Attributs (z.B. maxSpeed) und gebe auf der Konsole aus,
welches Flugzeug den Vergleich gewonnen hat und
warum (größere Zahl schlägt kleinere). 8. Erweitert: Zeige alle Attribute eines zufällig gewählten Flugobjekts (A)
auf der Konsole an. Nun lasse auswählen, welches Attribut für den
Vergleich mit dem anderen (bis dahin nicht gezeigten) Flugobjekt (B)
4. Im nächsten Schritt soll der Zufall entscheiden, welches der drei
verwendet werden soll. Für das Lesen von der Konsole siehe das
double-Attribute für den Vergleich herangezogen wird. Kombiniere
entsprechende Kapitel in Kapitel 4. Nachdem das Attribut ausgewählt
hierzu eine Zufallszahl aus Math.random() mit einer Verzweigung.
wurde, werden A und B anhand des gewählten Attributs verglichen.
Gewinnt A gegen B, erhält man einen Punkt. Andernfalls verliert man
5. Welche Objekte mit einander verglichen werden, soll danach einen Punkt. Danach startet eine neue Runde (Schleifen-Wiederholung).
ebenfalls vom Zufall bestimmt werden. Der aktuelle Punktestand wird in jeder Runde auf der Konsole angezeigt.
Sobald man 3 Punkte erreicht, ist das Spiel gewonnen (das Programm
wird beendet).
9. Erweitert: Füge dem weitere double-Attribute hinzu, z.B.: maxRange (km),
weight (kg), length (m), power (kW)
DHBW Ravensburg – Phillip Goellner 28

Arrays
Arrays sind ein wichtiger Baustein der Java-Grundkenntnisse.
Nachfolgend finden sich mehrere kleine Übungen, um den Umgang mit
Arrays einzuüben. Erstelle hierzu eine eigentständige Klasse ArrayExercises.
Hinweis: Bei dieser Übung eignet sich in den meisten Punkte ein TDD-Ansatz
1. Die Methode head(int[] intArray) soll das erste Element des
übergebenen Arrays zurückgeben
8. Die Methode init(int[] intArray) soll alle Werte des übergebenen
Arrays bis auf den letzten in ein neues Array kopieren
[1, 2, 3]
2. Die Methode last(int[] intArray) soll das letzte Element des
übergebenen Arrays zurückgeben
3. Die Methode printArray(int[] intArray) soll die Werte eines
übergebenes Array auf der Konsole ausgeben 9. Die Methode tail(int[] intArray) soll alle Werte des übergebenen
Arrays bis auf den ersten in ein neues Array kopieren
Zusatzübung: Die Ausgabe soll so aussehen:
[1, 2, 3]
4. Die Methode doubleAll(int[] intArray) soll alle Werte eines
übergebenes Array verdoppeln
10.Die Methode join(int[] array1, int[] array2) soll die übergebenen
Arrays zu einem neuen Array zusammenfügen
5. Die Methode printEveryTwo(int[] intArray) soll nur jede zweite Stelle array1 array2
auf der Konsole ausgegeben
[1, 2, 3] [[44,, 55]]
6. Die Methode copyArray(int[] intArray) soll das übergeben Array
erwartetes Ergebnis
kopieren und die Kopie zurückgeben
[1, 2, 3, 4, 5]
7. Die Methode sum(int[] intArray) soll alle Werte des übergebenen Arrays
addieren und das Ergebnis zurückgeben
DHBW Ravensburg – Phillip Goellner 29

HelloRecursion
HelloRecursion soll einen einfachen rekursiven Algorithmus umsetzt.
1. Erzeuge die Klasse HelloRecursion, mit einer Main-Methode. 5. Nun setze die Methode repeat() rekursiv um, d.h. ohne
Verwendung einer Schleife. Hierbei muss sich repeat() selbst
2. Darin, erstelle die Methode void repeat(int repetitions), aufrufen sofern (if) der Zähler (repetitions) größer als 0 ist.
welche von der Main-Methode aufgerufen wird. Sollte die Abbruchbedingung nicht korrekt definiert sein, ruft sich die
Methode endlos selbst auf, bis das Programm mit einem
StackOverflowError abstürzt.
3. Die Methode soll von der angegebenen Zahl repetitons bis auf 0
herunterzählen und bei jedem Schritt den aktuellen Zähler auf der
Konsole ausgeben: „Hello 10“, „Hello 9“, […], „Hello 0“. 6. Sobald die rekursive Variante funktioniert, versuche es mit größeren
Werten von repetitions: Erst 1000, dann 5000, dann 10000.
Sollte das Programm bei einem der höheren Werte abstürzen, wurde
4. Teste diese iterative Variante mit repetitions=100.
wahrscheinlich die maximale Stack-Size der JVM überschritten.
Als Hintergrund siehe dazu den Abschnitt „JVM Stack und Heap“ des
nächsten Kapitels.
7. Anstatt herunterzuzählen, zähle jetzt von 1 bis zur angegebenen
Zahl (100) hoch. Hierzu musst ggf. die Methode anpassen werden zu
repeat(int currentRepetition, int maxRepetitions).
DHBW Ravensburg – Phillip Goellner 30

Rekursive Arithmetik
Die Denkweise für rekursive Algorithmen soll weiter vertieft werden,
indem die einfachen arithmetischen Operatoren (+,-,/,*) rekursiv
implementiert werden. Hierbei sollen nur natürliche Zahlen
verwendet werden.
1. Erzeuge die Klasse RecursiveArithmatics, mit einer Main-Methode. 5. Implementiere eine Methode int divide(int a, int b), welche rekursiv
den Quotienten von a und b berechnet (a/b; nur als natürliche Zahl) und als
2. Implementiere eine Methode int add(int a, int b), welche rekursiv die Rückgabewert zurückliefert
Summe aus a und b berechnet und als Rückgabewert zurückliefert
Hinweis: Hierfür muss divide überladen werden
3. Implementiere eine Methode int subtract(int a, int b), welche rekursiv
die Differenz aus a und b berechnet (a - b) und als Rückgabewert zurückliefert
4. Implementiere eine Methode int multiply(int a, int b), welche rekursiv
das Produkt von a und b berechnet und als Rückgabewert zurückliefert
Hinweis: Hierfür muss multiply überladen werden
DHBW Ravensburg – Phillip Goellner 31

Fibonacci-Folge
Die Fibonacci-Sequenz ist eine unendliche Zahlenreihe, die eine
wichtige Bedeutung in der Mathematik hat. Sie beginnt mit zwei
einsen und jede weitere Zahl ergibt sich als die Summe der beiden
vorangegangenen Zahlen. Die ersten Fibonacci-Zahlen sind wie folgt:
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, […]
1. Erzeuge die Klasse Fibonacci, mit einer Main-Methode. 3. Erstelle eine neue Methode int getFibonacciNumberAt(int position),
welche
die Fibonacci-Nummer an der angegebenen Position zurückgibt
2. Entwerfe die Methode
(z.B. die 15. Fibonacci-Nummer ist 610).
void printFibonacciSequence(int fiboPrevious, int
fiboCurrent)
Tipp: Ermittle per Selbstaufruf die Fibonacci-Nummern an der
Diese soll die Fibonacci-Sequenz auf der Konsole ausgeben
vorherigen Position (P-1) und an der vor-vorherigen
– bis zur ca. zwanzigsten Stelle.
Position (P-2) und summiere beide. Für die Positionen 1 und 2
ist eine Sonderregelung (if) nötig. Verwende keine der zuvor
Tipp: Summiere fiboPrevious und fiboCurrent zu fiboNext und
programmierten Methoden – denn für diese letzte Aufgabe ist
übergebe beim Selbstaufruf fiboCurrent und fiboNext.
ein anderer Ansatz nötig.
DHBW Ravensburg – Phillip Goellner 32

Natural Numbers
Natürliche Zahlen können als eine rekursive Datenstruktur betrachtet
werden (als Abwandlung einer einfach-verketteten Liste):
predecessor predecessor predecessor
NaturalN NaturalN NaturalN
Zero
umber umber umber
0 1 2 3
1. Erzeuge die Klassen Number, Zero und NaturalNumber (siehe das
Klassendiagramm als Beispiel)
2. Implementiere die Methode isZero() (abstrakt in Number), die true
zurückgibt, wenn das Objekt von Typ Zero ist, ansonsten false
3. Die Klasse Number sollte ein Attribut haben mit Namen predecessor von
Typ Number und auch die dazugehörigen Akzessor-Methoden
4. Implementiere die statischen Methoden addition, subtraction,
multiply and divide. Jede dieser Methoden soll zwei Parameter von Typ
Number entgegen nehmen und den Rückgabetyp Number haben
Die Signaturen sollten folgendermaßen aussehen:
public static Number addition(Number a, Number b)
public static Number subtraction(Number a, Number b)
public static Number multiply(Number a, Number b)
public static Number divide(Number a, Number b)
DHBW Ravensburg – Phillip Goellner 33

FileFinder
FileFinder soll die Festplatte nach Dateien durchsucht und diejenigen
auflistet, die den definierten Filterkriterien entsprechen, z.B. Dateiname,
Endung, Größe, Datum (aber alles der Reihe nach).
Hinweise: Dateisysteme sind hierarchisch aufgebaut – daher bietet sich
hier ein rekursiver Algorithmus an.
Es soll die Java File-Klasse (java.io.File) verwendet werden,
welche Teil der Standard-JCL ist.
Ein File-Objekt stellt eine einzelne Datei oder auch einen
einzelnen Ordner im Dateisystem dar.
1. Erzeuge die Klasse FileFinder, mit einer Main-Methode. 7. Sonderfall: Wenn das Programm keine Zugriffsrechte auf einen Ordner
hat, dann gibt listFiles() den Wert null zurück. Zwischen Schritt 4 und
2. Definiere den Root-Ordner für die Suche, z.B.:
Schritt 5 sollte daher das File-Array auf null geprüft werden.
// System Root
File rootFolder = new File("C:/");
8. Filter 1: Gebe nur Dateien mit bestimmten Namen/Endungen auf der
// Eigene Dateien Konsole aus, z.B.:
File rootFolder = new File(System.getProperty("user.home")); if (childFile.getName().contains(".java")) {...}
9. Filter 2: Gebe nur Dateien mit einer bestimmten Größe auf der Konsole
3. Definiere die rekursive Methode aus, z.B.:
findFilesRecursively(File parentFile). if (childFile.length() > 10*1024 &&
childFile.length() < 1024*1024) {...}
4. Die Methode ermittelt die Liste aller Dateien/Unterordner die sich
unmittelbar im übergebenen Ordner befinden: 10.Filter 3: Gebe nur Dateien mit einem bestimmten Änderungsdatum auf
File[] childFiles = parentFile.listFiles(); der Konsole aus, z.B.:
if (childFile.lastModified() >
(System.currentTimeMillis() - 1000*60*60*48)) {...}
5. Die Methode iteriert über alle childFiles und gibt deren
Pfad (File.getPath()) auf der Konsole aus.
By the way, für professionelle Datumsoperationen sollte man auf die
Date-API von Java 8 zurückgreifen.
6. Wenn eine childFile selbst ein Ordner ist (isDirectory()), dann
ruft sich findFilesRecursively() selbst auf und übergibt dabei 11.Fortgeschritten: Sammle die Suchergebnisse, sortiere sie, und gebe
diese childFile. Dann geht es für diesen Unterordner wieder mit sie erst am Ende aus (verwende Collections).
Schritt 4 weiter.
DHBW Ravensburg – Phillip Goellner 34

JavaBank
JavaBank soll eine Bank mit Konten, Überweisungen und
Krediten simulieren.
1. Die Bank besteht aus einem FrontOffice (der Filiale), • Überweisung zw. Accounts:
dem BackOffice (Zentrale mit Hochsicherheits-Rechenzentrum) BackOffice.wireTransfer(amount, fromAcctNr, toAcctNr)
sowie mehreren Accounts (Bankkonten). • Abhebungen und Überweisungen werden vom BackOffice nur bei
ausreichendem Kontostand verarbeitet.
2. Das BackOffice hat eine Collection aller Accounts und kann 6. Um den Kontostand einsehen zu können, kann das FrontOffice
jeden Account über dessen eindeutige Kontonummer (long) folgende Methoden verwenden:
identifizieren (z.B. durch die Map: allAccounts<Long, Account>).
• Zeige Kontostand eines Accounts auf Konsole:
BackOffice.getAccountStatus(accountNr)
3. Es existieren nur ein einziges FrontOffice sowie ein einziges
• Zeige Kontostände aller Accounts auf Konsole:
BackOffice, jedoch mehrere Accounts.
BackOffice.getAllAccountsStatus()
7. Das Programm beginnt in FrontOffice.main() und ruft dann
4. Jeder Account hat eine accountBalance (den aktuellen Kontostand;
FrontOffice.normalDayInTheOffice()auf. Dort werden mindestens
der Einfachheit halber ein double).
2 Accounts angelegt. Es gibt einige Bareinzahlungen, Abhebungen und
Überweisungen. Ein paar Kundinnen und Kunden versuchen auch, mehr
5. Das FrontOffice hat aus Sicherheitsgründen keinen direkten Zugriff abzuheben/zu überweisen, als ihr Kontostand hergibt. Nach jeder Aktion
auf die Account-Objekte oder deren accountBalance und kann selbst werden alle Kontostände auf der Konsole angezeigt.
keine Account-Objekte erzeugen. Jedoch hat das FrontOffice eine
Verbindung (Referenz) zum BackOffice und kann bei diesem folgende
8. Zusatz: Der neue Kontotyp OverdraftAccount soll nun auch Dispokredite
sicherheitskritische Vorgänge anfordern:
in begrenzter Höhe unterstützen.
• Anlage eines neuen (leeren) Accounts:
BackOffice.createNewAccount()
Dies liefert dem FrontOffice die Kontonummer des neu angelegten
Accounts zurück.
• Bareinzahlung auf Account:
BackOffice.depositCash(amount, accountNr)
• Barabhebung von Account:
BackOffice.withdrawCash(amount, accountNr)
DHBW Ravensburg – Phillip Goellner 35

Das Klassendiagramm könnte folgendermaßen aussehen:
Beispielhafte Ausgabe von FrontOfficeBatch.normalDayInTheOffice():
DHBW Ravensburg – Phillip Goellner 36

JavaBank II
Ziel der Übung ist das Erweitern der JavaBank, um eine
korrekte und sichere Behandlung von Fehlern.
1. Erweitere das bestehende BackOffice so, dass in folgenden Fällen 2. In allen genannten Fällen darf die Banktransaktion nicht fortgesetzt werden.
Exceptions geworfen und korrekt behandelt werden. Der Begriff Stattdessen muss eine verständliche Fehlermeldung [e.getMessage()] auf
Banktransaktion umfasst hierbei Überweisungen, Bareinzahlungen der Konsole ausgegeben werden, jedoch soll nicht der Stacktrace angezeigt
und Barabhebungen. werden (Information Leakage). Alle Prüfungen müssen durchgeführt
werden, bevor eine accountBalance verändert wird.
• Bei einer Barabhebung von einem normalen Konto übersteigt
der Abhebungsbetrag den Kontostand. 3. Disclaimer: Nun ist die JavaBank zwar sicherer, jedoch fehlen noch viele
essenzielle Dinge wie z.B.:
• Bei einer Barabhebung von einem Konto mit Disporahmen
übersteigt der Abhebungsbetrag die Summe von Kontostand 1. Persistenz (ACID)
und Dispo. 2. Korrekte Wähungs-Datentypen (Currency)
3. Sicherer nebenläufiger Zugriff (Concurrency)
• Bei einer Barabhebung oder -einzahlung übersteigt der Betrag 4. Authentisierung und Autorisierung (JAAS)
eine fest definierte Obergrenze (welche sich durch begrenzte 5. KundInnen-Stammdatenverwaltung, Verzinsung, Besteuerung, Audit-
Bargeldbestände in den Filialen/Automaten ergibt). Log, Archivierung
6. Schnittstellen zu anderen Finanzinstituten (EBICS, SEPA, FIX, SWIFT,
• Bei einer Banktransaktion wird eine nicht existente EDI, FinTech-APIs)
7. Grafische Oberfläche (Filial/ATM-Client, Online/Mobile Banking)
Kontonummer verwendet.
• Bei einer Überweisung sind Quell- und Zielkonto identisch.
• Bei einer Banktransaktion wird ein negativer Betrag angegeben.
• Bei einer Banktransaktion wird ein ungewöhnlich hoher Betrag
angegeben (z.B. über 1 Million).
• Bei einer Banktransaktion wird ein Betrag angegeben, der mehr
als 2 Dezimalstellen hat.
DHBW Ravensburg – Phillip Goellner 37