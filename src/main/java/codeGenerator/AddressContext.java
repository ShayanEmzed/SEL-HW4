package codeGenerator;

import codeGenerator.AddressStrategy.AddressStrategy;

public class AddressContext {
    private AddressStrategy addressStrategy;

    public void setAddressStrategy(AddressStrategy addressStrategy) {
        this.addressStrategy = addressStrategy;
    }

    public String getString(int num) {
        return addressStrategy.getString(num);
    }
}
