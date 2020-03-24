package com.moonlit.logfaces.server.core;

import java.io.Serializable;
import java.util.Map;


public interface LogEvent extends Serializable, Cloneable{
	public Object getId();
	public long getSequenceNumber();
	public long getLoggerTimeStamp();
	public void setLoggerTimeStamp(long time);
	public int getLoggerLevel();
	public String getDomainName();
	public void setDomainName(String name);
	public String getHostName();
	public void setHostName(String name);
	public String getLoggerName();
	public String getMessage();
	public String getThrowableInfo();
	public String getLocClassName();
	public String getLocFileName();
	public String getLocMethodName();
	public String getLocLineNumber();
	public Map<String, String> getProperties();
	public LogEvent clone();
	public String resolve(String input);
}
