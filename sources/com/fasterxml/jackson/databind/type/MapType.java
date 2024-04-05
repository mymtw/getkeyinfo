package com.fasterxml.jackson.databind.type;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.TypeVariable;

public final class MapType extends MapLikeType {
    private static final long serialVersionUID = 1;

    private MapType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, javaType2, javaType3, obj, obj2, z);
    }

    public static MapType construct(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3) {
        return new MapType(cls, typeBindings, javaType, javaTypeArr, javaType2, javaType3, (Object) null, (Object) null, false);
    }

    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        return new MapType(cls, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new MapType(cls, typeBindings, javaType, javaTypeArr, this._keyType, this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("[map type; class ");
        h.append(this._class.getName());
        h.append(", ");
        h.append(this._keyType);
        h.append(" -> ");
        h.append(this._valueType);
        h.append("]");
        return h.toString();
    }

    public JavaType withContentType(JavaType javaType) {
        if (this._valueType == javaType) {
            return this;
        }
        return new MapType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, javaType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapType(TypeBase typeBase, JavaType javaType, JavaType javaType2) {
        super(typeBase, javaType, javaType2);
    }

    @Deprecated
    public static MapType construct(Class<?> cls, JavaType javaType, JavaType javaType2) {
        TypeBindings typeBindings;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length != 2) {
            typeBindings = TypeBindings.emptyBindings();
        } else {
            typeBindings = TypeBindings.create(cls, javaType, javaType2);
        }
        return new MapType(cls, typeBindings, TypeBase._bogusSuperClass(cls), (JavaType[]) null, javaType, javaType2, (Object) null, (Object) null, false);
    }

    public MapType withKeyType(JavaType javaType) {
        if (javaType == this._keyType) {
            return this;
        }
        return new MapType(this._class, this._bindings, this._superClass, this._superInterfaces, javaType, this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapType withKeyTypeHandler(Object obj) {
        return new MapType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType.withTypeHandler(obj), this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapType withKeyValueHandler(Object obj) {
        return new MapType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType.withValueHandler(obj), this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapType withContentTypeHandler(Object obj) {
        return new MapType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType.withTypeHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapType withContentValueHandler(Object obj) {
        return new MapType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType.withValueHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapType withStaticTyping() {
        if (this._asStatic) {
            return this;
        }
        return new MapType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType.withStaticTyping(), this._valueType.withStaticTyping(), this._valueHandler, this._typeHandler, true);
    }

    public MapType withTypeHandler(Object obj) {
        return new MapType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType, this._valueHandler, obj, this._asStatic);
    }

    public MapType withValueHandler(Object obj) {
        return new MapType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType, obj, this._typeHandler, this._asStatic);
    }
}
