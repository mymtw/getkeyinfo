package com.etsy.android.p327ui.conversation.details.models;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.conversation.details.models.ImageDatabaseModelJsonAdapter */
public final class ImageDatabaseModelJsonAdapter extends JsonAdapter<ImageDatabaseModel> {
    public static final int $stable = 8;
    private final JsonAdapter<List<ImageSourceDatabaseModel>> listOfImageSourceDatabaseModelAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.SOURCES);

    public ImageDatabaseModelJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.listOfImageSourceDatabaseModelAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ImageSourceDatabaseModel.class), EmptySet.INSTANCE, ResponseConstants.SOURCES);
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0 && (list = this.listOfImageSourceDatabaseModelAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m(ResponseConstants.SOURCES, ResponseConstants.SOURCES, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (list != null) {
            return new ImageDatabaseModel(list);
        }
        throw C18215a.m30728g(ResponseConstants.SOURCES, ResponseConstants.SOURCES, jsonReader);
    }

    public final void toJson(C17412w wVar, Object obj) {
        ImageDatabaseModel imageDatabaseModel = (ImageDatabaseModel) obj;
        C19383o.m32797g(wVar, "writer");
        if (imageDatabaseModel != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.SOURCES);
            this.listOfImageSourceDatabaseModelAdapter.toJson(wVar, imageDatabaseModel.f21182a);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ImageDatabaseModel)";
    }
}
