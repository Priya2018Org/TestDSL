#!/usr/bin/env groovy

def call(){
  def buildValues = readFile 'test.json'   
  echo """${buildValues.name} 
  ${buildValues.age} 
  ${buildValues.car}"""
}
