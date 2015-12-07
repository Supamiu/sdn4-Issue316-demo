# sdn4-Issue316-demo
A simple project to show a running example for SDN4 issue #316

The project is provided with a neo4j database inside data/ folder, in this database I have two Player nodes that you can get on /api/player/0 and /api/player/1

#Steps to reproduce Issue 316:
First of all, start spring-boot application:
`mvn spring-boot:run`

Then, simply make a cUrl request :
`curl -i -X POST -H 'Content-type: text/uri-list' -d 'localhost:8080/api/player/1' http://localhost:8080/api/player/0/friends`

Link to the issue: https://github.com/spring-projects/spring-data-neo4j/issues/316
