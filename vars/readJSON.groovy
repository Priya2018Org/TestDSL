#!/usr/bin/env groovy

def call(){
  def buildValues = readFile 'test.json'   
  echo """${buildValues.attachments[0].name} 
  ${buildValues.age} 
  ${buildValues.car}"""
}
