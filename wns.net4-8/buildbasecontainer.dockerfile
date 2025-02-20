FROM mcr.microsoft.com/dotnet/framework/aspnet:4.8

RUN powershell -Command Add-WindowsFeature Web-WebSockets

RUN powershell -Command Set-ExecutionPolicy Bypass -Scope Process -Force; iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))

RUN powershell -Command choco install googlechrome -y
RUN powershell -Command choco install firefox -y
RUN powershell -Command choco install powershell-core -y

# Brute force installers
# RUN mkdir installers
# COPY ./installers/ /installers
# RUN ["c:/installers/ChromeStandaloneSetup64.exe", "/silent", "/install"]
# RUN ["c:/installers/Firefox Setup 66.0.3.exe", "-ms"]

# BAKE THE IMAGE HERE

