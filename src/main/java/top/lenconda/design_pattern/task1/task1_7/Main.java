package top.lenconda.design_pattern.task1.task1_7;

public class Main {
    public static void main(String args[]) {
        try {
            Class<?> shortPersonBuilderClass = Class.forName("top.lenconda.design_pattern.task1.task1_7.ShortPerson");
            Class<?> tallPersonBuilderClass = Class.forName("top.lenconda.design_pattern.task1.task1_7.TallPerson");
            PersonBuilder shortPersonBuilder = (PersonBuilder) shortPersonBuilderClass.newInstance();
            PersonBuilder tallPersonBuilder = (PersonBuilder) tallPersonBuilderClass.newInstance();

            Painter painter = new Painter();

            painter.setPersonBuilder(shortPersonBuilder);
            Person shortPerson = painter.construct();
            System.out.println("Short person: ");
            System.out.println("-----------------------------");
            System.out.println(shortPerson.getHead());
            System.out.println(shortPerson.getBody());
            System.out.println(shortPerson.getArm());
            System.out.println(shortPerson.getLeg());
            System.out.println("-----------------------------");
            System.out.println();

            painter.setPersonBuilder(tallPersonBuilder);
            Person tallPerson = painter.construct();
            System.out.println("Tall person: ");
            System.out.println("-----------------------------");
            System.out.println(tallPerson.getHead());
            System.out.println(tallPerson.getBody());
            System.out.println(tallPerson.getArm());
            System.out.println(tallPerson.getLeg());
            System.out.println("-----------------------------");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
