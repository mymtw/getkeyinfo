package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class OptionalHandlerFactory implements Serializable {
    private static final Class<?> CLASS_DOM_DOCUMENT;
    private static final Class<?> CLASS_DOM_NODE = Node.class;
    private static final String DESERIALIZERS_FOR_JAVAX_XML = "com.fasterxml.jackson.databind.ext.CoreXMLDeserializers";
    private static final String DESERIALIZER_FOR_DOM_DOCUMENT = "com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer";
    private static final String DESERIALIZER_FOR_DOM_NODE = "com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer";
    private static final String PACKAGE_PREFIX_JAVAX_XML = "javax.xml.";
    private static final String SERIALIZERS_FOR_JAVAX_XML = "com.fasterxml.jackson.databind.ext.CoreXMLSerializers";
    private static final String SERIALIZER_FOR_DOM_NODE = "com.fasterxml.jackson.databind.ext.DOMSerializer";
    private static final Java7Handlers _jdk7Helper;
    public static final OptionalHandlerFactory instance = new OptionalHandlerFactory();
    private static final long serialVersionUID = 1;

    static {
        Java7Handlers java7Handlers = null;
        Class<Document> cls = Document.class;
        CLASS_DOM_DOCUMENT = cls;
        try {
            java7Handlers = Java7Handlers.instance();
        } catch (Throwable unused) {
        }
        _jdk7Helper = java7Handlers;
    }

    private boolean hasSuperClassStartingWith(Class<?> cls, String str) {
        boolean startsWith;
        do {
            Class<? super Object> superclass = r3.getSuperclass();
            Class<? super Object> cls2 = cls;
            if (superclass == null || superclass == Object.class) {
                return false;
            }
            startsWith = superclass.getName().startsWith(str);
            cls2 = superclass;
        } while (!startsWith);
        return true;
    }

    private Object instantiate(String str) {
        try {
            return ClassUtil.createInstance(Class.forName(str), false);
        } catch (Exception | LinkageError unused) {
            return null;
        }
    }

    public JsonDeserializer<?> findDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        Object instantiate;
        JsonDeserializer<?> deserializerForJavaNioFilePath;
        Class<?> rawClass = javaType.getRawClass();
        Java7Handlers java7Handlers = _jdk7Helper;
        if (java7Handlers != null && (deserializerForJavaNioFilePath = java7Handlers.getDeserializerForJavaNioFilePath(rawClass)) != null) {
            return deserializerForJavaNioFilePath;
        }
        Class<?> cls = CLASS_DOM_NODE;
        if (cls != null && cls.isAssignableFrom(rawClass)) {
            return (JsonDeserializer) instantiate(DESERIALIZER_FOR_DOM_NODE);
        }
        Class<?> cls2 = CLASS_DOM_DOCUMENT;
        if (cls2 != null && cls2.isAssignableFrom(rawClass)) {
            return (JsonDeserializer) instantiate(DESERIALIZER_FOR_DOM_DOCUMENT);
        }
        if ((rawClass.getName().startsWith(PACKAGE_PREFIX_JAVAX_XML) || hasSuperClassStartingWith(rawClass, PACKAGE_PREFIX_JAVAX_XML)) && (instantiate = instantiate(DESERIALIZERS_FOR_JAVAX_XML)) != null) {
            return ((Deserializers) instantiate).findBeanDeserializer(javaType, deserializationConfig, beanDescription);
        }
        return null;
    }

    public JsonSerializer<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) {
        Object instantiate;
        JsonSerializer<?> serializerForJavaNioFilePath;
        Class<?> rawClass = javaType.getRawClass();
        Class<?> cls = CLASS_DOM_NODE;
        if (cls != null && cls.isAssignableFrom(rawClass)) {
            return (JsonSerializer) instantiate(SERIALIZER_FOR_DOM_NODE);
        }
        Java7Handlers java7Handlers = _jdk7Helper;
        if (java7Handlers != null && (serializerForJavaNioFilePath = java7Handlers.getSerializerForJavaNioFilePath(rawClass)) != null) {
            return serializerForJavaNioFilePath;
        }
        if ((rawClass.getName().startsWith(PACKAGE_PREFIX_JAVAX_XML) || hasSuperClassStartingWith(rawClass, PACKAGE_PREFIX_JAVAX_XML)) && (instantiate = instantiate(SERIALIZERS_FOR_JAVAX_XML)) != null) {
            return ((Serializers) instantiate).findSerializer(serializationConfig, javaType, beanDescription);
        }
        return null;
    }

    public boolean hasDeserializerFor(Class<?> cls) {
        Class<?> cls2 = CLASS_DOM_NODE;
        if (cls2 != null && cls2.isAssignableFrom(cls)) {
            return true;
        }
        Class<?> cls3 = CLASS_DOM_DOCUMENT;
        return (cls3 != null && cls3.isAssignableFrom(cls)) || cls.getName().startsWith(PACKAGE_PREFIX_JAVAX_XML) || hasSuperClassStartingWith(cls, PACKAGE_PREFIX_JAVAX_XML);
    }
}
