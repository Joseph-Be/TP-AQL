# TP1 – Tests unitaires et couverture

## Exercice 1 – Palindrome

### Bug détecté

Lors de l’écriture des tests unitaires pour la méthode `isPalindrome`, le test suivant pose problème :

```java
assertTrue(Palindrome.isPalindrome("kayak"));
```
La cause : 
```java
while (i < j) {
    if (s.charAt(i) != s.charAt(j)) {
        return false;
    }
    j++;
    i--;
}
```
## Exercice 2 – Anagram

### Problème détecté

La boucle utilise la condition :
```java
for (int i = 0; i <= s1.length(); i++)
```
Cela peut provoquer un dépassement d’indice.

### Cause

La condition `<=` parcourt un indice qui n'existe pas dans le tableau.

### Correction proposée
```java
for (int i = 0; i < s1.length(); i++)
```

## Exercice 3 – BinarySearch

### Problème détecté

Le code fourni utilise :

```java
while (low < high)
```
Cela empêche de tester correctement le dernier cas où low == high.

### Correction proposée
```java
while (low <= high)
```

## Exercice 4 – QuadraticEquation

Aucun bug évident détecté dans le code fourni.

Les tests couvrent les cas suivants :
- a == 0 → exception
- delta < 0 → null
- delta == 0 → une racine
- delta > 0 → deux racines

Remarque :
Pour cet exercice, les jeux de tests de couverture de lignes, de branches et de conditions sont très proches.

## Exercice 5 – RomanNumeral

### Problèmes détectés

Le code fourni contient deux erreurs :

1. La boucle `for` utilise :
   `for (int i = 0; i <= symbols.length; i++)`

2. La boucle `while` utilise :
   `while (n > values[i])`

### Causes

- Dans la boucle `for`, la condition `<= symbols.length` est incorrecte, car le dernier indice valide est `symbols.length - 1`. Cela peut provoquer un dépassement d’indice.
- Dans la boucle `while`, la condition `>` est incorrecte. Elle empêche de traiter les cas où `n` est exactement égal à une valeur romaine, par exemple 1, 4, 5, 9, 10, etc.

### Correction proposée

```java
for (int i = 0; i < symbols.length; i++) {
    while (n >= values[i]) {
        sb.append(symbols[i]);
        n -= values[i];
    }
}
```


## Exercice 6 – FizzBuzz

### Problème détecté

Le code fourni contient la condition :

```java
if (n <= 1) {
    throw new IllegalArgumentException("n must be positive");
}
```
### Cause
Cette condition rejette la valeur `1`, alors que `1` est un entier positif.

Il y a donc une incohérence entre :

- la condition `n <= 1`

- le message `"n must be positive"`
### Correction proposée
```java
if (n < 1) {
    throw new IllegalArgumentException("n must be positive");
}
```