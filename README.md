# TP1 – Tests unitaires et couverture

## Exercice 1 – Palindrome

### Bug détecté

Lors de l’écriture des tests unitaires pour la méthode `isPalindrome`, le test suivant pose problème :

```java
assertTrue(Palindrome.isPalindrome("kayak"));

La cause : 
```java
while (i < j) {
    if (s.charAt(i) != s.charAt(j)) {
        return false;
    }
    j++;
    i--;
}

