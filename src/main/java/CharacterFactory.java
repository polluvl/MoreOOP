import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.reflections.Reflections;

import lombok.SneakyThrows;

public class CharacterFactory {
    public static final Reflections reflections = new Reflections("characters");
    static List<Class<? extends Character>> lstSubTypes =
    new ArrayList<>(reflections.getSubTypesOf(Character.class));
    
    @SneakyThrows
    public static Character createCharacter() {
        if (lstSubTypes.isEmpty()) {
            System.out.println("No characters found!");
            return null;
        }
        Class<? extends Character> cls =
            lstSubTypes.get(new Random().nextInt(lstSubTypes.size()));

        return cls.getDeclaredConstructor().newInstance();
    }
}
