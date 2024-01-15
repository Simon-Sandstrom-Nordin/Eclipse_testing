package Eclipse_testing.designPatterns;

public class MediatorMain {
	
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        MediatorUser mU1 = new MediatorUser1();
        mU1.setMediator(mediator);
        MediatorUser mU2 = new MediatorUser2();
        mU2.setMediator(mediator);

        mediator.registerUser1(mU1);
        mediator.registerUser2(mU2);

        mU1.send("Hello from User1");
        mU2.send("Hello from User2");
    }

}
