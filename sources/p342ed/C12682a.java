package p342ed;

import com.etsy.android.lib.models.apiv3.NewTranslatedReview;
import com.etsy.android.lib.models.apiv3.TranslatedFaq;
import com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields;
import java.util.List;
import p248tp.C8071s;
import p771sr.C20183f;
import p771sr.C20196s;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: ed.a */
public interface C12682a {
    @C20183f("/etsyapps/v3/public/translations/shops/{shop_id}/reviews/{review_id}")
    /* renamed from: a */
    C8071s<C20145v<NewTranslatedReview>> mo45455a(@C20196s("shop_id") long j, @C20196s("review_id") long j2, @C20197t("language") String str);

    @C20183f("/etsyapps/v3/public/translations/shops/{shop_id}/faqs")
    /* renamed from: b */
    C8071s<C20145v<List<TranslatedFaq>>> mo45456b(@C20196s("shop_id") long j, @C20197t("language") String str);

    @C20183f("/etsyapps/v3/public/translations/listings/{listing_id}")
    /* renamed from: c */
    C8071s<C20145v<ListingMachineTranslationTranslatedFields>> mo45457c(@C20196s("listing_id") long j, @C20197t("language") String str);
}
