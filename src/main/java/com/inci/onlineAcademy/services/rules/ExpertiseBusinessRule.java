package com.inci.onlineAcademy.services.rules;

import com.inci.onlineAcademy.core.exceptions.types.BusinessException;
import com.inci.onlineAcademy.core.utilities.messages.MessageService;
import com.inci.onlineAcademy.repositories.ExpertiseRepository;
import com.inci.onlineAcademy.services.constants.Messages;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExpertiseBusinessRule {

    private final ExpertiseRepository expertiseRepository;
    private final MessageService messageService;

    public void existsExpertiseByExpertise(String expertise){
        if(expertiseRepository.existsByExpertise(expertise)) {
            throw new BusinessException(messageService.getMessage(Messages.Expertise.getExpertiseAlreadyExistsMessage));
        }
    }

    public void existsExpertiseById(int id){
        if(!expertiseRepository.existsById(id)){
            throw new BusinessException(messageService.getMessage(Messages.Expertise.getExpertiseNotFoundMessage));
        }
    }


}
