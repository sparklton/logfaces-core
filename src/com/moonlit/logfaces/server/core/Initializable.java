package com.moonlit.logfaces.server.core;

public interface Initializable {
	public void initialize() throws Exception;
	public void terminate();
	public void restart()  throws Exception;
	public boolean isInitialized();
}
