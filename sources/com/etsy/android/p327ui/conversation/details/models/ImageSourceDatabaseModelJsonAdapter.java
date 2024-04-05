package com.etsy.android.p327ui.conversation.details.models;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.conversation.details.models.ImageSourceDatabaseModelJsonAdapter */
public final class ImageSourceDatabaseModelJsonAdapter extends JsonAdapter<ImageSourceDatabaseModel> {
    public static final int $stable = 8;
    private volatile Constructor<ImageSourceDatabaseModel> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.HEIGHT, ResponseConstants.WIDTH, "url");
    private final JsonAdapter<String> stringAdapter;

    public ImageSourceDatabaseModelJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.intAdapter = yVar.mo68558c(cls, emptySet, ResponseConstants.HEIGHT);
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "url");
    }

    public final Object fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        Integer num = 0;
        jsonReader.mo68410b();
        Integer num2 = num;
        int i = -1;
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.intAdapter.fromJson(jsonReader2);
                if (num != null) {
                    i &= -2;
                } else {
                    throw C18215a.m30734m(ResponseConstants.HEIGHT, ResponseConstants.HEIGHT, jsonReader2);
                }
            } else if (Q == 1) {
                num2 = this.intAdapter.fromJson(jsonReader2);
                if (num2 != null) {
                    i &= -3;
                } else {
                    throw C18215a.m30734m(ResponseConstants.WIDTH, ResponseConstants.WIDTH, jsonReader2);
                }
            } else if (Q == 2 && (str = this.stringAdapter.fromJson(jsonReader2)) == null) {
                throw C18215a.m30734m("url", "url", jsonReader2);
            }
        }
        jsonReader.mo68413e();
        if (i == -4) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (str != null) {
                return new ImageSourceDatabaseModel(intValue, intValue2, str);
            }
            throw C18215a.m30728g("url", "url", jsonReader2);
        }
        Constructor<ImageSourceDatabaseModel> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = ImageSourceDatabaseModel.class.getDeclaredConstructor(new Class[]{cls, cls, String.class, cls, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ImageSourceDatabaseModel…his.constructorRef = it }");
        }
        Object[] objArr = new Object[5];
        objArr[0] = num;
        objArr[1] = num2;
        if (str != null) {
            objArr[2] = str;
            objArr[3] = Integer.valueOf(i);
            objArr[4] = null;
            ImageSourceDatabaseModel newInstance = constructor.newInstance(objArr);
            C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        }
        throw C18215a.m30728g("url", "url", jsonReader2);
    }

    public final void toJson(C17412w wVar, Object obj) {
        ImageSourceDatabaseModel imageSourceDatabaseModel = (ImageSourceDatabaseModel) obj;
        C19383o.m32797g(wVar, "writer");
        if (imageSourceDatabaseModel != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.HEIGHT);
            this.intAdapter.toJson(wVar, Integer.valueOf(imageSourceDatabaseModel.f21183a));
            wVar.mo68529h(ResponseConstants.WIDTH);
            this.intAdapter.toJson(wVar, Integer.valueOf(imageSourceDatabaseModel.f21184b));
            wVar.mo68529h("url");
            this.stringAdapter.toJson(wVar, imageSourceDatabaseModel.f21185c);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ImageSourceDatabaseModel)";
    }
}
