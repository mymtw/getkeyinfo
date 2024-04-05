package com.fasterxml.jackson.databind;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.p333io.SerializedString;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;

public class PropertyName implements Serializable {
    public static final PropertyName NO_NAME = new PropertyName(new String(""), (String) null);
    public static final PropertyName USE_DEFAULT = new PropertyName("", (String) null);
    private static final String _NO_NAME = "";
    private static final String _USE_DEFAULT = "";
    private static final long serialVersionUID = 1;
    public SerializableString _encodedSimple;
    public final String _namespace;
    public final String _simpleName;

    public PropertyName(String str) {
        this(str, (String) null);
    }

    public static PropertyName construct(String str) {
        if (str == null || str.length() == 0) {
            return USE_DEFAULT;
        }
        return new PropertyName(InternCache.instance.intern(str), (String) null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        PropertyName propertyName = (PropertyName) obj;
        String str = this._simpleName;
        if (str == null) {
            if (propertyName._simpleName != null) {
                return false;
            }
        } else if (!str.equals(propertyName._simpleName)) {
            return false;
        }
        String str2 = this._namespace;
        return str2 == null ? propertyName._namespace == null : str2.equals(propertyName._namespace);
    }

    public String getNamespace() {
        return this._namespace;
    }

    public String getSimpleName() {
        return this._simpleName;
    }

    public boolean hasNamespace() {
        return this._namespace != null;
    }

    public boolean hasSimpleName() {
        return this._simpleName.length() > 0;
    }

    public int hashCode() {
        String str = this._namespace;
        return str == null ? this._simpleName.hashCode() : str.hashCode() ^ this._simpleName.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0 = com.fasterxml.jackson.core.util.InternCache.instance.intern(r3._simpleName);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.PropertyName internSimpleName() {
        /*
            r3 = this;
            java.lang.String r0 = r3._simpleName
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0009
            return r3
        L_0x0009:
            com.fasterxml.jackson.core.util.InternCache r0 = com.fasterxml.jackson.core.util.InternCache.instance
            java.lang.String r1 = r3._simpleName
            java.lang.String r0 = r0.intern(r1)
            java.lang.String r1 = r3._simpleName
            if (r0 != r1) goto L_0x0016
            return r3
        L_0x0016:
            com.fasterxml.jackson.databind.PropertyName r1 = new com.fasterxml.jackson.databind.PropertyName
            java.lang.String r2 = r3._namespace
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.PropertyName.internSimpleName():com.fasterxml.jackson.databind.PropertyName");
    }

    public boolean isEmpty() {
        return this._namespace == null && this._simpleName.isEmpty();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2._simpleName;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object readResolve() {
        /*
            r2 = this;
            java.lang.String r0 = r2._namespace
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = r2._simpleName
            if (r0 == 0) goto L_0x0010
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
        L_0x0010:
            com.fasterxml.jackson.databind.PropertyName r0 = USE_DEFAULT
            return r0
        L_0x0013:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.PropertyName.readResolve():java.lang.Object");
    }

    public SerializableString simpleAsEncoded(MapperConfig<?> mapperConfig) {
        SerializableString serializableString = this._encodedSimple;
        if (serializableString != null) {
            return serializableString;
        }
        SerializableString serializedString = mapperConfig == null ? new SerializedString(this._simpleName) : mapperConfig.compileString(this._simpleName);
        this._encodedSimple = serializedString;
        return serializedString;
    }

    public String toString() {
        if (this._namespace == null) {
            return this._simpleName;
        }
        StringBuilder h = C0072d.m201h("{");
        h.append(this._namespace);
        h.append("}");
        h.append(this._simpleName);
        return h.toString();
    }

    public PropertyName withNamespace(String str) {
        if (str == null) {
            if (this._namespace == null) {
                return this;
            }
        } else if (str.equals(this._namespace)) {
            return this;
        }
        return new PropertyName(this._simpleName, str);
    }

    public PropertyName withSimpleName(String str) {
        if (str == null) {
            str = "";
        }
        return str.equals(this._simpleName) ? this : new PropertyName(str, this._namespace);
    }

    public PropertyName(String str, String str2) {
        this._simpleName = ClassUtil.nonNullString(str);
        this._namespace = str2;
    }

    public boolean hasSimpleName(String str) {
        return this._simpleName.equals(str);
    }

    public static PropertyName construct(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null && str.length() == 0) {
            return USE_DEFAULT;
        }
        return new PropertyName(InternCache.instance.intern(str), str2);
    }
}
