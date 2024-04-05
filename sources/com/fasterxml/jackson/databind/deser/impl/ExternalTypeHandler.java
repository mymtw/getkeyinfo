package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ExternalTypeHandler {
    private final JavaType _beanType;
    private final Map<String, Object> _nameToPropertyIndex;
    private final C12523a[] _properties;
    private final TokenBuffer[] _tokens;
    private final String[] _typeIds;

    public static class Builder {
        private final JavaType _beanType;
        private final Map<String, Object> _nameToPropertyIndex = new HashMap();
        private final List<C12523a> _properties = new ArrayList();

        public Builder(JavaType javaType) {
            this._beanType = javaType;
        }

        private void _addPropertyIndex(String str, Integer num) {
            Object obj = this._nameToPropertyIndex.get(str);
            if (obj == null) {
                this._nameToPropertyIndex.put(str, num);
            } else if (obj instanceof List) {
                ((List) obj).add(num);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(obj);
                linkedList.add(num);
                this._nameToPropertyIndex.put(str, linkedList);
            }
        }

        public void addExternal(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            Integer valueOf = Integer.valueOf(this._properties.size());
            this._properties.add(new C12523a(settableBeanProperty, typeDeserializer));
            _addPropertyIndex(settableBeanProperty.getName(), valueOf);
            _addPropertyIndex(typeDeserializer.getPropertyName(), valueOf);
        }

        public ExternalTypeHandler build(BeanPropertyMap beanPropertyMap) {
            int size = this._properties.size();
            C12523a[] aVarArr = new C12523a[size];
            for (int i = 0; i < size; i++) {
                C12523a aVar = this._properties.get(i);
                SettableBeanProperty find = beanPropertyMap.find(aVar.f27666c);
                if (find != null) {
                    aVar.f27667d = find;
                }
                aVarArr[i] = aVar;
            }
            return new ExternalTypeHandler(this._beanType, aVarArr, this._nameToPropertyIndex, (String[]) null, (TokenBuffer[]) null);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$a */
    public static final class C12523a {

        /* renamed from: a */
        public final SettableBeanProperty f27664a;

        /* renamed from: b */
        public final TypeDeserializer f27665b;

        /* renamed from: c */
        public final String f27666c;

        /* renamed from: d */
        public SettableBeanProperty f27667d;

        public C12523a(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            this.f27664a = settableBeanProperty;
            this.f27665b = typeDeserializer;
            this.f27666c = typeDeserializer.getPropertyName();
        }
    }

    public ExternalTypeHandler(JavaType javaType, C12523a[] aVarArr, Map<String, Object> map, String[] strArr, TokenBuffer[] tokenBufferArr) {
        this._beanType = javaType;
        this._properties = aVarArr;
        this._nameToPropertyIndex = map;
        this._typeIds = strArr;
        this._tokens = tokenBufferArr;
    }

    private final boolean _handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj, String str2, int i) throws IOException {
        boolean z = false;
        if (!str.equals(this._properties[i].f27666c)) {
            return false;
        }
        if (!(obj == null || this._tokens[i] == null)) {
            z = true;
        }
        if (z) {
            _deserializeAndSet(jsonParser, deserializationContext, obj, i, str2);
            this._tokens[i] = null;
        } else {
            this._typeIds[i] = str2;
        }
        return true;
    }

    public static Builder builder(JavaType javaType) {
        return new Builder(javaType);
    }

    public final Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, int i, String str) throws IOException {
        JsonParser asParser = this._tokens[i].asParser(jsonParser);
        if (asParser.nextToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartArray();
        tokenBuffer.writeString(str);
        tokenBuffer.copyCurrentStructure(asParser);
        tokenBuffer.writeEndArray();
        JsonParser asParser2 = tokenBuffer.asParser(jsonParser);
        asParser2.nextToken();
        return this._properties[i].f27664a.deserialize(asParser2, deserializationContext);
    }

    public final void _deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i, String str) throws IOException {
        JsonParser asParser = this._tokens[i].asParser(jsonParser);
        if (asParser.nextToken() == JsonToken.VALUE_NULL) {
            this._properties[i].f27664a.set(obj, (Object) null);
            return;
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartArray();
        tokenBuffer.writeString(str);
        tokenBuffer.copyCurrentStructure(asParser);
        tokenBuffer.writeEndArray();
        JsonParser asParser2 = tokenBuffer.asParser(jsonParser);
        asParser2.nextToken();
        this._properties[i].f27664a.deserializeAndSet(asParser2, deserializationContext, obj);
    }

    public Object complete(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        String str;
        int length = this._properties.length;
        for (int i = 0; i < length; i++) {
            String str2 = this._typeIds[i];
            if (str2 == null) {
                TokenBuffer tokenBuffer = this._tokens[i];
                if (tokenBuffer != null) {
                    if (tokenBuffer.firstToken().isScalarValue()) {
                        JsonParser asParser = tokenBuffer.asParser(jsonParser);
                        asParser.nextToken();
                        SettableBeanProperty settableBeanProperty = this._properties[i].f27664a;
                        Object deserializeIfNatural = TypeDeserializer.deserializeIfNatural(asParser, deserializationContext, settableBeanProperty.getType());
                        if (deserializeIfNatural != null) {
                            settableBeanProperty.set(obj, deserializeIfNatural);
                        } else {
                            if (!(this._properties[i].f27665b.getDefaultImpl() != null)) {
                                deserializationContext.reportPropertyInputMismatch(obj.getClass(), settableBeanProperty.getName(), "Missing external type id property '%s'", this._properties[i].f27666c);
                            } else {
                                C12523a aVar = this._properties[i];
                                Class<?> defaultImpl = aVar.f27665b.getDefaultImpl();
                                String str3 = null;
                                if (defaultImpl != null) {
                                    str3 = aVar.f27665b.getTypeIdResolver().idFromValueAndType((Object) null, defaultImpl);
                                }
                                str = str3;
                                _deserializeAndSet(jsonParser, deserializationContext, obj, i, str);
                            }
                        }
                    }
                }
            } else if (this._tokens[i] == null) {
                SettableBeanProperty settableBeanProperty2 = this._properties[i].f27664a;
                if (settableBeanProperty2.isRequired() || deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    deserializationContext.reportPropertyInputMismatch(obj.getClass(), settableBeanProperty2.getName(), "Missing property '%s' for external type id '%s'", settableBeanProperty2.getName(), this._properties[i].f27666c);
                }
                return obj;
            }
            str = str2;
            _deserializeAndSet(jsonParser, deserializationContext, obj, i, str);
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
        if (r10._tokens[r0] != null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ae, code lost:
        if (r10._typeIds[r0] != null) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handlePropertyValue(com.fasterxml.jackson.core.JsonParser r11, com.fasterxml.jackson.databind.DeserializationContext r12, java.lang.String r13, java.lang.Object r14) throws java.io.IOException {
        /*
            r10 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10._nameToPropertyIndex
            java.lang.Object r0 = r0.get(r13)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            boolean r2 = r0 instanceof java.util.List
            r3 = 1
            if (r2 == 0) goto L_0x0075
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r14 = r0.iterator()
            java.lang.Object r0 = r14.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$a[] r1 = r10._properties
            int r2 = r0.intValue()
            r1 = r1[r2]
            java.lang.String r1 = r1.f27666c
            boolean r13 = r13.equals(r1)
            if (r13 == 0) goto L_0x004f
            java.lang.String r12 = r11.getText()
            r11.skipChildren()
            java.lang.String[] r11 = r10._typeIds
            int r13 = r0.intValue()
            r11[r13] = r12
        L_0x003a:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto L_0x0074
            java.lang.String[] r11 = r10._typeIds
            java.lang.Object r13 = r14.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11[r13] = r12
            goto L_0x003a
        L_0x004f:
            com.fasterxml.jackson.databind.util.TokenBuffer r13 = new com.fasterxml.jackson.databind.util.TokenBuffer
            r13.<init>((com.fasterxml.jackson.core.JsonParser) r11, (com.fasterxml.jackson.databind.DeserializationContext) r12)
            r13.copyCurrentStructure(r11)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r11 = r10._tokens
            int r12 = r0.intValue()
            r11[r12] = r13
        L_0x005f:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto L_0x0074
            com.fasterxml.jackson.databind.util.TokenBuffer[] r11 = r10._tokens
            java.lang.Object r12 = r14.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11[r12] = r13
            goto L_0x005f
        L_0x0074:
            return r3
        L_0x0075:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$a[] r2 = r10._properties
            r2 = r2[r0]
            java.lang.String r2 = r2.f27666c
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L_0x009c
            java.lang.String[] r13 = r10._typeIds
            java.lang.String r2 = r11.getText()
            r13[r0] = r2
            r11.skipChildren()
            if (r14 == 0) goto L_0x00b1
            com.fasterxml.jackson.databind.util.TokenBuffer[] r13 = r10._tokens
            r13 = r13[r0]
            if (r13 == 0) goto L_0x00b1
        L_0x009a:
            r1 = r3
            goto L_0x00b1
        L_0x009c:
            com.fasterxml.jackson.databind.util.TokenBuffer r13 = new com.fasterxml.jackson.databind.util.TokenBuffer
            r13.<init>((com.fasterxml.jackson.core.JsonParser) r11, (com.fasterxml.jackson.databind.DeserializationContext) r12)
            r13.copyCurrentStructure(r11)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r2 = r10._tokens
            r2[r0] = r13
            if (r14 == 0) goto L_0x00b1
            java.lang.String[] r13 = r10._typeIds
            r13 = r13[r0]
            if (r13 == 0) goto L_0x00b1
            goto L_0x009a
        L_0x00b1:
            if (r1 == 0) goto L_0x00c6
            java.lang.String[] r13 = r10._typeIds
            r9 = r13[r0]
            r1 = 0
            r13[r0] = r1
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r14
            r8 = r0
            r4._deserializeAndSet(r5, r6, r7, r8, r9)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r11 = r10._tokens
            r11[r0] = r1
        L_0x00c6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object):boolean");
    }

    public boolean handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) throws IOException {
        Object obj2 = this._nameToPropertyIndex.get(str);
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        String text = jsonParser.getText();
        if (obj2 instanceof List) {
            for (Integer intValue : (List) obj2) {
                if (_handleTypePropertyValue(jsonParser, deserializationContext, str, obj, text, intValue.intValue())) {
                    z = true;
                }
            }
            return z;
        }
        return _handleTypePropertyValue(jsonParser, deserializationContext, str, obj, text, ((Integer) obj2).intValue());
    }

    public ExternalTypeHandler start() {
        return new ExternalTypeHandler(this);
    }

    public ExternalTypeHandler(ExternalTypeHandler externalTypeHandler) {
        this._beanType = externalTypeHandler._beanType;
        C12523a[] aVarArr = externalTypeHandler._properties;
        this._properties = aVarArr;
        this._nameToPropertyIndex = externalTypeHandler._nameToPropertyIndex;
        int length = aVarArr.length;
        this._typeIds = new String[length];
        this._tokens = new TokenBuffer[length];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r13.isEnabled(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY) != false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object complete(com.fasterxml.jackson.core.JsonParser r12, com.fasterxml.jackson.databind.DeserializationContext r13, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer r14, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator r15) throws java.io.IOException {
        /*
            r11 = this;
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$a[] r0 = r11._properties
            int r0 = r0.length
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r3 = r2
        L_0x0007:
            if (r3 >= r0) goto L_0x00d3
            java.lang.String[] r4 = r11._typeIds
            r4 = r4[r3]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$a[] r5 = r11._properties
            r5 = r5[r3]
            r6 = 1
            if (r4 != 0) goto L_0x0053
            com.fasterxml.jackson.databind.util.TokenBuffer[] r7 = r11._tokens
            r7 = r7[r3]
            if (r7 != 0) goto L_0x001c
            goto L_0x00cf
        L_0x001c:
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r7 = r5.f27665b
            java.lang.Class r7 = r7.getDefaultImpl()
            if (r7 == 0) goto L_0x0026
            r7 = r6
            goto L_0x0027
        L_0x0026:
            r7 = r2
        L_0x0027:
            if (r7 != 0) goto L_0x003d
            com.fasterxml.jackson.databind.JavaType r7 = r11._beanType
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r8 = r5.f27664a
            java.lang.String r8 = r8.getName()
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r9 = r5.f27666c
            r6[r2] = r9
            java.lang.String r9 = "Missing external type id property '%s'"
            r13.reportPropertyInputMismatch((com.fasterxml.jackson.databind.JavaType) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.Object[]) r6)
            goto L_0x0085
        L_0x003d:
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r4 = r5.f27665b
            java.lang.Class r4 = r4.getDefaultImpl()
            r6 = 0
            if (r4 != 0) goto L_0x0048
            r4 = r6
            goto L_0x0085
        L_0x0048:
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r7 = r5.f27665b
            com.fasterxml.jackson.databind.jsontype.TypeIdResolver r7 = r7.getTypeIdResolver()
            java.lang.String r4 = r7.idFromValueAndType(r6, r4)
            goto L_0x0085
        L_0x0053:
            com.fasterxml.jackson.databind.util.TokenBuffer[] r7 = r11._tokens
            r7 = r7[r3]
            if (r7 != 0) goto L_0x0085
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r7 = r5.f27664a
            boolean r8 = r7.isRequired()
            if (r8 != 0) goto L_0x0069
            com.fasterxml.jackson.databind.DeserializationFeature r8 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY
            boolean r8 = r13.isEnabled((com.fasterxml.jackson.databind.DeserializationFeature) r8)
            if (r8 == 0) goto L_0x0085
        L_0x0069:
            com.fasterxml.jackson.databind.JavaType r8 = r11._beanType
            java.lang.String r9 = r7.getName()
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r7 = r7.getName()
            r10[r2] = r7
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$a[] r7 = r11._properties
            r7 = r7[r3]
            java.lang.String r7 = r7.f27666c
            r10[r6] = r7
            java.lang.String r6 = "Missing property '%s' for external type id '%s'"
            r13.reportPropertyInputMismatch((com.fasterxml.jackson.databind.JavaType) r8, (java.lang.String) r9, (java.lang.String) r6, (java.lang.Object[]) r10)
        L_0x0085:
            com.fasterxml.jackson.databind.util.TokenBuffer[] r6 = r11._tokens
            r6 = r6[r3]
            if (r6 == 0) goto L_0x0091
            java.lang.Object r6 = r11._deserialize(r12, r13, r3, r4)
            r1[r3] = r6
        L_0x0091:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r6 = r5.f27664a
            int r7 = r6.getCreatorIndex()
            if (r7 < 0) goto L_0x00cf
            r7 = r1[r3]
            r14.assignParameter(r6, r7)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r5 = r5.f27667d
            if (r5 == 0) goto L_0x00cf
            int r6 = r5.getCreatorIndex()
            if (r6 < 0) goto L_0x00cf
            com.fasterxml.jackson.databind.JavaType r6 = r5.getType()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = r6.hasRawClass(r7)
            if (r6 == 0) goto L_0x00b5
            goto L_0x00cc
        L_0x00b5:
            com.fasterxml.jackson.databind.util.TokenBuffer r6 = new com.fasterxml.jackson.databind.util.TokenBuffer
            r6.<init>((com.fasterxml.jackson.core.JsonParser) r12, (com.fasterxml.jackson.databind.DeserializationContext) r13)
            r6.writeString((java.lang.String) r4)
            com.fasterxml.jackson.databind.JsonDeserializer r4 = r5.getValueDeserializer()
            com.fasterxml.jackson.core.JsonParser r7 = r6.asParserOnFirstToken()
            java.lang.Object r4 = r4.deserialize(r7, r13)
            r6.close()
        L_0x00cc:
            r14.assignParameter(r5, r4)
        L_0x00cf:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x00d3:
            java.lang.Object r12 = r15.build(r13, r14)
        L_0x00d7:
            if (r2 >= r0) goto L_0x00ed
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$a[] r13 = r11._properties
            r13 = r13[r2]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r13 = r13.f27664a
            int r14 = r13.getCreatorIndex()
            if (r14 >= 0) goto L_0x00ea
            r14 = r1[r2]
            r13.set(r12, r14)
        L_0x00ea:
            int r2 = r2 + 1
            goto L_0x00d7
        L_0x00ed:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator):java.lang.Object");
    }
}
