package com.etsy.android.lib.models.apiv3.cart;

import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CartGroupItemDivider extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String HIDDEN = "hidden";
    public static final String SHOW = "show";
    private List<String> hidden = new ArrayList();
    private List<String> show = new ArrayList();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final List<String> getHidden() {
        return this.hidden;
    }

    public final List<String> getShow() {
        return this.show;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", str, SHOW)) {
            this.show = BaseModel.Companion.parseStringArray(jsonParser);
            return true;
        } else if (!C19383o.m32792b(str, HIDDEN)) {
            return false;
        } else {
            this.hidden = BaseModel.Companion.parseStringArray(jsonParser);
            return true;
        }
    }

    public final void setHidden(List<String> list) {
        C19383o.m32797g(list, "<set-?>");
        this.hidden = list;
    }

    public final void setShow(List<String> list) {
        C19383o.m32797g(list, "<set-?>");
        this.show = list;
    }
}
