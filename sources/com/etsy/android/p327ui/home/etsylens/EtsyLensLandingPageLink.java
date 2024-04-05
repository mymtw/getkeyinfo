package com.etsy.android.p327ui.home.etsylens;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.homescreen.LandingPageInfo;
import com.etsy.android.p327ui.EtsyWebFragment;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.etsylens.EtsyLensLandingPageLink */
public final class EtsyLensLandingPageLink implements LandingPageInfo {
    public static final int $stable = 8;
    private final String apiPath = "/etsyapps/v3/bespoke/member/visual-lens/landing-page";
    private final String deepLink;
    private final File image;
    private final boolean isPaginateForNext;
    private int layout = 2;
    private final Map<String, String> options = C19294b0.m32559p0();
    private final String pageType = "etsy_lens";
    private final HashMap<String, String> params = new HashMap<>();
    private int requestMethod = 1;
    private final String title;

    public EtsyLensLandingPageLink(String str, File file) {
        C19383o.m32797g(str, "title");
        C19383o.m32797g(file, ResponseConstants.IMAGE);
        this.title = str;
        this.image = file;
    }

    public String getApiPath() {
        return this.apiPath;
    }

    public Pair<String, File> getAttachment() {
        return new Pair<>(ResponseConstants.IMAGE, this.image);
    }

    public Map<String, String> getBodyParams() {
        return C19294b0.m32562s0(new Pair("spec", "VisualLens"), new Pair(EtsyWebFragment.PARAM_REF, "visual-lens"), new Pair("limit", "48"), new Pair("offset", "0"));
    }

    public boolean getBooleanOption(String str) {
        return false;
    }

    public String getDeepLink() {
        return this.deepLink;
    }

    public String getEventName() {
        return "image_search_results";
    }

    public final File getImage() {
        return this.image;
    }

    public int getLayout() {
        return this.layout;
    }

    public String getLinkTitle() {
        return this.title;
    }

    public Map<String, String> getOptions() {
        return this.options;
    }

    public String getPageTitle() {
        return this.title;
    }

    public String getPageType() {
        return this.pageType;
    }

    public HashMap<String, String> getParams() {
        return this.params;
    }

    public int getRequestMethod() {
        return this.requestMethod;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean isPaginateForNext() {
        return this.isPaginateForNext;
    }

    public void setLayout(int i) {
        this.layout = i;
    }

    public void setRequestMethod(int i) {
        this.requestMethod = i;
    }
}
