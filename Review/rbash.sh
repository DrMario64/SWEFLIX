#!/bin/bash

export GOOGLE_APPLICATION_CREDENTIALS="./swe443-reviews-9eb78de44268.json"
mvn clean install spring-boot:run
unset  GOOGLE_APPLICATION_CREDENTIALS