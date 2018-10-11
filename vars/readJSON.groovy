#!/usr/bin/env groovy

def call(){
  def files = fileExists 'test.json'   
  echo """${files[0].name} 
  ${files[0].path} 
  ${files[0].directory}
  ${files[0].length} 
  ${files[0].lastModified}"""
}