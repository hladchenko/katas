/*
  Grasshopper - Personalized Message

  Create a function that gives a personalized greeting. This function takes two parameters: name and owner.

  Use conditionals to return the proper message:

  case	                 return
  name equals owner	'Hello boss'
  otherwise	        'Hello guest'
 */

package com.hladchenko.katas.kyu8;

class GrasshopperPersonalizedMessage {
    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}