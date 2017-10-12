package irvin.api.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Uc_user_external {
    private String id;
    private String user_basic_id;
    private Long status;
}
