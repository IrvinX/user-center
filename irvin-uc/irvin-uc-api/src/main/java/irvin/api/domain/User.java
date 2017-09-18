package irvin.api.domain;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = -3775289231598318475L;

    private Integer uid;
    private String username;
    private String password;
}