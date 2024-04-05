package com.fasterxml.jackson.databind.introspect;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public final class AnnotatedClass extends Annotated implements TypeResolutionContext {
    private static final Creators NO_CREATORS = new Creators((AnnotatedConstructor) null, Collections.emptyList(), Collections.emptyList());
    public final AnnotationIntrospector _annotationIntrospector;
    public final TypeBindings _bindings;
    public final Class<?> _class;
    public final Annotations _classAnnotations;
    public final boolean _collectAnnotations;
    public Creators _creators;
    public List<AnnotatedField> _fields;
    public AnnotatedMethodMap _memberMethods;
    public final ClassIntrospector.MixInResolver _mixInResolver;
    public transient Boolean _nonStaticInnerClass;
    public final Class<?> _primaryMixIn;
    public final List<JavaType> _superTypes;
    public final JavaType _type;
    public final TypeFactory _typeFactory;

    public static final class Creators {
        public final List<AnnotatedConstructor> constructors;
        public final List<AnnotatedMethod> creatorMethods;
        public final AnnotatedConstructor defaultConstructor;

        public Creators(AnnotatedConstructor annotatedConstructor, List<AnnotatedConstructor> list, List<AnnotatedMethod> list2) {
            this.defaultConstructor = annotatedConstructor;
            this.constructors = list;
            this.creatorMethods = list2;
        }
    }

    public AnnotatedClass(JavaType javaType, Class<?> cls, List<JavaType> list, Class<?> cls2, Annotations annotations, TypeBindings typeBindings, AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, boolean z) {
        this._type = javaType;
        this._class = cls;
        this._superTypes = list;
        this._primaryMixIn = cls2;
        this._classAnnotations = annotations;
        this._bindings = typeBindings;
        this._annotationIntrospector = annotationIntrospector;
        this._mixInResolver = mixInResolver;
        this._typeFactory = typeFactory;
        this._collectAnnotations = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.fasterxml.jackson.databind.introspect.AnnotatedClass.Creators _creators() {
        /*
            r16 = this;
            r0 = r16
            com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators r1 = r0._creators
            if (r1 != 0) goto L_0x0229
            com.fasterxml.jackson.databind.JavaType r1 = r0._type
            if (r1 != 0) goto L_0x000e
            com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators r1 = NO_CREATORS
            goto L_0x0227
        L_0x000e:
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r0._annotationIntrospector
            com.fasterxml.jackson.databind.type.TypeFactory r3 = r0._typeFactory
            java.lang.Class<?> r4 = r0._primaryMixIn
            boolean r5 = r0._collectAnnotations
            r6 = 1
            if (r4 == 0) goto L_0x001b
            r8 = r6
            goto L_0x001c
        L_0x001b:
            r8 = 0
        L_0x001c:
            r5 = r5 | r8
            com.fasterxml.jackson.databind.introspect.a r8 = new com.fasterxml.jackson.databind.introspect.a
            r8.<init>(r2, r3, r0, r5)
            boolean r2 = r1.isEnumType()
            r3 = 0
            if (r2 != 0) goto L_0x005a
            java.lang.Class r2 = r1.getRawClass()
            com.fasterxml.jackson.databind.util.ClassUtil$Ctor[] r2 = com.fasterxml.jackson.databind.util.ClassUtil.getConstructors(r2)
            int r5 = r2.length
            r10 = r3
            r11 = r10
            r9 = 0
        L_0x0035:
            if (r9 >= r5) goto L_0x005c
            r12 = r2[r9]
            java.lang.reflect.Constructor r13 = r12.getConstructor()
            boolean r13 = r13.isSynthetic()
            r13 = r13 ^ r6
            if (r13 != 0) goto L_0x0045
            goto L_0x0057
        L_0x0045:
            int r13 = r12.getParamCount()
            if (r13 != 0) goto L_0x004d
            r10 = r12
            goto L_0x0057
        L_0x004d:
            if (r11 != 0) goto L_0x0054
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x0054:
            r11.add(r12)
        L_0x0057:
            int r9 = r9 + 1
            goto L_0x0035
        L_0x005a:
            r10 = r3
            r11 = r10
        L_0x005c:
            if (r11 != 0) goto L_0x0069
            java.util.List r2 = java.util.Collections.emptyList()
            if (r10 != 0) goto L_0x0066
            goto L_0x011f
        L_0x0066:
            r5 = r2
            r2 = 0
            goto L_0x007b
        L_0x0069:
            int r2 = r11.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
            r6 = 0
        L_0x0073:
            if (r6 >= r2) goto L_0x007b
            r5.add(r3)
            int r6 = r6 + 1
            goto L_0x0073
        L_0x007b:
            if (r4 == 0) goto L_0x00ec
            com.fasterxml.jackson.databind.util.ClassUtil$Ctor[] r6 = com.fasterxml.jackson.databind.util.ClassUtil.getConstructors(r4)
            int r9 = r6.length
            r13 = r3
            r12 = 0
        L_0x0084:
            if (r12 >= r9) goto L_0x00ec
            r14 = r6[r12]
            int r15 = r14.getParamCount()
            if (r15 != 0) goto L_0x00a5
            if (r10 == 0) goto L_0x00e8
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r15 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r7 = r8.f27708a
            java.lang.reflect.Constructor r3 = r10.getConstructor()
            com.fasterxml.jackson.databind.introspect.AnnotationMap r10 = r8.mo44222a(r10, r14)
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r14 = com.fasterxml.jackson.databind.introspect.C12552b.NO_ANNOTATION_MAPS
            r15.<init>(r7, r3, r10, r14)
            r8.f27711d = r15
            r10 = 0
            goto L_0x00e8
        L_0x00a5:
            if (r11 == 0) goto L_0x00e8
            if (r13 != 0) goto L_0x00c3
            com.fasterxml.jackson.databind.introspect.MemberKey[] r3 = new com.fasterxml.jackson.databind.introspect.MemberKey[r2]
            r7 = 0
        L_0x00ac:
            if (r7 >= r2) goto L_0x00c2
            com.fasterxml.jackson.databind.introspect.MemberKey r13 = new com.fasterxml.jackson.databind.introspect.MemberKey
            java.lang.Object r15 = r11.get(r7)
            com.fasterxml.jackson.databind.util.ClassUtil$Ctor r15 = (com.fasterxml.jackson.databind.util.ClassUtil.Ctor) r15
            java.lang.reflect.Constructor r15 = r15.getConstructor()
            r13.<init>((java.lang.reflect.Constructor<?>) r15)
            r3[r7] = r13
            int r7 = r7 + 1
            goto L_0x00ac
        L_0x00c2:
            r13 = r3
        L_0x00c3:
            com.fasterxml.jackson.databind.introspect.MemberKey r3 = new com.fasterxml.jackson.databind.introspect.MemberKey
            java.lang.reflect.Constructor r7 = r14.getConstructor()
            r3.<init>((java.lang.reflect.Constructor<?>) r7)
            r7 = 0
        L_0x00cd:
            if (r7 >= r2) goto L_0x00e8
            r15 = r13[r7]
            boolean r15 = r3.equals(r15)
            if (r15 == 0) goto L_0x00e5
            java.lang.Object r3 = r11.get(r7)
            com.fasterxml.jackson.databind.util.ClassUtil$Ctor r3 = (com.fasterxml.jackson.databind.util.ClassUtil.Ctor) r3
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r3 = r8.mo44225d(r3, r14)
            r5.set(r7, r3)
            goto L_0x00e8
        L_0x00e5:
            int r7 = r7 + 1
            goto L_0x00cd
        L_0x00e8:
            int r12 = r12 + 1
            r3 = 0
            goto L_0x0084
        L_0x00ec:
            if (r10 == 0) goto L_0x0102
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r3 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r6 = r8.f27708a
            java.lang.reflect.Constructor r7 = r10.getConstructor()
            r9 = 0
            com.fasterxml.jackson.databind.introspect.AnnotationMap r10 = r8.mo44222a(r10, r9)
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r9 = com.fasterxml.jackson.databind.introspect.C12552b.NO_ANNOTATION_MAPS
            r3.<init>(r6, r7, r10, r9)
            r8.f27711d = r3
        L_0x0102:
            r3 = 0
        L_0x0103:
            if (r3 >= r2) goto L_0x011e
            java.lang.Object r6 = r5.get(r3)
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r6 = (com.fasterxml.jackson.databind.introspect.AnnotatedConstructor) r6
            if (r6 != 0) goto L_0x011b
            java.lang.Object r6 = r11.get(r3)
            com.fasterxml.jackson.databind.util.ClassUtil$Ctor r6 = (com.fasterxml.jackson.databind.util.ClassUtil.Ctor) r6
            r7 = 0
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r6 = r8.mo44225d(r6, r7)
            r5.set(r3, r6)
        L_0x011b:
            int r3 = r3 + 1
            goto L_0x0103
        L_0x011e:
            r2 = r5
        L_0x011f:
            java.lang.Class r1 = r1.getRawClass()
            java.lang.reflect.Method[] r1 = com.fasterxml.jackson.databind.util.ClassUtil.getClassMethods(r1)
            int r3 = r1.length
            r5 = 0
            r9 = 0
        L_0x012a:
            if (r5 >= r3) goto L_0x0146
            r6 = r1[r5]
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L_0x0139
            goto L_0x0143
        L_0x0139:
            if (r9 != 0) goto L_0x0140
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0140:
            r9.add(r6)
        L_0x0143:
            int r5 = r5 + 1
            goto L_0x012a
        L_0x0146:
            if (r9 != 0) goto L_0x014e
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x01d8
        L_0x014e:
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext$Empty r1 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext$Empty
            com.fasterxml.jackson.databind.type.TypeFactory r3 = r8.f27709b
            r1.<init>(r3)
            int r3 = r9.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
            r6 = 0
        L_0x015f:
            if (r6 >= r3) goto L_0x0168
            r7 = 0
            r5.add(r7)
            int r6 = r6 + 1
            goto L_0x015f
        L_0x0168:
            if (r4 == 0) goto L_0x01bb
            java.lang.reflect.Method[] r4 = r4.getDeclaredMethods()
            int r6 = r4.length
            r7 = 0
            r10 = 0
        L_0x0171:
            if (r10 >= r6) goto L_0x01bb
            r11 = r4[r10]
            int r12 = r11.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            if (r12 != 0) goto L_0x0180
            goto L_0x01b8
        L_0x0180:
            if (r7 != 0) goto L_0x0197
            com.fasterxml.jackson.databind.introspect.MemberKey[] r7 = new com.fasterxml.jackson.databind.introspect.MemberKey[r3]
            r12 = 0
        L_0x0185:
            if (r12 >= r3) goto L_0x0197
            com.fasterxml.jackson.databind.introspect.MemberKey r13 = new com.fasterxml.jackson.databind.introspect.MemberKey
            java.lang.Object r14 = r9.get(r12)
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            r13.<init>((java.lang.reflect.Method) r14)
            r7[r12] = r13
            int r12 = r12 + 1
            goto L_0x0185
        L_0x0197:
            com.fasterxml.jackson.databind.introspect.MemberKey r12 = new com.fasterxml.jackson.databind.introspect.MemberKey
            r12.<init>((java.lang.reflect.Method) r11)
            r13 = 0
        L_0x019d:
            if (r13 >= r3) goto L_0x01b8
            r14 = r7[r13]
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x01b5
            java.lang.Object r12 = r9.get(r13)
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r11 = r8.mo44224c(r12, r1, r11)
            r5.set(r13, r11)
            goto L_0x01b8
        L_0x01b5:
            int r13 = r13 + 1
            goto L_0x019d
        L_0x01b8:
            int r10 = r10 + 1
            goto L_0x0171
        L_0x01bb:
            r7 = 0
        L_0x01bc:
            if (r7 >= r3) goto L_0x01d7
            java.lang.Object r4 = r5.get(r7)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r4 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r4
            if (r4 != 0) goto L_0x01d4
            java.lang.Object r4 = r9.get(r7)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r6 = 0
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r4 = r8.mo44224c(r4, r1, r6)
            r5.set(r7, r4)
        L_0x01d4:
            int r7 = r7 + 1
            goto L_0x01bc
        L_0x01d7:
            r1 = r5
        L_0x01d8:
            boolean r3 = r8.f27710c
            if (r3 == 0) goto L_0x021f
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r3 = r8.f27711d
            if (r3 == 0) goto L_0x01eb
            com.fasterxml.jackson.databind.AnnotationIntrospector r4 = r8._intr
            boolean r3 = r4.hasIgnoreMarker(r3)
            if (r3 == 0) goto L_0x01eb
            r3 = 0
            r8.f27711d = r3
        L_0x01eb:
            int r3 = r2.size()
        L_0x01ef:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0205
            com.fasterxml.jackson.databind.AnnotationIntrospector r4 = r8._intr
            java.lang.Object r5 = r2.get(r3)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r5 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r5
            boolean r4 = r4.hasIgnoreMarker(r5)
            if (r4 == 0) goto L_0x01ef
            r2.remove(r3)
            goto L_0x01ef
        L_0x0205:
            int r3 = r1.size()
        L_0x0209:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x021f
            com.fasterxml.jackson.databind.AnnotationIntrospector r4 = r8._intr
            java.lang.Object r5 = r1.get(r3)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r5 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r5
            boolean r4 = r4.hasIgnoreMarker(r5)
            if (r4 == 0) goto L_0x0209
            r1.remove(r3)
            goto L_0x0209
        L_0x021f:
            com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators r3 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r4 = r8.f27711d
            r3.<init>(r4, r2, r1)
            r1 = r3
        L_0x0227:
            r0._creators = r1
        L_0x0229:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.AnnotatedClass._creators():com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators");
    }

    private final List<AnnotatedField> _fields() {
        List<AnnotatedField> list = this._fields;
        if (list == null) {
            JavaType javaType = this._type;
            if (javaType == null) {
                list = Collections.emptyList();
            } else {
                list = AnnotatedFieldCollector.collectFields(this._annotationIntrospector, this, this._mixInResolver, this._typeFactory, javaType, this._collectAnnotations);
            }
            this._fields = list;
        }
        return list;
    }

    private final AnnotatedMethodMap _methods() {
        AnnotatedMethodMap annotatedMethodMap = this._memberMethods;
        if (annotatedMethodMap == null) {
            JavaType javaType = this._type;
            if (javaType == null) {
                annotatedMethodMap = new AnnotatedMethodMap();
            } else {
                annotatedMethodMap = AnnotatedMethodCollector.collectMethods(this._annotationIntrospector, this, this._mixInResolver, this._typeFactory, javaType, this._superTypes, this._primaryMixIn, this._collectAnnotations);
            }
            this._memberMethods = annotatedMethodMap;
        }
        return annotatedMethodMap;
    }

    @Deprecated
    public static AnnotatedClass construct(JavaType javaType, MapperConfig<?> mapperConfig) {
        return construct(javaType, mapperConfig, mapperConfig);
    }

    @Deprecated
    public static AnnotatedClass constructWithoutSuperTypes(Class<?> cls, MapperConfig<?> mapperConfig) {
        return constructWithoutSuperTypes(cls, mapperConfig, mapperConfig);
    }

    @Deprecated
    public Iterable<Annotation> annotations() {
        Annotations annotations = this._classAnnotations;
        if (annotations instanceof AnnotationMap) {
            return ((AnnotationMap) annotations).annotations();
        }
        if (!(annotations instanceof AnnotationCollector.OneAnnotation) && !(annotations instanceof AnnotationCollector.TwoAnnotations)) {
            return Collections.emptyList();
        }
        throw new UnsupportedOperationException("please use getAnnotations/ hasAnnotation to check for Annotations");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, AnnotatedClass.class)) {
            return false;
        }
        return ((AnnotatedClass) obj)._class == this._class;
    }

    public Iterable<AnnotatedField> fields() {
        return _fields();
    }

    public AnnotatedMethod findMethod(String str, Class<?>[] clsArr) {
        return _methods().find(str, clsArr);
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this._classAnnotations.get(cls);
    }

    public Annotations getAnnotations() {
        return this._classAnnotations;
    }

    public List<AnnotatedConstructor> getConstructors() {
        return _creators().constructors;
    }

    public AnnotatedConstructor getDefaultConstructor() {
        return _creators().defaultConstructor;
    }

    public List<AnnotatedMethod> getFactoryMethods() {
        return _creators().creatorMethods;
    }

    public int getFieldCount() {
        return _fields().size();
    }

    public int getMemberMethodCount() {
        return _methods().size();
    }

    public int getModifiers() {
        return this._class.getModifiers();
    }

    public String getName() {
        return this._class.getName();
    }

    public Class<?> getRawType() {
        return this._class;
    }

    @Deprecated
    public List<AnnotatedMethod> getStaticMethods() {
        return getFactoryMethods();
    }

    public JavaType getType() {
        return this._type;
    }

    public boolean hasAnnotation(Class<?> cls) {
        return this._classAnnotations.has(cls);
    }

    public boolean hasAnnotations() {
        return this._classAnnotations.size() > 0;
    }

    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        return this._classAnnotations.hasOneOf(clsArr);
    }

    public int hashCode() {
        return this._class.getName().hashCode();
    }

    public boolean isNonStaticInnerClass() {
        Boolean bool = this._nonStaticInnerClass;
        if (bool == null) {
            bool = Boolean.valueOf(ClassUtil.isNonStaticInnerClass(this._class));
            this._nonStaticInnerClass = bool;
        }
        return bool.booleanValue();
    }

    public Iterable<AnnotatedMethod> memberMethods() {
        return _methods();
    }

    public JavaType resolveType(Type type) {
        return type instanceof Class ? this._typeFactory.constructType(type) : this._typeFactory.constructType(type, this._bindings);
    }

    public String toString() {
        return C0326j.m863h(this._class, C0072d.m201h("[AnnotedClass "), "]");
    }

    @Deprecated
    public static AnnotatedClass construct(JavaType javaType, MapperConfig<?> mapperConfig, ClassIntrospector.MixInResolver mixInResolver) {
        return AnnotatedClassResolver.resolve(mapperConfig, javaType, mixInResolver);
    }

    @Deprecated
    public static AnnotatedClass constructWithoutSuperTypes(Class<?> cls, MapperConfig<?> mapperConfig, ClassIntrospector.MixInResolver mixInResolver) {
        return AnnotatedClassResolver.resolveWithoutSuperTypes(mapperConfig, cls, mixInResolver);
    }

    public Class<?> getAnnotated() {
        return this._class;
    }

    @Deprecated
    public AnnotatedClass(JavaType javaType, Class<?> cls, List<JavaType> list, Class<?> cls2, Annotations annotations, TypeBindings typeBindings, AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory) {
        this(javaType, cls, list, cls2, annotations, typeBindings, annotationIntrospector, mixInResolver, typeFactory, true);
    }

    public AnnotatedClass(Class<?> cls) {
        this._type = null;
        this._class = cls;
        this._superTypes = Collections.emptyList();
        this._primaryMixIn = null;
        this._classAnnotations = AnnotationCollector.emptyAnnotations();
        this._bindings = TypeBindings.emptyBindings();
        this._annotationIntrospector = null;
        this._mixInResolver = null;
        this._typeFactory = null;
        this._collectAnnotations = false;
    }
}
