package irvin.api.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UCUserBasic {
    private String id;
    private String name;
    private Long age;
    private java.sql.Date birth;
    private String mobile;
    private String email;
    private String english_name;
    private Long gender;
    private Long status;
}
