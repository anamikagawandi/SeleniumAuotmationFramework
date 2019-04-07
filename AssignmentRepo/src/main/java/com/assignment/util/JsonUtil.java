package com.assignment.util;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import com.assignment.base.TestBase;
import com.assignment.json.util.Domain;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil extends TestBase{
	
	Domain domain;
		

	public String[][] getDomainLang()
	{
		ObjectMapper m=new ObjectMapper();

		File f=new File(".\\community.json");
		try {
			domain = m.readValue(f, Domain.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//System.out.println("Community = " + domain.getDomain().get(0).getCommunity());
		//System.out.println("Language = " + domain.getDomain().get(0).getLang());
		
		String[][] data=new String[domain.getDomain().size()][2];
		
		for(int i=0;i<domain.getDomain().size();i++)
		{
			data[i][0]=domain.getDomain().get(i).getCommunity();
			data[i][1]=domain.getDomain().get(i).getLang();
		}
		
		return data;
	}
	
	
	
	public String[][] getDomain()
	{
		ObjectMapper m=new ObjectMapper();

		File f=new File(".\\community.json");
		try {
			domain = m.readValue(f, Domain.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//System.out.println("Community = " + domain.getDomain().get(0).getCommunity());
		//System.out.println("Language = " + domain.getDomain().get(0).getLang());
		
		String[][] data=new String[domain.getDomain().size()][1];
		
		for(int i=0;i<domain.getDomain().size();i++)
		{
			data[i][0]=domain.getDomain().get(i).getCommunity();
		}
		
		return data;
	}

	
	/*public static void main (String arg[])
	{
		JsonUtil u=new JsonUtil();
		u.getDomainLang();
		System.out.println(u.data[5][0]);
		System.out.println(u.data[5][1]);
	}*/
}
