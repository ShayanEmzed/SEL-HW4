package parser;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TableFacade {
    public ParseTable init_table(String firstStr) {
        try {
            Path path = Paths.get(firstStr);
            String line = Files.readAllLines(path).get(0);
            return new ParseTable(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
