Architecture Simula
=====

Notre simulation est encodée dans un package nomé SimulaGame. <br />
Ce dernier a pour fonctionnalité de contenir l'ensemble des modules nécessaires à la réalisation du projet <br />

 
Les différents modules de SimulaGame
---

 - une classe Simula qui joue le rôle de main
 - un module UI qui joue le rôle de Vue, chargé de l'interaction avec le joueur
 - un module Model qui joue le rôle de Modèle, chargé de représenter les éléments du jeu
 - un module Engine qui joue le rôle de Controleur, chargé de dynamiser Model et UI 
 - un module Adapters chargé de normaliser la communication entre les différents modules.

La classe simula contruit l'ensemble des éléments nécessaires au jeu.

UI
---
Le module UI est défini par une interface View. <br />
Celle-ci est réalisée par une classe ConcreteView. <br />
### ConcreteView
 - AbstractEngine qui définit le contrat de communication entre Engine et UI
 - Display qui affiche les informations du jeu pour l'utilisateur 
 - UserListener qui récupère les actions de l'utilisateur.

Model
---
Le module Model est défini par une interface Model.<br />
Celle-ci est réalisée par une classe ModelManager.<br />

### ModelManager
 - AbstractEngine qui définit le contrat de communication entre Engine et Model
 - CityModelManager qui permet d'accéder à la représentation de la ville 
 - PlayerModelManager qui permet d'accéder à la représentation du joueur 
 - TimeModelManager qui permet d'accéder à la représentation du temps 
 - NetworkModelManager qui permet d'accéder à la représentation des réseaux (ex: électriques et routiers) 
 - RulesModelManager qui permet d'acceder à la représentation des règles du jeu

Engine
---

Le module Engine est défini par une interface Engine.<br />
Celle-ci est réalisée par une classe ConcreteEngine.<br />

### ConcreteEngine

 - AbstractModel qui définit le contrat de communication entre Engine et Model
 - AbstractView qui définit le contrat de communication entre Engine et UI
 - ModelControler qui permet de faire les modifications sur Model 
 - GameControler qui applique les règles de jeu contenues dans Model
 - ViewControler qui capture l'ensemble des interactions entre UI et Model.

Adapters
---

Le Module Adapters contient deux classes:
 - UIEngineAdapter chargée de normaliser la communication entre UI et Engine
 - ModelEngineAdapter chargée de normaliser la communication entre Model et Engine.
