package com.fasterxml.jackson.databind.ext;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.lang.reflect.Type;
import org.w3c.dom.Node;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;

public class DOMSerializer extends StdSerializer<Node> {
    public final DOMImplementationLS _domImpl;

    public DOMSerializer() {
        super(Node.class);
        try {
            this._domImpl = (DOMImplementationLS) DOMImplementationRegistry.newInstance().getDOMImplementation("LS");
        } catch (Exception e) {
            StringBuilder h = C0072d.m201h("Could not instantiate DOMImplementationRegistry: ");
            h.append(e.getMessage());
            throw new IllegalStateException(h.toString(), e);
        }
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws JsonMappingException {
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper.expectAnyFormat(javaType);
        }
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("string", true);
    }

    public void serialize(Node node, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonGenerationException {
        DOMImplementationLS dOMImplementationLS = this._domImpl;
        if (dOMImplementationLS != null) {
            jsonGenerator.writeString(dOMImplementationLS.createLSSerializer().writeToString(node));
            return;
        }
        throw new IllegalStateException("Could not find DOM LS");
    }
}
