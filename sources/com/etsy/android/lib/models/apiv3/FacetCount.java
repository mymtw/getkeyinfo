package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FacetCount extends BaseModel {
    public static final Comparator<FacetCount> byDecreasingCount = new C8714a();
    public boolean isOpen;
    public List<FacetCount> mChildren;
    public int mCount;
    public String mId;
    public String mName;

    /* renamed from: com.etsy.android.lib.models.apiv3.FacetCount$a */
    public class C8714a implements Comparator<FacetCount> {
        public final int compare(Object obj, Object obj2) {
            return ((FacetCount) obj2).getCount() - ((FacetCount) obj).getCount();
        }
    }

    public FacetCount(String str, String str2, int i) {
        this.isOpen = false;
        this.mId = str;
        this.mName = str2;
        this.mCount = i;
    }

    public static boolean buildPathToFacet(List<FacetCount> list, String str, List<FacetCount> list2) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            FacetCount facetCount = list.get(i);
            if (facetCount.getId().equals(str)) {
                list2.add(facetCount);
                return true;
            } else if (buildPathToFacet(facetCount.getChildren(), str, list2)) {
                list2.add(0, facetCount);
                return true;
            } else {
                i++;
            }
        }
        return false;
    }

    private List<FacetCount> parseChildren(JsonParser jsonParser) throws IOException {
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            return BaseModel.parseArray(jsonParser, FacetCount.class);
        }
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                arrayList.add((FacetCount) BaseModel.parseObject(jsonParser, FacetCount.class));
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof FacetCount)) {
            return false;
        }
        FacetCount facetCount = (FacetCount) obj;
        if (getId() != null || facetCount.getId() == null) {
            return getId().equals(facetCount.getId());
        }
        return false;
    }

    public List<FacetCount> getChildren() {
        return this.mChildren;
    }

    public int getCount() {
        return this.mCount;
    }

    public String getId() {
        return this.mId;
    }

    public String getName() {
        return this.mName;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("id".equals(currentName)) {
                    this.mId = BaseModel.parseStringIdOrNumericValue(jsonParser);
                } else if ("name".equals(currentName)) {
                    this.mName = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.COUNT.equals(currentName)) {
                    this.mCount = jsonParser.getValueAsInt();
                } else if (ResponseConstants.CHILDREN.equals(currentName)) {
                    this.mChildren = parseChildren(jsonParser);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setOpen(boolean z) {
        this.isOpen = z;
    }

    public String toString() {
        return getId() + " " + getName() + " " + getCount();
    }

    public FacetCount(String str, String str2, int i, List<FacetCount> list) {
        this.isOpen = false;
        this.mId = str;
        this.mName = str2;
        this.mCount = i;
        this.mChildren = list;
    }

    public FacetCount(String str) {
        this.mName = "";
        this.isOpen = false;
        this.mId = str;
    }

    public FacetCount() {
        this.mId = "";
        this.mName = "";
        this.isOpen = false;
    }
}
