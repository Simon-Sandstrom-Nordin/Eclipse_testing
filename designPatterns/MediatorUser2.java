package Eclipse_testing.designPatterns;

public class MediatorUser2 implements MediatorUser {
	
	public MediatorUser2() {}
	
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
        System.out.println("User2 received: " + message);
    }

}
