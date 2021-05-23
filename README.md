# Camel K Telegram Chat Bot

This project uses Camel K to fetch Chuck Norris from the web. 

Status: Currently playing around with it but this is the basic version.

## Setup

You will need the following :

1. Local Kubernetes Cluster (Minikube etc)
2. Installed [Camel K](https://camel.apache.org/camel-k/latest/installation/installation.html) on a namespace of your choice (use Helm chart [here](https://artifacthub.io/packages/helm/camel-k/camel-k) or manually install via the Kamel CLI with `kamel install`)
3. Download the Kamel CLI
3. Your own Telegram bot

Replace token placeholder inside `TelegramBotRoutes.java` with your own telegram bot token.

Run the integration in your cluster with 

> `kamel get TelegramBotRoutes.java --dev -n <your-namespace>`


## FAQs

WIP

