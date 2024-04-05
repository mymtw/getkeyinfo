package p342ed;

import com.etsy.android.lib.models.apiv3.NewTranslatedReview;
import com.etsy.android.lib.models.apiv3.TranslatedFaq;
import com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: ed.b */
public final class C12683b {

    /* renamed from: a */
    public final C12682a f27962a;

    /* renamed from: ed.b$a */
    public static abstract class C12684a {

        /* renamed from: ed.b$a$a */
        public static final class C12685a extends C12684a {
        }

        /* renamed from: ed.b$a$b */
        public static final class C12686b extends C12684a {

            /* renamed from: a */
            public final ListingMachineTranslationTranslatedFields f27963a;

            public C12686b(ListingMachineTranslationTranslatedFields listingMachineTranslationTranslatedFields) {
                this.f27963a = listingMachineTranslationTranslatedFields;
            }
        }
    }

    /* renamed from: ed.b$b */
    public static abstract class C12687b {

        /* renamed from: ed.b$b$a */
        public static final class C12688a extends C12687b {
        }

        /* renamed from: ed.b$b$b */
        public static final class C12689b extends C12687b {

            /* renamed from: a */
            public final NewTranslatedReview f27964a;

            public C12689b(NewTranslatedReview newTranslatedReview) {
                this.f27964a = newTranslatedReview;
            }
        }
    }

    /* renamed from: ed.b$c */
    public static abstract class C12690c {

        /* renamed from: ed.b$c$a */
        public static final class C12691a extends C12690c {
        }

        /* renamed from: ed.b$c$b */
        public static final class C12692b extends C12690c {

            /* renamed from: a */
            public final List<TranslatedFaq> f27965a;

            public C12692b(List<TranslatedFaq> list) {
                this.f27965a = list;
            }
        }
    }

    public C12683b(C12682a aVar) {
        C19383o.m32797g(aVar, "machineTranslationEndpoint");
        this.f27962a = aVar;
    }
}
