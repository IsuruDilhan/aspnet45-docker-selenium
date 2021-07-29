# meant to be run inside docker container
Invoke-WebRequest http://localhost -UseBasicParsing

#.\seleniumtests\SeleniumDockerTest.exe http://localhost


cd .\seleniumtests\TestSelenium\; mvn clean test -Dsuite=regression -P=regression '-Dtestng.dtd.http=true'