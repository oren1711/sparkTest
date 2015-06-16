/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spark3;

import static spark.Spark.*;


public class HelloWorld {

    public static void main(String[] args) {
        port(Integer.parseInt(System.getenv("PORT")));
        get("/", (request, response) -> "home");
        get("/hello", (request, response) -> "i love nofar!!");
        get("/nofar", (request, response) -> "i love nofar!!");
        get("/sayHi/:name", (request, response) -> "hi "+request.params(":name"));
    }
}
