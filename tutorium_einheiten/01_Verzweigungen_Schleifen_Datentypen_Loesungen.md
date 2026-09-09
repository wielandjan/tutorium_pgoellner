# Musterlösungen — Einheit 1: Verzweigungen, Schleifen, Datentypen & Casting

**Aufgabe 1:** 1. true — 2. true — 3. false — 4. true

**Aufgabe 2:**
```java
void run() {
    int x = 23;
    if (x > 20) {
        System.out.println("groß");
    } else {
        if (x % 2 == 0) {
            System.out.println("gerade");
        } else {
            System.out.println("ungerade");
        }
    }
}
```

**Aufgabe 3:**
```java
void run() {
    for (int i = 1; i <= 30; i++) {
        if (i % 3 == 0) {
            printToConsole(i);
        }
    }
}
```

**Aufgabe 4:**
1. Bei der `while`-Schleife wird die Bedingung vor dem Schleifenrumpf geprüft (Rumpf kann 0-mal laufen). Bei der `do`-Schleife wird die Bedingung nach dem Rumpf geprüft (Rumpf läuft mindestens 1-mal).
2. `continue;` bricht die aktuelle Wiederholung ab und springt zur nächsten Iteration der Schleife.

**Aufgabe 5:**
1. `3` (Integer-Division, Nachkommastellen werden abgeschnitten)
2. `3.0` (Division erfolgt noch als int-Division `7/2=3`, danach erst automatische Umwandlung zu double)
3. `3.5`
4. `4`
5. `5` (`(int) 5.0`)
6. `15.0` (`(int)(3.8) = 3`, `5 * 3 = 15`, als double `15.0`)

**Aufgabe 6:**
1. z.B. `int`, `long` — auch `short` oder `byte` korrekt
2. `float`/`double` sind ungenau (Fließkomma-Rundungsfehler) — für exakte Werte gibt es `BigDecimal`/`BigInteger`
3. Der kleinere Datentyp wird automatisch verlustfrei in den größeren umgewandelt (gemäß Hierarchie byte→short→int→long→float→double)

**Aufgabe 7:**
```java
void run() {
    for (int i = 1; i <= 20; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }
}
```
