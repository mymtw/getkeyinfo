package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AnnotatedMethodCollector extends C12552b {
    private final boolean _collectAnnotations;
    private final ClassIntrospector.MixInResolver _mixInResolver;

    /* renamed from: com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector$a */
    public static final class C12533a {

        /* renamed from: a */
        public TypeResolutionContext f27689a;

        /* renamed from: b */
        public Method f27690b;

        /* renamed from: c */
        public AnnotationCollector f27691c;

        public C12533a(TypeResolutionContext typeResolutionContext, Method method, AnnotationCollector annotationCollector) {
            this.f27689a = typeResolutionContext;
            this.f27690b = method;
            this.f27691c = annotationCollector;
        }
    }

    public AnnotatedMethodCollector(AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver, boolean z) {
        super(annotationIntrospector);
        this._mixInResolver = annotationIntrospector == null ? null : mixInResolver;
        this._collectAnnotations = z;
    }

    private void _addMemberMethods(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<MemberKey, C12533a> map, Class<?> cls2) {
        if (cls2 != null) {
            _addMethodMixIns(typeResolutionContext, cls, map, cls2);
        }
        if (cls != null) {
            for (Method method : ClassUtil.getClassMethods(cls)) {
                if (_isIncludableMemberMethod(method)) {
                    MemberKey memberKey = new MemberKey(method);
                    C12533a aVar = map.get(memberKey);
                    if (aVar == null) {
                        map.put(memberKey, new C12533a(typeResolutionContext, method, this._intr == null ? AnnotationCollector.emptyCollector() : collectAnnotations(method.getDeclaredAnnotations())));
                    } else {
                        if (this._collectAnnotations) {
                            aVar.f27691c = collectDefaultAnnotations(aVar.f27691c, method.getDeclaredAnnotations());
                        }
                        Method method2 = aVar.f27690b;
                        if (method2 == null) {
                            aVar.f27690b = method;
                        } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                            aVar.f27690b = method;
                            aVar.f27689a = typeResolutionContext;
                        }
                    }
                }
            }
        }
    }

    private boolean _isIncludableMemberMethod(Method method) {
        return !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic() && !method.isBridge() && method.getParameterTypes().length <= 2;
    }

    public static AnnotatedMethodMap collectMethods(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, JavaType javaType, List<JavaType> list, Class<?> cls, boolean z) {
        return new AnnotatedMethodCollector(annotationIntrospector, mixInResolver, z).collect(typeFactory, typeResolutionContext, javaType, list, cls);
    }

    public void _addMethodMixIns(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<MemberKey, C12533a> map, Class<?> cls2) {
        if (this._intr != null) {
            for (Class<?> declaredMethods : ClassUtil.findRawSuperTypes(cls2, cls, true)) {
                for (Method method : declaredMethods.getDeclaredMethods()) {
                    if (_isIncludableMemberMethod(method)) {
                        MemberKey memberKey = new MemberKey(method);
                        C12533a aVar = map.get(memberKey);
                        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                        if (aVar == null) {
                            map.put(memberKey, new C12533a(typeResolutionContext, (Method) null, collectAnnotations(declaredAnnotations)));
                        } else {
                            aVar.f27691c = collectDefaultAnnotations(aVar.f27691c, declaredAnnotations);
                        }
                    }
                }
            }
        }
    }

    public AnnotatedMethodMap collect(TypeFactory typeFactory, TypeResolutionContext typeResolutionContext, JavaType javaType, List<JavaType> list, Class<?> cls) {
        boolean z;
        Class<?> findMixInClassFor;
        Class<Object> cls2 = Object.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        _addMemberMethods(typeResolutionContext, javaType.getRawClass(), linkedHashMap, cls);
        Iterator<JavaType> it = list.iterator();
        while (true) {
            Class<?> cls3 = null;
            if (!it.hasNext()) {
                break;
            }
            JavaType next = it.next();
            ClassIntrospector.MixInResolver mixInResolver = this._mixInResolver;
            if (mixInResolver != null) {
                cls3 = mixInResolver.findMixInClassFor(next.getRawClass());
            }
            _addMemberMethods(new TypeResolutionContext.Basic(typeFactory, next.getBindings()), next.getRawClass(), linkedHashMap, cls3);
        }
        ClassIntrospector.MixInResolver mixInResolver2 = this._mixInResolver;
        if (mixInResolver2 == null || (findMixInClassFor = mixInResolver2.findMixInClassFor(cls2)) == null) {
            z = false;
        } else {
            _addMethodMixIns(typeResolutionContext, javaType.getRawClass(), linkedHashMap, findMixInClassFor);
            z = true;
        }
        if (z && this._intr != null && !linkedHashMap.isEmpty()) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                MemberKey memberKey = (MemberKey) entry.getKey();
                if ("hashCode".equals(memberKey.getName()) && memberKey.argCount() == 0) {
                    try {
                        Method declaredMethod = cls2.getDeclaredMethod(memberKey.getName(), new Class[0]);
                        if (declaredMethod != null) {
                            C12533a aVar = (C12533a) entry.getValue();
                            aVar.f27691c = collectDefaultAnnotations(aVar.f27691c, declaredMethod.getDeclaredAnnotations());
                            aVar.f27690b = declaredMethod;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return new AnnotatedMethodMap();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            C12533a aVar2 = (C12533a) entry2.getValue();
            Method method = aVar2.f27690b;
            AnnotatedMethod annotatedMethod = method == null ? null : new AnnotatedMethod(aVar2.f27689a, method, aVar2.f27691c.asAnnotationMap(), (AnnotationMap[]) null);
            if (annotatedMethod != null) {
                linkedHashMap2.put(entry2.getKey(), annotatedMethod);
            }
        }
        return new AnnotatedMethodMap(linkedHashMap2);
    }
}
