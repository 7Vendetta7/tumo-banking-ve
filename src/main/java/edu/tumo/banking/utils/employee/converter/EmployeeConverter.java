package edu.tumo.banking.utils.employee.converter;

import edu.tumo.banking.domain.address.dao.AddressDAO;
import edu.tumo.banking.domain.address.model.AddressModel;
import edu.tumo.banking.domain.employee.dao.EmployeeDAO;
import edu.tumo.banking.domain.employee.dto.EmployeeDTO;
import edu.tumo.banking.domain.employee.model.EmployeeModel;
import edu.tumo.banking.utils.address.converter.AddressConverter;

import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class EmployeeConverter {
    public static EmployeeDAO fromDTOtoDAO(EmployeeDTO employeeDTO){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.setAge(employeeDTO.getAge());
        employeeDAO.setFirstName(employeeDTO.getFirstName());
        employeeDAO.setLastName(employeeDTO.getLastName());
        employeeDAO.setSalary(employeeDTO.getSalary());
        employeeDAO.setPosition(employeeDTO.getPosition());
        employeeDAO.setAddress(AddressConverter.fromDTOtoDAO(employeeDTO.getAddress()));
        employeeDAO.setCreatedDate((Instant.now(Clock.systemUTC())));
        employeeDAO.setEnabled(true);
        return employeeDAO;
    }

//    public static EmployeeModel fromDAOtoModel(EmployeeDAO employeeDAO){
//        return new EmployeeModel.EmployeeModelBuilder()
//                .id(employeeDAO.getId())
//                .age(employeeDAO.getAge())
//                .firstName(employeeDAO.getFirstName())
//                .lastName(employeeDAO.getLastName())
//                .salary(employeeDAO.getSalary())
//                .position(employeeDAO.getPosition())
//                //.workStartDate(employeeDAO.getCreatedDate())
//                .address(AddressConverter.fromDAOtoModel(employeeDAO.getAddress()))
//                .build();
//    }

//    public static List<EmployeeModel> fromDAOListToModelList(Iterable<EmployeeDAO> employeeDAOS){
//        List<EmployeeModel> employeeModels = new ArrayList<>();
//        for (EmployeeDAO dao: employeeDAOS) {
//            employeeModels.add(fromDAOtoModel(dao));
//        }
//        return employeeModels;
//    }
}
