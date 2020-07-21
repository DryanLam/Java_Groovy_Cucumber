package com.sample.dl.cucumber.step.definitions

//abstract class BaseTest extends Script{
// class BaseTest{
//
//boolean isListEqual(def fList, def sList) {
//    return fList.containsAll(sList) && fList.size() == sList.size()
//}
//
//def insideBaseScript() {
//    println("Inside basescript")
//}
//}

boolean isListEqual(def fList, def sList) {
    return fList.containsAll(sList) && fList.size() == sList.size()
}

def insideBaseScript() {
    println("Inside basescript")
}