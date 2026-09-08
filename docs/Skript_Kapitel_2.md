PROGRAMMIERUNG I
Kapitel 2: Methoden, Klassen und Objekte

Methoden
Komplexe Software bestehet häufig aus mehreren tausend Zeilen
Quellcode (z.B. Linux-Kernel: über 15 Millionen Zeilen). Hier ist eine
gute Struktur des Programmcodes unerlässlich. Diese Strukturierung
kann auf unterschiedliche Weisen erreicht werden, wobei die
grundlegendste aller Möglichkeit Funktionen sind, bei Java
Methoden genannt.
Aufbau einer Methode
Methodensignatur
Syntax:
public int putManyBeepers(int numberOfBeepers) {
Visibilität Definiert, von wo aus diese Methode aufgerufen werden
// Hier kommt Code hin
kann. Wird diese Angabe weg gelassen, wird die
Default-Visibility verwendet. Visibility wird ausführlich }
in Kapitel 3 behandelt.
Return-Type Eine Methode kann mittels return maximal einen Wert
zurückliefern, der dem in der Signatur angegebenen
Typen entsprechen muss. Soll kein Wert zurück gegeben
werden, ist der Return-Type void anzugeben.
Dementsprechend darf dann im Methodenrumpf kein
Wert mittels return zurückgeliefert werden.
Name Für Methoden-Namen gelten die gleichen Konventionen
wie für Variablen
Parameter Beim Aufruf der Methode können beliebig viele Parameter
übergeben werden, die dann innerhalb des Methodenrumpfes
verwendet werden können.
DHBW Ravensburg – Phillip Goellner 2

Methodenrumpf
Der Methodenrumpf befindet sich zwischen den beiden äußersten
geschweiften Klammern einer Methode. In ihm steht, was die Methode
machen soll, was also ihre Funktionalität ist. Alle bisher behandelten
syntaktischen Bausteine dürfen in einer Methode verwendet werden:
• Variablen dürfen deklariert und ihnen können Werte zugewiesen werden
• Arithmetische Operationen können ausgeführt werden
• Verzweigungen und Schleifen bestimmen den Ablauf einer Methode
• Andere Methoden dürfen aufgerufen werden
Aufbau einer Methode im Überblick
Visibilität Rückgabewert Name Übergabeparameter
Diese gesamte erste
Zeile heißt
Methodensignatur
Die hier verwendete
for-Schleife ist bereits
bekannt
Alles zwischen den
äußeren geschweiften
Klammern ist der
Methodenrumpf
Beendigung der Methode und Rückgabe des
definierten Rückgabewerts
Vorteile von Methoden
• Strukturierung Durch die Verwendung von Methoden kann der Quellcode
besser strukturiert werden, was dessen Komplexität
reduziert und Verständnis erleichtert.
• Weniger Redundanz Wenn häufig benötigte Code-Teile in Methoden ausgelagert
werden, müssen diese Code-Teile nicht immer wieder
kopiert werden.
DHBW Ravensburg – Phillip Goellner 3

Fortgeschrittene Methoden-Konzepte
Parameter
In ihrer einfachsten Form haben Methoden weder Übergabeparameter
noch einen Rückgabewert, z.B.:
Optional kann die aufrufende Methode der aufgerufenen Methode einen
oder mehrere Variablen übergeben (Übergabeparameter) und damit das
Verhalten der aufgerufenen Methode beeinflussen.
Hierfür sind zwei Dinge erforderlich:
1 Die aufrufende Methode muss den Übergabeparameter übergeben.
2 Die aufgerufene Methode muss in Ihrer Signatur den Übergameparameter definieren.
1
2
DHBW Ravensburg – Phillip Goellner 4

Rückgabewerte
Eine Methode kann nach ihrer Ausführung entweder nichts zurückgeben
oder genau einen Wert des in der Signatur angegebenen Typs. Wenn sie
nichts zurückgibt, wird dies durch das Keyword void angegeben.
Soll etwas an die aufrufende Methode zurückgeliefert werden,
sind hierfür zwei Dinge notwendig:
1 Der Typ des zurückgegebenen Werts muss in der Methodensignatur festgelegt werden.
2 Die Methode muss mittels return einen Wert des festgelegten Typs zurückliefern.
1
1
2
2
Wenn in der Signatur festgelegt ist, dass eine Methode einen Wert zurück
liefert (d.h. es ist nicht void definiert), muss sie in jedem Fall exakt einen
Wert dieses Typs oder einen Fehler zurückliefern
(zu Fehlern/Exceptions mehr in Kapitel 3).
Methoden haben häufig sowohl Übergabeparameter als auch
Rückgabewerte, die beliebig miteinander kombiniert werden können.
DHBW Ravensburg – Phillip Goellner 5

Call-by-Value
Die Übergabe von Parametern an Methoden erfolgt in Java nach
dem Call-by-Value-Prinzip, d.h. der Methode wird immer eine
Kopie des übergebenen Wertes bereitgestellt.
Das funktioniert nicht:
Das funktioniert:
DHBW Ravensburg – Phillip Goellner 6

Überladene Methoden
Es ist möglich, mehrere Methoden zu definieren, welche zwar denselben
Namen haben, aber sich in der Anzahl, Reihenfolge oder Art der
Übergabeparameter unterscheiden. Man spricht dabei von einem
Überladen der Methoden (Method Overloading):
DHBW Ravensburg – Phillip Goellner 7

Die Main-Methode
Java-Programme können aus einer Vielzahl von Methoden
bestehen, aber beim Start eines Programms wird immer zuerst
die Main-Methode aufgerufen.
Sie ist der Einstiegspunkt für den gesamten Programmfluss.
Auch beim Start von Karel JRobot wird immer zuerst die Methode
Karel.main() aufgerufen. Erst später wird der Code in der run()
Methode ausgeführt.
Um von Grund auf ein neues Java-Programm zu entwickeln,
muss also eine neue Klasse angelegt und mit einer Main-Methode
versehen werden – z.B.:
Wenn beim Start des Programms Parameter über die Kommandozeile
übergeben wurden, dann werden diese in dem Methoden-Parameter
args hinterlegt (Es handelt sich dabei um ein String-Array – dazu später mehr).
DHBW Ravensburg – Phillip Goellner 8

Klassen Und Objekte
Klassen
Mittels Methoden lässt sich wunderbar definieren, welche Arbeitsschritte • was ein Akteur IST, d.h. welchen Typ der Akteur hat
ein Programm durchführen soll (z.B. feedAllZooAnimals()).
Oft werden Programme aber so groß und komplex (tausende Zeilen Code),
dass Methoden allein zur Strukturierung nicht mehr ausreichen. • was ein Akteur HAT, d.h. welche Attribute (Variablen/Konstanten)
er besitzt (z.B. name, age)
Bei der Objektorientierten Programmierung wird deshalb der
Code (z.B. Methoden und Variablen) auf mehrere getrennte Klassen verteilt.
• was ein Akteur KANN, d.h. welche Methoden er besitzt
Mit Klassen lässt sich definieren, welche Akteure im Programm eine Rolle (z.B. fly() und eat())
spielen (z.B. ZooKeeperElephantDuck). Jeder Akteur kann
, ,
verschiedene Methoden haben.
In Java wird üblicherweise jede Klasse in einer eigenen *.java Datei
definiert. Es ist aber auch möglich, in einer *.java Datei mehrere Klassen
zu definieren.
Die Klasse Duck (in der Datei Duck.java) könnte z.B. folgendermaßen definiert sein:
Klassen sind Baupläne, die beschreiben:
DHBW Ravensburg – Phillip Goellner 9

Objekte
Während Klassen Baupläne für die Akteuere eines Programms sind,
sind Objekte die Akteure selbst. Neue Objekte (auch Instanzen genannt)
können mittels des new Operators erzeugt werden; so auch neue
Instanzen des Typen Duck:
Es existieren zwei
voneinander unabhängige
Objekte (Instanzen) vom
Typ Duck.
Auf der Grundlage jeder Klasse können beliebig viele Objekte erstellt
werden. Die zu den Attributen gehörigen Werte werden für jedes Objekt
getrennt gespeichert.
Zur Laufzeit speichert Java alle Objekte (nicht jedoch primitive Datentypen)
in einem Speicherbereich, der Heap genannt wird (dazu mehr in Kapitel 4).
Meistens möchte man nach der Erzeugung eines Objekts damit weiter arbeiten.
Daher speichert man die Referenz (quasi einen Link) auf das erzeugte Objekt
in einer eigenen Variable ab, welche dem Typ des Objekts entspricht.
Beispiel:
1. Java erzeugt ein
neues (new) Objekt
2. Die Referenz auf dieses Objekt vom Typ Duck und legt
wird in der Variable freddy vom es im Heap ab.
Typ Duck gespeichert.
3. Über diese Referenz kann man
jederzeit auf das Objekt und dessen
Attribute/Methoden zugreifen.
DHBW Ravensburg – Phillip Goellner 10

Objektreferenzen
Anders als bei primitiven Datentypen, deren Variablen immer einen
tatsächlichen Wert enthalten, speichern Variablen bei einem Referenztyp
lediglich eine Referenz auf ein Objekt ab – wie der Name bereits sagt.
Es ist möglich und üblich, dass mehrere Variablen auf dasselbe
Objekt verweisen:
Im Heap existiert nur ein
Objekt, aber zwei
Variablen verweisen auf
dieses.
Des Weiteren ist es auch möglich und üblich, dass eine Variable auf
gar kein Objekt verweist. Die Variable enthält dann statt einer
Objektreferenz den Wert null:
Das Keyword this funktioniert wie eine Konstante. Damit erhält ein
Objekt die Referenz auf sich selbst.
DHBW Ravensburg – Phillip Goellner 11

Vergleichen von Variablen und Referenzen
Um zu prüfen ob zwei primitive Datentypen denselben Wert haben, kann
man wie gewohnt beide Variablen mittels == vergleichen:
Da Variablen bei Objekt-Datentypen nur Links auf Objekte speichern,
prüft ein == bei Objekt-Variablen, ob diese auf die selbe Instanz
verweisen. Hier verweisen a und b nicht auf dasselbe Objekt (es sind ja
2 separate Ducks).
Möchte man prüfen ob zwei Objekte inhaltlich gleich sind,
verwendet man die equals-Methode (hier sind beide Strings separat, aber inhaltlich gleich):
Die equals-Methode gibt in folgenden Fällen true zurück:
• Beide Variablen verweisen auf dasselbe (eine) Objekt.
• Die Variablen verweisen auf 2 getrennte Objekte – doch diese sind inhaltlich gleich
DHBW Ravensburg – Phillip Goellner 12

Konstruktoren
Um sicherzustellen, dass bei der Erzeugung jedes neuen Duck-Objekts
immer gleich name und age gesetzt werden, können wir die Klasse Duck
um einen Konstruktor erweitern. Ein Konstruktor sieht sehr ähnlich zu
einer Methode aus, allerdings hat er keinen Rückgabewert und sein Name
ist gleich dem Klassennamen, in dem er steht:
Syntax:
public Duck(Parameter) {
// Konstruktor Code
}
Standardmäßig besitzt jede Klasse einen Konstruktor ohne
Übergabeparameter [z.B. public Duck()]. Sobald aber ein eigener
Konstruktor geschrieben ist, ist der Standardkonstruktor nicht mehr
verwendbar, d.h. es muss der neue verwendet werden:
Klassen können auch mehrere Konstruktoren haben, die sich aber in
den Parameter-Typen oder der Parameter-Reihenfolge unterscheiden
müssen (gleiche Regeln wie beim Methoden-Overloading).
DHBW Ravensburg – Phillip Goellner 13

Kapselung und Validierung
Aktuell ist der interne Zustand aller Duck Objekte von überall aus beliebig
veränderbar. Jeder Code-Bestandteil kann z.B. dem Duck hinter der Variable
freddy ein ungültiges Alter zuweisen:
Um den internen Zustand der Duck Objekte besser zu schützen, sollte im
ersten Schritt sichergestellt werden, dass nur noch die Klasse Duck
uneingeschränkt auf die Attribute name und age zugreifen kann (lesen/schreiben).
Dies wird erreicht, indem statt des Visibility-Keywords public das Visibility-Keyword
private verwendet wird (Visibility wird ausführlich in Kapitel 3 behandelt):
Andere Klassen (z.B. Zoo) können nun nicht mehr direkt auf die Attribute
zugreifen. D.h. nun können andere Klassen diese Attribute weder direkt lesen
noch verändern.
DHBW Ravensburg – Phillip Goellner 14

Für das Funktionieren des Zoos ist es jedoch notwendig, dass andere Klassen
auf die Attribute name und age der Duck-Klasse zugreifen können (lesen und
verändern). Dies soll allerdings nur in genau festgelegten Grenzen möglich sein.
Hierfür bietet Duck zwei Setter-Methoden an, über welche die Attribute
name und age verändert (d.h. geschrieben, ersetzt) werden können.
Der Weg des Übergabeparameters (Zoo  Duck-Konstruktor  Setter  Attribut)
ist unten am Beispiel von age markiert.
Start Ziel
Attribut age
des Duck-Objekts (orange).
Methoden-Übergabeparameter age
Um Verwechslungen mit dem gleichnamigen
Übergabeparameter (magenta) zu
vermeiden, wird das Duck-Objekt mittels
this angesprochen.
DHBW Ravensburg – Phillip Goellner 15

Die Setter-Methoden werden nun so verbessert, sodass die Attribute name bzw.
age von Duck (ganz oben) nur verändert werden, falls die vorgeschaltete
Validierung (Prüfung) der Übergabeparameter (magenta Markierung) erfolgreich
war. Andernfalls wird die Variable nicht verändert, sondern lediglich eine
Fehlermeldung angezeigt:
Durch die Kapselung der Variablen und die Wert-Validierung in den Setter-Methoden
ist nun der interne Zustand der Duck-Objekte gesichert:
DHBW Ravensburg – Phillip Goellner 16

Neben den Setter-Methoden bieten Klassen häufig auch noch Getter-Methoden an:
Die Getter- und Setter-Methoden werden als Akzessoren (Accessor-Methods) bezeichnet,
da sie einen Zugriff auf die jeweiligen Attribute bieten.
toString
Damit man zur Laufzeit den Typ und aktuellen Zustand eines Objektes erfahren
kann, bietet es sich an, für jede eigene Klasse die toString() Methode zu definieren:
DHBW Ravensburg – Phillip Goellner 17

Vererbung
Es kann nun eine Menge abgesicherter Enten erzeugt werden, aber für
einen richtigen Zoo werden ein paar weitere verschiedene
Klassen (Tierarten) benötigt.
Bevor man mit dem Programmieren anfängt, ist es oft ratsam die
verschiedenen Klassen mit Hilfe eines UML-Klassendiagramms
zu planen:
die Art des UML-Stereotypen
der Name der Klasse
der Name des Packages
die Namen und Typen der
Attribute
die Namen der
Funktionen/Methoden
Die Ente (Duck)
kann jetzt auch:
- eat() Der Strauß (Ostrich) ist einer
- fly() der größten Vögel, aber er kann
nicht:
- layEggs()
- fly()
- move()
Wenn man Duck.java zwei mal kopiert, den Konstruktor
umbenennt und einmal fly() herauslöscht, erhält man oben
gezeigtes Ergebnis.
Wenn sich aber irgendwann das Fressverhalten aller Tiere
ändern soll [eat()], muss dreimal der gleiche Code geändert
werden. Hier gibt es eine bessere Lösung!
DHBW Ravensburg – Phillip Goellner 18

In der Biologie werden Organismen entsprechend ähnlicher Eigenschaften
hierarchisch klassifiziert (Biosystematik), z.B. für die Stockente:
Unterstamm → Klasse → Ordnung → Familie → Tribus → Gattung → Art
Wirbeltiere → Vögel → Gänsevögel → Entenvögel → Schwimmenten → Eigentliche Enten → Stockente
Mitglieder der gleichen Gruppierung haben gleiche Eigenschaften. Alle Vögel etwa:
• haben Flügel (aber nicht alle können auch fliegen)
• pflanzen sich durch Eiablage fort
Auch in Java können Hierarchien von Klassen gebildet werden. Es kann
beispielsweise eine Mutterklasse namens Bird definiert werden,
die wiederum die Methoden flapWings(), layEggs(), setAge(),
etc. enthält.
Die Unterklassen Duck, Hummingbird und Ostrich können von dieser
Mutterklasse erben. Damit stehen den Unterklassen automatisch die
Funktionalitäten der Mutterklasse Bird zur Verfügung.
In den Unterklassen müssen die Methoden der Mutterklasse folglich nicht
noch einmal implementiert werden.
Dadurch reduziert sich die Gesamtmenge des Codes erheblich.
All diese Methoden sind jetzt nur noch
einmal (statt dreimal) definiert.
DHBW Ravensburg – Phillip Goellner 19

In Java wird eine Vererbung zwischen Klassen mit folgender Syntax angezeigt:
Syntax:
class ChildClass extends ParentClass
Duck
implementiert eine
zusätzliche fly()
Methode.
Im obigen Beispiel ist Duck die Unterklasse/Kindklasse und Bird
die Oberklasse/Mutterklasse.
Unterklassen können (nahezu) beliebig zusätzliche Variablen und
Methoden definieren, welche nicht in der Mutterklasse definiert sind.
Unterklassen können Methoden aufrufen, welche bereits in der
Mutterklasse definiert sind (Markierung in magenta) – außer wenn
diese Methoden private sind.
Auch auf Variablen, die in der Mutterklasse definiert sind, kann eine
Unterklass zugreifen – außer diese Variablen sind als private markiert.
DHBW Ravensburg – Phillip Goellner 20

Im Gegensatz zu manch anderen objektorientierten Programmiersprachen
unterstützt Java keine Mehrfachvererbung, d.h. eine Klasse kann maximal von
einer Mutterklasse erben. Die Mutterklasse kann aber ihrerseits von einer
anderen Mutterklasse erben.
Dass Unterklassen automatisch die Funktionalitäten der Oberklasse erben
ist praktisch. Aus Bequemlichkeit könnte man also auf folgende Idee kommen:
Das wäre zwar technisch machbar, widerspricht aber der geltenden Konvention:
| EIN       | Unterklasse  | IST EIN  | Oberklasse        |
| --------- | ------------ | -------- | ----------------- |
| z.B.: EIN | Duck         | IST EIN  | Bird              |
| EIN       | Bird         | IST EIN  | Animal            |
| EIN       | Duck         | IST EIN  | Animal            |
| aber: EIN | Bird         | IST KEIN | VeryUsefulMethods |
Das Keyword extends ist gleich zu setzen mit „ist ein“ sowie „erbt von“.
DHBW Ravensburg – Phillip Goellner 21

Wenn eine Unterklasse eine Methode definiert und die Mutterklasse bereits
eine Methode mit derselben Signatur (Name und Parameter) enthält,
dann überschreibt die Methode der Unterklasse die Methode der Mutterklasse.
Dies wird als Method Overriding bezeichnet (nicht zu verwechseln
mit Overloading).
Bei einem Aufruf von Duck.eat() wird ausschließlich
die in Duck definierte Methode verwendet (nicht die von Bird).
Duck überschreibt die von Bird
definierte eat() Methode.
DHBW Ravensburg – Phillip Goellner 22

Bei der Beschreibung von Objekten sind vier Hauptaspekte maßgeblich,
welche auch in Klassendiagrammen dargestellt werden können:
Was ist das für ein Objekt?
Dies ergibt sich aus der Klasse (und ggf. den Mutterklassen)
sowie den implementierten Interfaces (dazu später mehr), z.B.:
EIN Duck IST EIN Bird ∧ EIN Bird IST EIN Animal → EIN Duck IST EIN Animal
logisches UND Implikation (Kettenschluss)
Was kann das Objekt?
Dies ergibt sich aus den Methoden, die das Objekt anbietet. Das wiederum
ergibt sich direkt aus der Klasse des Objekts (und ggf. den Mutterklassen/Schnittstellen)
sowie den implementierten Interfaces, z.B.:
Die Klasse Duck implementiert die fly() Methode, d.h. alle Enten können per se fliegen.
Was hat das Objekt?
Aus der Klasse ergibt sich, welche Attribute das Objekt besitzt, z.B.:
Ein Duck hat immer einen name und ein age.
Wenn eine Klasse (z.B. Zoo) eine andere Klasse (z.B. Duck) referenziert (z.B. Zoo hat
eine Variable vom Typ Duck), dann bezeichnet man diese Beziehung als Assoziation.
Eine Sonderform der Assoziation ist die Komposition, bei der die Existenz der
Unterbestandteile (z.B. Room) direkt abhängig ist von der Existenz des Ganzen
(z.B. House) ist.
Was darf man mit dem Objekt tun?
Einerseits ergibt sich das aus der Visibilität der Variablen und Methoden.
Andererseits kann der Zugriff noch feiner geregelt werden, z.B. durch Validationen
in Akzessor-Methoden (siehe die Setter-Methoden von Duck).
DHBW Ravensburg – Phillip Goellner 23

Klassendiagramme des Zoos
Kanten mit
geschlossener
Pfeilspitze zeigen eine
Was hat das Objekt? Vererbung an. Was ist das für ein Objekt?
Die Namen und Typen der Der Typ des Objekts ergibt
Attribute werden in der sich aus dessen Klasse,
Klasse definiert. Klassenhierarchie und
Bei bekannten Typen (z.B. Interfaces
int, String, File) wird
meist nicht explizit eine
Assoziation dargestellt.
Was kann das Objekt?
Die Funktionalität des
Objekts ergibt sich aus
dessen Methoden.
Was hat das Objekt?
Assoziationen mit
selbst-definierten Typen
werden mit so einer
Kante angezeigt.
D.h. der Zoo hat:
Was darf man mit dem Objekt tun?
Das Farbschema gibt die Visibilität - zwei Ducks
der Variablen und Methoden an – - einen Ostrich
und zeigt so, - einen Hummingbird
wer diese verwenden kann.
DHBW Ravensburg – Phillip Goellner 24

Statische Variablen und lokale Variablen
Bisher wurde für jedes einzelne erzeugte Duck Objekt (für jede Instanz)
ein eigener Namen und ein eigenes Alter festlegen. Für n Ducks wurden
also n Werte für je age und name gespeichert. Die dafür eingesetzten
Variablen heißen Instanzvariablen.
Mittels Klassenvariablen ist es möglich, eine Variable auf Klassen-Ebene zu
speichern. Der Variablen-Wert wird hierbei nur ein einziges mal im
Arbeitsspeicher abgelegt, egal wie viele n Objekte von der Klasse erstellt
werden. Alle Objekte der Klasse greifen auf diesen einen, instanz-
übergreifenden Wert zu. Klassenvariablen werden mittels des
Keywords static deklariert:
Syntax:
static MyType myName;
Instanzvariablen und Klassenvariablen werden immer außerhalb von
Methoden deklariert. Variablen die innerhalb von Methodenrümpfen
deklariert werden, heißen Lokale Variablen.
Variablen jeder Art (Instanzvariablen, Klassenvariablen, Lokale Variablen)
können mittels des Keywords final in Konstanten umgewandelt werden.
Für Fortgeschrittene (nicht klausurrelevant): Local-Variable Type Inference (JEP 286).
DHBW Ravensburg – Phillip Goellner 25

Statische Methoden
Es gibt auch Fälle, in denen es sinnvoll ist, dass man Methoden einer Klasse
aufrufen kann, ohne explizit mit new eine Instanz dieser Klasse zu erstellen.
Hierfür können statische Methoden (Klassenmethoden) eingesetzt werden.
Beispielsweise kann man sich so die Beschreibung zu Enten ansehen, ohne
explizit eine neue Ente mit eigenem Namen und Alter erzeugen zu müssen:
static wird vor allem aus Komfort-Gründen bei sogenannten Helper-Methoden
eingesetzt, z.B.:
out ist eine statische Konstante der Klasse println() ist eine Methode der
System. Sie hat den Typ PrintStream. Klasse PrintStream.
DHBW Ravensburg – Phillip Goellner 26

Kapitel 2 - Zusammenfassung
• Komplexe Programme können mittels Methoden strukturiert • Mittels Vererbung können Unterklassen Attribute und Methoden
werden. Der Einstiegspunkt für Java-Programme ist ihrer Überklassen übernehmen bzw. auf diese zugreifen.
die Main-Methode.
• Beim Method-Overloading haben mehrere Methoden denselben
• Bei der Objektorientierten Programmierung wird der Code auf Namen aber unterscheiden sich hinsichtlich ihrer
mehrere Klassen und Methoden verteilt. Eine Klasse ist ein Übergabeparameter (unterschiedliche Signatur).
Bauplan für einen Akteur des Programms, welcher dessen
Attribute und Methoden definiert. Auf der Grundlage jeder
Klasse können beliebig viele Objekte (Instanzen) erstellt werden. • Beim Method-Overriding ersetzt eine in der Kindklasse definierte
Methode eine andere Methode die bereits mit gleicher Signatur in
der der Überklasse definiert war.
• Mittels parametrisierter Konstruktoren können die Attribute
eines Objekts bereits bei dessen Erzeugung gesetzt werden.
• Instanzvariablen werden für jedes Objekt einer Klasse getrennt
gespeichert.
• Kapselung dient dem Schutz des inneren Zustands von Objekten
vor unzulässigen Zugriffen von außen. Hierbei wird häufig
die Visibility von Attributen eingeschränkt und der Zugriff über • Klassenvariablen (static) werden für alle Objekte einer Klasse
Akzessor-Methoden kontrolliert. zentral gespeichert. Statische Methoden können verwendet werden
' ohne explizit ein Objekt erzeugen zu müssen.
• Die Attribute und Methoden von Klassen sowie die Beziehungen
der Klassen untereinander können in einem UML Class Diagram
dargestellt werden.
DHBW Ravensburg – Phillip Goellner 27