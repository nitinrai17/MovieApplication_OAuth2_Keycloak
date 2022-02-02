# Movie Application with OAuth2
This is simplest spring boot Movie application which provide the OAuth2 security using the library(OAuth2KeycloakLib) and keycloak authorization server.
<br/>

## Command for run the application using docker compose 
`
	docker-compose up
`
<br/>

## Keycloak UI
`
	http://localhost:8080
`	

<br/>

## Movie application Rest Api 
`
	http://localhost:8880/movies
`	

<br/>

## OAuth2KeycloakLib jar location 
https://nitinraidev.jfrog.io/ui/native/nitin-gradle-dev/com/nitin/oauth2/lib/OAuth2KeycloakLib/0.0.1-SNAPSHOT/
<br/>
https://github.com/nitinrai17/OAuth2KeycloakLib

<br/>

## Gradle build and run command 
you need to setup jfrog cloud artifactory and provide the credential in the gradle.properties file.(https://jfrog.com/start-free/) <br/>

```
	gradlew clean build bootRun
```
<br/>
<br/>

## Docker build and run command 
```
	docker build . -t nitinrai17/movieapplication


	docker run --network oauth20_default -e KEYCLOAK_URL='http://keycloak:8080/' -p 8880:8880 nitinrai17/movieapplication 

```
