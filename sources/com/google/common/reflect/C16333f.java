package com.google.common.reflect;

import android.support.p013v4.media.C0072d;
import com.google.common.base.C15787h;
import com.google.common.base.C15794l;
import com.google.common.collect.ImmutableMap;
import com.google.common.reflect.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.common.reflect.f */
public final class C16333f {

    /* renamed from: a */
    public final C16335b f36433a;

    /* renamed from: com.google.common.reflect.f$a */
    public static final class C16334a extends C16342k {

        /* renamed from: b */
        public final HashMap f36434b = new HashMap();

        /* renamed from: b */
        public final void mo58251b(Class<?> cls) {
            mo58307a(cls.getGenericSuperclass());
            mo58307a(cls.getGenericInterfaces());
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.reflect.Type} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo58248d(java.lang.reflect.ParameterizedType r13) {
            /*
                r12 = this;
                java.lang.reflect.Type r0 = r13.getRawType()
                java.lang.Class r0 = (java.lang.Class) r0
                java.lang.reflect.TypeVariable[] r1 = r0.getTypeParameters()
                java.lang.reflect.Type[] r2 = r13.getActualTypeArguments()
                int r3 = r1.length
                int r4 = r2.length
                r5 = 0
                r6 = 1
                if (r3 != r4) goto L_0x0016
                r3 = r6
                goto L_0x0017
            L_0x0016:
                r3 = r5
            L_0x0017:
                com.google.common.base.C15794l.m25623q(r3)
                r3 = r5
            L_0x001b:
                int r4 = r1.length
                if (r3 >= r4) goto L_0x0076
                com.google.common.reflect.f$c r4 = new com.google.common.reflect.f$c
                r7 = r1[r3]
                r4.<init>(r7)
                r7 = r2[r3]
                java.util.HashMap r8 = r12.f36434b
                boolean r8 = r8.containsKey(r4)
                if (r8 == 0) goto L_0x0030
                goto L_0x0073
            L_0x0030:
                r8 = r7
            L_0x0031:
                if (r8 == 0) goto L_0x006e
                boolean r9 = r8 instanceof java.lang.reflect.TypeVariable
                if (r9 == 0) goto L_0x003f
                r10 = r8
                java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
                boolean r10 = r4.mo58301a(r10)
                goto L_0x0040
            L_0x003f:
                r10 = r5
            L_0x0040:
                r11 = 0
                if (r10 == 0) goto L_0x005c
            L_0x0043:
                if (r7 == 0) goto L_0x0073
                java.util.HashMap r4 = r12.f36434b
                boolean r8 = r7 instanceof java.lang.reflect.TypeVariable
                if (r8 == 0) goto L_0x0053
                com.google.common.reflect.f$c r8 = new com.google.common.reflect.f$c
                java.lang.reflect.TypeVariable r7 = (java.lang.reflect.TypeVariable) r7
                r8.<init>(r7)
                goto L_0x0054
            L_0x0053:
                r8 = r11
            L_0x0054:
                java.lang.Object r4 = r4.remove(r8)
                r7 = r4
                java.lang.reflect.Type r7 = (java.lang.reflect.Type) r7
                goto L_0x0043
            L_0x005c:
                java.util.HashMap r10 = r12.f36434b
                if (r9 == 0) goto L_0x0067
                com.google.common.reflect.f$c r11 = new com.google.common.reflect.f$c
                java.lang.reflect.TypeVariable r8 = (java.lang.reflect.TypeVariable) r8
                r11.<init>(r8)
            L_0x0067:
                java.lang.Object r8 = r10.get(r11)
                java.lang.reflect.Type r8 = (java.lang.reflect.Type) r8
                goto L_0x0031
            L_0x006e:
                java.util.HashMap r8 = r12.f36434b
                r8.put(r4, r7)
            L_0x0073:
                int r3 = r3 + 1
                goto L_0x001b
            L_0x0076:
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r6]
                r1[r5] = r0
                r12.mo58307a(r1)
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r6]
                java.lang.reflect.Type r13 = r13.getOwnerType()
                r0[r5] = r13
                r12.mo58307a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.reflect.C16333f.C16334a.mo58248d(java.lang.reflect.ParameterizedType):void");
        }

        /* renamed from: e */
        public final void mo58249e(TypeVariable<?> typeVariable) {
            mo58307a(typeVariable.getBounds());
        }

        /* renamed from: f */
        public final void mo58250f(WildcardType wildcardType) {
            mo58307a(wildcardType.getUpperBounds());
        }
    }

    /* renamed from: com.google.common.reflect.f$c */
    public static final class C16336c {

        /* renamed from: a */
        public final TypeVariable<?> f36436a;

        public C16336c(TypeVariable<?> typeVariable) {
            typeVariable.getClass();
            this.f36436a = typeVariable;
        }

        /* renamed from: a */
        public final boolean mo58301a(TypeVariable<?> typeVariable) {
            return this.f36436a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f36436a.getName().equals(typeVariable.getName());
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C16336c) {
                return mo58301a(((C16336c) obj).f36436a);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f36436a.getGenericDeclaration(), this.f36436a.getName()});
        }

        public final String toString() {
            return this.f36436a.toString();
        }
    }

    /* renamed from: com.google.common.reflect.f$d */
    public static class C16337d {

        /* renamed from: b */
        public static final C16337d f36437b = new C16337d();

        /* renamed from: a */
        public final AtomicInteger f36438a;

        public C16337d() {
            this(new AtomicInteger());
        }

        /* renamed from: a */
        public final Type mo58305a(Type type) {
            type.getClass();
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return Types.m26432d(new C16337d(this.f36438a).mo58305a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = (Class) parameterizedType.getRawType();
                TypeVariable[] typeParameters = cls.getTypeParameters();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    actualTypeArguments[i] = new C16339h(this.f36438a, typeParameters[i]).mo58305a(actualTypeArguments[i]);
                }
                C16337d dVar = new C16337d(this.f36438a);
                Type ownerType = parameterizedType.getOwnerType();
                return Types.m26434f(ownerType == null ? null : dVar.mo58305a(ownerType), cls, actualTypeArguments);
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? mo58306b(wildcardType.getUpperBounds()) : type;
            } else {
                throw new AssertionError("must have been one of the known types");
            }
        }

        /* renamed from: b */
        public TypeVariable<?> mo58306b(Type[] typeArr) {
            StringBuilder h = C0072d.m201h("capture#");
            h.append(this.f36438a.incrementAndGet());
            h.append("-of ? extends ");
            h.append(new C15787h(String.valueOf('&')).mo55780a(Arrays.asList(typeArr)));
            return Types.m26433e(C16337d.class, h.toString(), typeArr);
        }

        public C16337d(AtomicInteger atomicInteger) {
            this.f36438a = atomicInteger;
        }
    }

    public C16333f() {
        this.f36433a = new C16335b();
    }

    /* renamed from: a */
    public static void m26445a(Type type, Type type2, Map map) {
        if (!type.equals(type2)) {
            new C16332e(type2, map).mo58307a(type);
        }
    }

    /* renamed from: b */
    public final Type mo58297b(Type type) {
        type.getClass();
        if (type instanceof TypeVariable) {
            C16335b bVar = this.f36433a;
            TypeVariable typeVariable = (TypeVariable) type;
            bVar.getClass();
            return bVar.mo58300a(typeVariable, new C16338g(typeVariable, bVar));
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            return Types.m26434f(ownerType == null ? null : mo58297b(ownerType), (Class) mo58297b(parameterizedType.getRawType()), mo58298c(parameterizedType.getActualTypeArguments()));
        } else if (type instanceof GenericArrayType) {
            return Types.m26432d(mo58297b(((GenericArrayType) type).getGenericComponentType()));
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new Types.WildcardTypeImpl(mo58298c(wildcardType.getLowerBounds()), mo58298c(wildcardType.getUpperBounds()));
        }
    }

    /* renamed from: c */
    public final Type[] mo58298c(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = mo58297b(typeArr[i]);
        }
        return typeArr2;
    }

    /* renamed from: d */
    public final C16333f mo58299d(Map<C16336c, ? extends Type> map) {
        C16335b bVar = this.f36433a;
        bVar.getClass();
        ImmutableMap.C15958b builder = ImmutableMap.builder();
        builder.mo56616e(bVar.f36435a);
        for (Map.Entry next : map.entrySet()) {
            C16336c cVar = (C16336c) next.getKey();
            Type type = (Type) next.getValue();
            cVar.getClass();
            C15794l.m25612f(cVar, "Type variable %s bound to itself", !(type instanceof TypeVariable ? cVar.mo58301a((TypeVariable) type) : false));
            builder.mo56613b(cVar, type);
        }
        return new C16333f(new C16335b(builder.mo56612a()));
    }

    /* renamed from: com.google.common.reflect.f$b */
    public static class C16335b {

        /* renamed from: a */
        public final ImmutableMap<C16336c, Type> f36435a;

        public C16335b() {
            this.f36435a = ImmutableMap.m25853of();
        }

        /* renamed from: a */
        public Type mo58300a(TypeVariable typeVariable, C16338g gVar) {
            Type type = this.f36435a.get(new C16336c(typeVariable));
            if (type != null) {
                return new C16333f(gVar).mo58297b(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] c = new C16333f(gVar).mo58298c(bounds);
            return (!Types.C16323c.f36421a || !Arrays.equals(bounds, c)) ? Types.m26433e(typeVariable.getGenericDeclaration(), typeVariable.getName(), c) : typeVariable;
        }

        public C16335b(ImmutableMap<C16336c, Type> immutableMap) {
            this.f36435a = immutableMap;
        }
    }

    public C16333f(C16335b bVar) {
        this.f36433a = bVar;
    }
}
