package com.pxp.springbootmongodbmysql.controller;

import com.pxp.springbootmongodbmysql.model.StudentModel;
import com.pxp.springbootmongodbmysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info(){
        return "The application is up...";
    }

    @RequestMapping(value = "createresource", method = RequestMethod.POST)
    public String createStudent(@RequestBody StudentModel studentModel){
        return studentService.createResource(studentModel);
    }

    @RequestMapping(value = "readresources", method = RequestMethod.GET)
    public List<StudentModel> readResources(){
        return studentService.readResources();
    }

    @RequestMapping(value = "updateresource", method = RequestMethod.PUT)
    public String updateStudent(@RequestBody StudentModel studentModel){
        return studentService.updateResource(studentModel);
    }

    @DeleteMapping("/deleteresource/{email}")
    public String deleteStudent(@PathVariable String email){
        return studentService.deleteResource(email);
    }

    @GetMapping("/readresource/{email}")
    public List<StudentModel> readresource(@PathVariable String email){
        return studentService.readResource(email);
    }

}