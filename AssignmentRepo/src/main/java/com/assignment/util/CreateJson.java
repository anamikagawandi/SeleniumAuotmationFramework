package com.assignment.util;

import java.io.FileNotFoundException;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class CreateJson {
	
	
	public static void main(String[] args) throws FileNotFoundException  
    { 
		ObjectMapper mapper = new ObjectMapper();
		 
        ArrayNode arrayNode = mapper.createArrayNode();
 
        ArrayNode authorsArray = mapper.createArrayNode();
        ObjectNode author1 = mapper.createObjectNode();
        author1.put("firstName","Hamidul");
        author1.put("middleName","");
        author1.put("lastName","Islam");
    } 

}
