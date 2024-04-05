package com.fasterxml.jackson.databind.type;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.fasterxml.jackson.databind.JavaType;
import java.util.Collection;
import java.util.Map;

public class SimpleType extends TypeBase {
    private static final long serialVersionUID = 1;

    public SimpleType(Class<?> cls) {
        this(cls, TypeBindings.emptyBindings(), (JavaType) null, (JavaType[]) null);
    }

    private static JavaType _buildSuperClass(Class<?> cls, TypeBindings typeBindings) {
        if (cls == null) {
            return null;
        }
        if (cls == Object.class) {
            return TypeFactory.unknownType();
        }
        return new SimpleType(cls, typeBindings, _buildSuperClass(cls.getSuperclass(), typeBindings), (JavaType[]) null, (Object) null, (Object) null, false);
    }

    @Deprecated
    public static SimpleType construct(Class<?> cls) {
        if (Map.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(C0326j.m863h(cls, C0072d.m201h("Cannot construct SimpleType for a Map (class: "), ")"));
        } else if (Collection.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(C0326j.m863h(cls, C0072d.m201h("Cannot construct SimpleType for a Collection (class: "), ")"));
        } else if (!cls.isArray()) {
            TypeBindings emptyBindings = TypeBindings.emptyBindings();
            return new SimpleType(cls, emptyBindings, _buildSuperClass(cls.getSuperclass(), emptyBindings), (JavaType[]) null, (Object) null, (Object) null, false);
        } else {
            throw new IllegalArgumentException(C0326j.m863h(cls, C0072d.m201h("Cannot construct SimpleType for an array (class: "), ")"));
        }
    }

    public static SimpleType constructUnsafe(Class<?> cls) {
        return new SimpleType(cls, (TypeBindings) null, (JavaType) null, (JavaType[]) null, (Object) null, (Object) null, false);
    }

    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        Class<?> cls2 = this._class;
        if (cls2 == cls) {
            return this;
        }
        if (!cls2.isAssignableFrom(cls)) {
            return new SimpleType(cls, this._bindings, this, this._superInterfaces, this._valueHandler, this._typeHandler, this._asStatic);
        }
        Class<? super Object> superclass = cls.getSuperclass();
        Class<?> cls3 = this._class;
        if (superclass == cls3) {
            return new SimpleType(cls, this._bindings, this, this._superInterfaces, this._valueHandler, this._typeHandler, this._asStatic);
        } else if (superclass == null || !cls3.isAssignableFrom(superclass)) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            int i = 0;
            while (i < length) {
                Class<?> cls4 = interfaces[i];
                Class<?> cls5 = this._class;
                if (cls4 == cls5) {
                    return new SimpleType(cls, this._bindings, (JavaType) null, new JavaType[]{this}, this._valueHandler, this._typeHandler, this._asStatic);
                } else if (cls5.isAssignableFrom(cls4)) {
                    return new SimpleType(cls, this._bindings, (JavaType) null, new JavaType[]{_narrow(cls4)}, this._valueHandler, this._typeHandler, this._asStatic);
                } else {
                    i++;
                }
            }
            StringBuilder h = C0072d.m201h("Internal error: Cannot resolve sub-type for Class ");
            h.append(cls.getName());
            h.append(" to ");
            throw new IllegalArgumentException(C0326j.m862g(this._class, h));
        } else {
            return new SimpleType(cls, this._bindings, _narrow(superclass), (JavaType[]) null, this._valueHandler, this._typeHandler, this._asStatic);
        }
    }

    public String buildCanonicalName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._class.getName());
        int size = this._bindings.size();
        if (size > 0) {
            sb.append('<');
            for (int i = 0; i < size; i++) {
                JavaType containedType = containedType(i);
                if (i > 0) {
                    sb.append(',');
                }
                sb.append(containedType.toCanonical());
            }
            sb.append('>');
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        SimpleType simpleType = (SimpleType) obj;
        if (simpleType._class != this._class) {
            return false;
        }
        return this._bindings.equals(simpleType._bindings);
    }

    public StringBuilder getErasedSignature(StringBuilder sb) {
        return TypeBase._classSignature(this._class, sb, true);
    }

    public StringBuilder getGenericSignature(StringBuilder sb) {
        TypeBase._classSignature(this._class, sb, false);
        int size = this._bindings.size();
        if (size > 0) {
            sb.append('<');
            for (int i = 0; i < size; i++) {
                sb = containedType(i).getGenericSignature(sb);
            }
            sb.append('>');
        }
        sb.append(';');
        return sb;
    }

    public boolean hasContentType() {
        return false;
    }

    public boolean isContainerType() {
        return false;
    }

    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    public String toString() {
        StringBuilder g = C0069a.m176g(40, "[simple type, class ");
        g.append(buildCanonicalName());
        g.append(']');
        return g.toString();
    }

    public JavaType withContentType(JavaType javaType) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    public JavaType withContentTypeHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        this(cls, typeBindings, javaType, javaTypeArr, (Object) null, (Object) null, false);
    }

    public SimpleType withContentValueHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
    }

    public SimpleType withStaticTyping() {
        return this._asStatic ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, this._typeHandler, true);
    }

    public SimpleType withTypeHandler(Object obj) {
        if (this._typeHandler == obj) {
            return this;
        }
        return new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, obj, this._asStatic);
    }

    public SimpleType withValueHandler(Object obj) {
        if (obj == this._valueHandler) {
            return this;
        }
        return new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, obj, this._typeHandler, this._asStatic);
    }

    public SimpleType(TypeBase typeBase) {
        super(typeBase);
    }

    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, 0, obj, obj2, z);
    }

    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, int i, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, i, obj, obj2, z);
    }
}
