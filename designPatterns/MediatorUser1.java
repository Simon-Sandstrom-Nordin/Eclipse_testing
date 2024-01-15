package Eclipse_testing.designPatterns;

public class MediatorUser1 implements MediatorUser {
	
	private Mediator mediator;
	
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void send(String message) {
        mediator.sendMessage(message, this);
    }
    
    @Override
    public void receive(String message) {
        System.out.println("User1 received: " + message);
    }

}
