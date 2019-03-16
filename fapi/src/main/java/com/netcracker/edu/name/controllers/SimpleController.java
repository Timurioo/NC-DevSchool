package com.netcracker.edu.name.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping(value = "/get-simple-text")
    SimpleObject getSimpleString() {
        SimpleObject simpleObject = new SimpleObject();
        simpleObject.setId("2112212");
        simpleObject.setName("test");
        return simpleObject;
    }

    class SimpleObject {

        String id;
        String name;

        void setId(String id) {
            this.id = id;
        }

        void setName(String name) {
            this.name = name;
        }


        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }




    }
}