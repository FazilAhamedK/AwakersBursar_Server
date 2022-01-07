package in.awakers.server.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@SuperBuilder
public class User
{
    @NotBlank(message = "{user.fullName.notBlank}")
    private String fullName;
    private String email;
    private Long mobileNumber;
}