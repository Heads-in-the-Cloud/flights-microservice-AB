#!/bin/sh
http_status_code=$(curl -X GET -s -o /dev/null -w '%{http_code}' http://localhost:$1/api/flights)
[ 403 -eq $http_status_code ]