package irvin.api.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UCUserRole {
    private String id;
    private String user_basic_id;
    private String role_id;
    private Long status;
}
