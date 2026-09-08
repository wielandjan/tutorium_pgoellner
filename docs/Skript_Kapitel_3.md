PROGRAMMIERUNG I
Kapitel 3: Rekursion, Datenstrukturen und Fehler

Arrays
Instanziierung und Zugriff
Aktuell kann die Zoo-Klasse in ihren Variablen maximal vier Tiere
aufnehmen. Ein richtiger Zoo hat aber natürlich weitaus mehr Tiere.
Dafür die Zoo-Klasse um unzählige weitere Instanzvariablen zu
erweitern ist nicht praktikabel. Stattdessen kann eine neue
Datenstruktur verwendet werden: Arrays.
Ein Array ist ein Container für eine feste Anzahl an Objekten
desselben Typs, etwa vergleichbar mit einem Regal für typgleiche
Objekte. Einmal festgelegt, kann die Größe eines Arrays nicht
mehr verändert werden.
Arrays werden folgendermaßen deklariert und instanziiert
(zu beachten sind die eckigen Klammern):
Syntax (Deklaration eines Arrays): Syntax (Deklaration und Instanziierung eines Arrays der Größe size):
Type[] arrayVar; Type[] arrayVar = new Type[size];
Die Elemente innerhalb eines Arrays werden über deren
Index-Position referenziert:
Syntax (Ablegen des Wertes someVariable an der Position index): Syntax (Lesen des Wertes someVariable von der Position index):
arrayVar[index] = someVariable; someVariable = arrayVar[index];
Die erste Index-Position ist immer 0, die letzte Index-Position ist
dementsprechend Größe minus 1.
Arrays können für Klassen (z.B. String[] oder Duck[]) als auch für
primitive Datentypen (z.B. int[] oder double[]) angelegt werden.
Wenn an einer Position des Arrays noch kein konkreter Wert
abgelegt wurde, so liefert ein Lesezugriff auf diese Position
den Wert null zurück (bzw. 0 bei primitiven Zahl-Datentypen).
DHBW Ravensburg – Phillip Goellner 2

Iteration
Um dieselbe Aktion für jedes Element innerhalb eines Arrays
auszuführen, kann über das Array iteriert werden.
Hierfür kann die bekannte for-Schleife verwendet werden:
DHBW Ravensburg – Phillip Goellner 3

Eine modernere (und kürzere) Variante der Iteration ist die ForEach-Schleife:
Syntax:
for (ElementType currentElement : arrayVariable) {
// in jeder Iteration referenziert currentElement auf das jeweils aktuelle Array-Element.
}
Beispiel:
Die Iteration erfolgt über alle Array-Indizes – egal ob dort der Wert null vorliegt.
DHBW Ravensburg – Phillip Goellner 4

Erweiterte Objektorientierung
Polymorphie
Der Zoo fasst jetzt eine ordentliche Anzahl an Ducks, Ostrichs und
Hummingbirds. Alle Objekte werden in einem von insgesamt 3 tierart-
spezifischen Arrays gespeichert. Um eine komplett neue Tierart
hinzuzufügen, müsste ein weiteres Array erzeugt werden.
Da größere Zoos aber oft mehrere hundert verschiedene Tierarten
enthalten, ist das Hinzufügen von hunderten Arrays keine praktikable
Lösung.
Da Java Polymorphie unterstützt, können alle Ducks, Ostrichs und
Hummingbirds einfach in demselben Animal-Array (oder Bird-Array)
gespeichert werden, denn jedes einzelne dieser Objekte IST ja auch
ein Animal und Bird (aber nicht jedes ist ein FlyingBird), z.B.:
Polymorphie bedeutet „Vielgestaltigkeit“, d.h. dass für ein und
dasselbe Objekt mehrere dieser Aussagen gleichzeitig gelten
können „Das Objekt IST EIN …“ – z.B.:
EIN Duck IST EIN Animal
EIN Duck IST EIN Bird
EIN Duck IST EIN FlyingBird
Im genannten Beispiel erstreckt sich die Polymorphie auf alle
Überklassen (von Duck). Tatsächlich erstreckt sich Polymorphie
zusätzlich auch auf implementierte Interfaces – dazu später mehr.
Polymorphie funktioniert nur bei Objekt-Datentypen (nicht bei primitiven).
DHBW Ravensburg – Phillip Goellner 5

Polymorphie bedeutet:
Variablen können nicht nur Objekte des angegebenen Typs fassen,
sondern auch Objekte eines entsprechenden Subtyps (Unterklasse oder
Interface):
Methoden akzeptieren als Übergabeparameter nicht nur die angegebenen
Typen, sondern auch alle entsprechenden Subtypen:
Rückgabewerte von Methoden dürfen dem angegebenen Typen
entsprechen oder einem Subtypen:
Verwendung der Java-Basisklasse
Math. Für Details dazu, bitte das
entsprechende JavaDoc ansehen.
Es wird erst zur Laufzeit entschieden, welche Methode aufgerufen wird.
Dabei wird diejenige Methode ausgeführt, die in der Klasse am
niedrigsten im Vererbungsbaum implementiert ist. Wenn beispielsweise
sowohl Animal als auch Duck eine toString() Methode definieren, dann
wird hier die Methode der Duck-Klasse aufgerufen (welche die Methode
von Animal überschreibt):
DHBW Ravensburg – Phillip Goellner 6

Beispiel der Polymorphie im Zoo
DHBW Ravensburg – Phillip Goellner 7

Um zur Laufzeit den tatsächlichen Typen eines beliebigen Objekts
ermitteln zu können, gibt es folgende Möglichkeiten:
1. Jedes Objekt besitzt die Methode getClass(), mittels welcher
zur Laufzeit der Name der tatsächlichen Klasse ermittelt werden kann.
Damit können wir z.B. die toString() Methode einmal an zentraler
Stelle (Animal) definieren und dadurch Redundanz vermeiden:
2. In Verzweigungen kann das Keyword instanceof verwendet werden:
DHBW Ravensburg – Phillip Goellner 8

Wenn der Typ des tatsächlichen Objekts (rechts) garantiert gleich dem
Typ des Bezeichners ist (einfachster Fall), dann handelt es sich nicht
um Polymorphie und es ist keine Typumwandlung erforderlich:
Bezeichner [links] == tatsächliches Objekt [rechts]
Wenn das tatsächliche Objekt (rechts) garantiert ein Subtyp des
Bezeichners ist („[rechts] ist garantiert ein [links]“), dann führt Java die
Umwandlung des Typen (das Casting) automatisch (implizit) durch,
da hierbei kein Risiko für Casting-Fehler besteht:
Bezeichner [links] > tatsächliches Objekt [rechts]
Wenn nicht garantiert werden kann, dass das tatsächliche Objekt (rechts)
ein Subtyp des Bezeichners ist („[rechts] ist möglicherweise kein [links]“),
dann kann bei Bedarf eine manuelle (explizite) Typumwandlung
durchgeführt werden. Da hierbei das Risiko für Casting-Fehler besteht,
sollte vor dem Casting mittels instanceof sichergestellt werden,
dass „[rechts] ist in diesem Fall ein [links]“:
Prüfen, ob (if) die Variable animal ein
Objekt vom Typ Duck enthält
Bezeichner
[links]
tatsächliches Objekt
[rechts]
expliziter Cast von
animal auf Duck
DHBW Ravensburg – Phillip Goellner 9

Interfaces
~
Bisher haben wir innerhalb der Animals zwischen Birds und FlyingBirds
unterschieden. Neben der Flugfähigkeit gibt es aber noch weitere
Aspekte, anhand derer Vögel unterschieden werden können und die
für den Zoo relevant sind, z.B.:
MigratoryBirds (Zugvögel) vs. ResidentialBirds (Standvögel)
WaterBirds (Wasservögel) vs. FieldBirds (Feldvögel) vs. ForestBirds (Waldvögel)
HerbivoreBirds (Pflanzenfresser) vs. CarnivoreBirds (Fleischfresser) vs. OmnivoreBirds (Allesfresser)
Um dies mit Vererbung abzubilden, müssten wir eine Menge
weiterer Unterklassen von Bird erstellen, z.B.:
• OmnivoreMigratoryFlyingWaterBird (z.B. für Duck)
• HerbivoreResidentialNonFlyingFieldBird (z.B. für Ostrich)
• HerbivoreResidentialFlyingForestBird (z.B. für Hummingbird)
Die Einführung weiterer Tierarten oder Aspekte würde sicherlich zu
einer Explosion der verschiedenen Zwischen-Klassen führen. Diese
Art der ausschließlich hierarchischen Gruppierung von Klassen ist
daher nicht zielführend.
Dieses Problem lässt sich durch die Verwendung von Interfaces lösen.
DHBW Ravensburg – Phillip Goellner 10

Ähnlich zu Klassen, können Interfaces anzeigen, was ein Objekt kann.
Ein Interface ist eine normale Java Class-Datei, welche jedoch
ausschließlich eine beliebige Anzahl an Methodensignaturen enthält.
D.h. ein Interface hat niemals Methodenrümpfe, Schleifen oder
Verzweigungen:
Syntax (Definition eines Interfaces welches zwei Methoden definiert):
public interface MyInterface {
void myMethod(); keine Methodenrümpfe!
int myOtherMethod(long myParameter);
}
Ein Interface definiert, WAS ein Objekt können muss.
Eine Klasse definiert, WIE genau die geforderte Funktionalität
implementiert ist.
Konkrete Java-Klassen können (mehrere) Interfaces implementieren
und damit anzeigen dass sie alle im Interface definierten
Funktionalitäten bereitstellen:
Syntax:
public class MyClass implements MyInterface, OtherInterface
Wenn eine konkrete Klasse ein Interface implementiert, muss sie
zwingend alle im Interface angegebenen Methoden implementieren
(d.h. die zu den Methodensignaturen gehörigen Methodenrümpfe
ausprogrammieren).
Wenn eine Klasse ein Interface implementiert, dann nimmt sie den
Typen des implementierten Interfaces an (IST EIN). Somit kann eine
Klasse mehrere Typen gleichzeitig annehmen (Polymorphie).
Es ist auch üblich, Interfaces zu definieren welche überhaupt keine
Methoden definieren. Diese werden als Marker-Interfaces bezeichnet.
DHBW Ravensburg – Phillip Goellner 11

Ein Interface kann von anderen Interfaces erben – sogar von mehreren
gleichzeitig:
Syntax:
public interface MyInterface extends OtherInterface, OneMoreInterface
Es ist möglich, aber unüblich, in Interfaces Variablen zu deklarieren.
Diese werden automatisch in Klassen-Konstanten (static final)
umgewandelt.
Häufig wird bei der Entwicklung von Software zuerst definiert,
WAS die verschiedenen Programmkomponenten tun sollen,
d.h. die entsprechenden Interfaces werden definiert. Erst danach
wird in den konkreten Klassen implementiert, WIE genau diese
Funktionalitäten umgesetzt werden.
Eine API (Application Programming Interface) definiert ein oder
mehrere Interfaces mit den zugehörigen Methodensignaturen.
Häufig sind diese besonders umfangreich dokumentiert um
dritten einen leichtes und umfassendes Verständnis zu ermöglichen.
In einigen Fällen existieren für eine API mehrere konkurrierende
Implementierungen, die ggf. von unterschiedlichen Teams erstellt
wurden (Beispielsweise wird die Java Persistence API
implementiert von Hibernate, EclipseLink, DataNucelus, ObjectDB…).
DHBW Ravensburg – Phillip Goellner 12

Beispiel der Verwendung von Interfaces bei der Duck-Klasse:
DHBW Ravensburg – Phillip Goellner 13

Beispiel eines Zoos welcher die Ernährungsgewohnheiten der Animals berücksichtigt:
Vererbung
Assoziation („ist ein…“)
Implementierung („kann…“
(„hat ein …“)
bzw. „ist ein…“)
Creature steht
hier für
Lebewesen.
DHBW Ravensburg – Phillip Goellner 14

Interfaces und Polymorphie
Der Typ eines Objekts wird durch dessen konkrete Klasse sowie
die Interfaces bestimmt, welche durch die konkrete Klasse implementiert
werden.
Die Polymorphie erstreckt sich nicht nur auf Klassen,
sondern schließt auch Interfaces mit ein.
Beispiel (alle untenstehenden Operationen sind so zulässig):
Im Heap existiert nur ein einziges
Objekt der konkreten
Klasse Duck.
Impliziter Cast, denn
ein Duck IST EIN Animal.
Die Variable animal verweist auf das
einzige Duck-Objekt.
Impliziter Cast, denn
ein Duck IST EIN Omnivore.
Die Variable omnivore verweist auf
das einzige Duck-Objekt.
DHBW Ravensburg – Phillip Goellner 15

Abstrakte Klassen
Da alle Objekte vom Typ Bird mit den Flügeln flattern [flapWings()]
und Eier legen [layEggs()] können und diese Methoden aktuell bei
allen Vögeln gleich funktionieren, sind diese nach wie vor an
zentraler Stelle in der Klasse Bird implementiert.
Dank Polymorphie sind folgende Instanziierungen möglich:
Sowohl die Variable als auch das
Objekt haben den Typ Duck.
EIN Duck IST EIN Bird, daher
funktioniert auch diese Zuweisung.
Aber wie sieht es denn mit Bird-Objekten aus?
Das scheint etwas merkwürdig; wie
genau soll denn ein Bird-Objekt
aussehen?
Von einem Bird sollte es keine Objekte geben, nur von konkreten
Unterklassen, denn ein Vogel ist mehr ein abstraktes Konzept als
ein konkretes Tier.
In Java können Klassen, die niemals instanziiert werden sollen,
als abstract markiert werden:
Syntax:
public abstract class MyClass
DHBW Ravensburg – Phillip Goellner 16

Ähnlich zu flapWings()und layEggs() können alle Vögeln ein
Geräusch von sich geben [makeNoise()], doch ähnlich wie mit der
abstrakten Klasse Bird, kann man die Frage stellen, wie ein
generisches Vogelgeräusch klingen mag.
Es ist viel sinnvoller, dass jede konkrete Unterklasse von Bird eine
eigene makeNoise() Methode implementiert. Hierfür bietet
Java die Möglichkeit abstrakter Methoden:
Syntax:
abstract Type myMethod(ParamType param);
Abstrakte Methoden besitzen keinen Rumpf und ähneln
den Definitionen von Methoden in Interfaces. Klassen,
welche abstrakte Methoden enthalten, müssen abstrakte
Klassen sein. Jede konkrete Unterklasse muss jede abstrakte
Methode ihrer Mutterklasse implementieren.
Häufig erbt eine nicht-abstrakte (konkrete) Klasse von einer
abstrakten Klasse und implementiert die abstrakten Methoden
(falls vorhanden), sodass dann auch unmittelbar ein Objekt der
konkreten Klasse erstellt werden kann.
Im Gegensatz zu Interfaces sind innerhalb von abstrakten Klassen
auch Instanzvariablen und Methodenrümpfe erlaubt und üblich.
DHBW Ravensburg – Phillip Goellner 17

Beispiel des Zusammenspiels zwischen der abstrakten Klasse
Bird und der konkreten Klasse Duck:
DHBW Ravensburg – Phillip Goellner 18

Beispiel des Zoos mit Abstrakten Klassen:
Abstrakte
Klasse
Abstrakte
Methode
Implementierung der
abstrakten Methode
DHBW Ravensburg – Phillip Goellner 19

Assoziationen und Objekt-
~
Hierarchien
Alle Birds im Zoo können jetzt mit den Flügeln flattern, Geräusche machen, herumlaufen
und essen. Außerdem hat jedes Animal einen Namen und ein Alter. Um den Fortbestand
der verschiedenen Tierarten zu sichern, muss es den Tieren möglich sein, Nachkommen
zu zeugen. Dafür muss die bestehende layEggs() Methode verbessert werden.
Anforderungen:
In der Klasse Bird soll die neue Instanzvariable Bird.female (boolean) das
1 jeweilige Geschlecht angeben. Die zugehörigen Akzessor-Methoden sollen
ebenfalls hinzugefügt werden.
Die Konstruktoren von Duck, Hummingbird und Ostrich sollen so erweitert
2 werden, dass man bei der Objekt-Erzeugung das Geschlecht mit angeben muss.
In der Klasse Bird soll die neue Instanzvariable Bird.children (Bird[])
3 hinzugefügt werden. Füge die entsprechende Getter-Methode hinzu. Eine
Anpassung des Konstruktors ist nicht nötig.
Jede konkrete Subklasse von Bird muss zwingend eine eigene layEggs()
4 Methode implementieren. Sie hat keine Übergabeparameter oder
Rückgabewerte.
Implementiere die Methode layEggs() zuerst in der Duck-Klasse. Wird die
5 Methode bei der Mutter aufgerufen, werden vier neue Objekte angelegt,
die den gleichen Typ wie die Mutter haben (z.B. Duck). Jedes Küken hat das Alter
0. Es werden zwei weibliche und zwei männliche Küken angelegt.
Wird layEggs() bei einem männlichen Bird aufgerufen, soll eine Fehlermeldung
6 auf der Konsole ausgegeben werden.
Wenn ein weiblicher Bird schon einmal zuvor Eier gelegt hat, so kann er nicht
7 nochmal Eier legen.
Die Instanz-Methode Bird.listAllChildren() soll die Infos aller
8 Nachkommen auf der Konsole ausgeben.
Setze die Methode layEggs() auch für alle anderen Unterklassen von Bird um.
9
DHBW Ravensburg – Phillip Goellner 20

Der folgende Quellcode setzt alle genannten Anforderungen um:
X
1
3 2
4
6
7
8
5
3
1
1
DHBW Ravensburg – Phillip Goellner 21

Mittels der neuen Methode Zoo.breedingSeason() bekommen alle
| weiblichen Objekte von Typ Bird Kinder: | Der Test-Code: | X   |
| --------------------------------------- | -------------- | --- |
Das Ergebnis:
DHBW Ravensburg – Phillip Goellner 22

Der Zoo wurde von einer ornithologischen Studie kontaktiert, die sich
mit der Erforschung der maternalen mitochondrialen DNA beschäftigt.
Um sich bestmöglich auf die Studienteilnahme vorzubereiten, soll eine
einfache Möglichkeit bestehen für jeden Duck das Muttertier zu
ermitteln. Außerdem soll es einige Möglichkeiten geben Informationen
über die Verwandtschaft von verschiedenen Tieren auszugeben bzw. zu
ermitteln.
Das sollen folgende Änderungen implementiert werden:
• Es soll ein neues Attribut eingeführt werden, welches eine Referenz
auf die jeweilige Mutter jedes Ducks enhält
• Eine Methode soll implementiert werden, die ermittelt, ob zwei
gegebene Ducks miteinander verwandt sind (sofern bekannt)
• Die Ahnenlinie aller Mütter soll mit einer Methode ausgegeben werden
(älteste Mutter zuletzt)
DHBW Ravensburg – Phillip Goellner 23

Rekursion
Da das Muttertier eines Duck Objektes ebenfalls den Typen Duck hat,
verweist das Feld Duck.mother gewissermaßen auf sich selbst. Man
spricht dabei von einem rekursiven Datentyp, was ein Datentyp ist, der
eine Referenz auf sich selbst hält.
Mit der Methode Duck.getOldestFemaleAncestor() soll dasjenige
Duck Objekt gefunden werden, das an oberster Stelle im Ahnenbaum
steht (der ältesten Generation angehört).
Für diese Problemstellung bietet sich die Implementierung eines
rekursiven Algorithmus‘ an:
Rekursive Referenz der
Klasse Duck auf sich
• Bei einem rekursiven Algorithmus ruft eine Methode sich selbst selbst
auf (entweder direkt oder indirekt mit ein paar Zwischenschritten).
• Diese Kette an Selbst-Aufrufen wird unterbrochen, wenn eine
definierte Abbruchbedingung erfüllt ist.
Zur Lösung dieses Problems sind lediglich die folgenden Zeilen
Code nötig, welche einen rekursiven Algorithmus umsetzen:
DHBW Ravensburg – Phillip Goellner 24

Exceptions
Bei der Softwareentwicklung sind Fehlermeldungen, Abstürze und
unerwartetes Programmverhalten alltäglich und absolut normal. Man
unterscheidet in Java grundsätzlich zwischen Fehlern, die während der
Kompilation auftreten (Compile-Time), und solchen, die zur Laufzeit
passieren (Runtime).
Im Allgemeinen kann eine hunderprozentig fehlerfreie Software nicht
garantiert werden. Es kann jedoch mittels verschiedener Arten von
Tests sichergestellt werden, dass die üblichsten Funktionen und
Konstellationen wie erwartet funktionieren (hierzu später mehr).
Fehler zur Compile-Time sind nicht zu übersehen – schließlich kompiliert
der Code gar nicht – und mit Erfahrung meist relativ schnell behebbar:
Ein anderer Teil der Fehler fällt erst zur Laufzeit auf, d.h. wenn der
entsprechende Code-Abschnitt tatsächlich ausgeführt wird. In vielen
Fällen hängt auch von den verarbeiteten Daten (z.B. fehlerhafte Eingabe)
oder Umgebungsfaktoren (z.B. Festplatte voll) ab, ob ein Fehler auftritt.
In Java werden Laufzeitfehler über Exceptions angezeigt. Wenn ein
Programmbestandteil oder die Java-Laufzeitumgebung einen Fehler
feststellt, wird ein neues Objekt vom Typ Exception erzeugt, welches
Details über den Fehler enthält:
Stacktrace die Information über die Klasse, Methode und Code-Zeile
in welcher der Fehler auftrat
Message kurze verbale Beschreibung des Fehlers
Es gibt eine Vielzahl von verschiedenen Exceptions, die in der Regel Unterklassen von
Exception sind, z.B. NullPointerException, FileNotFoundException oder
IOException.
DHBW Ravensburg – Phillip Goellner 25

Abfangen von Exceptions
Manchmal kann im Code ein gewisses Risiko nicht vermieden, eine
erfolgreiche Ausführung kann nicht garantiert werden. In vielen solchen Fällen,
muss man dem Compiler mitteilen, dass man sich das Risiko kennt und sich
dessen bewusst ist – ansonsten kann das Programm gar nicht kompiliert werden.
Dafür ist der übliche Weg explizit eine Behandlung für Exceptions zu
implementieren, was ein try/catch-Konstrukt verwendet. Hierbei kommen in Java
drei verschiedene Keywords zum Einsatz:
try Markiert einen Code-Block, welcher Code enthält, in welchem Exceptions auftreten
können. Falls im try-Block eine Exception auftritt, wird die Ausführung an der
entsprechenden Zeile abgebrochen und der zum Exception-Typ gehörende
Catch-Block aufgerufen.
catch Markiert einen Code-Block, in welchem aufgetretene Exceptions behandelt werden.
Hier kann z.B. der Fehler geloggt, fehlerhafte Daten korrigiert und/oder eine
anwendungsfreundliche Fehlermeldung erzeugt werden. Zu jedem try-Block gehört
mindestens ein catch-Block. Zu einem try-Block können optional auch mehrere
catch-Blocks angelegt werden, die jeweils verschiedene Typen (Klassen) von
Exceptions behandeln. Es ist möglich, dass im try-Block eine Exception auftritt,
welche von keinem catch-Block abgefangen wird. In diesem Fall wird die Exception
an die aufrufende Methode übergeben.
finally Markiert einen optionalen Code-Block der immer nach den try- und catch-Blöcken
ausgeführt wird, egal ob eine Exception aufgetreten ist oder nicht. Hier werden
üblicherweise Aufräumarbeiten durchgeführt, z.B. externe Ressourcen wie
Datenbankverbindungen geschlossen oder temporäre Dateien entfernt.
Syntax:
try {
// dangerous code
} catch (FileNotFoundException exception) {
exception.printStackTrace();
} catch (InterruptedException otherException) {
System.err.println(otherException.getMessage());
} finally {
// clean up
}
DHBW Ravensburg – Phillip Goellner 26

Werfen von Exceptions
Bevor Exceptions abgefangen und behandlet werden können, müssen sie
zuerst erzeutgt und geworfen werden. Das passiert innerhalt einer riskanten
Methode. Damit die Außenwelt davon erfährt, muss die Methode deklarieren,
dass sie möglicherweise eine oder mehrere Exceptions wirft. Dafür wird das
Keyword throws verwendet:
Syntax:
public void myDangerousMethod() throws IOException, InterruptedException
Um im Fehlerfall tatsächlich eine Exception zu werfen, wird zunächst ein
Objekt von Typ Exception benötigt. Dieses kann entweder mittels new neu erzeugt
werden oder existiert bereits – etwa durch weiteren Code.
Syntax: Syntax:
throw new MyException("MyMessage"); throw myException;
Zusätzlich zur Throws-Klausel sollte immer auch in den Kommentaren (JavaDoc)
beschrieben werden, in welchen Situationen eine Methode welche Art von
Exceptions wirft.
In Java wird zwischen verschiedenen Grundtypen von Fehlern unterschieden,
von denen es jeweils eine große Anzahl an weiteren Subklassen gibt, mit
Ausnahme von Throwable:
Throwable
Exception Zeigt einen Fehler an, welcher aber kein kritischer Systemfehler ist.
Die meisten Fehler sind Subklassen von Exception. Subklassen von
Exception sind Checked Exceptions.
Exception Error
RuntimeException Zeigt einen Fehler an, welcher durch die falsche Verwendung einer API,
(Checked Exception) (kritischer Systemfehler)
d.h. typischerweise einen Programmierfehler entstanden ist.
Subklassen von RuntimeException sind Unchecked Exceptions.
RuntimeException
Error Zeigt einen kritischen Systemfehler an, z.B. einen vollen Arbeitsspeicher.
(Unchecked Exception)
Einfache Programme sollten keine Errors erzeugen oder catchen.
Throwable Superklasse aller Fehler.
DHBW Ravensburg – Phillip Goellner 27

Checked vs Unchecked Exceptions
Wenn eine Methode deklariert, dass sie eine Checked Exception werfen könnte,
überprüft der Compiler alle Aufrufe dieser gefährlichen Methode. Sollte sich
nicht adäquat um eine eventuell auftretende Exception gekümmert werden,
kompiliert der Code nicht. Man kann sich auf zwei mögliche Weisen um eine
Exception kümmern:
• Die Checked Exception wird innerhalb der Methode mittels eines try/catch-Konstrukts
behandelt. In manchen Fällen ist dies aber nicht sinnvoll, weil der Fehler besser in einer
der aufrufenden Methoden behandelt werden sollte.
• Die Checked Exception wird nicht innerhalb der ursprünglichen Methode behandelt,
sondern wird an die aufrufende Methode weitergereicht (weitergeworfen).
Eine Exception weiterzuwerfen bedeutet das Unausweichliche aufzuschieben. Wenn
die aufrufende Methode ihrerseits die Exception weiterwirft und sich das bis zur
Main-Methode weiterzieht, kommt es zu einem Programmabsturz.
Unchecked Exceptions können auch auf die oben gennanten Weisen behandelt werden,
allerdings ist dies nicht verpflichtend, da RuntimeExceptions zumeist auf logische
Fehler in der Programmierung zurückzuführen sind.
Wenn Exceptions auf niedrigen Ebenen komplett abgefangen werden, bekommen höhere
Programmkomponenten oder Anwendende ggf. nicht mit, dass überhaupt ein Fehler
aufgetreten ist. Es besteht daher die realistische Gefahr, dass Exceptions „versteckt“
werden und dem Anwender ein Erfolg suggeriert wird, obwohl eigentlich ein Fehler
aufgetreten ist.
Falls also eine Methode einen Fehler nicht komplett eigenständig lösen kann, ist es
häufig ratsam die Exception an die aufrufende Methode weiterzureichen.
DHBW Ravensburg – Phillip Goellner 28

Kapitel 3 - Zusammenfassung
• Arrays sind Container in welchen mehrere Objekte desselben
Typs gespeichert werden können.
• Polymorphie erhöht die Flexibilität des Codes, da bei Variablen,
Übergabeparametern und Rückgabetypen neben den angegebenen
Typen auch beliebige Subtypen verwendet werden können.
• Interfaces definieren eine Reihe von Methodensignaturen und
geben damit an, welche Funktionalitäten eine Klasse anbietet
ohne jedoch eine Implementierung zu beinhalten.
• Abstrakte Klassen können ebenfalls un-implementierte
Methodensignaturen enthalten, jedoch wie normale Klassen auch
Variablen und komplette Methoden.
• Datentypen, die sich selbst oder einen Supertypen von sich als eine
Referenz halten (ein Attribut diesen Typs hat), werden als
rekursive Datentypen bezeichnet.
• Bei einem rekursiven Algorithmus ruft sich eine Methode immer
wieder selbst auf, bis eine definierte Abbruchbedingung erfüllt ist.
• Laufzeitfehler (Exceptions) können direkt behandelt (try/catch/finally)
oder an die aufrufende Methode weitergereicht werden (oder beides).
DHBW Ravensburg – Phillip Goellner 29