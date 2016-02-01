cf create-service p-mysql 100mb-dev cities-db
cf push cities-service -p cities-service.jar --random-route --no-start
cf bind-service cities-service cities-db
cf push cities-ui -p cities-ui.jar --random-route --no-start
url=`cf app cities-service  | grep urls: | sed -e 's/urls: //'`
cf cups dev-cities-ws -p '{"tag": "cities", "uri": "http://'$url'"}'
cf bind-service cities-ui dev-cities-ws
cf start cities-service
cf start cities-ui
