Use Eclipse Luna 4.4.2 or later to avoid any project import issues but will likely work fine with other versions.
<br>
The app is built using three eclipse projects: LegacyEJB, InfoWeb, and Nostalgia (EAR).   After you import to eclipse, make sure the Nostalgia EAR project properly links with the other two projects.
<br>
<br>
push to CF from the Deploy folder:<br>
    cf push -b https://github.com/cloudfoundry/ibm-websphere-liberty-buildpack<br>
    <br>
    
    The app will be deployed inside Websphere Liberty App Server on Pivotal Cloud Foundry
