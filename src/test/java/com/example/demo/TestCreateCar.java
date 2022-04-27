package com.example.demo;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class TestCreateCar {
	@Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private myRepo repo;
    
    @Test
    public void testCreateUser() {
       Car c1 = new Car();
       c1.setMake("audi");
       c1.setCar_model("A4");
       c1.setProblem("engine");
         
       Car savedCar = repo.save(c1);
        //User savedUser = repo.save(user);
         
        Car existcar = entityManager.find(Car.class, savedCar.getId());
         
       // assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
         
    }
}
