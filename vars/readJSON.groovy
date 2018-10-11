#!/usr/bin/env groovy

def call(){
  def buildValues = readFile 'test.json'   
  echo """${buildValues[0].name} 
  ${buildValues[0].age} 
  ${buildValues[0].car}"""
}
