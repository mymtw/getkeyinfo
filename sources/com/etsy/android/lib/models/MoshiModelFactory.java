package com.etsy.android.lib.models;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0388a;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.util.CrashUtil;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.android.play.core.assetpacks.C15588c1;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17403o;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p340ea.C12673n;
import p425q9.C13258i;
import p756lr.C19893f;
import p756lr.C19897i;

public final class MoshiModelFactory {
    public static final int $stable = 8;
    public static final MoshiModelFactory INSTANCE = new MoshiModelFactory();
    private static final C19285c crashUtil$delegate = C19350d.m32677b(MoshiModelFactory$crashUtil$2.INSTANCE);
    private static final C19285c elkLogger$delegate = C19350d.m32677b(MoshiModelFactory$elkLogger$2.INSTANCE);
    private static final C19285c moshi$delegate = C19350d.m32677b(MoshiModelFactory$moshi$2.INSTANCE);
    private static final C19285c objectMapper$delegate = C19350d.m32677b(MoshiModelFactory$objectMapper$2.INSTANCE);

    private MoshiModelFactory() {
    }

    public static final <T> T create(JsonParser jsonParser, Class<T> cls) throws IOException {
        C19383o.m32797g(jsonParser, "jp");
        C19383o.m32797g(cls, "clazz");
        MoshiModelFactory moshiModelFactory = INSTANCE;
        return moshiModelFactory.isMoshiModel(cls) ? moshiModelFactory.createMoshi(jsonParser, cls) : moshiModelFactory.createJackson(jsonParser, cls);
    }

    public static final <T> T createFromByteArray(byte[] bArr, Class<T> cls) throws IOException {
        C19383o.m32797g(bArr, "byteArray");
        C19383o.m32797g(cls, "clazz");
        if (bArr.length == 0) {
            LogCatKt.m17045a().error(new IllegalArgumentException("createFromByteArray: byteArray argument is empty"));
            return null;
        }
        MoshiModelFactory moshiModelFactory = INSTANCE;
        return moshiModelFactory.isMoshiModel(cls) ? moshiModelFactory.createMoshiFromByteArray(bArr, cls) : moshiModelFactory.createJacksonFromByteArray(bArr, cls);
    }

    private final <T> T createJackson(JsonParser jsonParser, Class<T> cls) {
        C8694h a = LogCatKt.m17045a();
        cls.getSimpleName();
        a.mo21308c();
        try {
            T newInstance = cls.newInstance();
            C19383o.m32795e(newInstance, "null cannot be cast to non-null type com.etsy.android.lib.models.BaseModel");
            ((BaseModel) newInstance).parseData(jsonParser);
            return newInstance;
        } catch (InstantiationException e) {
            logError(cls.getName(), e, "createJackson");
        } catch (IllegalAccessException e2) {
            logError(cls.getName(), e2, "createJackson");
        } catch (Exception e3) {
            logError(cls.getName(), e3, "createJackson");
        }
        return null;
    }

    private final <T> T createJacksonFromByteArray(byte[] bArr, Class<T> cls) {
        C8694h a = LogCatKt.m17045a();
        cls.getSimpleName();
        a.mo21308c();
        JsonParser a2 = C13258i.f29122d.mo45955a(bArr);
        a2.nextToken();
        return createJackson(a2, cls);
    }

    private final <T> List<T> createJacksonListFromByteArray(byte[] bArr, Class<T> cls) {
        C8694h a = LogCatKt.m17045a();
        cls.getSimpleName();
        a.mo21308c();
        JsonParser a2 = C13258i.f29122d.mo45955a(bArr);
        a2.nextToken();
        ArrayList arrayList = new ArrayList();
        T t = null;
        if (a2.getCurrentToken() == JsonToken.START_ARRAY) {
            while (a2.nextToken() != JsonToken.END_ARRAY) {
                T createJackson = a2.getCurrentToken() == JsonToken.START_OBJECT ? createJackson(a2, cls) : null;
                if (createJackson != null) {
                    arrayList.add(createJackson);
                }
            }
        } else {
            JsonToken currentToken = a2.getCurrentToken();
            JsonToken jsonToken = JsonToken.START_OBJECT;
            if (currentToken == jsonToken) {
                if (a2.getCurrentToken() == jsonToken) {
                    t = createJackson(a2, cls);
                }
                if (t != null) {
                    arrayList.add(t);
                }
            }
        }
        return arrayList;
    }

    public static final <T> List<T> createList(JsonParser jsonParser, Class<T> cls) {
        T create;
        C19383o.m32797g(jsonParser, "jp");
        C19383o.m32797g(cls, "clazz");
        ArrayList arrayList = new ArrayList();
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                T create2 = jsonParser.getCurrentToken() == JsonToken.START_OBJECT ? create(jsonParser, cls) : null;
                if (create2 != null) {
                    arrayList.add(create2);
                }
            }
        } else if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT && (create = create(jsonParser, cls)) != null) {
            arrayList.add(create);
        }
        return arrayList;
    }

    public static final <T> List<T> createListFromByteArray(byte[] bArr, Class<T> cls) {
        C19383o.m32797g(bArr, "byteArray");
        C19383o.m32797g(cls, "clazz");
        if (bArr.length == 0) {
            LogCatKt.m17045a().mo21314h(new IllegalArgumentException("createListFromByteArray: byteArray argument is empty"));
            return EmptyList.INSTANCE;
        }
        MoshiModelFactory moshiModelFactory = INSTANCE;
        return moshiModelFactory.isMoshiModel(cls) ? moshiModelFactory.createMoshiListFromByteArray(bArr, cls) : moshiModelFactory.createJacksonListFromByteArray(bArr, cls);
    }

    private final <T> T createMoshi(JsonParser jsonParser, Class<T> cls) {
        C8694h a = LogCatKt.m17045a();
        cls.getSimpleName();
        a.mo21308c();
        return getMoshi().mo68556a(cls).fromJson(((ObjectNode) getObjectMapper().readTree(jsonParser)).toString());
    }

    private final <T> T createMoshiFromByteArray(byte[] bArr, Class<T> cls) {
        C8694h a = LogCatKt.m17045a();
        cls.getSimpleName();
        a.mo21308c();
        try {
            JsonAdapter<T> a2 = getMoshi().mo68556a(cls);
            C19893f fVar = new C19893f();
            fVar.write(bArr);
            T fromJson = a2.fromJson((C19897i) fVar);
            C19383o.m32794d(fromJson);
            return fromJson;
        } catch (Throwable th) {
            logError(cls.getName(), th, "createMoshiFromByteArray");
            return null;
        }
    }

    private final <T> List<T> createMoshiListFromByteArray(byte[] bArr, Class<T> cls) {
        C8694h a = LogCatKt.m17045a();
        cls.getSimpleName();
        a.mo21308c();
        try {
            C19893f fVar = new C19893f();
            fVar.write(bArr);
            Object fromJson = getMoshi().mo68557b(C17387a0.m29126d(List.class, cls)).fromJson((C19897i) fVar);
            C19383o.m32794d(fromJson);
            return (List) fromJson;
        } catch (Throwable th) {
            logError(cls.getName(), th, "createMoshiList");
            return EmptyList.INSTANCE;
        }
    }

    /* access modifiers changed from: private */
    public final CrashUtil getCrashUtil() {
        Object value = crashUtil$delegate.getValue();
        C19383o.m32796f(value, "<get-crashUtil>(...)");
        return (CrashUtil) value;
    }

    private final C12673n getElkLogger() {
        return (C12673n) elkLogger$delegate.getValue();
    }

    private final C17414y getMoshi() {
        return (C17414y) moshi$delegate.getValue();
    }

    private final ObjectMapper getObjectMapper() {
        return (ObjectMapper) objectMapper$delegate.getValue();
    }

    private final boolean isMoshiModel(Class<?> cls) {
        return cls.isAnnotationPresent(C17403o.class);
    }

    private final void logError(String str, Throwable th, String str2) {
        C15588c1.m25314Y(new MoshiModelFactory$logError$1(str, th), 1);
        C12673n elkLogger = getElkLogger();
        StringBuilder f = C0388a.m1050f("error in MoshiModelFactory.", str2, "() while parsing [", str, "] message: ");
        f.append(th.getMessage());
        elkLogger.mo45449a(f.toString());
        C8694h a = LogCatKt.m17045a();
        StringBuilder f2 = C0388a.m1050f("error in MoshiModelFactory.", str2, "() while parsing [", str, "] message: ");
        f2.append(th.getMessage());
        a.mo21306a(f2.toString());
        if (C0326j.m869n(BuildTarget.Companion)) {
            throw th;
        }
    }
}
