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