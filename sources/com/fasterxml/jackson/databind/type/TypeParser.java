package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TypeParser implements Serializable {
    private static final long serialVersionUID = 1;
    public final TypeFactory _factory;

    /* renamed from: com.fasterxml.jackson.databind.type.TypeParser$a */
    public static final class C12585a extends StringTokenizer {

        /* renamed from: a */
        public final String f27770a;

        /* renamed from: b */
        public int f27771b;

        /* renamed from: c */
        public String f27772c;

        public C12585a(String str) {
            super(str, "<,>", true);
            this.f27770a = str;
        }

        public final boolean hasMoreTokens() {
            return this.f27772c != null || super.hasMoreTokens();
        }

        public final String nextToken() {
            String str = this.f27772c;
            if (str != null) {
                this.f27772c = null;
                return str;
            }
            String nextToken = super.nextToken();
            this.f27771b = nextToken.length() + this.f27771b;
            return nextToken.trim();
        }
    }

    public TypeParser(TypeFactory typeFactory) {
        this._factory = typeFactory;
    }

    public IllegalArgumentException _problem(C12585a aVar, String str) {
        String str2 = aVar.f27770a;
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", new Object[]{str2, str2.substring(aVar.f27771b), str}));
    }

    public Class<?> findClass(String str, C12585a aVar) {
        try {
            return this._factory.findClass(str);
        } catch (Exception e) {
            ClassUtil.throwIfRTE(e);
            throw _problem(aVar, "Cannot locate class '" + str + "', problem: " + e.getMessage());
        }
    }

    public JavaType parse(String str) throws IllegalArgumentException {
        C12585a aVar = new C12585a(str.trim());
        JavaType parseType = parseType(aVar);
        if (!aVar.hasMoreTokens()) {
            return parseType;
        }
        throw _problem(aVar, "Unexpected tokens after complete type");
    }

    public JavaType parseType(C12585a aVar) throws IllegalArgumentException {
        if (aVar.hasMoreTokens()) {
            Class<?> findClass = findClass(aVar.nextToken(), aVar);
            if (aVar.hasMoreTokens()) {
                String nextToken = aVar.nextToken();
                if ("<".equals(nextToken)) {
                    return this._factory._fromClass((ClassStack) null, findClass, TypeBindings.create(findClass, parseTypes(aVar)));
                }
                aVar.f27772c = nextToken;
            }
            return this._factory._fromClass((ClassStack) null, findClass, TypeBindings.emptyBindings());
        }
        throw _problem(aVar, "Unexpected end-of-string");
    }

    public List<JavaType> parseTypes(C12585a aVar) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        while (aVar.hasMoreTokens()) {
            arrayList.add(parseType(aVar));
            if (!aVar.hasMoreTokens()) {
                break;
            }
            String nextToken = aVar.nextToken();
            if (">".equals(nextToken)) {
                return arrayList;
            }
            if (!",".equals(nextToken)) {
                throw _problem(aVar, "Unexpected token '" + nextToken + "', expected ',' or '>')");
            }
        }
        throw _problem(aVar, "Unexpected end-of-string");
    }

    public TypeParser withFactory(TypeFactory typeFactory) {
        return typeFactory == this._factory ? this : new TypeParser(typeFactory);
    }
}
