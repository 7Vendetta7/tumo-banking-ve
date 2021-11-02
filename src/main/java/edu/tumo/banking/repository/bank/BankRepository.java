package edu.tumo.banking.repository.bank;

import edu.tumo.banking.domain.bank.dto.BankDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface BankRepository extends CrudRepository <BankDTO, Id>{
    List<BankDTO> findall();
    BankDTO add(BankDTO bank);
    Optional<BankDTO> findBy(Id i);
    void deleteBankDTOBy(Id i);
    void deleteAll();
}
