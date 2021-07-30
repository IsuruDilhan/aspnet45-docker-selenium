Write-Host "Windows Custom Build  - STEP 07 - Add sap files to win10 container"

Set-PSDebug -Trace 0
# Set-PSDebug -Off

docker build --no-cache -f 07.buildsapcontainer.dockerfile -t wincustomsap . 

docker run -d --name wincustomsaprun -p 8080:80 wincustomsap

docker container ls 

# Invoke-WebRequest http:\\localhost:5000 -UseBasicParsing

Write-Output "enter test container: docker exec -it wincustomsaprun powershell"

docker exec -it wincustomsaprun powershell