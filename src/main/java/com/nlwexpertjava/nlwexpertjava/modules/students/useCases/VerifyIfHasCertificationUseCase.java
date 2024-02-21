package com.nlwexpertjava.nlwexpertjava.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.nlwexpertjava.nlwexpertjava.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto) {
        if (dto.getEmail().equals("mcspipoca47@gmail.com") && dto.getTechnology().equals("JAVA")) {
            return true;
        }
        return false;
    }
}
