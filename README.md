# Movie Application with OAuth2
This is simplest spring boot Movie application which provide the OAuth2 security using the library(OAuth2KeycloakLib) and keycloak authorization server.

## Sequence Diagram 
<br/>
<img src="images/Diagram.png">	
<br/><br/>


## Command for run the keycloak using docker compose 
`
	docker-compose up
`

## Keycloak UI
`
	http://localhost:8080
	
### Keycloak login screen
username: admin <br/>
password: admin <br/>
<br/>
<img src="images/keycloak_login.gif">	
<br/><br/>

### Keycloak create realm 
<br/>
<img src="images/create_realm.gif">	
<br/><br/>

### Keycloak create client
<br/>
<img src="images/create_client.gif">	
<br/><br/>

### Keycloak create role and user
<br/>
<img src="images/create_role_user.gif">	
<br/><br/>

## Movie application Rest Api
`
	http://localhost:8880/movies
`	

### Get the JWT token using postman
Request Body contains:- <br/>
* grant_type:password
* scope:openid
* client_id:test_client
* client_secret:33a80087-2cff-4ed7-b8b4-6a7299e96b42
* username:rai
* password:password

<br/>
<img src="images/get_Token.gif">	
<br/><br/>

### Movie Rest api call using postman
<br/>
<img src="images/call_movie_api1.gif">	
<br/><br/>

### Swagger Documentation Movie Rest api
you need to provide the token in the header for swagger documentation response in json.  
<br/>
<img src="images/swagger_api_docs.PNG">	
<br/><br/>

