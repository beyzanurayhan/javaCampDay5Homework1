package kodlamaio5.core;

import kodlamaio5.Google.GoogleManager;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void logToSystem(String message) {
		GoogleManager manager = new GoogleManager();
		manager.google(message);
	}

}
