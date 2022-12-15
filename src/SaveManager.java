import java.util.List;
import java.io.*;

public class SaveManager {
    public void save (List<Animal> animals) {
        try (FileWriter writer = new FileWriter("animals_list.txt", false)){
            for (Animal item: animals) {
                writer.write(item.toString() + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
