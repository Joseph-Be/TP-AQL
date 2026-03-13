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