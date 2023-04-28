# gestiondestock
Gestion de Stock

On souhaite développer une application de gestion de stock pour répondre aux besoins de nos clients.

Cette application permet de:
	- Créer des profils pour chaque entreprise.
	- Une entreprise a un ou plusieurs utilisateurs
	- Paramétrer les catégories d'articles (produit)
	- Une entreprise a un ou plusieurs articles (produit)
	- Une entreprise a un ou plusieurs Client, Fournisseur, …
	- Passer des commandes clients
		○ Une commande client a un seul client
		○ Une commande client a un ou plusieurs articles (produits)
		○ Une commande client effectue une sortie de stock pour les articles en question
		
	- Passer des commandes fournisseurs
		○ Une commande fournisseur a un seul client
		○ Une commande fournisseur a un ou plusieurs articles (produits)
		○ Une commande fournisseur effectue une entrée de stock pour les articles en question
		
	- Effectuer des ventes au magasin
		○ Une vente a un ou plusieurs articles
		○ Une vente effectue une sortie de stock pour les articles en question
	- Consulter l'état du stock de chaque article
		○ Voir la quantité de stock de l'article en temps réel
		○ Effectuer des corrections de stock (mettre à jour le stock)

L'application doit pouvoir envoyer automatiquement des emails aux fournisseurs lors de la création d'une nouvelle commande fournisseur en se basant sur un Template prédéfini

L'application doit pouvoir envoyer un email de confirmation aux clients lors de la création de la commande client en utilisant un Template prédéfini

L'application doit afficher une notification lorsqu'un article (produit) atteint un seuil minimal de stock

L'application doit avoir un tableau de bord qui affiche les statistiques (à définir)

L'application offre une console d'administration pour les entreprises pour gérer les utilisateurs et le paramétrage

L'application offre un historique des commandes d'un client / Fournisseur

L'application offre un état d'avancement des commandes

L'application doit être sécurisée avec un système d'authentification
		
		
		
		Diagramme
![image](https://user-images.githubusercontent.com/89779513/235141916-b542e37d-15c6-4eda-a53b-3b9e53ef716e.png)
