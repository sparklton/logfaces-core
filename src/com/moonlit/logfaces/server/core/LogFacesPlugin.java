package com.moonlit.logfaces.server.core;

import java.util.List;
import java.util.Map;

public interface LogFacesPlugin {
	public String getName();
	public List<String> getArgs();
	public Object handleEvents(List<LogEvent> events, Map<String,String> args);
	public Object validate();
}
