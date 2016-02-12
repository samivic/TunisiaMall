package test;

import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Locator {
	
	// cette classe retourne un proxy
	static Context context;
	 private static Map<String,Object> cache=new HashMap<>();
	
	public static final  String MODULE_NAME="TunisiaMall";
	
	public static Object lookup(String ejbName,Class viewClass) {
	try {
			String jndiName=MODULE_NAME+"/"+ejbName+"!"+viewClass.getCanonicalName();
			if( context==null)
				
			context = new InitialContext();
			Object proxy=null;
			if (!cache.containsKey(ejbName)){
				
				proxy=context.lookup(jndiName);
				cache.put(ejbName,proxy);
				
						
			}else {
				proxy=context.lookup(jndiName);
			}
			
			return proxy;
	}
			catch (Exception e)
	{
		return null;}
			
					
			
			
			// TODO Auto-generated catch block
		
		}
	
		
	
		
	}