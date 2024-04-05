package com.etsy.android.lib.models.apiv3.pastpurchase;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class Module {
    public static final int $stable = 8;
    private final String headerTitle;
    private final ModuleLandingPage landingPage;
    private final List<ModuleListingCard> listings;

    public Module(@C17402n(name = "header_title") String str, @C17402n(name = "landing_page") ModuleLandingPage moduleLandingPage, @C17402n(name = "formattedListingCard") List<ModuleListingCard> list) {
        C19383o.m32797g(str, "headerTitle");
        C19383o.m32797g(moduleLandingPage, "landingPage");
        C19383o.m32797g(list, "listings");
        this.headerTitle = str;
        this.landingPage = moduleLandingPage;
        this.listings = list;
    }

    public static /* synthetic */ Module copy$default(Module module, String str, ModuleLandingPage moduleLandingPage, List<ModuleListingCard> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = module.headerTitle;
        }
        if ((i & 2) != 0) {
            moduleLandingPage = module.landingPage;
        }
        if ((i & 4) != 0) {
            list = module.listings;
        }
        return module.copy(str, moduleLandingPage, list);
    }

    public final String component1() {
        return this.headerTitle;
    }

    public final ModuleLandingPage component2() {
        return this.landingPage;
    }

    public final List<ModuleListingCard> component3() {
        return this.listings;
    }

    public final Module copy(@C17402n(name = "header_title") String str, @C17402n(name = "landing_page") ModuleLandingPage moduleLandingPage, @C17402n(name = "formattedListingCard") List<ModuleListingCard> list) {
        C19383o.m32797g(str, "headerTitle");
        C19383o.m32797g(moduleLandingPage, "landingPage");
        C19383o.m32797g(list, "listings");
        return new Module(str, moduleLandingPage, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Module)) {
            return false;
        }
        Module module = (Module) obj;
        return C19383o.m32792b(this.headerTitle, module.headerTitle) && C19383o.m32792b(this.landingPage, module.landingPage) && C19383o.m32792b(this.listings, module.listings);
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final ModuleLandingPage getLandingPage() {
        return this.landingPage;
    }

    public final List<ModuleListingCard> getListings() {
        return this.listings;
    }

    public int hashCode() {
        int hashCode = this.landingPage.hashCode();
        return this.listings.hashCode() + ((hashCode + (this.headerTitle.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Module(headerTitle=");
        h.append(this.headerTitle);
        h.append(", landingPage=");
        h.append(this.landingPage);
        h.append(", listings=");
        return C0070b.m186i(h, this.listings, ')');
    }
}
