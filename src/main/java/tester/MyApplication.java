package tester;

import com.google.inject.Inject;

public class MyApplication {

	private MessageService service;

	@Inject
	public void setservice(MessageService svc) {
		this.service = svc;
	}

	public boolean sendMessage(String msg, String rec) {
		return service.sendMessage(msg, rec);
	}

}
