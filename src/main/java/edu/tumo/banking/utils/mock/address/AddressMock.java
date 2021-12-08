package edu.tumo.banking.utils.mock.address;

import edu.tumo.banking.domain.address.dto.AddressDTO;
import edu.tumo.banking.utils.mock.address.valueobjects.*;

import static edu.tumo.banking.utils.mock.address.valueobjects.BuildingNumberMock.mockInvalidFullBuildingNumber;

public class AddressMock {

    public static AddressDTO mockValidAddress(){
        return new AddressDTO(ZipCodeMock.mockValidZipCode(),
                CountryMock.mockValidCountry(8, 2),
                ProvinceMock.mockValidProvince(8),
                CityMock.mockValidCity(7),
                StreetMock.mockValidStreet(7, 2),
                BuildingNumberMock.mockValidFullBuildingNumber(2));
    }

    public static AddressDTO mockInvalidAddress(){
        return new AddressDTO(ZipCodeMock.mockInvalidValueZipCode(),
                CountryMock.mockInvalidCountry(9),
                ProvinceMock.mockInvalidProvince(8),
                CityMock.mockInvalidCity(7),
                StreetMock.mockInvalidStreet(9),
                mockInvalidFullBuildingNumber(2));
    }
}
