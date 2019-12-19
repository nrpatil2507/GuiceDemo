package tester;

import com.google.inject.Singleton;

@Singleton
public class EmailService implements MessageService {
	@Override
	public boolean sendMessage(String msg, String rp) {
		System.out.println("Emial sent to " + rp + "with message=" + msg);
		return true;
	}
}
