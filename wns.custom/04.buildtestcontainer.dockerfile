# adding in tests
FROM wincustombasecontainer

# Install chocolately, pretty much game on after that

RUN mkdir seleniumtests 
# RUN mkdir seleniumtests/assets

# copy in our website
# COPY ./MvcHelloWorld45/publish/ /inetpub/wwwroot/
COPY ./mvchelloworld45/  /inetpub/wwwroot/
# copy in the tests
COPY ./SeleniumDockerTest/ /seleniumtests/

# chromedriver is bundled into the official nuget
# make sure geckodriver is there with the selenium tests
COPY ./assets/geckodriver-v0.24.0-win64/ /seleniumtests/
COPY ./05.runtest.ps1 /

# chrome needs fonts to be installed in 2019lts image to work
RUN powershell -Command C:\\seleniumtests\\Add-Font.ps1 C:\\seleniumtests\\Fonts

# install selenium test package
RUN powershell -Command cd C:\\seleniumtests\\TestSelenium\\; mvn clean test -Dsuite=regression -P=regression '-Dtestng.dtd.http=true';

USER ContainerAdministrator
RUN dir \inetpub\wwwroot\