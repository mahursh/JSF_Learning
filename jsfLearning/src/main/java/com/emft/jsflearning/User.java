package com.emft.jsflearning;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString


@RequestScoped
@Named
public class User implements Serializable {


    @NotBlank
    private String name;

   @NotBlank
    private String family;

//   @Min(18)
//   @Min(80)
//   @NotNull
    private Integer age;

    private int salary;

    @Past(message = "Date is not valid .")
//    private LocalDateTime birthDate;
    private Date birthDate;

    @NotBlank(message = "email can't be empty")
    @Email(message = "Email Not Valid")
    private String email;

    @NotBlank
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$", message = "Invalid Password")
    //Testing193! -------> valid password
    private String password;

    @NotBlank(message = "gender should be selected")
    private String gender;

    @NotBlank
    private String address;


    public String submit(){
        return "response.xhtml";
    }

}
