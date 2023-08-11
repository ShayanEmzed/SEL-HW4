package codeGenerator.AddressStrategy;

public class IndirectAddress implements AddressStrategy {
    @Override
    public String getString(int num) {
        return "@" + num;
    }
}
