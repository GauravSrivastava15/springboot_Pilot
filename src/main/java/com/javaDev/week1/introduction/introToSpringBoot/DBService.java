
package com.javaDev.week1.introduction.introToSpringBoot;
import com.javaDev.week1.introduction.introToSpringBoot.DB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    @Autowired
    private DB db;

    String getData(){
        return db.getData();
    }
}
