package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import java.io.Closeable;
import java.io.Serializable;
import java.util.HashSet;

public class DefaultBaseTypeLimitingValidator extends PolymorphicTypeValidator {
    private static final long serialVersionUID = 1;

    /* renamed from: com.fasterxml.jackson.databind.jsontype.DefaultBaseTypeLimitingValidator$a */
    public static final class C12560a {

        /* renamed from: b */
        public static final C12560a f27718b = new C12560a();

        /* renamed from: a */
        public final HashSet f27719a;

        public C12560a() {
            HashSet hashSet = new HashSet();
            this.f27719a = hashSet;
            hashSet.add(Object.class.getName());
            hashSet.add(Closeable.class.getName());
            hashSet.add(Serializable.class.getName());
            hashSet.add(AutoCloseable.class.getName());
            hashSet.add(Cloneable.class.getName());
            hashSet.add("java.util.logging.Handler");
            hashSet.add("javax.naming.Referenceable");
            hashSet.add("javax.sql.DataSource");
        }
    }

    public boolean isSafeSubType(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) {
        return true;
    }

    public boolean isUnsafeBaseType(MapperConfig<?> mapperConfig, JavaType javaType) {
        return C12560a.f27718b.f27719a.contains(javaType.getRawClass().getName());
    }

    public PolymorphicTypeValidator.Validity validateBaseType(MapperConfig<?> mapperConfig, JavaType javaType) {
        return isUnsafeBaseType(mapperConfig, javaType) ? PolymorphicTypeValidator.Validity.DENIED : PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    public PolymorphicTypeValidator.Validity validateSubClassName(MapperConfig<?> mapperConfig, JavaType javaType, String str) {
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    public PolymorphicTypeValidator.Validity validateSubType(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) {
        return isSafeSubType(mapperConfig, javaType, javaType2) ? PolymorphicTypeValidator.Validity.ALLOWED : PolymorphicTypeValidator.Validity.DENIED;
    }
}
