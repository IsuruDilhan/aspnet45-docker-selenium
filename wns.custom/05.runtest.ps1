# meant to be run inside docker container
Invoke-WebRequest http://localhost -UseBasicParsing

#copy settings.xml to .m2 folder
cp \seleniumtests\settings.xml \Users\ContainerAdministrator\.m2

Set-Location \seleniumtests\TestSelenium\; mvn clean test -Dsuite=regression -P=regression '-Dtestng.dtd.http=true'

Set-Location \seleniumtests\uniqueBuildTest\; mvn -Dtest=testUniqueBuild#testGoogleSearchAutomateTest27e test '-Dfile.encoding=UTF8'

Set-Location \