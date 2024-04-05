package com.fasterxml.jackson.databind.jsontype.impl;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;

public class AsWrapperTypeDeserializer extends TypeDeserializerBase {
    private static final long serialVersionUID = 1;

    public AsWrapperTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, JavaType javaType2) {
        super(javaType, typeIdResolver, str, z, javaType2);
    }

    public Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object typeId;
        if (jsonParser.canReadTypeId() && (typeId = jsonParser.getTypeId()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, typeId);
        }
        JsonToken currentToken = jsonParser.currentToken();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (currentToken == jsonToken) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (nextToken != jsonToken2) {
                JavaType baseType = baseType();
                StringBuilder h = C0072d.m201h("need JSON String that contains type id (for subtype of ");
                h.append(baseTypeName());
                h.append(")");
                deserializationContext.reportWrongTokenException(baseType, jsonToken2, h.toString(), new Object[0]);
            }
        } else if (currentToken != JsonToken.FIELD_NAME) {
            JavaType baseType2 = baseType();
            StringBuilder h2 = C0072d.m201h("need JSON Object to contain As.WRAPPER_OBJECT type information for class ");
            h2.append(baseTypeName());
            deserializationContext.reportWrongTokenException(baseType2, jsonToken, h2.toString(), new Object[0]);
        }
        String text = jsonParser.getText();
        JsonDeserializer<Object> _findDeserializer = _findDeserializer(deserializationContext, text);
        jsonParser.nextToken();
        JsonParserSequence jsonParserSequence = jsonParser;
        if (this._typeIdVisible) {
            boolean hasToken = jsonParser.hasToken(jsonToken);
            jsonParserSequence = jsonParser;
            if (hasToken) {
                TokenBuffer tokenBuffer = new TokenBuffer((ObjectCodec) null, false);
                tokenBuffer.writeStartObject();
                tokenBuffer.writeFieldName(this._typePropertyName);
                tokenBuffer.writeString(text);
                jsonParser.clearCurrentToken();
                JsonParserSequence createFlattened = JsonParserSequence.createFlattened(false, tokenBuffer.asParser(jsonParser), jsonParser);
                createFlattened.nextToken();
                jsonParserSequence = createFlattened;
            }
        }
        Object deserialize = _findDeserializer.deserialize(jsonParserSequence, deserializationContext);
        JsonToken nextToken2 = jsonParserSequence.nextToken();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (nextToken2 != jsonToken3) {
            deserializationContext.reportWrongTokenException(baseType(), jsonToken3, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        }
        return deserialize;
    }

    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    public TypeDeserializer forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsWrapperTypeDeserializer(this, beanProperty);
    }

    public JsonTypeInfo.C12506As getTypeInclusion() {
        return JsonTypeInfo.C12506As.WRAPPER_OBJECT;
    }

    public AsWrapperTypeDeserializer(AsWrapperTypeDeserializer asWrapperTypeDeserializer, BeanProperty beanProperty) {
        super(asWrapperTypeDeserializer, beanProperty);
    }
}
