package com.squareup.moshi.adapters;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.Enum;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;
import p618lp.C18215a;

public final class EnumJsonAdapter<T extends Enum<T>> extends JsonAdapter<T> {
    public final T[] constants;
    public final Class<T> enumType;
    public final T fallbackValue;
    public final String[] nameStrings;
    public final JsonReader.C17362b options;
    public final boolean useFallbackValue;

    public EnumJsonAdapter(Class<T> cls, T t, boolean z) {
        this.enumType = cls;
        this.fallbackValue = t;
        this.useFallbackValue = z;
        try {
            T[] tArr = (Enum[]) cls.getEnumConstants();
            this.constants = tArr;
            this.nameStrings = new String[tArr.length];
            int i = 0;
            while (true) {
                T[] tArr2 = this.constants;
                if (i < tArr2.length) {
                    String name = tArr2[i].name();
                    String[] strArr = this.nameStrings;
                    Field field = cls.getField(name);
                    Set<Annotation> set = C18215a.f39926a;
                    C17402n nVar = (C17402n) field.getAnnotation(C17402n.class);
                    if (nVar != null) {
                        String name2 = nVar.name();
                        if (!"\u0000".equals(name2)) {
                            name = name2;
                        }
                    }
                    strArr[i] = name;
                    i++;
                } else {
                    this.options = JsonReader.C17362b.m29110a(this.nameStrings);
                    return;
                }
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError(C0326j.m862g(cls, C0072d.m201h("Missing field in ")), e);
        }
    }

    public final Object fromJson(JsonReader jsonReader) throws IOException {
        int R = jsonReader.mo68407R(this.options);
        if (R != -1) {
            return this.constants[R];
        }
        String path = jsonReader.getPath();
        if (!this.useFallbackValue) {
            String t = jsonReader.mo68425t();
            StringBuilder h = C0072d.m201h("Expected one of ");
            h.append(Arrays.asList(this.nameStrings));
            h.append(" but was ");
            h.append(t);
            h.append(" at path ");
            h.append(path);
            throw new JsonDataException(h.toString());
        } else if (jsonReader.mo68426u() == JsonReader.Token.STRING) {
            jsonReader.mo68411c0();
            return this.fallbackValue;
        } else {
            StringBuilder h2 = C0072d.m201h("Expected a string but was ");
            h2.append(jsonReader.mo68426u());
            h2.append(" at path ");
            h2.append(path);
            throw new JsonDataException(h2.toString());
        }
    }

    public final void toJson(C17412w wVar, Object obj) throws IOException {
        Enum enumR = (Enum) obj;
        if (enumR != null) {
            wVar.mo68535x(this.nameStrings[enumR.ordinal()]);
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C0326j.m863h(this.enumType, C0072d.m201h("EnumJsonAdapter("), ")");
    }
}
