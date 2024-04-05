package com.etsy.android.lib.models.apiv3.vespa;

import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

public final class SizeableTextSize {
    public static final int $stable = 8;
    public String value;

    public final int getTextSize() {
        String value2 = getValue();
        switch (value2.hashCode()) {
            case -1773363065:
                return !value2.equals(ResponseConstants.TITLE_TINY) ? R.dimen.sk_text_body : R.dimen.sk_text_title_smallest;
            case -813351425:
                boolean equals = value2.equals(ResponseConstants.BODY_REGULAR);
                return R.dimen.sk_text_body;
            case -128910064:
                return !value2.equals(ResponseConstants.HEADLINE_LARGE) ? R.dimen.sk_text_body : R.dimen.sizeable_text_size_headline_large;
            case -122104100:
                return !value2.equals(ResponseConstants.HEADLINE_SMALL) ? R.dimen.sk_text_body : R.dimen.sk_text_headline_smaller;
            case 181212766:
                return !value2.equals(ResponseConstants.BODY_LARGER) ? R.dimen.sk_text_body : R.dimen.sizeable_text_size_body_large;
            case 188018730:
                return !value2.equals(ResponseConstants.BODY_SMALL) ? R.dimen.sk_text_body : R.dimen.sk_text_body_smaller;
            case 237637813:
                return !value2.equals(ResponseConstants.TITLE_REGULAR) ? R.dimen.sk_text_body : R.dimen.sk_text_title;
            case 852696724:
                return !value2.equals(ResponseConstants.TITLE_LARGE) ? R.dimen.sk_text_body : R.dimen.sk_text_title_larger;
            case 859502688:
                return !value2.equals(ResponseConstants.TITLE_SMALL) ? R.dimen.sk_text_body : R.dimen.sk_text_title_smaller;
            case 1253017469:
                return !value2.equals(ResponseConstants.BODY_TINY) ? R.dimen.sk_text_body : R.dimen.sizeable_text_size_body_tiny;
            case 1520108171:
                return !value2.equals(ResponseConstants.HEADLINE_TINY) ? R.dimen.sk_text_body : R.dimen.sizeable_text_size_headline_tiny;
            case 1806319665:
                return !value2.equals(ResponseConstants.HEADLINE_REGULAR) ? R.dimen.sk_text_body : R.dimen.sk_text_headline;
            case 2088899934:
                return !value2.equals(ResponseConstants.HEADING_01) ? R.dimen.sk_text_body : R.dimen.sizeable_text_size_heading_01;
            case 2088899935:
                return !value2.equals(ResponseConstants.HEADING_02) ? R.dimen.sk_text_body : R.dimen.sizeable_text_size_heading_02;
            default:
                return R.dimen.sk_text_body;
        }
    }

    public final String getValue() {
        String str = this.value;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("value");
        throw null;
    }

    public final void setValue(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.value = str;
    }
}
