package com.eamapp.springweb.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eamapp.springweb.models.Estudiante;
import com.eamapp.springweb.models.Profesor;

@Controller
@RequestMapping("/profesor")
public class ProfesorController {

    @GetMapping({"/",""})
    public String indexEstudiante(Model model){
        Profesor profesor = new Profesor();
        model.addAttribute("titulo", "perfil");
        model.addAttribute("profesor",profesor);
        profesor.setNombre("Juan");
        profesor.setApellido("Franco");
        profesor.setEmail("franco.juan.7830@eam.edu.co");
        profesor.setAsignatura("Informatica");
        model.addAttribute("cuerpo", "Perfil del profesor: ".concat(profesor.getNombre()));
        return "profesor/index";
    }

    @ModelAttribute("estudiantes")
    public List<Estudiante> listaEstudiante(){
        List<Estudiante> estudiantes = Arrays.asList(new Estudiante("Carlos", "Rodriguez", "rodriguez@eam.edu.co"),new Estudiante("Carla", "Quintero", "quintero@ema.edu.co"));
        return estudiantes;
    }
}
