package com.example.JsonToXML.Controller;

import com.example.JsonToXML.Service.Conversion;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert")
public class JsonToXmlController {

    private final Conversion jsonToXmlService;

    public JsonToXmlController(Conversion jsonToXmlService) {
        this.jsonToXmlService = jsonToXmlService;
    }
    @PostMapping(value = "/json-to-xml", produces = "application/xml")
    public String convertJsonToXml(@RequestBody String json) throws JsonProcessingException {
        return jsonToXmlService.convertJsonToXml(json);
    }
}
