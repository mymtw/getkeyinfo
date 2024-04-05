package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.io.Serializable;

public abstract class BaseJsonNode extends JsonNode implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract JsonToken asToken();

    public final JsonNode findPath(String str) {
        JsonNode findValue = findValue(str);
        return findValue == null ? MissingNode.getInstance() : findValue;
    }

    public abstract int hashCode();

    public JsonParser.NumberType numberType() {
        return null;
    }

    public JsonNode required(String str) {
        return (JsonNode) _reportRequiredViolation("Node of type `%s` has no fields", getClass().getSimpleName());
    }

    public abstract void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException;

    public abstract void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException, JsonProcessingException;

    public String toPrettyString() {
        try {
            return C12565a.f27727c.writeValueAsString(this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        try {
            return C12565a.f27726b.writeValueAsString(this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public JsonParser traverse() {
        return new TreeTraversingParser(this);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return NodeSerialization.from(this);
    }

    public JsonParser traverse(ObjectCodec objectCodec) {
        return new TreeTraversingParser(this, objectCodec);
    }

    public JsonNode required(int i) {
        return (JsonNode) _reportRequiredViolation("Node of type `%s` has no indexed values", getClass().getSimpleName());
    }
}
