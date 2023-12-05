package br.com.pedrelosa.userapi.resoucers.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor
public class StandartError {

    private LocalDateTime timestamp;
    private String error;
    private Integer status;
    private String path;

}
