## 🚀 README - Mise en place de la stack ELK (Elasticsearch, Logstash, Kibana)

### 📌 Prérequis
#### Avant de commencer, assurez-vous d'avoir installé :

- 🐳 Docker
- 📦 Docker Compose
- 🐫 Elastisearch, Kibana et Logstash
### 🚀 Lancer les services:
Créez un fichier docker-compose.yml avec le contenu suivant :
![alt text](image-12.png)
![alt text](image-13.png)
![alt text](image-14.png)
### Démarrez les services avec la commande suivante :
````sh
docker compose up
````
![alt text](image-1.png)
### 📌 Les conteneurs sont maintenant en cours d'exécution :
![alt text](image.png)
### 🔍 Accéder à Kibana et configurer les logs:
#### 1️⃣ Ouvrez Kibana dans votre navigateur et suivez les étapes ci-dessous :
![alt text](image-2.png)
#### 2️⃣ Cliquez sur "Sample Web Logs"
![alt text](image-3.png)
#### 3️⃣ Allez dans Management > Settings et éditez le Data View
![alt text](image-4.png)
#### 4️⃣ Vous verrez maintenant les logs de Kibana et ceux de votre application
![alt text](image-5.png)
### 📊 Vérifier l'Index Management:
#### Accédez à la section Index Management pour valider vos données :
![alt text](image-6.png)
![alt text](image-7.png)
![alt text](image-8.png)
### ✅ Visualiser les logs de l'application:
#### Vous pouvez désormais voir les logs générés par votre application :
![alt text](image-9.png)
![alt text](image-10.png)
![alt text](image-11.png)

### 🚀Voilà! Votre stack ELK est maintenant prête à être utilisée ! 🎉
Auteur: Khadidiatou DIA / sokhnakhadidjah@gmail.com