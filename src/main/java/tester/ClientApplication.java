package tester;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ClientApplication {

	public static void main(String[] args) {
		Injector inject = Guice.createInjector(new AppInjector());
		MyApplication app = inject.getInstance(MyApplication.class);

		app.sendMessage("hii how are you", "np@gmail.com");
	}

}
