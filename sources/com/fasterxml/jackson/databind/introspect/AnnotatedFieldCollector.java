package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AnnotatedFieldCollector extends C12552b {
    private final boolean _collectAnnotations;
    private final ClassIntrospector.MixInResolver _mixInResolver;
    private final TypeFactory _typeFactory;

    /* renamed from: com.fasterxml.jackson.databind.introspect.AnnotatedFieldCollector$a */
    public static final class C12532a {

        /* renamed from: a */
        public final TypeResolutionContext f27686a;

        /* renamed from: b */
        public final Field f27687b;

        /* renamed from: c */
        public AnnotationCollector f27688c = AnnotationCollector.emptyCollector();

        public C12532a(TypeResolutionContext typeResolutionContext, Field field) {
            this.f27686a = typeResolutionContext;
            this.f27687b = field;
        }
    }

    public AnnotatedFieldCollector(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, ClassIntrospector.MixInResolver mixInResolver, boolean z) {
        super(annotationIntrospector);
        this._typeFactory = typeFactory;
        this._mixInResolver = annotationIntrospector == null ? null : mixInResolver;
        this._collectAnnotations = z;
    }

    private void _addFieldMixIns(Class<?> cls, Class<?> cls2, Map<String, C12532a> map) {
        C12532a aVar;
        for (Class<?> declaredFields : ClassUtil.findSuperClasses(cls, cls2, true)) {
            for (Field field : declaredFields.getDeclaredFields()) {
                if (_isIncludableField(field) && (aVar = map.get(field.getName())) != null) {
                    aVar.f27688c = collectAnnotations(aVar.f27688c, field.getDeclaredAnnotations());
                }
            }
        }
    }

    private Map<String, C12532a> _findFields(TypeResolutionContext typeResolutionContext, JavaType javaType, Map<String, C12532a> map) {
        ClassIntrospector.MixInResolver mixInResolver;
        Class<?> findMixInClassFor;
        JavaType superClass = javaType.getSuperClass();
        if (superClass == null) {
            return map;
        }
        Class<?> rawClass = javaType.getRawClass();
        Map<String, C12532a> _findFields = _findFields(new TypeResolutionContext.Basic(this._typeFactory, superClass.getBindings()), superClass, map);
        for (Field field : rawClass.getDeclaredFields()) {
            if (_isIncludableField(field)) {
                if (_findFields == null) {
                    _findFields = new LinkedHashMap<>();
                }
                C12532a aVar = new C12532a(typeResolutionContext, field);
                if (this._collectAnnotations) {
                    aVar.f27688c = collectAnnotations(aVar.f27688c, field.getDeclaredAnnotations());
                }
                _findFields.put(field.getName(), aVar);
            }
        }
        if (!(_findFields == null || (mixInResolver = this._mixInResolver) == null || (findMixInClassFor = mixInResolver.findMixInClassFor(rawClass)) == null)) {
            _addFieldMixIns(findMixInClassFor, rawClass, _findFields);
        }
        return _findFields;
    }

    private boolean _isIncludableField(Field field) {
        return !field.isSynthetic() && !Modifier.isStatic(field.getModifiers());
    }

    public static List<AnnotatedField> collectFields(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, JavaType javaType, boolean z) {
        return new AnnotatedFieldCollector(annotationIntrospector, typeFactory, mixInResolver, z).collect(typeResolutionContext, javaType);
    }

    public List<AnnotatedField> collect(TypeResolutionContext typeResolutionContext, JavaType javaType) {
        Map<String, C12532a> _findFields = _findFields(typeResolutionContext, javaType, (Map<String, C12532a>) null);
        if (_findFields == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(_findFields.size());
        for (C12532a next : _findFields.values()) {
            arrayList.add(new AnnotatedField(next.f27686a, next.f27687b, next.f27688c.asAnnotationMap()));
        }
        return arrayList;
    }
}
