package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* renamed from: com.fasterxml.jackson.databind.introspect.a */
public final class C12551a extends C12552b {

    /* renamed from: a */
    public final TypeResolutionContext f27708a;

    /* renamed from: b */
    public final TypeFactory f27709b;

    /* renamed from: c */
    public final boolean f27710c;

    /* renamed from: d */
    public AnnotatedConstructor f27711d;

    public C12551a(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, TypeResolutionContext typeResolutionContext, boolean z) {
        super(annotationIntrospector);
        this.f27709b = typeFactory;
        this.f27708a = typeResolutionContext;
        this.f27710c = z;
    }

    /* renamed from: a */
    public final AnnotationMap mo44222a(ClassUtil.Ctor ctor, ClassUtil.Ctor ctor2) {
        if (!this.f27710c) {
            return C12552b._emptyAnnotationMap();
        }
        AnnotationCollector collectAnnotations = collectAnnotations(ctor.getDeclaredAnnotations());
        if (ctor2 != null) {
            collectAnnotations = collectAnnotations(collectAnnotations, ctor2.getDeclaredAnnotations());
        }
        return collectAnnotations.asAnnotationMap();
    }

    /* renamed from: b */
    public final AnnotationMap[] mo44223b(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (!this.f27710c) {
            return C12552b.NO_ANNOTATION_MAPS;
        }
        int length = annotationArr.length;
        AnnotationMap[] annotationMapArr = new AnnotationMap[length];
        for (int i = 0; i < length; i++) {
            AnnotationCollector collectAnnotations = collectAnnotations(AnnotationCollector.emptyCollector(), annotationArr[i]);
            if (annotationArr2 != null) {
                collectAnnotations = collectAnnotations(collectAnnotations, annotationArr2[i]);
            }
            annotationMapArr[i] = collectAnnotations.asAnnotationMap();
        }
        return annotationMapArr;
    }

    /* renamed from: c */
    public final AnnotatedMethod mo44224c(Method method, TypeResolutionContext.Empty empty, Method method2) {
        Annotation[][] annotationArr;
        int length = method.getParameterTypes().length;
        if (this._intr == null) {
            return new AnnotatedMethod(empty, method, C12552b._emptyAnnotationMap(), C12552b._emptyAnnotationMaps(length));
        }
        if (length == 0) {
            AnnotationCollector collectAnnotations = collectAnnotations(method.getDeclaredAnnotations());
            if (method2 != null) {
                collectAnnotations = collectAnnotations(collectAnnotations, method2.getDeclaredAnnotations());
            }
            return new AnnotatedMethod(empty, method, collectAnnotations.asAnnotationMap(), C12552b.NO_ANNOTATION_MAPS);
        }
        AnnotationCollector collectAnnotations2 = collectAnnotations(method.getDeclaredAnnotations());
        if (method2 != null) {
            collectAnnotations2 = collectAnnotations(collectAnnotations2, method2.getDeclaredAnnotations());
        }
        AnnotationMap asAnnotationMap = collectAnnotations2.asAnnotationMap();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (method2 == null) {
            annotationArr = null;
            Annotation[][] annotationArr2 = null;
        } else {
            annotationArr = method2.getParameterAnnotations();
        }
        return new AnnotatedMethod(empty, method, asAnnotationMap, mo44223b(parameterAnnotations, annotationArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.annotation.Annotation[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.fasterxml.jackson.databind.introspect.AnnotationMap[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.annotation.Annotation[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.fasterxml.jackson.databind.introspect.AnnotationMap[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: com.fasterxml.jackson.databind.introspect.AnnotationMap[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.annotation.Annotation[][]} */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.introspect.AnnotatedConstructor mo44225d(com.fasterxml.jackson.databind.util.ClassUtil.Ctor r9, com.fasterxml.jackson.databind.util.ClassUtil.Ctor r10) {
        /*
            r8 = this;
            int r0 = r9.getParamCount()
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r8._intr
            if (r1 != 0) goto L_0x001c
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r1 = r8.f27708a
            java.lang.reflect.Constructor r9 = r9.getConstructor()
            com.fasterxml.jackson.databind.introspect.AnnotationMap r2 = com.fasterxml.jackson.databind.introspect.C12552b._emptyAnnotationMap()
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r0 = com.fasterxml.jackson.databind.introspect.C12552b._emptyAnnotationMaps(r0)
            r10.<init>(r1, r9, r2, r0)
            return r10
        L_0x001c:
            if (r0 != 0) goto L_0x0030
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r1 = r8.f27708a
            java.lang.reflect.Constructor r2 = r9.getConstructor()
            com.fasterxml.jackson.databind.introspect.AnnotationMap r9 = r8.mo44222a(r9, r10)
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r10 = com.fasterxml.jackson.databind.introspect.C12552b.NO_ANNOTATION_MAPS
            r0.<init>(r1, r2, r9, r10)
            return r0
        L_0x0030:
            java.lang.annotation.Annotation[][] r1 = r9.getParameterAnnotations()
            int r2 = r1.length
            r3 = 0
            if (r0 == r2) goto L_0x00a1
            java.lang.Class r2 = r9.getDeclaringClass()
            boolean r4 = com.fasterxml.jackson.databind.util.ClassUtil.isEnumType(r2)
            r5 = 0
            r6 = 1
            r7 = 2
            if (r4 == 0) goto L_0x005a
            int r4 = r1.length
            int r4 = r4 + r7
            if (r0 != r4) goto L_0x005a
            int r2 = r1.length
            int r2 = r2 + r7
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r7, r4)
            r1 = r3
            java.lang.annotation.Annotation[][] r1 = (java.lang.annotation.Annotation[][]) r1
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r3 = r8.mo44223b(r2, r3)
        L_0x0058:
            r1 = r2
            goto L_0x0078
        L_0x005a:
            boolean r2 = r2.isMemberClass()
            if (r2 == 0) goto L_0x0078
            int r2 = r1.length
            int r2 = r2 + r6
            if (r0 != r2) goto L_0x0078
            int r2 = r1.length
            int r2 = r2 + r6
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r6, r4)
            java.lang.annotation.Annotation[] r1 = com.fasterxml.jackson.databind.introspect.C12552b.NO_ANNOTATIONS
            r2[r5] = r1
            r1 = r3
            java.lang.annotation.Annotation[][] r1 = (java.lang.annotation.Annotation[][]) r1
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r3 = r8.mo44223b(r2, r3)
            goto L_0x0058
        L_0x0078:
            if (r3 == 0) goto L_0x007b
            goto L_0x00af
        L_0x007b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Class r9 = r9.getDeclaringClass()
            java.lang.String r9 = r9.getName()
            r2[r5] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r2[r6] = r9
            int r9 = r1.length
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2[r7] = r9
            java.lang.String r9 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations"
            java.lang.String r9 = java.lang.String.format(r9, r2)
            r10.<init>(r9)
            throw r10
        L_0x00a1:
            if (r10 != 0) goto L_0x00a7
            r0 = r3
            java.lang.annotation.Annotation[][] r0 = (java.lang.annotation.Annotation[][]) r0
            goto L_0x00ab
        L_0x00a7:
            java.lang.annotation.Annotation[][] r3 = r10.getParameterAnnotations()
        L_0x00ab:
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r3 = r8.mo44223b(r1, r3)
        L_0x00af:
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r1 = r8.f27708a
            java.lang.reflect.Constructor r2 = r9.getConstructor()
            com.fasterxml.jackson.databind.introspect.AnnotationMap r9 = r8.mo44222a(r9, r10)
            r0.<init>(r1, r2, r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.C12551a.mo44225d(com.fasterxml.jackson.databind.util.ClassUtil$Ctor, com.fasterxml.jackson.databind.util.ClassUtil$Ctor):com.fasterxml.jackson.databind.introspect.AnnotatedConstructor");
    }
}
