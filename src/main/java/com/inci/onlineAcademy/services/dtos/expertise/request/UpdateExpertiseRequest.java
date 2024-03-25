package com.inci.onlineAcademy.services.dtos.expertise.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateExpertiseRequest {

    @NotNull
    @Positive(message = "The assigned value must not assume a negative numerical value!")
    private int id;

    @NotBlank
    @Length(max = 25)
    @Pattern(regexp = "^[0-9A-Za-zÇçĞğİıÖöŞşÜü\\s-]*$",
            message = "Please ensure that the input consists exclusively of letters, " +
                    "with the exclusion of any special characters.")
    private String expertise;

}
