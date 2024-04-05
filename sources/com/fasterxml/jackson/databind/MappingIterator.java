package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class MappingIterator<T> implements Iterator<T>, Closeable {
    public static final MappingIterator<?> EMPTY_ITERATOR = new MappingIterator((JavaType) null, (JsonParser) null, (DeserializationContext) null, (JsonDeserializer<?>) null, false, (Object) null);
    public static final int STATE_CLOSED = 0;
    public static final int STATE_HAS_VALUE = 3;
    public static final int STATE_MAY_HAVE_VALUE = 2;
    public static final int STATE_NEED_RESYNC = 1;
    public final boolean _closeParser;
    public final DeserializationContext _context;
    public final JsonDeserializer<T> _deserializer;
    public final JsonParser _parser;
    public final JsonStreamContext _seqContext;
    public int _state;
    public final JavaType _type;
    public final T _updatedValue;

    public MappingIterator(JavaType javaType, JsonParser jsonParser, DeserializationContext deserializationContext, JsonDeserializer<?> jsonDeserializer, boolean z, Object obj) {
        this._type = javaType;
        this._parser = jsonParser;
        this._context = deserializationContext;
        this._deserializer = jsonDeserializer;
        this._closeParser = z;
        if (obj == null) {
            this._updatedValue = null;
        } else {
            this._updatedValue = obj;
        }
        if (jsonParser == null) {
            this._seqContext = null;
            this._state = 0;
            return;
        }
        JsonStreamContext parsingContext = jsonParser.getParsingContext();
        if (!z || !jsonParser.isExpectedStartArrayToken()) {
            JsonToken currentToken = jsonParser.currentToken();
            if (currentToken == JsonToken.START_OBJECT || currentToken == JsonToken.START_ARRAY) {
                parsingContext = parsingContext.getParent();
            }
        } else {
            jsonParser.clearCurrentToken();
        }
        this._seqContext = parsingContext;
        this._state = 2;
    }

    public static <T> MappingIterator<T> emptyIterator() {
        return EMPTY_ITERATOR;
    }

    public <R> R _handleIOException(IOException iOException) {
        throw new RuntimeException(iOException.getMessage(), iOException);
    }

    public <R> R _handleMappingException(JsonMappingException jsonMappingException) {
        throw new RuntimeJsonMappingException(jsonMappingException.getMessage(), jsonMappingException);
    }

    public void _resync() throws IOException {
        JsonParser jsonParser = this._parser;
        if (jsonParser.getParsingContext() != this._seqContext) {
            while (true) {
                JsonToken nextToken = jsonParser.nextToken();
                if (nextToken == JsonToken.END_ARRAY || nextToken == JsonToken.END_OBJECT) {
                    if (jsonParser.getParsingContext() == this._seqContext) {
                        jsonParser.clearCurrentToken();
                        return;
                    }
                } else if (nextToken == JsonToken.START_ARRAY || nextToken == JsonToken.START_OBJECT) {
                    jsonParser.skipChildren();
                } else if (nextToken == null) {
                    return;
                }
            }
        }
    }

    public <R> R _throwNoSuchElement() {
        throw new NoSuchElementException();
    }

    public void close() throws IOException {
        if (this._state != 0) {
            this._state = 0;
            JsonParser jsonParser = this._parser;
            if (jsonParser != null) {
                jsonParser.close();
            }
        }
    }

    public JsonLocation getCurrentLocation() {
        return this._parser.getCurrentLocation();
    }

    public JsonParser getParser() {
        return this._parser;
    }

    public FormatSchema getParserSchema() {
        return this._parser.getSchema();
    }

    public boolean hasNext() {
        try {
            return hasNextValue();
        } catch (JsonMappingException e) {
            return ((Boolean) _handleMappingException(e)).booleanValue();
        } catch (IOException e2) {
            return ((Boolean) _handleIOException(e2)).booleanValue();
        }
    }

    public boolean hasNextValue() throws IOException {
        JsonToken nextToken;
        JsonParser jsonParser;
        int i = this._state;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            _resync();
        } else if (i != 2) {
            return true;
        }
        if (this._parser.currentToken() == null && ((nextToken = this._parser.nextToken()) == null || nextToken == JsonToken.END_ARRAY)) {
            this._state = 0;
            if (this._closeParser && (jsonParser = this._parser) != null) {
                jsonParser.close();
            }
            return false;
        }
        this._state = 3;
        return true;
    }

    public T next() {
        try {
            return nextValue();
        } catch (JsonMappingException e) {
            return _handleMappingException(e);
        } catch (IOException e2) {
            return _handleIOException(e2);
        }
    }

    public T nextValue() throws IOException {
        T t;
        int i = this._state;
        if (i == 0) {
            return _throwNoSuchElement();
        }
        int i2 = 2;
        i2 = 1;
        if ((i == i2 || i == i2) && !hasNextValue()) {
            return _throwNoSuchElement();
        }
        try {
            T t2 = this._updatedValue;
            if (t2 == null) {
                t = this._deserializer.deserialize(this._parser, this._context);
            } else {
                this._deserializer.deserialize(this._parser, this._context, t2);
                t = this._updatedValue;
            }
            return t;
        } finally {
            this._state = i2;
            this._parser.clearCurrentToken();
        }
    }

    public List<T> readAll() throws IOException {
        return readAll(new ArrayList());
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public <L extends List<? super T>> L readAll(L l) throws IOException {
        while (hasNextValue()) {
            l.add(nextValue());
        }
        return l;
    }

    public <C extends Collection<? super T>> C readAll(C c) throws IOException {
        while (hasNextValue()) {
            c.add(nextValue());
        }
        return c;
    }
}
