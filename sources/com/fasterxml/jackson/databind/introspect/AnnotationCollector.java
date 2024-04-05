package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class AnnotationCollector {
    public static final Annotations NO_ANNOTATIONS = new NoAnnotations();
    public final Object _data;

    public static class NoAnnotations implements Annotations, Serializable {
        private static final long serialVersionUID = 1;

        public <A extends Annotation> A get(Class<A> cls) {
            return null;
        }

        public boolean has(Class<?> cls) {
            return false;
        }

        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            return false;
        }

        public int size() {
            return 0;
        }
    }

    public static class OneAnnotation implements Annotations, Serializable {
        private static final long serialVersionUID = 1;
        private final Class<?> _type;
        private final Annotation _value;

        public OneAnnotation(Class<?> cls, Annotation annotation) {
            this._type = cls;
            this._value = annotation;
        }

        public <A extends Annotation> A get(Class<A> cls) {
            if (this._type == cls) {
                return this._value;
            }
            return null;
        }

        public boolean has(Class<?> cls) {
            return this._type == cls;
        }

        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            for (Class<?> cls : clsArr) {
                if (cls == this._type) {
                    return true;
                }
            }
            return false;
        }

        public int size() {
            return 1;
        }
    }

    public static class TwoAnnotations implements Annotations, Serializable {
        private static final long serialVersionUID = 1;
        private final Class<?> _type1;
        private final Class<?> _type2;
        private final Annotation _value1;
        private final Annotation _value2;

        public TwoAnnotations(Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            this._type1 = cls;
            this._value1 = annotation;
            this._type2 = cls2;
            this._value2 = annotation2;
        }

        public <A extends Annotation> A get(Class<A> cls) {
            if (this._type1 == cls) {
                return this._value1;
            }
            if (this._type2 == cls) {
                return this._value2;
            }
            return null;
        }

        public boolean has(Class<?> cls) {
            return this._type1 == cls || this._type2 == cls;
        }

        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            for (Class<?> cls : clsArr) {
                if (cls == this._type1 || cls == this._type2) {
                    return true;
                }
            }
            return false;
        }

        public int size() {
            return 2;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.AnnotationCollector$a */
    public static class C12534a extends AnnotationCollector {

        /* renamed from: a */
        public static final C12534a f27692a = new C12534a((Object) null);

        public C12534a(Object obj) {
            super(obj);
        }

        public final AnnotationCollector addOrOverride(Annotation annotation) {
            return new C12536c(this._data, annotation.annotationType(), annotation);
        }

        public final AnnotationMap asAnnotationMap() {
            return new AnnotationMap();
        }

        public final Annotations asAnnotations() {
            return AnnotationCollector.NO_ANNOTATIONS;
        }

        public final boolean isPresent(Annotation annotation) {
            return false;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.AnnotationCollector$b */
    public static class C12535b extends AnnotationCollector {

        /* renamed from: a */
        public final HashMap<Class<?>, Annotation> f27693a;

        public C12535b(Object obj, Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            super(obj);
            HashMap<Class<?>, Annotation> hashMap = new HashMap<>();
            this.f27693a = hashMap;
            hashMap.put(cls, annotation);
            hashMap.put(cls2, annotation2);
        }

        public final AnnotationCollector addOrOverride(Annotation annotation) {
            this.f27693a.put(annotation.annotationType(), annotation);
            return this;
        }

        public final AnnotationMap asAnnotationMap() {
            AnnotationMap annotationMap = new AnnotationMap();
            for (Annotation add : this.f27693a.values()) {
                annotationMap.add(add);
            }
            return annotationMap;
        }

        public final Annotations asAnnotations() {
            if (this.f27693a.size() != 2) {
                return new AnnotationMap(this.f27693a);
            }
            Iterator<Map.Entry<Class<?>, Annotation>> it = this.f27693a.entrySet().iterator();
            Map.Entry next = it.next();
            Map.Entry next2 = it.next();
            return new TwoAnnotations((Class) next.getKey(), (Annotation) next.getValue(), (Class) next2.getKey(), (Annotation) next2.getValue());
        }

        public final boolean isPresent(Annotation annotation) {
            return this.f27693a.containsKey(annotation.annotationType());
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.AnnotationCollector$c */
    public static class C12536c extends AnnotationCollector {

        /* renamed from: a */
        public Class<?> f27694a;

        /* renamed from: b */
        public Annotation f27695b;

        public C12536c(Object obj, Class<?> cls, Annotation annotation) {
            super(obj);
            this.f27694a = cls;
            this.f27695b = annotation;
        }

        public final AnnotationCollector addOrOverride(Annotation annotation) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            Class<?> cls = this.f27694a;
            if (cls != annotationType) {
                return new C12535b(this._data, cls, this.f27695b, annotationType, annotation);
            }
            this.f27695b = annotation;
            return this;
        }

        public final AnnotationMap asAnnotationMap() {
            return AnnotationMap.m20269of(this.f27694a, this.f27695b);
        }

        public final Annotations asAnnotations() {
            return new OneAnnotation(this.f27694a, this.f27695b);
        }

        public final boolean isPresent(Annotation annotation) {
            return annotation.annotationType() == this.f27694a;
        }
    }

    public AnnotationCollector(Object obj) {
        this._data = obj;
    }

    public static Annotations emptyAnnotations() {
        return NO_ANNOTATIONS;
    }

    public static AnnotationCollector emptyCollector() {
        return C12534a.f27692a;
    }

    public abstract AnnotationCollector addOrOverride(Annotation annotation);

    public abstract AnnotationMap asAnnotationMap();

    public abstract Annotations asAnnotations();

    public Object getData() {
        return this._data;
    }

    public abstract boolean isPresent(Annotation annotation);

    public static AnnotationCollector emptyCollector(Object obj) {
        return new C12534a(obj);
    }
}
