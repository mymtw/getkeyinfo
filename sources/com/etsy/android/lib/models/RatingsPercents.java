package com.etsy.android.lib.models;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RatingsPercents extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final transient String FIVE = "five";
    public static final transient String FOUR = "four";
    public static final transient String ONE = "one";
    public static final transient String THREE = "three";
    public static final transient String TWO = "two";
    private int fiveStars;
    private int fourStars;
    private int oneStars;
    private int threeStars;
    private int twoStars;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getFiveStars() {
        return this.fiveStars;
    }

    public final int getFourStars() {
        return this.fourStars;
    }

    public final int getOneStars() {
        return this.oneStars;
    }

    public final int getThreeStars() {
        return this.threeStars;
    }

    public final int getTwoStars() {
        return this.twoStars;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case 110182:
                if (str.equals(ONE)) {
                    this.oneStars = jsonParser.getIntValue();
                    return true;
                }
                break;
            case 115276:
                if (str.equals(TWO)) {
                    this.twoStars = jsonParser.getIntValue();
                    return true;
                }
                break;
            case 3143346:
                if (str.equals(FIVE)) {
                    this.fiveStars = jsonParser.getIntValue();
                    return true;
                }
                break;
            case 3149094:
                if (str.equals(FOUR)) {
                    this.fourStars = jsonParser.getIntValue();
                    return true;
                }
                break;
            case 110339486:
                if (str.equals(THREE)) {
                    this.threeStars = jsonParser.getIntValue();
                    return true;
                }
                break;
        }
        return false;
    }

    public final void setFiveStars(int i) {
        this.fiveStars = i;
    }

    public final void setFourStars(int i) {
        this.fourStars = i;
    }

    public final void setOneStars(int i) {
        this.oneStars = i;
    }

    public final void setThreeStars(int i) {
        this.threeStars = i;
    }

    public final void setTwoStars(int i) {
        this.twoStars = i;
    }
}
