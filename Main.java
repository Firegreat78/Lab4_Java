import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        Object[] objects = new Object[4];
        objects[0] = "MyString";
        objects[1] = new LongNumber(Long.MAX_VALUE).Multiply(1243); // 11464651441810486328101
        objects[2] = ((LongNumber)objects[1]).Negate(); // -11464651441810486328101, приведение типа
        objects[3] = 17; // примитивный тип
        System.out.println(objects[0]);
        System.out.println(objects[1]);
        System.out.println(objects[2]);
        System.out.println(objects[3]);
    }
}