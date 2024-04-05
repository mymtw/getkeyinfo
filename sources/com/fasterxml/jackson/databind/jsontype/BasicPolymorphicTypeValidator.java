package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class BasicPolymorphicTypeValidator extends PolymorphicTypeValidator.Base {
    private static final long serialVersionUID = 1;
    public final TypeMatcher[] _baseTypeMatchers;
    public final Set<Class<?>> _invalidBaseTypes;
    public final TypeMatcher[] _subClassMatchers;
    public final NameMatcher[] _subTypeNameMatchers;

    public static class Builder {
        public List<TypeMatcher> _baseTypeMatchers;
        public Set<Class<?>> _invalidBaseTypes;
        public List<TypeMatcher> _subTypeClassMatchers;
        public List<NameMatcher> _subTypeNameMatchers;

        /* renamed from: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator$Builder$a */
        public class C12553a extends TypeMatcher {

            /* renamed from: a */
            public final /* synthetic */ Class f27712a;

            public C12553a(Class cls) {
                this.f27712a = cls;
            }

            public final boolean match(MapperConfig<?> mapperConfig, Class<?> cls) {
                return this.f27712a.isAssignableFrom(cls);
            }
        }

        /* renamed from: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator$Builder$b */
        public class C12554b extends TypeMatcher {

            /* renamed from: a */
            public final /* synthetic */ Pattern f27713a;

            public C12554b(Pattern pattern) {
                this.f27713a = pattern;
            }

            public final boolean match(MapperConfig<?> mapperConfig, Class<?> cls) {
                return this.f27713a.matcher(cls.getName()).matches();
            }
        }

        /* renamed from: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator$Builder$c */
        public class C12555c extends TypeMatcher {

            /* renamed from: a */
            public final /* synthetic */ String f27714a;

            public C12555c(String str) {
                this.f27714a = str;
            }

            public final boolean match(MapperConfig<?> mapperConfig, Class<?> cls) {
                return cls.getName().startsWith(this.f27714a);
            }
        }

        /* renamed from: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator$Builder$d */
        public class C12556d extends TypeMatcher {

            /* renamed from: a */
            public final /* synthetic */ Class f27715a;

            public C12556d(Class cls) {
                this.f27715a = cls;
            }

            public final boolean match(MapperConfig<?> mapperConfig, Class<?> cls) {
                return this.f27715a.isAssignableFrom(cls);
            }
        }

        /* renamed from: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator$Builder$e */
        public class C12557e extends NameMatcher {

            /* renamed from: a */
            public final /* synthetic */ Pattern f27716a;

            public C12557e(Pattern pattern) {
                this.f27716a = pattern;
            }

            public final boolean match(MapperConfig<?> mapperConfig, String str) {
                return this.f27716a.matcher(str).matches();
            }
        }

        /* renamed from: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator$Builder$f */
        public class C12558f extends NameMatcher {

            /* renamed from: a */
            public final /* synthetic */ String f27717a;

            public C12558f(String str) {
                this.f27717a = str;
            }

            public final boolean match(MapperConfig<?> mapperConfig, String str) {
                return str.startsWith(this.f27717a);
            }
        }

        /* renamed from: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator$Builder$g */
        public class C12559g extends TypeMatcher {
            public final boolean match(MapperConfig<?> mapperConfig, Class<?> cls) {
                return cls.isArray();
            }
        }

        public Builder _appendBaseMatcher(TypeMatcher typeMatcher) {
            if (this._baseTypeMatchers == null) {
                this._baseTypeMatchers = new ArrayList();
            }
            this._baseTypeMatchers.add(typeMatcher);
            return this;
        }

        public Builder _appendSubClassMatcher(TypeMatcher typeMatcher) {
            if (this._subTypeClassMatchers == null) {
                this._subTypeClassMatchers = new ArrayList();
            }
            this._subTypeClassMatchers.add(typeMatcher);
            return this;
        }

        public Builder _appendSubNameMatcher(NameMatcher nameMatcher) {
            if (this._subTypeNameMatchers == null) {
                this._subTypeNameMatchers = new ArrayList();
            }
            this._subTypeNameMatchers.add(nameMatcher);
            return this;
        }

        public Builder allowIfBaseType(Class<?> cls) {
            return _appendBaseMatcher(new C12553a(cls));
        }

        public Builder allowIfSubType(Class<?> cls) {
            return _appendSubClassMatcher(new C12556d(cls));
        }

        public Builder allowIfSubTypeIsArray() {
            return _appendSubClassMatcher(new C12559g());
        }

        public BasicPolymorphicTypeValidator build() {
            Set<Class<?>> set = this._invalidBaseTypes;
            List<TypeMatcher> list = this._baseTypeMatchers;
            TypeMatcher[] typeMatcherArr = null;
            TypeMatcher[] typeMatcherArr2 = list == null ? null : (TypeMatcher[]) list.toArray(new TypeMatcher[0]);
            List<NameMatcher> list2 = this._subTypeNameMatchers;
            NameMatcher[] nameMatcherArr = list2 == null ? null : (NameMatcher[]) list2.toArray(new NameMatcher[0]);
            List<TypeMatcher> list3 = this._subTypeClassMatchers;
            if (list3 != null) {
                typeMatcherArr = (TypeMatcher[]) list3.toArray(new TypeMatcher[0]);
            }
            return new BasicPolymorphicTypeValidator(set, typeMatcherArr2, nameMatcherArr, typeMatcherArr);
        }

        public Builder denyForExactBaseType(Class<?> cls) {
            if (this._invalidBaseTypes == null) {
                this._invalidBaseTypes = new HashSet();
            }
            this._invalidBaseTypes.add(cls);
            return this;
        }

        public Builder allowIfBaseType(Pattern pattern) {
            return _appendBaseMatcher(new C12554b(pattern));
        }

        public Builder allowIfSubType(Pattern pattern) {
            return _appendSubNameMatcher(new C12557e(pattern));
        }

        public Builder allowIfBaseType(String str) {
            return _appendBaseMatcher(new C12555c(str));
        }

        public Builder allowIfSubType(String str) {
            return _appendSubNameMatcher(new C12558f(str));
        }

        public Builder allowIfBaseType(TypeMatcher typeMatcher) {
            return _appendBaseMatcher(typeMatcher);
        }

        public Builder allowIfSubType(TypeMatcher typeMatcher) {
            return _appendSubClassMatcher(typeMatcher);
        }
    }

    public static abstract class NameMatcher {
        public abstract boolean match(MapperConfig<?> mapperConfig, String str);
    }

    public static abstract class TypeMatcher {
        public abstract boolean match(MapperConfig<?> mapperConfig, Class<?> cls);
    }

    public BasicPolymorphicTypeValidator(Set<Class<?>> set, TypeMatcher[] typeMatcherArr, NameMatcher[] nameMatcherArr, TypeMatcher[] typeMatcherArr2) {
        this._invalidBaseTypes = set;
        this._baseTypeMatchers = typeMatcherArr;
        this._subTypeNameMatchers = nameMatcherArr;
        this._subClassMatchers = typeMatcherArr2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public PolymorphicTypeValidator.Validity validateBaseType(MapperConfig<?> mapperConfig, JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        Set<Class<?>> set = this._invalidBaseTypes;
        if (set != null && set.contains(rawClass)) {
            return PolymorphicTypeValidator.Validity.DENIED;
        }
        TypeMatcher[] typeMatcherArr = this._baseTypeMatchers;
        if (typeMatcherArr != null) {
            for (TypeMatcher match : typeMatcherArr) {
                if (match.match(mapperConfig, rawClass)) {
                    return PolymorphicTypeValidator.Validity.ALLOWED;
                }
            }
        }
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    public PolymorphicTypeValidator.Validity validateSubClassName(MapperConfig<?> mapperConfig, JavaType javaType, String str) throws JsonMappingException {
        NameMatcher[] nameMatcherArr = this._subTypeNameMatchers;
        if (nameMatcherArr != null) {
            for (NameMatcher match : nameMatcherArr) {
                if (match.match(mapperConfig, str)) {
                    return PolymorphicTypeValidator.Validity.ALLOWED;
                }
            }
        }
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    public PolymorphicTypeValidator.Validity validateSubType(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) throws JsonMappingException {
        if (this._subClassMatchers != null) {
            Class<?> rawClass = javaType2.getRawClass();
            for (TypeMatcher match : this._subClassMatchers) {
                if (match.match(mapperConfig, rawClass)) {
                    return PolymorphicTypeValidator.Validity.ALLOWED;
                }
            }
        }
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }
}
