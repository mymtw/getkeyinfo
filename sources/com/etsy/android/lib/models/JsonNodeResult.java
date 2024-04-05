package com.etsy.android.lib.models;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;

public class JsonNodeResult extends BaseModel {
    private JsonNode mJsonNode;

    public JsonNode getData() {
        return this.mJsonNode;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        this.mJsonNode = (JsonNode) jsonParser.readValueAsTree();
    }
}
