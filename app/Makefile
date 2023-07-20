# Makefile
.PHONY: build

run: # Run app
	./build/install/app/bin/app

build: # Build app
	./gradlew clean
	./gradlew installDist

lint: # Check code style
	./gradlew checkstyleMain

test: # Test code
	./gradlew test

last: # Last version plugin
	./gradlew useLatestVersions