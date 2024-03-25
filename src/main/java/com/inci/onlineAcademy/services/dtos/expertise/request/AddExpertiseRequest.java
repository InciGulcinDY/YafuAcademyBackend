package com.inci.onlineAcademy.services.dtos.expertise.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddExpertiseRequest {

    @NotBlank
    @Length(max = 25)
    @Pattern(regexp = "^[0-9A-Za-zÇçĞğİıÖöŞşÜü\\s-]*$",
            message = "Please ensure that the input consists exclusively of letters, " +
                    "with the exclusion of any special characters.")
    private String expertise;

}
