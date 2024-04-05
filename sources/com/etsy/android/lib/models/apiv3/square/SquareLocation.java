package com.etsy.android.lib.models.apiv3.square;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

public final class SquareLocation extends BaseModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: ID */
    private static final String f19151ID = "id";
    private static final String NAME = "name";

    /* renamed from: id */
    private String f19152id = "";
    private boolean inProgress;
    private String name = "";
    private boolean selected;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getId() {
        return this.f19152id;
    }

    public final boolean getInProgress() {
        return this.inProgress;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public void parseData(JsonParser jsonParser) {
        C19383o.m32797g(jsonParser, "jp");
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (C19383o.m32792b(currentName, "id")) {
                    this.f19152id = BaseModel.Companion.parseString(jsonParser);
                } else if (C19383o.m32792b(currentName, "name")) {
                    this.name = BaseModel.Companion.parseString(jsonParser);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public final void setInProgress(boolean z) {
        this.inProgress = z;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SquareLocation(id='");
        h.append(this.f19152id);
        h.append("', name='");
        return C0023f.m110k(h, this.name, "')");
    }
}
