# adding in sap
FROM wincustombasecontainer

RUN mkdir sap

# copy sap files
COPY ./sapfiles/ /sap/

# installing sap packages
RUN powershell -Command C:\\sap\\PRES1\\GUI\\WINDOWS\\Win32\\Setup\\NwSapSetup.exe /Product:"SAPGUI+KW+GUIISHMED+SAPWUS+NWBC65+SCE+SapBI" /silent

RUN powershell -Command Start-Sleep -s 300

RUN dir \