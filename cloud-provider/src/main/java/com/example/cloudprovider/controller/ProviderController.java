package com.example.cloudprovider.controller;


import com.demo.model.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProviderController
 *
 * @author 10905 2018/12/18
 * @version 1.0
 */
@RestController
public class ProviderController {

    @RequestMapping(value = "/person/{personId}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(@PathVariable("personId")String personId){
        System.out.println("-----------------------Provider服务实现类------------------------------------");
        return new Person(personId,"张晓祥","123456");
    }



}
