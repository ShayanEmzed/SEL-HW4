package parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParserFacade {
    private Parser parser;
    public ParserFacade() {
        parser = new Parser();
    }
    public void parse(String path) {
        try {
            parser.startParse(new Scanner(new File(path)));
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
