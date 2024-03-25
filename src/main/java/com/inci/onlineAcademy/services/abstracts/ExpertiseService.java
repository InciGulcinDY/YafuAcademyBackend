package com.inci.onlineAcademy.services.abstracts;

import com.inci.onlineAcademy.core.utilities.results.Result;
import com.inci.onlineAcademy.services.dtos.expertise.request.AddExpertiseRequest;
import com.inci.onlineAcademy.services.dtos.expertise.request.DeleteExpertiseRequest;
import com.inci.onlineAcademy.services.dtos.expertise.request.UpdateExpertiseRequest;
import com.inci.onlineAcademy.services.dtos.expertise.response.GetAllExpertiseResponse;
import com.inci.onlineAcademy.services.dtos.expertise.response.GetExpertiseByIdResponse;

import java.util.List;

public interface ExpertiseService {

    List<GetAllExpertiseResponse> getAll();

    GetExpertiseByIdResponse getById(int id);

    Result add(AddExpertiseRequest request);

    Result update(UpdateExpertiseRequest request);

    Result delete(DeleteExpertiseRequest request);

}
