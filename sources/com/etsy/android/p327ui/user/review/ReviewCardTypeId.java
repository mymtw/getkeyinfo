package com.etsy.android.p327ui.user.review;

/* renamed from: com.etsy.android.ui.user.review.ReviewCardTypeId */
public enum ReviewCardTypeId {
    OVERALL_RATING(6),
    SUBRATINGS(8),
    SUBRATINGS_WITH_EXIT_PROMPT(88),
    PHOTO_UPLOAD(13),
    PHOTO_UPLOAD_LOW_RATING(12),
    PHOTO_UPLOAD_WITH_ICONS(100);
    
    public static final C11698a Companion = null;

    /* renamed from: id */
    private final int f25979id;

    /* renamed from: com.etsy.android.ui.user.review.ReviewCardTypeId$a */
    public static final class C11698a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C11698a();
    }

    private ReviewCardTypeId(int i) {
        this.f25979id = i;
    }

    public final int getId() {
        return this.f25979id;
    }
}
