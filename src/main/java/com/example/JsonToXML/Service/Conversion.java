package com.example.JsonToXML.Service;

import com.example.JsonToXML.Modal.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Service;

@Service
public class Conversion {
    private final ObjectMapper jsonMapper=new ObjectMapper();
    private final XmlMapper xmlMapper=new XmlMapper();

    public String convertJsonToXml(String json)throws JsonProcessingException{

        // converting JSON to JAVA Object
        User user=jsonMapper.readValue(json,User.class);

        // converting JAVA Object to XML
        return xmlMapper.writeValueAsString(user);
    }

}
