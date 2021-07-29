C:\seleniumtests\Add-Font.ps1 C:\seleniumtests\Fonts

# meant to be run inside docker container
Invoke-WebRequest http://localhost -UseBasicParsing

#.\seleniumtests\SeleniumDockerTest.exe http://localhost


cd .\inetpub\wwwroot\TestSelenium\; mvn clean test -Dsuite=regression -P=regression '-Dtestng.dtd.http=true'