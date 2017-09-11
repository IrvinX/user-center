package irvin.common.domain;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Module implements Serializable {

    private static final long serialVersionUID = 8747649082257054715L;

    private Integer mid;
    private String mname;
}