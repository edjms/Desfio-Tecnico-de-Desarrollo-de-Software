package co.com.technical_test_alianza.repository;

import co.com.technical_test_alianza.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository <Client,String>{

}
