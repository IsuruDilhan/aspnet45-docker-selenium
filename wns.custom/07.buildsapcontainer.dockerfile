# escape=`

# adding in sap
FROM wincustombasecontainer

RUN mkdir sap

# copy sap files
COPY ./sapfiles/ /sap/

# installing sap packages

SHELL ["powershell", "-Command", "$ErrorActionPreference = 'Stop'; $ProgressPreference = 'SilentlyContinue';"]

RUN Start-Process "C:\sap\PRES1\GUI\WINDOWS\Win32\Setup\NwSapSetup.exe" '/Product:"SAPGUI+KW+GUIISHMED+SAPWUS+NWBC65+SCE+SapBI+NWBCGUI" /silent' -Wait;

RUN Start-Process -FilePath "C:\ProgramData\Microsoft\Windows\Start Menu\Programs\SAP Front End\SAP Logon.lnk"

RUN ps

RUN dir -Force .\Users\ContainerAdministrator\AppData\Roaming\SAP\Common\

RUN Stop-Process -Name saplogon