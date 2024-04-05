package com.etsy.android.lib.models.apiv3;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.MoshiModelFactory;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19446a;
import p568fn.C17782b;

public final class ListReminder extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String LIST_CARD_ITEM_TYPE = "listCard";
    /* access modifiers changed from: private */
    public static final ListingImage fakeImage;
    private int count = -1;
    private DeepLink deepLink;

    /* renamed from: id */
    private long f19139id = -1;
    public List<? extends ListingCard> listings;
    public String name;
    private Collection.PrivacyLevel privacyLevel = Collection.PrivacyLevel.PUBLIC;
    public String slug;
    /* access modifiers changed from: private */
    public int type = R.id.view_type_list_reminder_card;
    private long userId;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ListReminder fake() {
            ListReminder listReminder = new ListReminder();
            listReminder.type = R.id.view_type_sdl_fixture;
            listReminder.setName("ListReminderTestName");
            listReminder.setId(777);
            listReminder.setCount(666);
            ListingCard listingCard = new ListingCard();
            listingCard.listingImages = C17782b.m29866f0(ListReminder.fakeImage, ListReminder.fakeImage, ListReminder.fakeImage, ListReminder.fakeImage);
            listReminder.setListings(C17782b.m29864d0(listingCard));
            listReminder.setDeepLink(DeepLink.Companion.fake());
            return listReminder;
        }
    }

    static {
        byte[] bytes = "{\n              \"image_id\": 1450154361,\n              \"owner_id\": 13846987,\n              \"url\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_fullxfull.1450154361_179j.jpg\",\n              \"url_75x75\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/d\\/il\\/43de1d\\/1450154361\\/il_75x75.1450154361_179j.jpg?version=0\",\n              \"url_170x135\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/d\\/il\\/43de1d\\/1450154361\\/il_170x135.1450154361_179j.jpg?version=0\",\n              \"url_224xN\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_224xN.1450154361_179j.jpg\",\n              \"url_300x300\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_300x300.1450154361_179j.jpg\",\n              \"url_340x270\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/d\\/il\\/43de1d\\/1450154361\\/il_340x270.1450154361_179j.jpg?version=0\",\n              \"url_680x540\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/d\\/il\\/43de1d\\/1450154361\\/il_680x540.1450154361_179j.jpg?version=0\",\n              \"url_570xN\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_570xN.1450154361_179j.jpg\",\n              \"url_642xN\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_642xN.1450154361_179j.jpg\",\n              \"url_794xN\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_794xN.1450154361_179j.jpg\",\n              \"url_1588xN\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_1588xN.1450154361_179j.jpg\",\n              \"url_600x600\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_600x600.1450154361_179j.jpg\",\n              \"url_1140xN\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_1140xN.1450154361_179j.jpg\",\n              \"url_1000x1000\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_1000x1000.1450154361_179j.jpg\",\n              \"url_500x500\": \"https:\\/\\/i.etsystatic.com\\/13846987\\/r\\/il\\/43de1d\\/1450154361\\/il_500x500.1450154361_179j.jpg\",\n              \"color\": \"938172\",\n              \"blur_hash\": null,\n              \"hue\": 27,\n              \"saturation\": 22,\n              \"height\": 2250,\n              \"width\": 3000,\n              \"volume\": 201,\n              \"version\": 0,\n              \"extra_data\": \"179j\",\n              \"extension\": \"\"\n            }".getBytes(C19446a.f43373b);
        C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
        fakeImage = (ListingImage) MoshiModelFactory.createFromByteArray(bytes, ListingImage.class);
    }

    public static final ListReminder fake() {
        return Companion.fake();
    }

    public final int getCount() {
        return this.count;
    }

    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    public final long getId() {
        return this.f19139id;
    }

    public final List<ListingCard> getListings() {
        List<? extends ListingCard> list = this.listings;
        if (list != null) {
            return list;
        }
        C19383o.m32805o("listings");
        throw null;
    }

    public final String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("name");
        throw null;
    }

    public final Collection.PrivacyLevel getPrivacyLevel() {
        return this.privacyLevel;
    }

    public final String getSlug() {
        String str = this.slug;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("slug");
        throw null;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int getViewType() {
        return this.type;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ae, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b0, code lost:
        return false;
     */
    @android.annotation.SuppressLint({"HtmlEscapedStringParsingIssue"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean parseField(com.fasterxml.jackson.core.JsonParser r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "jp"
            java.lang.String r1 = "fieldName"
            int r0 = android.support.p013v4.media.C0072d.m197c(r3, r0, r4, r1)
            switch(r0) {
                case -1980522643: goto L_0x0099;
                case -1885840902: goto L_0x0089;
                case -821242276: goto L_0x0079;
                case -147132913: goto L_0x0069;
                case 3373707: goto L_0x0056;
                case 3533483: goto L_0x003f;
                case 1038182732: goto L_0x0028;
                case 1965579277: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x00b0
        L_0x000d:
            java.lang.String r0 = "privacy_level"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0017
            goto L_0x00b0
        L_0x0017:
            java.lang.String r3 = r3.getValueAsString()
            com.etsy.android.lib.models.apiv3.Collection$PrivacyLevel r3 = com.etsy.android.lib.models.apiv3.Collection.PrivacyLevel.fromSlug(r3)
            java.lang.String r4 = "fromSlug(jp.valueAsString)"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)
            r2.privacyLevel = r3
            goto L_0x00ae
        L_0x0028:
            java.lang.String r0 = "display_listings"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0032
            goto L_0x00b0
        L_0x0032:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.Class<com.etsy.android.lib.models.apiv3.ListingCard> r0 = com.etsy.android.lib.models.apiv3.ListingCard.class
            java.util.List r3 = r4.parseArray(r3, r0)
            r2.setListings(r3)
            goto L_0x00ae
        L_0x003f:
            java.lang.String r0 = "slug"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0049
            goto L_0x00b0
        L_0x0049:
            java.lang.String r3 = r3.getValueAsString()
            java.lang.String r4 = "jp.valueAsString"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)
            r2.setSlug(r3)
            goto L_0x00ae
        L_0x0056:
            java.lang.String r0 = "name"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x005f
            goto L_0x00b0
        L_0x005f:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r3 = r4.parseString(r3)
            r2.setName(r3)
            goto L_0x00ae
        L_0x0069:
            java.lang.String r0 = "user_id"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0072
            goto L_0x00b0
        L_0x0072:
            long r3 = r3.getLongValue()
            r2.userId = r3
            goto L_0x00ae
        L_0x0079:
            java.lang.String r0 = "collection_id"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0082
            goto L_0x00b0
        L_0x0082:
            long r3 = r3.getValueAsLong()
            r2.f19139id = r3
            goto L_0x00ae
        L_0x0089:
            java.lang.String r0 = "total_count_listings"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0092
            goto L_0x00b0
        L_0x0092:
            int r3 = r3.getIntValue()
            r2.count = r3
            goto L_0x00ae
        L_0x0099:
            java.lang.String r0 = "deep_link"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x00a2
            goto L_0x00b0
        L_0x00a2:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.Class<com.etsy.android.lib.models.apiv3.DeepLink> r0 = com.etsy.android.lib.models.apiv3.DeepLink.class
            java.lang.Object r3 = r4.parseObject(r3, r0)
            com.etsy.android.lib.models.apiv3.DeepLink r3 = (com.etsy.android.lib.models.apiv3.DeepLink) r3
            r2.deepLink = r3
        L_0x00ae:
            r3 = 1
            goto L_0x00b1
        L_0x00b0:
            r3 = 0
        L_0x00b1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.ListReminder.parseField(com.fasterxml.jackson.core.JsonParser, java.lang.String):boolean");
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setDeepLink(DeepLink deepLink2) {
        this.deepLink = deepLink2;
    }

    public final void setId(long j) {
        this.f19139id = j;
    }

    public final void setListings(List<? extends ListingCard> list) {
        C19383o.m32797g(list, "<set-?>");
        this.listings = list;
    }

    public final void setName(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.name = str;
    }

    public final void setPrivacyLevel(Collection.PrivacyLevel privacyLevel2) {
        C19383o.m32797g(privacyLevel2, "<set-?>");
        this.privacyLevel = privacyLevel2;
    }

    public final void setSlug(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.slug = str;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }
}
