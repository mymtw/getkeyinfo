package com.etsy.android.lib.models.apiv3.cart;

import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class TotalsNote extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final transient String STYLE = "style";
    public static final transient String STYLE_DEFAULT = "default";
    public static final transient String STYLE_SMALL_TERMS = "smallTerms";
    private String style = "default";
    public String text;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getText() {
        String str = this.text;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("text");
        throw null;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", str, "text")) {
            setText(BaseModel.Companion.parseString(jsonParser));
            return true;
        } else if (!C19383o.m32792b(str, STYLE)) {
            return false;
        } else {
            this.style = BaseModel.Companion.parseString(jsonParser);
            return true;
        }
    }

    public final void setStyle(String str) {
        this.style = str;
    }

    public final void setText(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.text = str;
    }
}
