package irvin.api.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Uc_user_role {
    private String id;
    private String user_basic_id;
    private String role_id;
    private Long status;
}
