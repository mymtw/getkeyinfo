package com.squareup.moshi;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import p618lp.C18215a;

/* renamed from: com.squareup.moshi.a0 */
public final class C17387a0 {
    /* renamed from: a */
    public static Type m29123a(Type type, Class<?> cls) {
        Class<Collection> cls2 = Collection.class;
        if (cls2.isAssignableFrom(cls)) {
            Type i = C18215a.m30730i(type, cls, C18215a.m30724c(type, cls, cls2), new LinkedHashSet());
            if (i instanceof WildcardType) {
                i = ((WildcardType) i).getUpperBounds()[0];
            }
            return i instanceof ParameterizedType ? ((ParameterizedType) i).getActualTypeArguments()[0] : Object.class;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public static boolean m29124b(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? m29124b(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m29124b(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof C18215a.C18217b ? ((C18215a.C18217b) parameterizedType).f39934d : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof C18215a.C18217b ? ((C18215a.C18217b) parameterizedType2).f39934d : parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m29124b(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m29124b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    /* renamed from: c */
    public static Class<?> m29125c(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m29125c(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m29125c(((WildcardType) type).getUpperBounds()[0]);
        }
        String name = type == null ? "null" : type.getClass().getName();
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    /* renamed from: d */
    public static C18215a.C18217b m29126d(Class cls, Type... typeArr) {
        if (typeArr.length != 0) {
            return new C18215a.C18217b((Type) null, cls, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + cls);
    }
}
