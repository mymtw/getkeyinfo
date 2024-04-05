package p145io.branch.indexing;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p145io.branch.referral.Branch;
import p145io.branch.referral.C7032d;
import p145io.branch.referral.C7033d0;
import p145io.branch.referral.C7041h;
import p145io.branch.referral.C7043i;
import p145io.branch.referral.C7077r;
import p145io.branch.referral.C7079s;
import p145io.branch.referral.Defines$Jsonkey;
import p145io.branch.referral.Defines$RequestPath;
import p145io.branch.referral.ServerRequest;
import p145io.branch.referral.util.BRANCH_STANDARD_EVENT;
import p145io.branch.referral.util.ContentMetadata;
import p145io.branch.referral.util.CurrencyType;
import p145io.branch.referral.util.LinkProperties;
import p227rp.C7785a;
import p227rp.C7787b;
import p623mm.C18251e;
import p660qp.C18471a;
import p660qp.C18472b;
import p660qp.C18473c;

/* renamed from: io.branch.indexing.BranchUniversalObject */
public class BranchUniversalObject implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C17878a();
    private String canonicalIdentifier_;
    private String canonicalUrl_;
    private long creationTimeStamp_;
    private String description_;
    private long expirationInMilliSec_;
    private String imageUrl_;
    private CONTENT_INDEX_MODE indexMode_;
    private final ArrayList<String> keywords_;
    private CONTENT_INDEX_MODE localIndexMode_;
    private ContentMetadata metadata_;
    private String title_;

    /* renamed from: io.branch.indexing.BranchUniversalObject$CONTENT_INDEX_MODE */
    public enum CONTENT_INDEX_MODE {
        PUBLIC,
        PRIVATE
    }

    /* renamed from: io.branch.indexing.BranchUniversalObject$a */
    public class C17878a implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new BranchUniversalObject(parcel, (C17878a) null);
        }

        public final Object[] newArray(int i) {
            return new BranchUniversalObject[i];
        }
    }

    /* renamed from: io.branch.indexing.BranchUniversalObject$b */
    public class C17879b implements Branch.C7013c {

        /* renamed from: a */
        public final Branch.C7013c f38834a;

        public C17879b(Branch.C7013c cVar, C7041h hVar, LinkProperties linkProperties) {
            this.f38834a = cVar;
        }

        /* renamed from: a */
        public final void mo19208a(String str, String str2, C7032d dVar) {
            HashMap hashMap = new HashMap();
            if (dVar == null) {
                hashMap.put(Defines$Jsonkey.SharedLink.getKey(), str);
            } else {
                hashMap.put(Defines$Jsonkey.ShareError.getKey(), dVar.f15642a);
            }
            BranchUniversalObject.this.userCompletedAction(BRANCH_STANDARD_EVENT.SHARE.getName(), (HashMap<String, String>) hashMap);
            Branch.C7013c cVar = this.f38834a;
            if (cVar != null) {
                cVar.mo19208a(str, str2, dVar);
            }
        }
    }

    /* renamed from: io.branch.indexing.BranchUniversalObject$c */
    public interface C17880c {
        /* renamed from: a */
        void mo69292a();
    }

    public /* synthetic */ BranchUniversalObject(Parcel parcel, C17878a aVar) {
        this(parcel);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: io.branch.indexing.BranchUniversalObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: io.branch.indexing.BranchUniversalObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: org.json.JSONArray} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p145io.branch.indexing.BranchUniversalObject createInstance(org.json.JSONObject r6) {
        /*
            r0 = 0
            io.branch.indexing.BranchUniversalObject r1 = new io.branch.indexing.BranchUniversalObject     // Catch:{ Exception -> 0x011e }
            r1.<init>()     // Catch:{ Exception -> 0x011e }
            io.branch.referral.n$a r2 = new io.branch.referral.n$a     // Catch:{ Exception -> 0x011d }
            r2.<init>(r6)     // Catch:{ Exception -> 0x011d }
            io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.ContentTitle     // Catch:{ Exception -> 0x011d }
            java.lang.String r6 = r6.getKey()     // Catch:{ Exception -> 0x011d }
            java.lang.String r6 = r2.mo19293b(r6)     // Catch:{ Exception -> 0x011d }
            r1.title_ = r6     // Catch:{ Exception -> 0x011d }
            io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.CanonicalIdentifier     // Catch:{ Exception -> 0x011d }
            java.lang.String r6 = r6.getKey()     // Catch:{ Exception -> 0x011d }
            java.lang.String r6 = r2.mo19293b(r6)     // Catch:{ Exception -> 0x011d }
            r1.canonicalIdentifier_ = r6     // Catch:{ Exception -> 0x011d }
            io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.CanonicalUrl     // Catch:{ Exception -> 0x011d }
            java.lang.String r6 = r6.getKey()     // Catch:{ Exception -> 0x011d }
            java.lang.String r6 = r2.mo19293b(r6)     // Catch:{ Exception -> 0x011d }
            r1.canonicalUrl_ = r6     // Catch:{ Exception -> 0x011d }
            io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.ContentDesc     // Catch:{ Exception -> 0x011d }
            java.lang.String r6 = r6.getKey()     // Catch:{ Exception -> 0x011d }
            java.lang.String r6 = r2.mo19293b(r6)     // Catch:{ Exception -> 0x011d }
            r1.description_ = r6     // Catch:{ Exception -> 0x011d }
            io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.ContentImgUrl     // Catch:{ Exception -> 0x011d }
            java.lang.String r6 = r6.getKey()     // Catch:{ Exception -> 0x011d }
            java.lang.String r6 = r2.mo19293b(r6)     // Catch:{ Exception -> 0x011d }
            r1.imageUrl_ = r6     // Catch:{ Exception -> 0x011d }
            io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.ContentExpiryTime     // Catch:{ Exception -> 0x011d }
            java.lang.String r6 = r6.getKey()     // Catch:{ Exception -> 0x011d }
            org.json.JSONObject r3 = r2.f15711a     // Catch:{ Exception -> 0x011d }
            long r3 = r3.optLong(r6)     // Catch:{ Exception -> 0x011d }
            org.json.JSONObject r5 = r2.f15711a     // Catch:{ Exception -> 0x011d }
            r5.remove(r6)     // Catch:{ Exception -> 0x011d }
            r1.expirationInMilliSec_ = r3     // Catch:{ Exception -> 0x011d }
            io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.ContentKeyWords     // Catch:{ Exception -> 0x011d }
            java.lang.String r6 = r6.getKey()     // Catch:{ Exception -> 0x011d }
            org.json.JSONObject r3 = r2.f15711a     // Catch:{ Exception -> 0x011d }
            java.lang.Object r3 = r3.opt(r6)     // Catch:{ Exception -> 0x011d }
            org.json.JSONObject r4 = r2.f15711a     // Catch:{ Exception -> 0x011d }
            r4.remove(r6)     // Catch:{ Exception -> 0x011d }
            boolean r6 = r3 instanceof org.json.JSONArray     // Catch:{ Exception -> 0x011d }
            if (r6 == 0) goto L_0x0073
            r0 = r3
            org.json.JSONArray r0 = (org.json.JSONArray) r0     // Catch:{ Exception -> 0x011d }
            goto L_0x007e
        L_0x0073:
            boolean r6 = r3 instanceof java.lang.String     // Catch:{ Exception -> 0x011d }
            if (r6 == 0) goto L_0x007e
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x011d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x011d }
            r0.<init>(r3)     // Catch:{ Exception -> 0x011d }
        L_0x007e:
            if (r0 == 0) goto L_0x0095
            r6 = 0
        L_0x0081:
            int r3 = r0.length()     // Catch:{ Exception -> 0x011d }
            if (r6 >= r3) goto L_0x0095
            java.util.ArrayList<java.lang.String> r3 = r1.keywords_     // Catch:{ Exception -> 0x011d }
            java.lang.Object r4 = r0.get(r6)     // Catch:{ Exception -> 0x011d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x011d }
            r3.add(r4)     // Catch:{ Exception -> 0x011d }
            int r6 = r6 + 1
            goto L_0x0081
        L_0x0095:
            io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.PublicallyIndexable     // Catch:{ Exception -> 0x011d }
            java.lang.String r6 = r6.getKey()     // Catch:{ Exception -> 0x011d }
            org.json.JSONObject r0 = r2.f15711a     // Catch:{ Exception -> 0x011d }
            java.lang.Object r0 = r0.opt(r6)     // Catch:{ Exception -> 0x011d }
            org.json.JSONObject r3 = r2.f15711a     // Catch:{ Exception -> 0x011d }
            r3.remove(r6)     // Catch:{ Exception -> 0x011d }
            boolean r6 = r0 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x011d }
            if (r6 == 0) goto L_0x00ba
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x011d }
            boolean r6 = r0.booleanValue()     // Catch:{ Exception -> 0x011d }
            if (r6 == 0) goto L_0x00b5
            io.branch.indexing.BranchUniversalObject$CONTENT_INDEX_MODE r6 = p145io.branch.indexing.BranchUniversalObject.CONTENT_INDEX_MODE.PUBLIC     // Catch:{ Exception -> 0x011d }
            goto L_0x00b7
        L_0x00b5:
            io.branch.indexing.BranchUniversalObject$CONTENT_INDEX_MODE r6 = p145io.branch.indexing.BranchUniversalObject.CONTENT_INDEX_MODE.PRIVATE     // Catch:{ Exception -> 0x011d }
        L_0x00b7:
            r1.indexMode_ = r6     // Catch:{ Exception -> 0x011d }
            goto L_0x00ce
        L_0x00ba:
            boolean r6 = r0 instanceof java.lang.Integer     // Catch:{ Exception -> 0x011d }
            if (r6 == 0) goto L_0x00ce
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x011d }
            int r6 = r0.intValue()     // Catch:{ Exception -> 0x011d }
            r0 = 1
            if (r6 != r0) goto L_0x00ca
            io.branch.indexing.BranchUniversalObject$CONTENT_INDEX_MODE r6 = p145io.branch.indexing.BranchUniversalObject.CONTENT_INDEX_MODE.PUBLIC     // Catch:{ Exception -> 0x011d }
            goto L_0x00cc
        L_0x00ca:
            io.branch.indexing.BranchUniversalObject$CONTENT_INDEX_MODE r6 = p145io.branch.indexing.BranchUniversalObject.CONTENT_INDEX_MODE.PRIVATE     // Catch:{ Exception -> 0x011d }
        L_0x00cc:
            r1.indexMode_ = r6     // Catch:{ Exception -> 0x011d }
        L_0x00ce:
            io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.LocallyIndexable     // Catch:{ Exception -> 0x011d }
            java.lang.String r6 = r6.getKey()     // Catch:{ Exception -> 0x011d }
            org.json.JSONObject r0 = r2.f15711a     // Catch:{ Exception -> 0x011d }
            boolean r0 = r0.optBoolean(r6)     // Catch:{ Exception -> 0x011d }
            org.json.JSONObject r3 = r2.f15711a     // Catch:{ Exception -> 0x011d }
            r3.remove(r6)     // Catch:{ Exception -> 0x011d }
            if (r0 == 0) goto L_0x00e4
            io.branch.indexing.BranchUniversalObject$CONTENT_INDEX_MODE r6 = p145io.branch.indexing.BranchUniversalObject.CONTENT_INDEX_MODE.PUBLIC     // Catch:{ Exception -> 0x011d }
            goto L_0x00e6
        L_0x00e4:
            io.branch.indexing.BranchUniversalObject$CONTENT_INDEX_MODE r6 = p145io.branch.indexing.BranchUniversalObject.CONTENT_INDEX_MODE.PRIVATE     // Catch:{ Exception -> 0x011d }
        L_0x00e6:
            r1.localIndexMode_ = r6     // Catch:{ Exception -> 0x011d }
            io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.CreationTimestamp     // Catch:{ Exception -> 0x011d }
            java.lang.String r6 = r6.getKey()     // Catch:{ Exception -> 0x011d }
            org.json.JSONObject r0 = r2.f15711a     // Catch:{ Exception -> 0x011d }
            long r3 = r0.optLong(r6)     // Catch:{ Exception -> 0x011d }
            org.json.JSONObject r0 = r2.f15711a     // Catch:{ Exception -> 0x011d }
            r0.remove(r6)     // Catch:{ Exception -> 0x011d }
            r1.creationTimeStamp_ = r3     // Catch:{ Exception -> 0x011d }
            io.branch.referral.util.ContentMetadata r6 = p145io.branch.referral.util.ContentMetadata.createFromJson(r2)     // Catch:{ Exception -> 0x011d }
            r1.metadata_ = r6     // Catch:{ Exception -> 0x011d }
            org.json.JSONObject r6 = r2.f15711a     // Catch:{ Exception -> 0x011d }
            java.util.Iterator r0 = r6.keys()     // Catch:{ Exception -> 0x011d }
        L_0x0107:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x011d }
            if (r2 == 0) goto L_0x011f
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x011d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x011d }
            io.branch.referral.util.ContentMetadata r3 = r1.metadata_     // Catch:{ Exception -> 0x011d }
            java.lang.String r4 = r6.optString(r2)     // Catch:{ Exception -> 0x011d }
            r3.addCustomMetadata(r2, r4)     // Catch:{ Exception -> 0x011d }
            goto L_0x0107
        L_0x011d:
            r0 = r1
        L_0x011e:
            r1 = r0
        L_0x011f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.indexing.BranchUniversalObject.createInstance(org.json.JSONObject):io.branch.indexing.BranchUniversalObject");
    }

    private C7043i getLinkBuilder(Context context, LinkProperties linkProperties) {
        return getLinkBuilder(new C7043i(context), linkProperties);
    }

    public static BranchUniversalObject getReferredBranchUniversalObject() {
        Branch j = Branch.m13575j();
        if (j == null) {
            return null;
        }
        try {
            j.mo19197k();
            if (!j.mo19197k().has("+clicked_branch_link") || !j.mo19197k().getBoolean("+clicked_branch_link")) {
                return null;
            }
            return createInstance(j.mo19197k());
        } catch (Exception unused) {
            return null;
        }
    }

    public BranchUniversalObject addContentMetadata(HashMap<String, String> hashMap) {
        if (hashMap != null) {
            for (String next : hashMap.keySet()) {
                this.metadata_.addCustomMetadata(next, hashMap.get(next));
            }
        }
        return this;
    }

    public BranchUniversalObject addKeyWord(String str) {
        this.keywords_.add(str);
        return this;
    }

    public BranchUniversalObject addKeyWords(ArrayList<String> arrayList) {
        this.keywords_.addAll(arrayList);
        return this;
    }

    public JSONObject convertToJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject convertToJson = this.metadata_.convertToJson();
            Iterator<String> keys = convertToJson.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, convertToJson.get(next));
            }
            if (!TextUtils.isEmpty(this.title_)) {
                jSONObject.put(Defines$Jsonkey.ContentTitle.getKey(), this.title_);
            }
            if (!TextUtils.isEmpty(this.canonicalIdentifier_)) {
                jSONObject.put(Defines$Jsonkey.CanonicalIdentifier.getKey(), this.canonicalIdentifier_);
            }
            if (!TextUtils.isEmpty(this.canonicalUrl_)) {
                jSONObject.put(Defines$Jsonkey.CanonicalUrl.getKey(), this.canonicalUrl_);
            }
            if (this.keywords_.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = this.keywords_.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put(Defines$Jsonkey.ContentKeyWords.getKey(), jSONArray);
            }
            if (!TextUtils.isEmpty(this.description_)) {
                jSONObject.put(Defines$Jsonkey.ContentDesc.getKey(), this.description_);
            }
            if (!TextUtils.isEmpty(this.imageUrl_)) {
                jSONObject.put(Defines$Jsonkey.ContentImgUrl.getKey(), this.imageUrl_);
            }
            if (this.expirationInMilliSec_ > 0) {
                jSONObject.put(Defines$Jsonkey.ContentExpiryTime.getKey(), this.expirationInMilliSec_);
            }
            jSONObject.put(Defines$Jsonkey.PublicallyIndexable.getKey(), isPublicallyIndexable());
            jSONObject.put(Defines$Jsonkey.LocallyIndexable.getKey(), isLocallyIndexable());
            jSONObject.put(Defines$Jsonkey.CreationTimestamp.getKey(), this.creationTimeStamp_);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public void generateShortUrl(Context context, LinkProperties linkProperties, Branch.C7012b bVar) {
        if (!C7077r.m13677h(context).mo19316e("bnc_tracking_state") || bVar == null) {
            getLinkBuilder(context, linkProperties).mo19281b(bVar);
            return;
        }
        ((C7033d0) bVar).mo19276a(getLinkBuilder(context, linkProperties).mo19282c(), (C7032d) null);
    }

    public String getCanonicalIdentifier() {
        return this.canonicalIdentifier_;
    }

    public String getCanonicalUrl() {
        return this.canonicalUrl_;
    }

    public ContentMetadata getContentMetadata() {
        return this.metadata_;
    }

    public String getCurrencyType() {
        return null;
    }

    public String getDescription() {
        return this.description_;
    }

    public long getExpirationTime() {
        return this.expirationInMilliSec_;
    }

    public String getImageUrl() {
        return this.imageUrl_;
    }

    public ArrayList<String> getKeywords() {
        return this.keywords_;
    }

    public JSONArray getKeywordsJsonArray() {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.keywords_.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    public HashMap<String, String> getMetadata() {
        return this.metadata_.getCustomMetadata();
    }

    public double getPrice() {
        return ShadowDrawableWrapper.COS_45;
    }

    public String getShortUrl(Context context, LinkProperties linkProperties) {
        return getLinkBuilder(context, linkProperties).mo19282c();
    }

    public String getTitle() {
        return this.title_;
    }

    public String getType() {
        return null;
    }

    public boolean isLocallyIndexable() {
        return this.localIndexMode_ == CONTENT_INDEX_MODE.PUBLIC;
    }

    public boolean isPublicallyIndexable() {
        return this.indexMode_ == CONTENT_INDEX_MODE.PUBLIC;
    }

    public void listOnGoogleSearch(Context context) {
        C18251e eVar = C18473c.f40678a;
        new Thread(new C18471a(context, this, (LinkProperties) null)).start();
    }

    public void registerView() {
        registerView((C17880c) null);
    }

    public void removeFromLocalIndexing(Context context) {
        C18251e eVar = C18473c.f40678a;
        new Thread(new C18472b(context, this, (LinkProperties) null)).run();
    }

    public BranchUniversalObject setCanonicalIdentifier(String str) {
        this.canonicalIdentifier_ = str;
        return this;
    }

    public BranchUniversalObject setCanonicalUrl(String str) {
        this.canonicalUrl_ = str;
        return this;
    }

    public BranchUniversalObject setContentDescription(String str) {
        this.description_ = str;
        return this;
    }

    public BranchUniversalObject setContentExpiration(Date date) {
        this.expirationInMilliSec_ = date.getTime();
        return this;
    }

    public BranchUniversalObject setContentImageUrl(String str) {
        this.imageUrl_ = str;
        return this;
    }

    public BranchUniversalObject setContentIndexingMode(CONTENT_INDEX_MODE content_index_mode) {
        this.indexMode_ = content_index_mode;
        return this;
    }

    public BranchUniversalObject setContentMetadata(ContentMetadata contentMetadata) {
        this.metadata_ = contentMetadata;
        return this;
    }

    public BranchUniversalObject setContentType(String str) {
        return this;
    }

    public BranchUniversalObject setLocalIndexMode(CONTENT_INDEX_MODE content_index_mode) {
        this.localIndexMode_ = content_index_mode;
        return this;
    }

    public BranchUniversalObject setPrice(double d, CurrencyType currencyType) {
        return this;
    }

    public BranchUniversalObject setTitle(String str) {
        this.title_ = str;
        return this;
    }

    public void showShareSheet(Activity activity, LinkProperties linkProperties, C7787b bVar, Branch.C7013c cVar) {
        showShareSheet(activity, linkProperties, bVar, cVar, (Branch.C7019h) null);
    }

    public void userCompletedAction(String str) {
        userCompletedAction(str, (HashMap<String, String>) null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.creationTimeStamp_);
        parcel.writeString(this.canonicalIdentifier_);
        parcel.writeString(this.canonicalUrl_);
        parcel.writeString(this.title_);
        parcel.writeString(this.description_);
        parcel.writeString(this.imageUrl_);
        parcel.writeLong(this.expirationInMilliSec_);
        parcel.writeInt(this.indexMode_.ordinal());
        parcel.writeSerializable(this.keywords_);
        parcel.writeParcelable(this.metadata_, i);
        parcel.writeInt(this.localIndexMode_.ordinal());
    }

    public BranchUniversalObject() {
        this.metadata_ = new ContentMetadata();
        this.keywords_ = new ArrayList<>();
        this.canonicalIdentifier_ = "";
        this.canonicalUrl_ = "";
        this.title_ = "";
        this.description_ = "";
        CONTENT_INDEX_MODE content_index_mode = CONTENT_INDEX_MODE.PUBLIC;
        this.indexMode_ = content_index_mode;
        this.localIndexMode_ = content_index_mode;
        this.expirationInMilliSec_ = 0;
        this.creationTimeStamp_ = System.currentTimeMillis();
    }

    public String getShortUrl(Context context, LinkProperties linkProperties, boolean z) {
        C7043i linkBuilder = getLinkBuilder(context, linkProperties);
        linkBuilder.f15701j = z;
        return linkBuilder.mo19282c();
    }

    public void registerView(C17880c cVar) {
        if (Branch.m13575j() != null) {
            Branch j = Branch.m13575j();
            if (j.f15578d != null) {
                C7785a aVar = new C7785a(BRANCH_STANDARD_EVENT.VIEW_ITEM);
                Collections.addAll(aVar.f17227f, new BranchUniversalObject[]{this});
                Context context = j.f15578d;
                Defines$RequestPath defines$RequestPath = aVar.f17223b ? Defines$RequestPath.TrackStandardEvent : Defines$RequestPath.TrackCustomEvent;
                if (Branch.m13575j() != null) {
                    Branch.m13575j().mo19198l(new C7785a.C7786a(aVar, context, defines$RequestPath));
                }
            }
        } else if (cVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Register view error");
            sb.append("Branch instance is not created. Make  sure your Application class is an instance of BranchLikedApp.");
            cVar.mo69292a();
        }
    }

    public void showShareSheet(Activity activity, LinkProperties linkProperties, C7787b bVar, Branch.C7013c cVar, Branch.C7019h hVar) {
        if (Branch.m13575j() != null) {
            new C17879b(cVar, new C7041h(activity, getLinkBuilder((Context) activity, linkProperties)), linkProperties);
            throw null;
        } else if (cVar != null) {
            cVar.mo19208a((String) null, (String) null, new C7032d("Trouble sharing link. ", -109));
        } else {
            C7077r.m13675a("Sharing error. Branch instance is not created yet. Make sure you have initialised Branch.");
        }
    }

    public void userCompletedAction(BRANCH_STANDARD_EVENT branch_standard_event) {
        userCompletedAction(branch_standard_event.getName(), (HashMap<String, String>) null);
    }

    /* access modifiers changed from: private */
    public C7043i getLinkBuilder(C7043i iVar, LinkProperties linkProperties) {
        if (linkProperties.getTags() != null) {
            ArrayList<String> tags = linkProperties.getTags();
            if (iVar.f15699h == null) {
                iVar.f15699h = new ArrayList<>();
            }
            iVar.f15699h.addAll(tags);
        }
        if (linkProperties.getFeature() != null) {
            iVar.f15694c = linkProperties.getFeature();
        }
        if (linkProperties.getAlias() != null) {
            iVar.f15697f = linkProperties.getAlias();
        }
        if (linkProperties.getChannel() != null) {
            iVar.f15693b = linkProperties.getChannel();
        }
        if (linkProperties.getStage() != null) {
            iVar.f15695d = linkProperties.getStage();
        }
        if (linkProperties.getCampaign() != null) {
            iVar.f15696e = linkProperties.getCampaign();
        }
        if (linkProperties.getMatchDuration() > 0) {
            iVar.f15698g = linkProperties.getMatchDuration();
        }
        if (!TextUtils.isEmpty(this.title_)) {
            iVar.mo19291a(this.title_, Defines$Jsonkey.ContentTitle.getKey());
        }
        if (!TextUtils.isEmpty(this.canonicalIdentifier_)) {
            iVar.mo19291a(this.canonicalIdentifier_, Defines$Jsonkey.CanonicalIdentifier.getKey());
        }
        if (!TextUtils.isEmpty(this.canonicalUrl_)) {
            iVar.mo19291a(this.canonicalUrl_, Defines$Jsonkey.CanonicalUrl.getKey());
        }
        JSONArray keywordsJsonArray = getKeywordsJsonArray();
        if (keywordsJsonArray.length() > 0) {
            iVar.mo19291a(keywordsJsonArray, Defines$Jsonkey.ContentKeyWords.getKey());
        }
        if (!TextUtils.isEmpty(this.description_)) {
            iVar.mo19291a(this.description_, Defines$Jsonkey.ContentDesc.getKey());
        }
        if (!TextUtils.isEmpty(this.imageUrl_)) {
            iVar.mo19291a(this.imageUrl_, Defines$Jsonkey.ContentImgUrl.getKey());
        }
        if (this.expirationInMilliSec_ > 0) {
            String key = Defines$Jsonkey.ContentExpiryTime.getKey();
            StringBuilder h = C0072d.m201h("");
            h.append(this.expirationInMilliSec_);
            iVar.mo19291a(h.toString(), key);
        }
        String key2 = Defines$Jsonkey.PublicallyIndexable.getKey();
        StringBuilder h2 = C0072d.m201h("");
        h2.append(isPublicallyIndexable());
        iVar.mo19291a(h2.toString(), key2);
        JSONObject convertToJson = this.metadata_.convertToJson();
        try {
            Iterator<String> keys = convertToJson.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                iVar.mo19291a(convertToJson.get(next), next);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        HashMap<String, String> controlParams = linkProperties.getControlParams();
        for (String next2 : controlParams.keySet()) {
            iVar.mo19291a(controlParams.get(next2), next2);
        }
        return iVar;
    }

    public void userCompletedAction(String str, HashMap<String, String> hashMap) {
        JSONObject jSONObject = new JSONObject();
        try {
            new JSONArray().put(this.canonicalIdentifier_);
            jSONObject.put(this.canonicalIdentifier_, convertToJson());
            if (hashMap != null) {
                for (String next : hashMap.keySet()) {
                    jSONObject.put(next, hashMap.get(next));
                }
            }
            if (Branch.m13575j() != null) {
                Branch j = Branch.m13575j();
                j.getClass();
                C7079s sVar = new C7079s(j.f15578d, str, jSONObject);
                if (!sVar.f15621g && !(!ServerRequest.m13601c(j.f15578d))) {
                    j.mo19198l(sVar);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void generateShortUrl(Context context, LinkProperties linkProperties, Branch.C7012b bVar, boolean z) {
        C7043i linkBuilder = getLinkBuilder(context, linkProperties);
        linkBuilder.f15701j = z;
        linkBuilder.mo19281b(bVar);
    }

    public void listOnGoogleSearch(Context context, LinkProperties linkProperties) {
        C18251e eVar = C18473c.f40678a;
        new Thread(new C18471a(context, this, linkProperties)).start();
    }

    public void removeFromLocalIndexing(Context context, LinkProperties linkProperties) {
        C18251e eVar = C18473c.f40678a;
        new Thread(new C18472b(context, this, linkProperties)).run();
    }

    public BranchUniversalObject addContentMetadata(String str, String str2) {
        this.metadata_.addCustomMetadata(str, str2);
        return this;
    }

    private BranchUniversalObject(Parcel parcel) {
        this();
        this.creationTimeStamp_ = parcel.readLong();
        this.canonicalIdentifier_ = parcel.readString();
        this.canonicalUrl_ = parcel.readString();
        this.title_ = parcel.readString();
        this.description_ = parcel.readString();
        this.imageUrl_ = parcel.readString();
        this.expirationInMilliSec_ = parcel.readLong();
        this.indexMode_ = CONTENT_INDEX_MODE.values()[parcel.readInt()];
        ArrayList arrayList = (ArrayList) parcel.readSerializable();
        if (arrayList != null) {
            this.keywords_.addAll(arrayList);
        }
        this.metadata_ = (ContentMetadata) parcel.readParcelable(ContentMetadata.class.getClassLoader());
        this.localIndexMode_ = CONTENT_INDEX_MODE.values()[parcel.readInt()];
    }

    public void userCompletedAction(BRANCH_STANDARD_EVENT branch_standard_event, HashMap<String, String> hashMap) {
        userCompletedAction(branch_standard_event.getName(), hashMap);
    }
}
