
package com.javaDev.week1.introduction.introToSpringBoot;
import com.javaDev.week1.introduction.introToSpringBoot.DB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    // we are implemention Constructor Injection
    // we should mostly use the constructor injection because we can make the dependency as final so they can't be change
    // Constructor Injection: preferred method of dependency injection in Spring
    // Makes the dependency final and easier to test
    final private DB db;

    public DBService(DB db){
        this.db = db;
    }
    String getData(){
        return db.getData();
    }
}
