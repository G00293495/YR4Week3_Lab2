package productapp.week3_programme2;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {
    @NotBlank(message = "name cannot be null")
    public String name;
    @NotBlank(message = "email cannot be null")
    public String email;
}
