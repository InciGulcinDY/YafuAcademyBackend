package com.inci.onlineAcademy.controllers;

import com.inci.onlineAcademy.core.utilities.results.Result;
import com.inci.onlineAcademy.services.abstracts.ExpertiseService;
import com.inci.onlineAcademy.services.dtos.expertise.request.AddExpertiseRequest;
import com.inci.onlineAcademy.services.dtos.expertise.request.DeleteExpertiseRequest;
import com.inci.onlineAcademy.services.dtos.expertise.request.UpdateExpertiseRequest;
import com.inci.onlineAcademy.services.dtos.expertise.response.GetAllExpertiseResponse;
import com.inci.onlineAcademy.services.dtos.expertise.response.GetExpertiseByIdResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("api/expertises")
public class ExpertiseController {

    private final ExpertiseService expertiseService;

    @GetMapping("/getAll")
    public List<GetAllExpertiseResponse> getAll(){
        return expertiseService.getAll();
    }

    @GetMapping("/getById/{id}")
    public GetExpertiseByIdResponse getById(@PathVariable int id){
        return expertiseService.getById(id);
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Result add(@RequestBody @Valid AddExpertiseRequest request){
        return  expertiseService.add(request);
    }

    @PutMapping("/update")
    public Result update(@RequestBody @Valid UpdateExpertiseRequest request){
        return expertiseService.update(request);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody @Valid DeleteExpertiseRequest request){
        return expertiseService.delete(request);
    }

}
