# Musterlösungen — Einheit 4: Arrays & Rekursion

**Aufgabe 1:**
```java
String greeting = "Hallo";

void run() {
    String[] texts = new String[50];
    texts[0] = greeting;
}
```
3. `null` (bzw. `0` bei primitiven Zahl-Datentypen).
4. Die Größe eines Arrays ist fix und kann nach der Instanziierung nicht mehr verändert werden.

**Aufgabe 2:**
```java
int sum(int[] numbers) {
    int total = 0;
    for (int i = 0; i < numbers.length; i++) {
        total += numbers[i];
    }
    return total;
}
```

**Aufgabe 3:**
```java
int max(int[] numbers) {
    int largest = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > largest) {
            largest = numbers[i];
        }
    }
    return largest;
}
```

**Aufgabe 4:**
1.
```java
for (int value : values) {
    // value referenziert das jeweils aktuelle Element
}
```
2. Vorteil: kürzer/lesbarer, kein Risiko für Index-Fehler (Off-by-one). Nachteil: der aktuelle Index ist nicht direkt verfügbar, Elemente können nicht direkt über den Index verändert werden.

**Aufgabe 5:**
Eine rekursive Methode ist eine Methode, die sich selbst aufruft (direkt oder indirekt über Zwischenschritte), bis eine definierte Abbruchbedingung erfüllt ist.

**Aufgabe 6:**
```java
int sumUpTo(int n) {
    if (n == 1) {
        return 1;
    }
    return n + sumUpTo(n - 1);
}
```

**Aufgabe 7:**
```java
void countDown(int n) {
    if (n <= 0) {
        System.out.println("Start!");
        return;
    }
    System.out.println(n);
    countDown(n - 1);
}
```
