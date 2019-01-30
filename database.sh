#!/bin/bash
sudo mongorestore --db Football_WebApp --drop /database_start
mongod --bind_ip 0.0.0.0