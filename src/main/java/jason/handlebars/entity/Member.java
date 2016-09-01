package jason.handlebars.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Jason on 2016-08-31.
 */
@Entity
@Data
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
