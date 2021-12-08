package edu.tumo.banking.utils.address.filter;

import edu.tumo.banking.domain.address.dao.AddressDAO;
import edu.tumo.banking.domain.address.model.AddressModel;
import edu.tumo.banking.utils.common.filter.CommonFilterUtils;
import lombok.*;
import org.springframework.data.jpa.domain.Specification;

import javax.annotation.Generated;
import javax.persistence.criteria.Predicate;
import javax.persistence.metamodel.StaticMetamodel;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AddressModel.class)
public class AddressFilter {

   // private boolean isPartialMatching;

    private String country;

    private String province;

    private String city;

    private String street;

    private String zipCode;

    private String buildingNumber;


        public static Specification<AddressDAO> search(AddressFilter addressFilter) throws IllegalAccessException {
        return new Specification<AddressDAO>() {
            @SneakyThrows
            @Override
            public Predicate toPredicate(Root<AddressDAO> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                Field[] fields = AddressFilter.class.getDeclaredFields();
                int fieldsLength = fields.length;
                Predicate[] predicates = new Predicate[fieldsLength + 1];
                for (int i = 0; i < fieldsLength; i++) {
                    if (fields[i] != null) {
                        String currentFieldName = fields[i].getName();
                        if (fields[i].get(addressFilter) == null){
//                            if (fields[i].get(addressFilter) == null){
//                                predicates[i] = CommonFilterUtils
//                                        .has(currentFieldName, "", addressFilter.isPartialMatching(), root)
//                                        .toPredicate(root, query, criteriaBuilder);
//                                continue;
                            predicates[i] = CommonFilterUtils
                                    .has(currentFieldName, "", false, root)
                                    .toPredicate(root, query, criteriaBuilder);
//                            }
                        }
                    }
                }
                //predicates[6] = CommonFilterUtils.isEnabled(root).toPredicate(root, query, criteriaBuilder);
                List<Predicate> predicateList = Arrays
                        .stream(predicates)
                        .filter(predicate -> predicate != null)
                        .collect(Collectors.toList());
                Predicate[] finalPredicates = new Predicate[predicateList.size()];
                predicateList.toArray(finalPredicates);
                return criteriaBuilder.and(finalPredicates);
            }
        };
    }
}
