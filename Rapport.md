# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme :

## Exercices 1

Le patron de conception est un patron composite. Il n'y a pas besoin de réécrire les méthodes
car la classe vehicle implémente déjà un traitement sur tous ses composants, et notre classe hérite de Bike, et donc de Vehicle.

## Exercices 2

La patron utilisé est le composant Iterator, cela permet de pouvoir modifier le type de l'ensemble de composants sans
changer la méthode de parcours de l'ensemble, nous n'avons donc pas besoin de changer le GetVelocity()

## Exercices 3

Pour transformer la classe Clock en singleton, il faut créer une instance static unique, qu'on récupère
avec une méthode getInstance(), pour empêcher que l'utilisateur puisse outrepasser le getInstance et crée
une instance avec un new Clock(), on passe le constructeur de Clock en private.

## Exercices 4

Non, les classes Bike et Wheel ne sont pas dans le même paquetage.
La dépendance est que Wheel a besoin de Bike pour calculer la vitesse, car elle utilise la fonctionnalité getPush() de Bike
Oui, il y a déjà une abstraction : Vehicle implémente getPush() et se trouve dans le paquetage fr.polytech.sim.transport, qui est le même que celui de Wheel


## Exercices 5

## Exercices 6

La différence entre cette méthode et un singleton est qu'on peut créer plusieurs instances de Logger.
On garde l'avantage du singleton de ne pas avoir à instancier soi-même de composant, tout en ayant la possibilité
de créer plusieurs instances.

## Exercices 7

## Exercices 8

Le classe Context suit le patron de conception Facade, elle sert à limiter l'accès à l'utilisateur à certaines fonctionnalités de la classe parent ServiceLoader.
On peut avoir plusieurs lignes dans le fichier, chacune des lignes du fichier correspond à un type de classe à instancier
via le ServiceLoader.

## Exercices 9

Cette méthode utilise le patron Iterator.