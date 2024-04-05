package com.etsy.android.lib.models.apiv3.search;

import android.graphics.Color;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.fasterxml.jackson.core.JsonParser;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p628nj.C18263b;

public final class QueryReformulation extends BaseFieldModel {
    public static final int $stable = 8;
    public static final String COLOR = "color";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String DISPLAY = "display";
    public static final String IMAGES = "images";
    public static final String QUERY = "query";
    private int color;
    private String display = "";
    private List<ListingImage> images = EmptyList.INSTANCE;
    private String query = "";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getColor() {
        return this.color;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final List<ListingImage> getImages() {
        return this.images;
    }

    public final String getQuery() {
        return this.query;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        int i;
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case -1185250696:
                if (str.equals("images")) {
                    this.images = BaseModel.Companion.parseArray(jsonParser, ListingImage.class);
                    break;
                } else {
                    return false;
                }
            case 94842723:
                if (!str.equals("color")) {
                    return false;
                }
                String parseString = BaseModel.Companion.parseString(jsonParser);
                if (C18263b.m30839d0(parseString)) {
                    if (parseString.charAt(0) != '#') {
                        parseString = '#' + parseString;
                    }
                    try {
                        i = Color.parseColor(parseString);
                    } catch (IllegalArgumentException unused) {
                    }
                    this.color = i;
                    break;
                }
                i = -1;
                this.color = i;
            case 107944136:
                if (str.equals("query")) {
                    this.query = BaseModel.Companion.parseString(jsonParser);
                    break;
                } else {
                    return false;
                }
            case 1671764162:
                if (str.equals(DISPLAY)) {
                    this.display = BaseModel.Companion.parseString(jsonParser);
                    break;
                } else {
                    return false;
                }
            default:
                return false;
        }
        return true;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setDisplay(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.display = str;
    }

    public final void setImages(List<ListingImage> list) {
        this.images = list;
    }

    public final void setQuery(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.query = str;
    }
}
