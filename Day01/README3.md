
## `caesarCipher` - Implement a function to encrypt a string

---
Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.

```
Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
```
<b>
Example:

s = There's a starman waiting in the sky.

k = 3
</b>

The alphabet is rotated by <b>3</b>, matching the mapping above. The encrypted string is
<b>Wkhuh'v d vwdupdq zdlwlqj lq wkh vnb.</b>

<b>Note:</b> The cipher only encrypts letters! Symbols such as - remain unencrypted.

The method signature should be like the following:
```java
public static String ceasarCipher(String s, int k)
```

- String s: clear text
- int k: the alphabet rotation factor

## `reverseCeasarCipher` - Implement a function to decrypt a string

---
The task is to create another function that decrypts a string encrypted by `ceaserCipher`. If we have a string `a`, then `reverseCeasarCipher(ceasarCipher(a, k), k).equals(a)` should always be true for any `k`.

The method signature should be like the following:
```java
public static String reverseCeasarCipher(String s, int k)
```

- String s: clear text
- int k: the alphabet rotation factor

