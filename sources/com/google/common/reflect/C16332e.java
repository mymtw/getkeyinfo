package com.google.common.reflect;

import com.google.common.base.C15794l;
import com.google.common.reflect.C16333f;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;

/* renamed from: com.google.common.reflect.e */
public final class C16332e extends C16342k {

    /* renamed from: b */
    public final /* synthetic */ Map f36431b;

    /* renamed from: c */
    public final /* synthetic */ Type f36432c;

    public C16332e(Type type, Map map) {
        this.f36431b = map;
        this.f36432c = type;
    }

    /* renamed from: b */
    public final void mo58251b(Class<?> cls) {
        if (!(this.f36432c instanceof WildcardType)) {
            throw new IllegalArgumentException("No type mapping from " + cls + " to " + this.f36432c);
        }
    }

    /* renamed from: c */
    public final void mo58247c(GenericArrayType genericArrayType) {
        Type type = this.f36432c;
        if (!(type instanceof WildcardType)) {
            Type c = Types.m26431c(type);
            C15794l.m25612f(this.f36432c, "%s is not an array type.", c != null);
            C16333f.m26445a(genericArrayType.getGenericComponentType(), c, this.f36431b);
        }
    }

    /* renamed from: d */
    public final void mo58248d(ParameterizedType parameterizedType) {
        Type type = this.f36432c;
        if (!(type instanceof WildcardType)) {
            Class<ParameterizedType> cls = ParameterizedType.class;
            try {
                ParameterizedType cast = cls.cast(type);
                if (!(parameterizedType.getOwnerType() == null || cast.getOwnerType() == null)) {
                    C16333f.m26445a(parameterizedType.getOwnerType(), cast.getOwnerType(), this.f36431b);
                }
                C15794l.m25611e(parameterizedType, "Inconsistent raw type: %s vs. %s", this.f36432c, parameterizedType.getRawType().equals(cast.getRawType()));
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                Type[] actualTypeArguments2 = cast.getActualTypeArguments();
                C15794l.m25611e(parameterizedType, "%s not compatible with %s", cast, actualTypeArguments.length == actualTypeArguments2.length);
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    C16333f.m26445a(actualTypeArguments[i], actualTypeArguments2[i], this.f36431b);
                }
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(type + " is not a " + cls.getSimpleName());
            }
        }
    }

    /* renamed from: e */
    public final void mo58249e(TypeVariable<?> typeVariable) {
        this.f36431b.put(new C16333f.C16336c(typeVariable), this.f36432c);
    }

    /* renamed from: f */
    public final void mo58250f(WildcardType wildcardType) {
        Type type = this.f36432c;
        if (type instanceof WildcardType) {
            WildcardType wildcardType2 = (WildcardType) type;
            Type[] upperBounds = wildcardType.getUpperBounds();
            Type[] upperBounds2 = wildcardType2.getUpperBounds();
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] lowerBounds2 = wildcardType2.getLowerBounds();
            C15794l.m25611e(wildcardType, "Incompatible type: %s vs. %s", this.f36432c, upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length);
            for (int i = 0; i < upperBounds.length; i++) {
                C16333f.m26445a(upperBounds[i], upperBounds2[i], this.f36431b);
            }
            for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                C16333f.m26445a(lowerBounds[i2], lowerBounds2[i2], this.f36431b);
            }
        }
    }
}
