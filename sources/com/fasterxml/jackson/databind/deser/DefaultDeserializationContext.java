package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class DefaultDeserializationContext extends DeserializationContext {
    private static final long serialVersionUID = 1;
    private List<ObjectIdResolver> _objectIdResolvers;
    public transient LinkedHashMap<ObjectIdGenerator.IdKey, ReadableObjectId> _objectIds;

    public static final class Impl extends DefaultDeserializationContext {
        private static final long serialVersionUID = 1;

        public Impl(DeserializerFactory deserializerFactory) {
            super(deserializerFactory, (DeserializerCache) null);
        }

        public DefaultDeserializationContext copy() {
            ClassUtil.verifyMustOverride(Impl.class, this, "copy");
            return new Impl(this);
        }

        public DefaultDeserializationContext createInstance(DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
            return new Impl(this, deserializationConfig, jsonParser, injectableValues);
        }

        public DefaultDeserializationContext with(DeserializerFactory deserializerFactory) {
            return new Impl(this, deserializerFactory);
        }

        public Impl(Impl impl, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
            super(impl, deserializationConfig, jsonParser, injectableValues);
        }

        public Impl(Impl impl) {
            super(impl);
        }

        public Impl(Impl impl, DeserializerFactory deserializerFactory) {
            super((DefaultDeserializationContext) impl, deserializerFactory);
        }
    }

    public DefaultDeserializationContext(DeserializerFactory deserializerFactory, DeserializerCache deserializerCache) {
        super(deserializerFactory, deserializerCache);
    }

    public void checkUnresolvedObjectId() throws UnresolvedForwardReference {
        if (this._objectIds != null && isEnabled(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS)) {
            UnresolvedForwardReference unresolvedForwardReference = null;
            for (Map.Entry<ObjectIdGenerator.IdKey, ReadableObjectId> value : this._objectIds.entrySet()) {
                ReadableObjectId readableObjectId = (ReadableObjectId) value.getValue();
                if (readableObjectId.hasReferringProperties() && !tryToResolveUnresolvedObjectId(readableObjectId)) {
                    if (unresolvedForwardReference == null) {
                        unresolvedForwardReference = new UnresolvedForwardReference(getParser(), "Unresolved forward references for: ");
                    }
                    Object obj = readableObjectId.getKey().key;
                    Iterator<ReadableObjectId.Referring> referringProperties = readableObjectId.referringProperties();
                    while (referringProperties.hasNext()) {
                        ReadableObjectId.Referring next = referringProperties.next();
                        unresolvedForwardReference.addUnresolvedId(obj, next.getBeanType(), next.getLocation());
                    }
                }
            }
            if (unresolvedForwardReference != null) {
                throw unresolvedForwardReference;
            }
        }
    }

    public DefaultDeserializationContext copy() {
        throw new IllegalStateException("DefaultDeserializationContext sub-class not overriding copy()");
    }

    public abstract DefaultDeserializationContext createInstance(DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues);

    public ReadableObjectId createReadableObjectId(ObjectIdGenerator.IdKey idKey) {
        return new ReadableObjectId(idKey);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Class<com.fasterxml.jackson.databind.JsonDeserializer$None>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.fasterxml.jackson.databind.JsonDeserializer<?>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated r3, java.lang.Object r4) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r2 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof com.fasterxml.jackson.databind.JsonDeserializer
            if (r1 == 0) goto L_0x000b
            com.fasterxml.jackson.databind.JsonDeserializer r4 = (com.fasterxml.jackson.databind.JsonDeserializer) r4
            goto L_0x0044
        L_0x000b:
            boolean r1 = r4 instanceof java.lang.Class
            if (r1 == 0) goto L_0x0062
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<com.fasterxml.jackson.databind.JsonDeserializer$None> r1 = com.fasterxml.jackson.databind.JsonDeserializer.None.class
            if (r4 == r1) goto L_0x0061
            boolean r1 = com.fasterxml.jackson.databind.util.ClassUtil.isBogusClass(r4)
            if (r1 == 0) goto L_0x001c
            goto L_0x0061
        L_0x001c:
            java.lang.Class<com.fasterxml.jackson.databind.JsonDeserializer> r1 = com.fasterxml.jackson.databind.JsonDeserializer.class
            boolean r1 = r1.isAssignableFrom(r4)
            if (r1 == 0) goto L_0x004f
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r2._config
            com.fasterxml.jackson.databind.cfg.HandlerInstantiator r1 = r1.getHandlerInstantiator()
            if (r1 != 0) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r2._config
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r1.deserializerInstance(r0, r3, r4)
        L_0x0033:
            if (r0 != 0) goto L_0x0043
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r2._config
            boolean r3 = r3.canOverrideAccessModifiers()
            java.lang.Object r3 = com.fasterxml.jackson.databind.util.ClassUtil.createInstance(r4, r3)
            r4 = r3
            com.fasterxml.jackson.databind.JsonDeserializer r4 = (com.fasterxml.jackson.databind.JsonDeserializer) r4
            goto L_0x0044
        L_0x0043:
            r4 = r0
        L_0x0044:
            boolean r3 = r4 instanceof com.fasterxml.jackson.databind.deser.ResolvableDeserializer
            if (r3 == 0) goto L_0x004e
            r3 = r4
            com.fasterxml.jackson.databind.deser.ResolvableDeserializer r3 = (com.fasterxml.jackson.databind.deser.ResolvableDeserializer) r3
            r3.resolve(r2)
        L_0x004e:
            return r4
        L_0x004f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "AnnotationIntrospector returned Class "
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.String r1 = "; expected Class<JsonDeserializer>"
            java.lang.String r4 = androidx.appcompat.widget.C0326j.m863h(r4, r0, r1)
            r3.<init>(r4)
            throw r3
        L_0x0061:
            return r0
        L_0x0062:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "AnnotationIntrospector returned deserializer definition of type "
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.String r1 = "; expected type JsonDeserializer or Class<JsonDeserializer> instead"
            java.lang.String r4 = p504ai.C13983i.m21493l(r4, r0, r1)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.deserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public ReadableObjectId findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, ObjectIdResolver objectIdResolver) {
        ObjectIdResolver objectIdResolver2 = null;
        if (obj == null) {
            return null;
        }
        ObjectIdGenerator.IdKey key = objectIdGenerator.key(obj);
        LinkedHashMap<ObjectIdGenerator.IdKey, ReadableObjectId> linkedHashMap = this._objectIds;
        if (linkedHashMap == null) {
            this._objectIds = new LinkedHashMap<>();
        } else {
            ReadableObjectId readableObjectId = linkedHashMap.get(key);
            if (readableObjectId != null) {
                return readableObjectId;
            }
        }
        List<ObjectIdResolver> list = this._objectIdResolvers;
        if (list != null) {
            Iterator<ObjectIdResolver> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ObjectIdResolver next = it.next();
                if (next.canUseFor(objectIdResolver)) {
                    objectIdResolver2 = next;
                    break;
                }
            }
        } else {
            this._objectIdResolvers = new ArrayList(8);
        }
        if (objectIdResolver2 == null) {
            objectIdResolver2 = objectIdResolver.newForDeserialization(this);
            this._objectIdResolvers.add(objectIdResolver2);
        }
        ReadableObjectId createReadableObjectId = createReadableObjectId(key);
        createReadableObjectId.setResolver(objectIdResolver2);
        this._objectIds.put(key, createReadableObjectId);
        return createReadableObjectId;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Class<com.fasterxml.jackson.databind.KeyDeserializer$None>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.fasterxml.jackson.databind.KeyDeserializer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.KeyDeserializer keyDeserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated r3, java.lang.Object r4) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r2 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof com.fasterxml.jackson.databind.KeyDeserializer
            if (r1 == 0) goto L_0x000b
            com.fasterxml.jackson.databind.KeyDeserializer r4 = (com.fasterxml.jackson.databind.KeyDeserializer) r4
            goto L_0x0044
        L_0x000b:
            boolean r1 = r4 instanceof java.lang.Class
            if (r1 == 0) goto L_0x0062
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<com.fasterxml.jackson.databind.KeyDeserializer$None> r1 = com.fasterxml.jackson.databind.KeyDeserializer.None.class
            if (r4 == r1) goto L_0x0061
            boolean r1 = com.fasterxml.jackson.databind.util.ClassUtil.isBogusClass(r4)
            if (r1 == 0) goto L_0x001c
            goto L_0x0061
        L_0x001c:
            java.lang.Class<com.fasterxml.jackson.databind.KeyDeserializer> r1 = com.fasterxml.jackson.databind.KeyDeserializer.class
            boolean r1 = r1.isAssignableFrom(r4)
            if (r1 == 0) goto L_0x004f
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r2._config
            com.fasterxml.jackson.databind.cfg.HandlerInstantiator r1 = r1.getHandlerInstantiator()
            if (r1 != 0) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r2._config
            com.fasterxml.jackson.databind.KeyDeserializer r0 = r1.keyDeserializerInstance(r0, r3, r4)
        L_0x0033:
            if (r0 != 0) goto L_0x0043
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r2._config
            boolean r3 = r3.canOverrideAccessModifiers()
            java.lang.Object r3 = com.fasterxml.jackson.databind.util.ClassUtil.createInstance(r4, r3)
            r4 = r3
            com.fasterxml.jackson.databind.KeyDeserializer r4 = (com.fasterxml.jackson.databind.KeyDeserializer) r4
            goto L_0x0044
        L_0x0043:
            r4 = r0
        L_0x0044:
            boolean r3 = r4 instanceof com.fasterxml.jackson.databind.deser.ResolvableDeserializer
            if (r3 == 0) goto L_0x004e
            r3 = r4
            com.fasterxml.jackson.databind.deser.ResolvableDeserializer r3 = (com.fasterxml.jackson.databind.deser.ResolvableDeserializer) r3
            r3.resolve(r2)
        L_0x004e:
            return r4
        L_0x004f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "AnnotationIntrospector returned Class "
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.String r1 = "; expected Class<KeyDeserializer>"
            java.lang.String r4 = androidx.appcompat.widget.C0326j.m863h(r4, r0, r1)
            r3.<init>(r4)
            throw r3
        L_0x0061:
            return r0
        L_0x0062:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "AnnotationIntrospector returned key deserializer definition of type "
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.String r1 = "; expected type KeyDeserializer or Class<KeyDeserializer> instead"
            java.lang.String r4 = p504ai.C13983i.m21493l(r4, r0, r1)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.keyDeserializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object):com.fasterxml.jackson.databind.KeyDeserializer");
    }

    public boolean tryToResolveUnresolvedObjectId(ReadableObjectId readableObjectId) {
        return readableObjectId.tryToResolveUnresolved(this);
    }

    public abstract DefaultDeserializationContext with(DeserializerFactory deserializerFactory);

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
        super(defaultDeserializationContext, deserializationConfig, jsonParser, injectableValues);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializerFactory deserializerFactory) {
        super((DeserializationContext) defaultDeserializationContext, deserializerFactory);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext) {
        super((DeserializationContext) defaultDeserializationContext);
    }
}
