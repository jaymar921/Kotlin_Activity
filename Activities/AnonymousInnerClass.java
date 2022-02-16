interface Zombie{
    void think();
}
public class AnonymousInnerClass {
    public static void main(String... args){
        Zombie zombie = new Zombie(){
            @Override
            public void think(){
                System.out.println("Zombie is thinking about brains");
            }
        };

        zombie.think();
    }
}
