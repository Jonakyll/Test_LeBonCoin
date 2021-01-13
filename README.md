# Test_LeBonCoin

# Architecture
Pour ce test technique, j'ai adopté une architecture MVC, avec pour model la class Album,
qui contiendra toutes les informations relatives aux albums présents dans l'objet JSON fourni.
La MainActivity est le controller qui se chargera de récupérer le résultat de la requête HTTP,
et utilisera le model pour afficher la liste des albums sur la view.
La view est le fichier .xml contenant le recyclerView pour l'affichage d'une liste d'éléments.

# Les librairies utilisées
Pour effectuer la requête HTTP, j'utilise la librairie Volley. Elle utilise une approche
asynchrone ce qui empêche l'application de bloquer lors de la requête.
La fonction de requêtage se fait également à partir d'une class SearchTask héritant
de AsyncTask. L'appel à la méthode doInBackground effectue la requête HTTP
dans un second thread afin de ne pas bloquer la thread principale.

L'analyse de la réponse à la requête HTTP se fait grâce à la librairie Gson.
Elle transforme le résultat en objet de type utilisant des structures Java natives
(List, Map, etc) contrairement à la librairie org.json, intégrée à l'API standard
Android, qui transforme le résultat en JSONObject. Il est donc plus simple
d'utiliser la librairie Gson.

Le chargement des images pour les couvertures d'albums, j'utilise Picasso.
Une première tentative avec URL et BitmapFactory pour récupérer les iamges
n'a pas permis de charger ces images (d'autres images provenant d'une autre source
ne posaient aucun problème). Picasso s'utilise très simplement,
en fournissant l'URL de l'image à charger, et l'ImageView dans laquelle il faut
insérer l'image.
