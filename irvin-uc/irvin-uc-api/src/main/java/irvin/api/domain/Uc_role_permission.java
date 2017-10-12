package irvin.api.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Uc_role_permission {
    private String id;
    private String role_id;
    private String permission_id;
    private Long status;

}
