package com.fasterxml.jackson.databind.type;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.TypeVariable;

public final class CollectionType extends CollectionLikeType {
    private static final long serialVersionUID = 1;

    private CollectionType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, javaType2, obj, obj2, z);
    }

    public static CollectionType construct(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2) {
        return new CollectionType(cls, typeBindings, javaType, javaTypeArr, javaType2, (Object) null, (Object) null, false);
    }

    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        return new CollectionType(cls, this._bindings, this._superClass, this._superInterfaces, this._elementType, (Object) null, (Object) null, this._asStatic);
    }

    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new CollectionType(cls, typeBindings, javaType, javaTypeArr, this._elementType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("[collection type; class ");
        h.append(this._class.getName());
        h.append(", contains ");
        h.append(this._elementType);
        h.append("]");
        return h.toString();
    }

    public JavaType withContentType(JavaType javaType) {
        if (this._elementType == javaType) {
            return this;
        }
        return new CollectionType(this._class, this._bindings, this._superClass, this._superInterfaces, javaType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public CollectionType(TypeBase typeBase, JavaType javaType) {
        super(typeBase, javaType);
    }

    @Deprecated
    public static CollectionType construct(Class<?> cls, JavaType javaType) {
        TypeBindings typeBindings;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length != 1) {
            typeBindings = TypeBindings.emptyBindings();
        } else {
            typeBindings = TypeBindings.create(cls, javaType);
        }
        return new CollectionType(cls, typeBindings, TypeBase._bogusSuperClass(cls), (JavaType[]) null, javaType, (Object) null, (Object) null, false);
    }

    public CollectionType withContentTypeHandler(Object obj) {
        return new CollectionType(this._class, this._bindings, this._superClass, this._superInterfaces, this._elementType.withTypeHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public CollectionType withContentValueHandler(Object obj) {
        return new CollectionType(this._class, this._bindings, this._superClass, this._superInterfaces, this._elementType.withValueHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public CollectionType withStaticTyping() {
        if (this._asStatic) {
            return this;
        }
        return new CollectionType(this._class, this._bindings, this._superClass, this._superInterfaces, this._elementType.withStaticTyping(), this._valueHandler, this._typeHandler, true);
    }

    public CollectionType withTypeHandler(Object obj) {
        return new CollectionType(this._class, this._bindings, this._superClass, this._superInterfaces, this._elementType, this._valueHandler, obj, this._asStatic);
    }

    public CollectionType withValueHandler(Object obj) {
        return new CollectionType(this._class, this._bindings, this._superClass, this._superInterfaces, this._elementType, obj, this._typeHandler, this._asStatic);
    }
}
