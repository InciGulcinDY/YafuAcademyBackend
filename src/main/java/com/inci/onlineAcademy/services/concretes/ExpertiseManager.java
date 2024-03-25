package com.inci.onlineAcademy.services.concretes;

import com.inci.onlineAcademy.core.exceptions.types.NotFoundException;
import com.inci.onlineAcademy.core.utilities.mappers.ModelMapperService;
import com.inci.onlineAcademy.core.utilities.messages.MessageService;
import com.inci.onlineAcademy.core.utilities.results.Result;
import com.inci.onlineAcademy.entities.concretes.Expertise;
import com.inci.onlineAcademy.repositories.ExpertiseRepository;
import com.inci.onlineAcademy.services.abstracts.ExpertiseService;
import com.inci.onlineAcademy.services.constants.Messages;
import com.inci.onlineAcademy.services.dtos.expertise.request.AddExpertiseRequest;
import com.inci.onlineAcademy.services.dtos.expertise.request.DeleteExpertiseRequest;
import com.inci.onlineAcademy.services.dtos.expertise.request.UpdateExpertiseRequest;
import com.inci.onlineAcademy.services.dtos.expertise.response.GetAllExpertiseResponse;
import com.inci.onlineAcademy.services.dtos.expertise.response.GetExpertiseByIdResponse;
import com.inci.onlineAcademy.services.rules.ExpertiseBusinessRule;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExpertiseManager implements ExpertiseService {

    private final ExpertiseRepository expertiseRepository;
    private final ExpertiseBusinessRule businessRule;
    private final ModelMapperService modelMapperService;
    private final MessageService messageService;


    @Override
    public List<GetAllExpertiseResponse> getAll() {

        return expertiseRepository.findAll().stream()
                .map(expertise -> this.modelMapperService.forResponse()
                        .map(expertise, GetAllExpertiseResponse.class)).toList();

    }

    @Override
    public GetExpertiseByIdResponse getById(int id) {

        Expertise expertise = expertiseRepository.findById(id)
                .orElseThrow(()-> new NotFoundException(
                        messageService.getMessage(Messages.Expertise.getExpertiseNotFoundMessage)));

        return this.modelMapperService.forResponse().map(expertise, GetExpertiseByIdResponse.class);
    }

    @Override
    public Result add(AddExpertiseRequest request) {
        return null;
    }

    @Override
    public Result update(UpdateExpertiseRequest request) {
        return null;
    }

    @Override
    public Result delete(DeleteExpertiseRequest request) {
        return null;
    }
}
