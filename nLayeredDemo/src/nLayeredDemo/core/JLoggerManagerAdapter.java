package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String messagge) {
		JLoggerManager manager = new JLoggerManager();
		manager.log(messagge);
		
	}

}
