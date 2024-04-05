package com.etsy.android.lib.models;

import com.fasterxml.jackson.core.JsonParser;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p425q9.C13258i;
import p568fn.C17782b;

public final class LegacyBaseModelAdapter extends JsonAdapter<Object> {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final LegacyBaseModelAdapterFactory INSTANCE = new LegacyBaseModelAdapterFactory();
    private final Type type;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LegacyBaseModelAdapterFactory getINSTANCE() {
            return LegacyBaseModelAdapter.INSTANCE;
        }
    }

    public LegacyBaseModelAdapter(Type type2) {
        C19383o.m32797g(type2, "type");
        this.type = type2;
    }

    public Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        InputStream z0 = jsonReader.mo68424r().mo72774z0();
        C13258i iVar = C13258i.f29122d;
        C19383o.m32797g(z0, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, z0.available()));
        C17782b.m29848N(z0, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C19383o.m32796f(byteArray, "buffer.toByteArray()");
        JsonParser a = iVar.mo45955a(byteArray);
        a.nextToken();
        return ModelFactory.create(a, C17387a0.m29125c(this.type));
    }

    public void toJson(C17412w wVar, Object obj) {
        C19383o.m32797g(wVar, "writer");
        throw new UnsupportedOperationException("LegacyBaseModelAdapter is only used to deserialize objects");
    }
}
