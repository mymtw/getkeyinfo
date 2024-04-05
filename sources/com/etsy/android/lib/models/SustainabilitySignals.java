package com.etsy.android.lib.models;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SustainabilitySignals extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final transient String IS_DIGITAL = "is_digital";
    public static final transient String IS_HANDMADE = "is_handmade";
    public static final transient String IS_ORGANIC = "is_organic";
    public static final transient String IS_RECYCLED = "is_recycled";
    public static final transient String IS_VINTAGE = "is_vintage";
    public static final transient String LOCATION = "location";
    private boolean isDigital;
    private boolean isHandmade;
    private boolean isOrganic;
    private boolean isRecycled;
    private boolean isVintage;
    public String location;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getLocation() {
        String str = this.location;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("location");
        throw null;
    }

    public final boolean isDigital() {
        return this.isDigital;
    }

    public final boolean isHandmade() {
        return this.isHandmade;
    }

    public final boolean isOrganic() {
        return this.isOrganic;
    }

    public final boolean isRecycled() {
        return this.isRecycled;
    }

    public final boolean isVintage() {
        return this.isVintage;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case -1525468250:
                if (str.equals(IS_RECYCLED)) {
                    this.isRecycled = jsonParser.getBooleanValue();
                    return true;
                }
                break;
            case -1134176253:
                if (str.equals("is_digital")) {
                    this.isDigital = jsonParser.getBooleanValue();
                    return true;
                }
                break;
            case -732935815:
                if (str.equals(IS_HANDMADE)) {
                    this.isHandmade = jsonParser.getBooleanValue();
                    return true;
                }
                break;
            case 295848150:
                if (str.equals(IS_ORGANIC)) {
                    this.isOrganic = jsonParser.getBooleanValue();
                    return true;
                }
                break;
            case 1901043637:
                if (str.equals("location")) {
                    setLocation(BaseModel.Companion.parseString(jsonParser));
                    return true;
                }
                break;
            case 1962762385:
                if (str.equals("is_vintage")) {
                    this.isVintage = jsonParser.getBooleanValue();
                    return true;
                }
                break;
        }
        return false;
    }

    public final void setDigital(boolean z) {
        this.isDigital = z;
    }

    public final void setHandmade(boolean z) {
        this.isHandmade = z;
    }

    public final void setLocation(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.location = str;
    }

    public final void setOrganic(boolean z) {
        this.isOrganic = z;
    }

    public final void setRecycled(boolean z) {
        this.isRecycled = z;
    }

    public final void setVintage(boolean z) {
        this.isVintage = z;
    }
}
