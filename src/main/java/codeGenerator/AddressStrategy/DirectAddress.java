package codeGenerator.AddressStrategy;

public class DirectAddress implements AddressStrategy {
    @Override
    public String getString(int num) {
        return num + "";
    }
}
