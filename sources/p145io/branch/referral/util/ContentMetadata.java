package p145io.branch.referral.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p145io.branch.referral.C7058n;
import p145io.branch.referral.Defines$Jsonkey;

/* renamed from: io.branch.referral.util.ContentMetadata */
public class ContentMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7084a();
    public String addressCity;
    public String addressCountry;
    public String addressPostalCode;
    public String addressRegion;
    public String addressStreet;
    public CONDITION condition;
    public BranchContentSchema contentSchema;
    public CurrencyType currencyType;
    private final HashMap<String, String> customMetadata;
    private final ArrayList<String> imageCaptions;
    public Double latitude;
    public Double longitude;
    public Double price;
    public String productBrand;
    public ProductCategory productCategory;
    public String productName;
    public String productVariant;
    public Double quantity;
    public Double rating;
    public Double ratingAverage;
    public Integer ratingCount;
    public Double ratingMax;
    public String sku;

    /* renamed from: io.branch.referral.util.ContentMetadata$CONDITION */
    public enum CONDITION {
        OTHER,
        NEW,
        GOOD,
        FAIR,
        POOR,
        USED,
        REFURBISHED,
        EXCELLENT;

        public static CONDITION getValue(String str) {
            if (!TextUtils.isEmpty(str)) {
                for (CONDITION condition : values()) {
                    if (condition.name().equalsIgnoreCase(str)) {
                        return condition;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: io.branch.referral.util.ContentMetadata$a */
    public class C7084a implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new ContentMetadata(parcel, (C7084a) null);
        }

        public final Object[] newArray(int i) {
            return new ContentMetadata[i];
        }
    }

    public /* synthetic */ ContentMetadata(Parcel parcel, C7084a aVar) {
        this(parcel);
    }

    public static ContentMetadata createFromJson(C7058n.C7059a aVar) {
        Integer num;
        ContentMetadata contentMetadata = new ContentMetadata();
        contentMetadata.contentSchema = BranchContentSchema.getValue(aVar.mo19293b(Defines$Jsonkey.ContentSchema.getKey()));
        contentMetadata.quantity = aVar.mo19292a(Defines$Jsonkey.Quantity.getKey());
        contentMetadata.price = aVar.mo19292a(Defines$Jsonkey.Price.getKey());
        contentMetadata.currencyType = CurrencyType.getValue(aVar.mo19293b(Defines$Jsonkey.PriceCurrency.getKey()));
        contentMetadata.sku = aVar.mo19293b(Defines$Jsonkey.SKU.getKey());
        contentMetadata.productName = aVar.mo19293b(Defines$Jsonkey.ProductName.getKey());
        contentMetadata.productBrand = aVar.mo19293b(Defines$Jsonkey.ProductBrand.getKey());
        contentMetadata.productCategory = ProductCategory.getValue(aVar.mo19293b(Defines$Jsonkey.ProductCategory.getKey()));
        contentMetadata.condition = CONDITION.getValue(aVar.mo19293b(Defines$Jsonkey.Condition.getKey()));
        contentMetadata.productVariant = aVar.mo19293b(Defines$Jsonkey.ProductVariant.getKey());
        contentMetadata.rating = aVar.mo19292a(Defines$Jsonkey.Rating.getKey());
        contentMetadata.ratingAverage = aVar.mo19292a(Defines$Jsonkey.RatingAverage.getKey());
        String key = Defines$Jsonkey.RatingCount.getKey();
        if (aVar.f15711a.has(key)) {
            num = Integer.valueOf(aVar.f15711a.optInt(key));
            aVar.f15711a.remove(key);
        } else {
            num = null;
        }
        contentMetadata.ratingCount = num;
        contentMetadata.ratingMax = aVar.mo19292a(Defines$Jsonkey.RatingMax.getKey());
        contentMetadata.addressStreet = aVar.mo19293b(Defines$Jsonkey.AddressStreet.getKey());
        contentMetadata.addressCity = aVar.mo19293b(Defines$Jsonkey.AddressCity.getKey());
        contentMetadata.addressRegion = aVar.mo19293b(Defines$Jsonkey.AddressRegion.getKey());
        contentMetadata.addressCountry = aVar.mo19293b(Defines$Jsonkey.AddressCountry.getKey());
        contentMetadata.addressPostalCode = aVar.mo19293b(Defines$Jsonkey.AddressPostalCode.getKey());
        contentMetadata.latitude = aVar.mo19292a(Defines$Jsonkey.Latitude.getKey());
        contentMetadata.longitude = aVar.mo19292a(Defines$Jsonkey.Longitude.getKey());
        String key2 = Defines$Jsonkey.ImageCaptions.getKey();
        JSONArray optJSONArray = aVar.f15711a.optJSONArray(key2);
        aVar.f15711a.remove(key2);
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                contentMetadata.imageCaptions.add(optJSONArray.optString(i));
            }
        }
        try {
            JSONObject jSONObject = aVar.f15711a;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                contentMetadata.customMetadata.put(next, jSONObject.optString(next));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contentMetadata;
    }

    public ContentMetadata addCustomMetadata(String str, String str2) {
        this.customMetadata.put(str, str2);
        return this;
    }

    public ContentMetadata addImageCaptions(String... strArr) {
        Collections.addAll(this.imageCaptions, strArr);
        return this;
    }

    public JSONObject convertToJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.contentSchema != null) {
                jSONObject.put(Defines$Jsonkey.ContentSchema.getKey(), this.contentSchema.name());
            }
            if (this.quantity != null) {
                jSONObject.put(Defines$Jsonkey.Quantity.getKey(), this.quantity);
            }
            if (this.price != null) {
                jSONObject.put(Defines$Jsonkey.Price.getKey(), this.price);
            }
            if (this.currencyType != null) {
                jSONObject.put(Defines$Jsonkey.PriceCurrency.getKey(), this.currencyType.toString());
            }
            if (!TextUtils.isEmpty(this.sku)) {
                jSONObject.put(Defines$Jsonkey.SKU.getKey(), this.sku);
            }
            if (!TextUtils.isEmpty(this.productName)) {
                jSONObject.put(Defines$Jsonkey.ProductName.getKey(), this.productName);
            }
            if (!TextUtils.isEmpty(this.productBrand)) {
                jSONObject.put(Defines$Jsonkey.ProductBrand.getKey(), this.productBrand);
            }
            if (this.productCategory != null) {
                jSONObject.put(Defines$Jsonkey.ProductCategory.getKey(), this.productCategory.getName());
            }
            if (this.condition != null) {
                jSONObject.put(Defines$Jsonkey.Condition.getKey(), this.condition.name());
            }
            if (!TextUtils.isEmpty(this.productVariant)) {
                jSONObject.put(Defines$Jsonkey.ProductVariant.getKey(), this.productVariant);
            }
            if (this.rating != null) {
                jSONObject.put(Defines$Jsonkey.Rating.getKey(), this.rating);
            }
            if (this.ratingAverage != null) {
                jSONObject.put(Defines$Jsonkey.RatingAverage.getKey(), this.ratingAverage);
            }
            if (this.ratingCount != null) {
                jSONObject.put(Defines$Jsonkey.RatingCount.getKey(), this.ratingCount);
            }
            if (this.ratingMax != null) {
                jSONObject.put(Defines$Jsonkey.RatingMax.getKey(), this.ratingMax);
            }
            if (!TextUtils.isEmpty(this.addressStreet)) {
                jSONObject.put(Defines$Jsonkey.AddressStreet.getKey(), this.addressStreet);
            }
            if (!TextUtils.isEmpty(this.addressCity)) {
                jSONObject.put(Defines$Jsonkey.AddressCity.getKey(), this.addressCity);
            }
            if (!TextUtils.isEmpty(this.addressRegion)) {
                jSONObject.put(Defines$Jsonkey.AddressRegion.getKey(), this.addressRegion);
            }
            if (!TextUtils.isEmpty(this.addressCountry)) {
                jSONObject.put(Defines$Jsonkey.AddressCountry.getKey(), this.addressCountry);
            }
            if (!TextUtils.isEmpty(this.addressPostalCode)) {
                jSONObject.put(Defines$Jsonkey.AddressPostalCode.getKey(), this.addressPostalCode);
            }
            if (this.latitude != null) {
                jSONObject.put(Defines$Jsonkey.Latitude.getKey(), this.latitude);
            }
            if (this.longitude != null) {
                jSONObject.put(Defines$Jsonkey.Longitude.getKey(), this.longitude);
            }
            if (this.imageCaptions.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put(Defines$Jsonkey.ImageCaptions.getKey(), jSONArray);
                Iterator<String> it = this.imageCaptions.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
            }
            if (this.customMetadata.size() > 0) {
                for (String next : this.customMetadata.keySet()) {
                    jSONObject.put(next, this.customMetadata.get(next));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public HashMap<String, String> getCustomMetadata() {
        return this.customMetadata;
    }

    public ArrayList<String> getImageCaptions() {
        return this.imageCaptions;
    }

    public ContentMetadata setAddress(String str, String str2, String str3, String str4, String str5) {
        this.addressStreet = str;
        this.addressCity = str2;
        this.addressRegion = str3;
        this.addressCountry = str4;
        this.addressPostalCode = str5;
        return this;
    }

    public ContentMetadata setContentSchema(BranchContentSchema branchContentSchema) {
        this.contentSchema = branchContentSchema;
        return this;
    }

    public ContentMetadata setLocation(Double d, Double d2) {
        this.latitude = d;
        this.longitude = d2;
        return this;
    }

    public ContentMetadata setPrice(Double d, CurrencyType currencyType2) {
        this.price = d;
        this.currencyType = currencyType2;
        return this;
    }

    public ContentMetadata setProductBrand(String str) {
        this.productBrand = str;
        return this;
    }

    public ContentMetadata setProductCategory(ProductCategory productCategory2) {
        this.productCategory = productCategory2;
        return this;
    }

    public ContentMetadata setProductCondition(CONDITION condition2) {
        this.condition = condition2;
        return this;
    }

    public ContentMetadata setProductName(String str) {
        this.productName = str;
        return this;
    }

    public ContentMetadata setProductVariant(String str) {
        this.productVariant = str;
        return this;
    }

    public ContentMetadata setQuantity(Double d) {
        this.quantity = d;
        return this;
    }

    public ContentMetadata setRating(Double d, Double d2, Double d3, Integer num) {
        this.rating = d;
        this.ratingAverage = d2;
        this.ratingMax = d3;
        this.ratingCount = num;
        return this;
    }

    public ContentMetadata setSku(String str) {
        this.sku = str;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        BranchContentSchema branchContentSchema = this.contentSchema;
        String str = "";
        parcel.writeString(branchContentSchema != null ? branchContentSchema.name() : str);
        parcel.writeSerializable(this.quantity);
        parcel.writeSerializable(this.price);
        CurrencyType currencyType2 = this.currencyType;
        parcel.writeString(currencyType2 != null ? currencyType2.name() : str);
        parcel.writeString(this.sku);
        parcel.writeString(this.productName);
        parcel.writeString(this.productBrand);
        ProductCategory productCategory2 = this.productCategory;
        parcel.writeString(productCategory2 != null ? productCategory2.getName() : str);
        CONDITION condition2 = this.condition;
        if (condition2 != null) {
            str = condition2.name();
        }
        parcel.writeString(str);
        parcel.writeString(this.productVariant);
        parcel.writeSerializable(this.rating);
        parcel.writeSerializable(this.ratingAverage);
        parcel.writeSerializable(this.ratingCount);
        parcel.writeSerializable(this.ratingMax);
        parcel.writeString(this.addressStreet);
        parcel.writeString(this.addressCity);
        parcel.writeString(this.addressRegion);
        parcel.writeString(this.addressCountry);
        parcel.writeString(this.addressPostalCode);
        parcel.writeSerializable(this.latitude);
        parcel.writeSerializable(this.longitude);
        parcel.writeSerializable(this.imageCaptions);
        parcel.writeSerializable(this.customMetadata);
    }

    public ContentMetadata() {
        this.imageCaptions = new ArrayList<>();
        this.customMetadata = new HashMap<>();
    }

    private ContentMetadata(Parcel parcel) {
        this();
        this.contentSchema = BranchContentSchema.getValue(parcel.readString());
        this.quantity = (Double) parcel.readSerializable();
        this.price = (Double) parcel.readSerializable();
        this.currencyType = CurrencyType.getValue(parcel.readString());
        this.sku = parcel.readString();
        this.productName = parcel.readString();
        this.productBrand = parcel.readString();
        this.productCategory = ProductCategory.getValue(parcel.readString());
        this.condition = CONDITION.getValue(parcel.readString());
        this.productVariant = parcel.readString();
        this.rating = (Double) parcel.readSerializable();
        this.ratingAverage = (Double) parcel.readSerializable();
        this.ratingCount = (Integer) parcel.readSerializable();
        this.ratingMax = (Double) parcel.readSerializable();
        this.addressStreet = parcel.readString();
        this.addressCity = parcel.readString();
        this.addressRegion = parcel.readString();
        this.addressCountry = parcel.readString();
        this.addressPostalCode = parcel.readString();
        this.latitude = (Double) parcel.readSerializable();
        this.longitude = (Double) parcel.readSerializable();
        this.imageCaptions.addAll((ArrayList) parcel.readSerializable());
        this.customMetadata.putAll((HashMap) parcel.readSerializable());
    }

    public ContentMetadata setRating(Double d, Double d2, Integer num) {
        this.ratingAverage = d;
        this.ratingMax = d2;
        this.ratingCount = num;
        return this;
    }
}
