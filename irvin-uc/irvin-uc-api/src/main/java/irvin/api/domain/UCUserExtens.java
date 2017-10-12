package irvin.api.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UCUserExtens {
    private String id;
    private String password;
    private String salt;
    private String user_basic_id;
    private Long type;
}
