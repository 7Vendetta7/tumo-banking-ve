package edu.tumo.banking.repository.address;

import edu.tumo.banking.domain.address.dao.AddressDAO;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.Optional;

/**
 * Description: The goal of AddressRepository interface is defining the ways with which
 *              its implementations should "work". At this moment it is empty because it
 *              extends CrudRepository and that interface already gives some implementations
 *              for the methods which should have every simple CRUD system.
 *
 * @author Argishti_Tigranyan
 */

public interface AddressRepository extends CrudRepository<AddressDAO, Long>,
        JpaSpecificationExecutor<AddressDAO>,
        PagingAndSortingRepository<AddressDAO, Long>,
        QueryByExampleExecutor<AddressDAO> {

    @Query("from #{#entityName} where id=:id and enabled = true")
    @Override
    Optional<AddressDAO> findById(@Param("id") Long id);

    @Override
    <S extends AddressDAO> Page<S> findAll(Example<S> example, Pageable pageable);
}
