# lecteur_fichiers

## Fonctionnement

Pour faire tourner les programmes de ce dépôt, depuis le répertoire parent du répertoire fichier, il faut compiler toutes les 
classes des packages dans l'ordre :

- fichier.lecteur
- fichier.comparateur
- fichier

Ensuite, il vous suffira d'éxécuter la classe LecteurMain qui se trouve le package fichier.
Lorsque vous exécuterez cette dernière, vous disposez de 2 moyens pour spécifier quels fichiers vous souhaitez comparer et/ou lire :

- Soit le passage d'arguments de ligne de commande via le paramètre ```args``` de la méthode main.
- Soit changer directement les valeurs des variables ```nom_fichier```, ```nom_fichier2``` et ``` nom_fichier_p ``` dans la méthode main.
