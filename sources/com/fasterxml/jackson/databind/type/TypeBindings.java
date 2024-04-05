package com.fasterxml.jackson.databind.type;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.appboy.Constants;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TypeBindings implements Serializable {
    private static final TypeBindings EMPTY;
    private static final String[] NO_STRINGS;
    private static final JavaType[] NO_TYPES;
    private static final long serialVersionUID = 1;
    private final int _hashCode;
    private final String[] _names;
    private final JavaType[] _types;
    private final String[] _unboundVariables;

    /* renamed from: com.fasterxml.jackson.databind.type.TypeBindings$a */
    public static final class C12583a {

        /* renamed from: a */
        public final Class<?> f27759a;

        /* renamed from: b */
        public final JavaType[] f27760b;

        /* renamed from: c */
        public final int f27761c;

        public C12583a(Class<?> cls, JavaType[] javaTypeArr, int i) {
            this.f27759a = cls;
            this.f27760b = javaTypeArr;
            this.f27761c = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != C12583a.class) {
                return false;
            }
            C12583a aVar = (C12583a) obj;
            if (this.f27761c == aVar.f27761c && this.f27759a == aVar.f27759a) {
                JavaType[] javaTypeArr = aVar.f27760b;
                int length = this.f27760b.length;
                if (length == javaTypeArr.length) {
                    for (int i = 0; i < length; i++) {
                        if (!this.f27760b[i].equals(javaTypeArr[i])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f27761c;
        }

        public final String toString() {
            return C0326j.m863h(this.f27759a, new StringBuilder(), "<>");
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.type.TypeBindings$b */
    public static class C12584b {

        /* renamed from: a */
        public static final TypeVariable<?>[] f27762a = AbstractList.class.getTypeParameters();

        /* renamed from: b */
        public static final TypeVariable<?>[] f27763b = Collection.class.getTypeParameters();

        /* renamed from: c */
        public static final TypeVariable<?>[] f27764c = Iterable.class.getTypeParameters();

        /* renamed from: d */
        public static final TypeVariable<?>[] f27765d = List.class.getTypeParameters();

        /* renamed from: e */
        public static final TypeVariable<?>[] f27766e = ArrayList.class.getTypeParameters();

        /* renamed from: f */
        public static final TypeVariable<?>[] f27767f = Map.class.getTypeParameters();

        /* renamed from: g */
        public static final TypeVariable<?>[] f27768g = HashMap.class.getTypeParameters();

        /* renamed from: h */
        public static final TypeVariable<?>[] f27769h = LinkedHashMap.class.getTypeParameters();
    }

    static {
        String[] strArr = new String[0];
        NO_STRINGS = strArr;
        JavaType[] javaTypeArr = new JavaType[0];
        NO_TYPES = javaTypeArr;
        EMPTY = new TypeBindings(strArr, javaTypeArr, (String[]) null);
    }

    private TypeBindings(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        strArr = strArr == null ? NO_STRINGS : strArr;
        this._names = strArr;
        javaTypeArr = javaTypeArr == null ? NO_TYPES : javaTypeArr;
        this._types = javaTypeArr;
        if (strArr.length == javaTypeArr.length) {
            int length = javaTypeArr.length;
            int i = 1;
            for (int i2 = 0; i2 < length; i2++) {
                i += this._types[i2].hashCode();
            }
            this._unboundVariables = strArr2;
            this._hashCode = i;
            return;
        }
        StringBuilder h = C0072d.m201h("Mismatching names (");
        h.append(strArr.length);
        h.append("), types (");
        throw new IllegalArgumentException(C0071c.m191c(h, javaTypeArr.length, ")"));
    }

    public static TypeBindings create(Class<?> cls, List<JavaType> list) {
        JavaType[] javaTypeArr;
        if (list == null || list.isEmpty()) {
            javaTypeArr = NO_TYPES;
        } else {
            javaTypeArr = (JavaType[]) list.toArray(NO_TYPES);
        }
        return create(cls, javaTypeArr);
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType javaType) {
        int i;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null) {
            i = 0;
        } else {
            i = typeParameters.length;
        }
        if (i == 0) {
            return EMPTY;
        }
        if (i == 1) {
            return new TypeBindings(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, (String[]) null);
        }
        StringBuilder h = C0072d.m201h("Cannot create TypeBindings for class ");
        h.append(cls.getName());
        h.append(" with 1 type parameter: class expects ");
        h.append(i);
        throw new IllegalArgumentException(h.toString());
    }

    public static TypeBindings emptyBindings() {
        return EMPTY;
    }

    public Object asKey(Class<?> cls) {
        return new C12583a(cls, this._types, this._hashCode);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, getClass())) {
            return false;
        }
        TypeBindings typeBindings = (TypeBindings) obj;
        int length = this._types.length;
        if (length != typeBindings.size()) {
            return false;
        }
        JavaType[] javaTypeArr = typeBindings._types;
        for (int i = 0; i < length; i++) {
            if (!javaTypeArr[i].equals(this._types[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r0 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType) r4).getSelfReferencedType();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JavaType findBoundType(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String[] r0 = r3._names
            int r0 = r0.length
            r1 = 0
        L_0x0004:
            if (r1 >= r0) goto L_0x0026
            java.lang.String[] r2 = r3._names
            r2 = r2[r1]
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0023
            com.fasterxml.jackson.databind.JavaType[] r4 = r3._types
            r4 = r4[r1]
            boolean r0 = r4 instanceof com.fasterxml.jackson.databind.type.ResolvedRecursiveType
            if (r0 == 0) goto L_0x0022
            r0 = r4
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType r0 = (com.fasterxml.jackson.databind.type.ResolvedRecursiveType) r0
            com.fasterxml.jackson.databind.JavaType r0 = r0.getSelfReferencedType()
            if (r0 == 0) goto L_0x0022
            r4 = r0
        L_0x0022:
            return r4
        L_0x0023:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0026:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.TypeBindings.findBoundType(java.lang.String):com.fasterxml.jackson.databind.JavaType");
    }

    public String getBoundName(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this._names;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    public JavaType getBoundType(int i) {
        if (i < 0) {
            return null;
        }
        JavaType[] javaTypeArr = this._types;
        if (i >= javaTypeArr.length) {
            return null;
        }
        return javaTypeArr[i];
    }

    public List<JavaType> getTypeParameters() {
        JavaType[] javaTypeArr = this._types;
        return javaTypeArr.length == 0 ? Collections.emptyList() : Arrays.asList(javaTypeArr);
    }

    public boolean hasUnbound(String str) {
        String[] strArr = this._unboundVariables;
        if (strArr == null) {
            return false;
        }
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!str.equals(this._unboundVariables[length]));
        return true;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public boolean isEmpty() {
        return this._types.length == 0;
    }

    public Object readResolve() {
        String[] strArr = this._names;
        return (strArr == null || strArr.length == 0) ? EMPTY : this;
    }

    public int size() {
        return this._types.length;
    }

    public String toString() {
        if (this._types.length == 0) {
            return "<>";
        }
        StringBuilder k = C0326j.m866k('<');
        int length = this._types.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                k.append(',');
            }
            k.append(this._types[i].getGenericSignature());
        }
        k.append('>');
        return k.toString();
    }

    public JavaType[] typeParameterArray() {
        return this._types;
    }

    public TypeBindings withUnboundVariable(String str) {
        String[] strArr = this._unboundVariables;
        int length = strArr == null ? 0 : strArr.length;
        String[] strArr2 = length == 0 ? new String[1] : (String[]) Arrays.copyOf(strArr, length + 1);
        strArr2[length] = str;
        return new TypeBindings(this._names, this._types, strArr2);
    }

    public static TypeBindings create(Class<?> cls, JavaType[] javaTypeArr) {
        String[] strArr;
        if (javaTypeArr == null) {
            javaTypeArr = NO_TYPES;
        } else {
            int length = javaTypeArr.length;
            if (length == 1) {
                return create(cls, javaTypeArr[0]);
            }
            if (length == 2) {
                return create(cls, javaTypeArr[0], javaTypeArr[1]);
            }
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = NO_STRINGS;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i = 0; i < length2; i++) {
                strArr[i] = typeParameters[i].getName();
            }
        }
        if (strArr.length == javaTypeArr.length) {
            return new TypeBindings(strArr, javaTypeArr, (String[]) null);
        }
        StringBuilder h = C0072d.m201h("Cannot create TypeBindings for class ");
        h.append(cls.getName());
        h.append(" with ");
        h.append(javaTypeArr.length);
        h.append(" type parameter");
        h.append(javaTypeArr.length == 1 ? "" : Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
        h.append(": class expects ");
        h.append(strArr.length);
        throw new IllegalArgumentException(h.toString());
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType[] javaTypeArr) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            return EMPTY;
        }
        if (javaTypeArr == null) {
            javaTypeArr = NO_TYPES;
        }
        int length = typeParameters.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = typeParameters[i].getName();
        }
        if (length == javaTypeArr.length) {
            return new TypeBindings(strArr, javaTypeArr, (String[]) null);
        }
        StringBuilder h = C0072d.m201h("Cannot create TypeBindings for class ");
        h.append(cls.getName());
        h.append(" with ");
        h.append(javaTypeArr.length);
        h.append(" type parameter");
        h.append(javaTypeArr.length == 1 ? "" : Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
        h.append(": class expects ");
        h.append(length);
        throw new IllegalArgumentException(h.toString());
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType) {
        TypeVariable<?>[] typeVariableArr;
        int i;
        TypeVariable<?>[] typeVariableArr2 = C12584b.f27762a;
        if (cls == Collection.class) {
            typeVariableArr = C12584b.f27763b;
        } else if (cls == List.class) {
            typeVariableArr = C12584b.f27765d;
        } else if (cls == ArrayList.class) {
            typeVariableArr = C12584b.f27766e;
        } else if (cls == AbstractList.class) {
            typeVariableArr = C12584b.f27762a;
        } else if (cls == Iterable.class) {
            typeVariableArr = C12584b.f27764c;
        } else {
            typeVariableArr = cls.getTypeParameters();
        }
        if (typeVariableArr == null) {
            i = 0;
        } else {
            i = typeVariableArr.length;
        }
        if (i == 1) {
            return new TypeBindings(new String[]{typeVariableArr[0].getName()}, new JavaType[]{javaType}, (String[]) null);
        }
        StringBuilder h = C0072d.m201h("Cannot create TypeBindings for class ");
        h.append(cls.getName());
        h.append(" with 1 type parameter: class expects ");
        h.append(i);
        throw new IllegalArgumentException(h.toString());
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType, JavaType javaType2) {
        TypeVariable<?>[] typeVariableArr;
        int i;
        TypeVariable<?>[] typeVariableArr2 = C12584b.f27762a;
        if (cls == Map.class) {
            typeVariableArr = C12584b.f27767f;
        } else if (cls == HashMap.class) {
            typeVariableArr = C12584b.f27768g;
        } else if (cls == LinkedHashMap.class) {
            typeVariableArr = C12584b.f27769h;
        } else {
            typeVariableArr = cls.getTypeParameters();
        }
        if (typeVariableArr == null) {
            i = 0;
        } else {
            i = typeVariableArr.length;
        }
        if (i == 2) {
            return new TypeBindings(new String[]{typeVariableArr[0].getName(), typeVariableArr[1].getName()}, new JavaType[]{javaType, javaType2}, (String[]) null);
        }
        StringBuilder h = C0072d.m201h("Cannot create TypeBindings for class ");
        h.append(cls.getName());
        h.append(" with 2 type parameters: class expects ");
        h.append(i);
        throw new IllegalArgumentException(h.toString());
    }
}
