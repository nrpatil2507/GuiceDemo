package tester;

import com.google.inject.ImplementedBy;

@ImplementedBy(FacebookService.class)
public interface MessageService {
	boolean sendMessage(String msg, String receipient);

}
