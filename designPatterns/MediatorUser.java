package Eclipse_testing.designPatterns;

public interface MediatorUser {

    void send(String message);
    void receive(String message);
    void setMediator(Mediator mediator);
	
}
