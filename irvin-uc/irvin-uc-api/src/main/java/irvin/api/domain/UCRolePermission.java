package irvin.api.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UCRolePermission {
    private String id;
    private String role_id;
    private String permission_id;
    private Long status;

}
