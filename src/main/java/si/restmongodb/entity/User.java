package si.restmongodb.entity;

import lombok.Data;

@Data
public class User {
    long id;
    String firstname;
    String lastname;
    String mail;
}
