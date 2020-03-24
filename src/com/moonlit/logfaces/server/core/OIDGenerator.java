package com.moonlit.logfaces.server.core;

public interface OIDGenerator {
	public Object generateID(LogEvent event);
	public Object generateID(long time, String application, String host, String logger);
}