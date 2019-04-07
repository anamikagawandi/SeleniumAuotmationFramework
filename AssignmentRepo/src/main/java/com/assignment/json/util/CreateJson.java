package com.assignment.json.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class CreateJson {


	public void creatJSON()
	{
		String line =null;


		ObjectMapper mapper = new ObjectMapper();

		ObjectNode d = mapper.createObjectNode();

		ArrayNode domain = mapper.createArrayNode();
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					".\\community_shaadi.txt"));
			line= reader.readLine();
			while (line != null) {
				System.out.println(line);

				ObjectNode det = mapper.createObjectNode();
				det.put("community", line);
				det.put("lang","null");

				domain.add(det);
				// read next line
				line = reader.readLine();
			}
			reader.close();
			
			d.putPOJO("domain",domain);
		} catch (IOException e) {
			e.printStackTrace();
		}



		try {
			mapper.writeValue(new File(".\\community.json"), d);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		try {
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(domain));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//public static void main(String[] args) throws FileNotFoundException  
	{ 

		CreateJson c=new CreateJson();
		c.creatJSON();

	} 

}
