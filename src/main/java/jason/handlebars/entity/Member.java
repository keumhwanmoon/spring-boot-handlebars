package jason.handlebars.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Jason on 2016-08-31.
 */
@Entity
@Data
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    private Long name;
}
