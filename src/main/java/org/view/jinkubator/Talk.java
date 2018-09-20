package org.view.jinkubator;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Talk {
    @Id
    @GeneratedValue(generator="system-uuid") /*In many tries this method was the most effective ones, I haven't already found better method*/
    @GenericGenerator(name="system-uuid", strategy = "uuid")
       private String id;

    private  String topic;

    public String getId() {
        return id;
    }
    public String getTopic() {
        return topic;
    }
}
