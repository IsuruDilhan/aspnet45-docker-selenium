FROM dotnet/framework/aspnet-windows:4.8

RUN dism.exe /online /enable-feature /featurename:IIS-WebSockets

RUN powershell -Command Set-ExecutionPolicy Bypass -Force; iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))

RUN powershell -Command choco install googlechrome -y
RUN powershell -Command choco install firefox -y
RUN powershell -Command choco install jdk8 -y
RUN powershell -Command choco install javaruntime -y
RUN powershell -Command choco install nodejs -y
RUN powershell -Command choco install maven -y