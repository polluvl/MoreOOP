import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.reflections.Reflections;

public class CharacterFactory {
    public static final Reflections reflections = new Reflections("lotr");
    static List<Class<? extends Character>> lstSubTypes =
            new ArrayList<>(reflections.getSubTypesOf(Character.class));

    public static Character createCharacter() {
        if (lstSubTypes.isEmpty()) {
            System.out.println("No characters found!");
            return null;
        }
        Class<? extends Character> cls =
                lstSubTypes.get(new Random().nextInt(lstSubTypes.size()));

        try {
            return cls.getDeclaredConstructor().newInstance();
        } catch (NoSuchMethodException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException("Failed to create character: " + cls.getName(), e);
        }
    }
}