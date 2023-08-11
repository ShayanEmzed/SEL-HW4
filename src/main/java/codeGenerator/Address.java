package codeGenerator;

import codeGenerator.AddressStrategy.AddressStrategy;
import codeGenerator.AddressStrategy.DirectAddress;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public class Address {
    public int num;
    public varType varType;
    public AddressContext addressContext = new AddressContext();

    public Address(int num, varType varType, AddressStrategy addressStrategy) {
        this.num = num;
        addressContext.setAddressStrategy(addressStrategy);
        this.varType = varType;
    }

    public Address(int num, varType varType) {
        this.num = num;
        addressContext.setAddressStrategy(new DirectAddress());
        this.varType = varType;
    }

    public String toString() {
        return addressContext.getString(num);
    }
}
