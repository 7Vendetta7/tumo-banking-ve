package edu.tumo.banking.utils.employee.filter;

import edu.tumo.banking.domain.address.dao.AddressDAO;
import edu.tumo.banking.domain.address.model.AddressModel;
import edu.tumo.banking.domain.employee.dao.EmployeeDAO;
import edu.tumo.banking.domain.employee.model.EmployeeModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.Specification;

import javax.annotation.Generated;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.StaticMetamodel;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EmployeeModel.class)
public class EmployeeFilter {

    private Integer ageFrom;

    private Integer ageTo;

    private Integer salaryFrom;

    private Integer salaryTo;

    private String firstName;

    private String lastName;

    private String position;

    private AddressModel address;

    private boolean isPartialMatching;

    // private Instant workStartDate;

}
