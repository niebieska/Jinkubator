package org.view.jinkubator;

//import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Talk {


    @Id
    @GeneratedValue
    private Long id;
    private  String topic;

    public Long getId(){
        return id;
    }
    public String getTopic() {
        return topic;
    }
}

 /* The implementation for String value of id in JPA.
     It is possible to do it easier so this code is a comment only
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;
    public String getId() {
            return id;
    }

   Jpa - recommended id type is Long
 * MongoDb - require String - generating random chars*/