package co.com.technical_test_alianza.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Client {
    @Id
    @Column(name= "sharedKey",unique = true, nullable = false)
    private String sharedKey;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(name = "NumberPhone", nullable = false)
    private String phone;

    @Column(name = "startDate",nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate startDate;

    @Column(name = "endDate",nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private  LocalDate endDate;

}
