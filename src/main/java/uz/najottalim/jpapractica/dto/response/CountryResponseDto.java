package uz.najottalim.jpapractica.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CountryResponseDto {

    Long id;

    String name;
}
