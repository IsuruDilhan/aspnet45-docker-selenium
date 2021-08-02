# escape=`

# adding in sap
FROM wincustombasecontainer

RUN mkdir sap

# copy sap files
COPY ./sapfiles/ /sap/

# installing sap packages

SHELL ["powershell", "-Command", "$ErrorActionPreference = 'Stop'; $ProgressPreference = 'SilentlyContinue';"]

RUN Start-Process "C:\sap\PRES1\GUI\WINDOWS\Win32\Setup\NwSapSetup.exe" '/Product:"SAPGUI+KW+GUIISHMED+SAPWUS+NWBC65+SCE+SapBI" /silent' -Wait;

RUN ls "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs"