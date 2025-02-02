package com.fasterxml.jackson.databind.node;

import android.support.p013v4.media.C0069a;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.RawValue;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayNode extends ContainerNode<ArrayNode> {
    private static final long serialVersionUID = 1;
    private final List<JsonNode> _children;

    public ArrayNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this._children = new ArrayList();
    }

    public ArrayNode _add(JsonNode jsonNode) {
        this._children.add(jsonNode);
        return this;
    }

    public JsonNode _at(JsonPointer jsonPointer) {
        return get(jsonPointer.getMatchingIndex());
    }

    public boolean _childrenEqual(ArrayNode arrayNode) {
        return this._children.equals(arrayNode._children);
    }

    public ArrayNode _insert(int i, JsonNode jsonNode) {
        if (i < 0) {
            this._children.add(0, jsonNode);
        } else if (i >= this._children.size()) {
            this._children.add(jsonNode);
        } else {
            this._children.add(i, jsonNode);
        }
        return this;
    }

    public ArrayNode add(JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        _add(jsonNode);
        return this;
    }

    public ArrayNode addAll(ArrayNode arrayNode) {
        this._children.addAll(arrayNode._children);
        return this;
    }

    public ArrayNode addArray() {
        ArrayNode arrayNode = arrayNode();
        _add(arrayNode);
        return arrayNode;
    }

    public ArrayNode addNull() {
        _add(nullNode());
        return this;
    }

    public ObjectNode addObject() {
        ObjectNode objectNode = objectNode();
        _add(objectNode);
        return objectNode;
    }

    public ArrayNode addPOJO(Object obj) {
        if (obj == null) {
            addNull();
        } else {
            _add(pojoNode(obj));
        }
        return this;
    }

    public ArrayNode addRawValue(RawValue rawValue) {
        if (rawValue == null) {
            addNull();
        } else {
            _add(rawValueNode(rawValue));
        }
        return this;
    }

    public JsonToken asToken() {
        return JsonToken.START_ARRAY;
    }

    public Iterator<JsonNode> elements() {
        return this._children.iterator();
    }

    public boolean equals(Comparator<JsonNode> comparator, JsonNode jsonNode) {
        if (!(jsonNode instanceof ArrayNode)) {
            return false;
        }
        ArrayNode arrayNode = (ArrayNode) jsonNode;
        int size = this._children.size();
        if (arrayNode.size() != size) {
            return false;
        }
        List<JsonNode> list = this._children;
        List<JsonNode> list2 = arrayNode._children;
        for (int i = 0; i < size; i++) {
            if (!list.get(i).equals(comparator, list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public List<JsonNode> findParents(String str, List<JsonNode> list) {
        for (JsonNode findParents : this._children) {
            list = findParents.findParents(str, list);
        }
        return list;
    }

    public JsonNode findValue(String str) {
        for (JsonNode findValue : this._children) {
            JsonNode findValue2 = findValue.findValue(str);
            if (findValue2 != null) {
                return findValue2;
            }
        }
        return null;
    }

    public List<JsonNode> findValues(String str, List<JsonNode> list) {
        for (JsonNode findValues : this._children) {
            list = findValues.findValues(str, list);
        }
        return list;
    }

    public List<String> findValuesAsText(String str, List<String> list) {
        for (JsonNode findValuesAsText : this._children) {
            list = findValuesAsText.findValuesAsText(str, list);
        }
        return list;
    }

    public JsonNode get(String str) {
        return null;
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.ARRAY;
    }

    public int hashCode() {
        return this._children.hashCode();
    }

    public ArrayNode insert(int i, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        _insert(i, jsonNode);
        return this;
    }

    public ArrayNode insertArray(int i) {
        ArrayNode arrayNode = arrayNode();
        _insert(i, arrayNode);
        return arrayNode;
    }

    public ArrayNode insertNull(int i) {
        _insert(i, nullNode());
        return this;
    }

    public ObjectNode insertObject(int i) {
        ObjectNode objectNode = objectNode();
        _insert(i, objectNode);
        return objectNode;
    }

    public ArrayNode insertPOJO(int i, Object obj) {
        return obj == null ? insertNull(i) : _insert(i, pojoNode(obj));
    }

    public boolean isArray() {
        return true;
    }

    public boolean isEmpty(SerializerProvider serializerProvider) {
        return this._children.isEmpty();
    }

    public JsonNode remove(int i) {
        if (i < 0 || i >= this._children.size()) {
            return null;
        }
        return this._children.remove(i);
    }

    public JsonNode required(int i) {
        if (i >= 0 && i < this._children.size()) {
            return this._children.get(i);
        }
        return (JsonNode) _reportRequiredViolation("No value at index #%d [0, %d) of `ArrayNode`", Integer.valueOf(i), Integer.valueOf(this._children.size()));
    }

    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        List<JsonNode> list = this._children;
        int size = list.size();
        jsonGenerator.writeStartArray(this, size);
        for (int i = 0; i < size; i++) {
            ((BaseJsonNode) list.get(i)).serialize(jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndArray();
    }

    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(this, JsonToken.START_ARRAY));
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            ((BaseJsonNode) it.next()).serialize(jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public JsonNode set(int i, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        if (i >= 0 && i < this._children.size()) {
            return this._children.set(i, jsonNode);
        }
        StringBuilder h = C0069a.m177h("Illegal index ", i, ", array size ");
        h.append(size());
        throw new IndexOutOfBoundsException(h.toString());
    }

    public int size() {
        return this._children.size();
    }

    public ArrayNode addAll(Collection<? extends JsonNode> collection) {
        for (JsonNode add : collection) {
            add(add);
        }
        return this;
    }

    public ArrayNode deepCopy() {
        ArrayNode arrayNode = new ArrayNode(this._nodeFactory);
        for (JsonNode deepCopy : this._children) {
            arrayNode._children.add(deepCopy.deepCopy());
        }
        return arrayNode;
    }

    public ObjectNode findParent(String str) {
        for (JsonNode findParent : this._children) {
            JsonNode findParent2 = findParent.findParent(str);
            if (findParent2 != null) {
                return (ObjectNode) findParent2;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return this._children.isEmpty();
    }

    public ArrayNode removeAll() {
        this._children.clear();
        return this;
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory, int i) {
        super(jsonNodeFactory);
        this._children = new ArrayList(i);
    }

    public ArrayNode add(int i) {
        _add(numberNode(i));
        return this;
    }

    public JsonNode get(int i) {
        if (i < 0 || i >= this._children.size()) {
            return null;
        }
        return this._children.get(i);
    }

    public ArrayNode insert(int i, int i2) {
        _insert(i, numberNode(i2));
        return this;
    }

    public JsonNode path(String str) {
        return MissingNode.getInstance();
    }

    public ArrayNode add(Integer num) {
        if (num == null) {
            return addNull();
        }
        return _add(numberNode(num.intValue()));
    }

    public ArrayNode insert(int i, Integer num) {
        if (num == null) {
            insertNull(i);
        } else {
            _insert(i, numberNode(num.intValue()));
        }
        return this;
    }

    public JsonNode path(int i) {
        if (i < 0 || i >= this._children.size()) {
            return MissingNode.getInstance();
        }
        return this._children.get(i);
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory, List<JsonNode> list) {
        super(jsonNodeFactory);
        this._children = list;
    }

    public ArrayNode add(long j) {
        return _add(numberNode(j));
    }

    public ArrayNode insert(int i, long j) {
        return _insert(i, numberNode(j));
    }

    public ArrayNode add(Long l) {
        if (l == null) {
            return addNull();
        }
        return _add(numberNode(l.longValue()));
    }

    public ArrayNode insert(int i, Long l) {
        if (l == null) {
            return insertNull(i);
        }
        return _insert(i, numberNode(l.longValue()));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ArrayNode)) {
            return this._children.equals(((ArrayNode) obj)._children);
        }
        return false;
    }

    public ArrayNode add(float f) {
        return _add(numberNode(f));
    }

    public ArrayNode insert(int i, float f) {
        return _insert(i, numberNode(f));
    }

    public ArrayNode add(Float f) {
        if (f == null) {
            return addNull();
        }
        return _add(numberNode(f.floatValue()));
    }

    public ArrayNode insert(int i, Float f) {
        if (f == null) {
            return insertNull(i);
        }
        return _insert(i, numberNode(f.floatValue()));
    }

    public ArrayNode add(double d) {
        return _add(numberNode(d));
    }

    public ArrayNode insert(int i, double d) {
        return _insert(i, numberNode(d));
    }

    public ArrayNode add(Double d) {
        if (d == null) {
            return addNull();
        }
        return _add(numberNode(d.doubleValue()));
    }

    public ArrayNode insert(int i, Double d) {
        if (d == null) {
            return insertNull(i);
        }
        return _insert(i, numberNode(d.doubleValue()));
    }

    public ArrayNode add(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return addNull();
        }
        return _add(numberNode(bigDecimal));
    }

    public ArrayNode insert(int i, BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return insertNull(i);
        }
        return _insert(i, numberNode(bigDecimal));
    }

    public ArrayNode add(BigInteger bigInteger) {
        if (bigInteger == null) {
            return addNull();
        }
        return _add(numberNode(bigInteger));
    }

    public ArrayNode insert(int i, BigInteger bigInteger) {
        if (bigInteger == null) {
            return insertNull(i);
        }
        return _insert(i, numberNode(bigInteger));
    }

    public ArrayNode add(String str) {
        if (str == null) {
            return addNull();
        }
        return _add(textNode(str));
    }

    public ArrayNode insert(int i, String str) {
        if (str == null) {
            return insertNull(i);
        }
        return _insert(i, textNode(str));
    }

    public ArrayNode add(boolean z) {
        return _add(booleanNode(z));
    }

    public ArrayNode insert(int i, boolean z) {
        return _insert(i, booleanNode(z));
    }

    public ArrayNode add(Boolean bool) {
        if (bool == null) {
            return addNull();
        }
        return _add(booleanNode(bool.booleanValue()));
    }

    public ArrayNode insert(int i, Boolean bool) {
        if (bool == null) {
            return insertNull(i);
        }
        return _insert(i, booleanNode(bool.booleanValue()));
    }

    public ArrayNode add(byte[] bArr) {
        if (bArr == null) {
            return addNull();
        }
        return _add(binaryNode(bArr));
    }

    public ArrayNode insert(int i, byte[] bArr) {
        if (bArr == null) {
            return insertNull(i);
        }
        return _insert(i, binaryNode(bArr));
    }
}
