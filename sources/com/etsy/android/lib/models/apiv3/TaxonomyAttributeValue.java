package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class TaxonomyAttributeValue extends BaseFieldModel {
    private static final long serialVersionUID = 652753520279457394L;
    public boolean mActive;
    public List<EtsyId> mEqTo = new ArrayList(0);
    public EtsyId mId = new EtsyId();
    public String mName = "";
    public int mOrder;
    public EtsyId mScale = new EtsyId();
    public String mVersion = "";

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaxonomyAttributeValue taxonomyAttributeValue = (TaxonomyAttributeValue) obj;
        return new EqualsBuilder().append(this.mOrder, taxonomyAttributeValue.mOrder).append(this.mActive, taxonomyAttributeValue.mActive).append((Object) this.mEqTo, (Object) taxonomyAttributeValue.mEqTo).append((Object) this.mId, (Object) taxonomyAttributeValue.mId).append((Object) this.mScale, (Object) taxonomyAttributeValue.mScale).append((Object) this.mName, (Object) taxonomyAttributeValue.mName).append((Object) this.mVersion, (Object) taxonomyAttributeValue.mVersion).isEquals();
    }

    public List<EtsyId> getEqTo() {
        return this.mEqTo;
    }

    public EtsyId getId() {
        return this.mId;
    }

    public String getName() {
        return this.mName;
    }

    public int getOrder() {
        return this.mOrder;
    }

    public EtsyId getScale() {
        return this.mScale;
    }

    public String getVersion() {
        return this.mVersion;
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append((Object) this.mEqTo).append((Object) this.mId).append((Object) this.mScale).append((Object) this.mName).append((Object) this.mVersion).append(this.mOrder).append(this.mActive).toHashCode();
    }

    public boolean isActive() {
        return this.mActive;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("id".equals(str)) {
            this.mId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if (ResponseConstants.SCALE.equals(str)) {
            this.mScale.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if (ResponseConstants.EQTO.equals(str)) {
            this.mEqTo = BaseModel.parseEtsyIdArray(jsonParser);
            return true;
        } else if ("name".equals(str)) {
            this.mName = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.VERSION.equals(str)) {
            this.mVersion = BaseModel.parseString(jsonParser);
            return true;
        } else if ("active".equals(str)) {
            this.mActive = jsonParser.getValueAsBoolean();
            return true;
        } else if (!ResponseConstants.ORDER.equals(str)) {
            return false;
        } else {
            this.mOrder = jsonParser.getValueAsInt();
            return true;
        }
    }

    public void setId(EtsyId etsyId) {
        this.mId = etsyId;
    }

    public void setScale(EtsyId etsyId) {
        this.mScale = etsyId;
    }
}
