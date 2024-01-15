package Eclipse_testing.designPatterns;

public class Mediator implements MediatorInterface {
	private MediatorUser mU1;
	private MediatorUser mU2;

    public void registerUser1(MediatorUser user) {
        this.mU1 = user;
    }
    
    public void registerUser2(MediatorUser user) {
        this.mU2 = user;
    }

	@Override
	public void sendMessage(String message, MediatorUser user) {
		if (user.equals(mU1)) {
			mU2.receive(message);
		} else if (user.equals(mU2)) {
			mU1.receive(message);;
		}	
	}

}
