Create the springcloudconfigserver project with the dependencies as mentioned in pom.xml

Note the use of @enableConfigServer
Note the entries in bootstrap.properties

create folder by the path and name  as mentioned in properties file

create the config-server-client.properties file
create the config-server-client-development.properties file
create the config-server-client-production.properties file
make key value pair entries

Git must be installed

from command prompt within the above folder
git init 
git add .
git commit -m "initial checkin"

after any new file is added to above folder or any existing file is modified again

git add .
git commit -m "test"

run the project as spring boot app

invoke URL : 
localhost:9088/config-server-client/production

****************************************************************************

Create the springcloudconfigclient project with dependenciesas mentioned in pom.xml

Code in the controller class note @RefreshScope
and the methods and attributes

make entries in bootstrap.properties

run the project as spring boot app

invoke URL :
localhost:8080/msg

now change the property in properties file to development

rerun the project
again invoke the url


