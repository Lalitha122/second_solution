package application;

import org.springframework.data.jpa.repository.JpaRepository;


public interface Myrepo extends JpaRepository<Employee,Long> {

}
