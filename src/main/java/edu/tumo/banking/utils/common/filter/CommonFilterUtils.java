package edu.tumo.banking.utils.common.filter;
import org.springframework.data.jpa.domain.Specification;
import javax.persistence.criteria.Root;

public class CommonFilterUtils {

    public static <T> Specification<T> isEnabled(Root<T> specifiedRoot) {
        return (specifiedRoot1, query, criteriaBuilder) -> criteriaBuilder.equal(specifiedRoot1.get("enabled"), true);
    }

    public static <T, V> Specification<T> has(final String field, final String searchingTerm,
                                               final boolean isPartialMatching, Root<T> specifiedRoot) {
        return (root, query, cb) -> {
            if (!isPartialMatching) {
                return cb.equal(root.get(field), searchingTerm);
            }
            else {
                return cb.like(root.get(field), searchingTerm);
            }
        };
    }

    private static String getContainsLikePattern(String searchingTerm) {
        if (searchingTerm == null || searchingTerm.isEmpty()) {
            return "%";
        } else {
            return "%" + searchingTerm.toLowerCase() + "%";
        }
    }
}
