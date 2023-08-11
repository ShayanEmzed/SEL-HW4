package codeGenerator.AddressStrategy;

public class ImidiateAddress implements AddressStrategy {
    @Override
    public String getString(int num) {
        return "#" + num;
    }
}
