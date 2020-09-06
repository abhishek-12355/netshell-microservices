uaa:
	docker build netshell-uaa/ -f netshell-uaa/Dockerfile -t netshell/netshell-uaa:1.0-SNAPSHOT

gateway:
	mvn clean install -f netshell-gateway/pom.xml

registry:
	mvn clean install -f netshell-registry/pom.xml