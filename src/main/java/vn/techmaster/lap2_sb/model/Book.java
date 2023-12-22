package vn.techmaster.lap2_sb.model;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder // Design Pattern : Builder Pattern (Nhóm khảo tạo)
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {
    int id;
    String name;
    String description ;
    String author ;
    int publishYear;


}
