package com.etsy.android.lib.models.apiv3.editable;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.List;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.ObjectUtils;

public class ProductionPartner extends BaseModel {
    private static final long serialVersionUID = -661511256625137272L;
    public String about_production_partner;
    public String business_name;
    public String descriptive_title;
    public String geoname;
    public boolean is_deleted;
    public EtsyId location_id = new EtsyId();
    public EtsyId manufacturer_id = new EtsyId();
    public String partners_role;
    public String partners_role_human_readable;
    public EtsyId production_partner_id = new EtsyId();
    public String role_in_design_process;
    public String role_in_design_process_human_readable;
    public EtsyId shop_id = new EtsyId();
    public Boolean show_business_name;
    public String why_working_with_partner;
    public String why_working_with_partner_human_readable;
    public String why_working_with_partner_other;

    public static class Builder {
        private final ProductionPartner mProductionPartner = new ProductionPartner();

        public Builder about_production_partner(String str) {
            this.mProductionPartner.about_production_partner = str;
            return this;
        }

        public ProductionPartner build() {
            return this.mProductionPartner;
        }

        public Builder business_name(String str) {
            this.mProductionPartner.business_name = str;
            return this;
        }

        public Builder descriptive_title(String str) {
            this.mProductionPartner.descriptive_title = str;
            return this;
        }

        public Builder geoname(String str) {
            this.mProductionPartner.geoname = str;
            return this;
        }

        public Builder is_deleted(boolean z) {
            this.mProductionPartner.is_deleted = z;
            return this;
        }

        public Builder location_id(EtsyId etsyId) {
            this.mProductionPartner.location_id = etsyId;
            return this;
        }

        public Builder manufacturer_id(EtsyId etsyId) {
            this.mProductionPartner.manufacturer_id = etsyId;
            return this;
        }

        public Builder partners_role(String str) {
            this.mProductionPartner.partners_role = str;
            return this;
        }

        public Builder partners_role_human_readable(String str) {
            this.mProductionPartner.partners_role_human_readable = str;
            return this;
        }

        public Builder production_partner_id(EtsyId etsyId) {
            this.mProductionPartner.production_partner_id = etsyId;
            return this;
        }

        public Builder role_in_design_process(String str) {
            this.mProductionPartner.role_in_design_process = str;
            return this;
        }

        public Builder role_in_design_process_human_readable(String str) {
            this.mProductionPartner.role_in_design_process_human_readable = str;
            return this;
        }

        public Builder shop_id(EtsyId etsyId) {
            this.mProductionPartner.shop_id = etsyId;
            return this;
        }

        public Builder show_business_name(Boolean bool) {
            this.mProductionPartner.show_business_name = bool;
            return this;
        }

        public Builder why_working_with_partner(String str) {
            this.mProductionPartner.why_working_with_partner = str;
            return this;
        }

        public Builder why_working_with_partner_human_readable(String str) {
            this.mProductionPartner.why_working_with_partner_human_readable = str;
            return this;
        }

        public Builder why_working_with_partner_other(String str) {
            this.mProductionPartner.why_working_with_partner_other = str;
            return this;
        }
    }

    public static String getProductionPartnersJson(List<ProductionPartner> list) {
        StringBuilder sb = new StringBuilder();
        for (ProductionPartner next : list) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(next.minimalJson());
        }
        sb.insert(0, "[").append("]");
        return sb.toString();
    }

    public String about_production_partner() {
        return this.about_production_partner;
    }

    public String business_name() {
        return this.business_name;
    }

    public String descriptive_title() {
        return this.descriptive_title;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ProductionPartner) {
            ProductionPartner productionPartner = (ProductionPartner) obj;
            return ObjectUtils.equals(this.descriptive_title, productionPartner.descriptive_title) && ObjectUtils.equals(this.location_id, productionPartner.location_id) && ObjectUtils.equals(this.partners_role, productionPartner.partners_role) && ObjectUtils.equals(this.production_partner_id, productionPartner.production_partner_id) && ObjectUtils.equals(this.role_in_design_process, productionPartner.role_in_design_process) && ObjectUtils.equals(this.shop_id, productionPartner.shop_id) && ObjectUtils.equals(this.show_business_name, productionPartner.show_business_name) && ObjectUtils.equals(this.why_working_with_partner, productionPartner.why_working_with_partner) && ObjectUtils.equals(this.why_working_with_partner_other, productionPartner.why_working_with_partner_other);
        }
    }

    public String geoname() {
        return this.geoname;
    }

    public int hashCode() {
        int hashCode = ObjectUtils.hashCode(this.location_id);
        int hashCode2 = ObjectUtils.hashCode(this.partners_role);
        int hashCode3 = ObjectUtils.hashCode(this.production_partner_id);
        int hashCode4 = ObjectUtils.hashCode(this.role_in_design_process);
        int hashCode5 = ObjectUtils.hashCode(this.shop_id);
        int hashCode6 = ObjectUtils.hashCode(this.show_business_name);
        int hashCode7 = ObjectUtils.hashCode(this.why_working_with_partner);
        return ObjectUtils.hashCode(this.why_working_with_partner_other) + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((ObjectUtils.hashCode(this.descriptive_title) + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public boolean is_deleted() {
        return this.is_deleted;
    }

    public EtsyId location_id() {
        return this.location_id;
    }

    public EtsyId manufacturer_id() {
        return this.manufacturer_id;
    }

    public String minimalJson() {
        return String.format("{\"production_partner_id\": %s, \"business_name\": \"%s\"}", new Object[]{this.production_partner_id, this.business_name});
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1667139096:
                        if (currentName.equals("show_business_name")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1540734683:
                        if (currentName.equals("descriptive_title")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1244194300:
                        if (currentName.equals(ResponseConstants.IS_DELETED)) {
                            c = 2;
                            break;
                        }
                        break;
                    case -616090689:
                        if (currentName.equals("role_in_design_process")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -589083707:
                        if (currentName.equals("why_working_with_partner_other")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -78972580:
                        if (currentName.equals("geoname")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 135050669:
                        if (currentName.equals("why_working_with_partner_human_readable")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 393078584:
                        if (currentName.equals("production_partner_id")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 396542132:
                        if (currentName.equals("why_working_with_partner")) {
                            c = 8;
                            break;
                        }
                        break;
                    case 408224052:
                        if (currentName.equals("about_production_partner")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 418082889:
                        if (currentName.equals(ResponseConstants.MANUFACTURER_ID)) {
                            c = 10;
                            break;
                        }
                        break;
                    case 552319461:
                        if (currentName.equals("location_id")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 629885866:
                        if (currentName.equals("business_name")) {
                            c = 12;
                            break;
                        }
                        break;
                    case 1071147842:
                        if (currentName.equals("role_in_design_process_human_readable")) {
                            c = CharUtils.f44393CR;
                            break;
                        }
                        break;
                    case 1278455690:
                        if (currentName.equals("partners_role")) {
                            c = 14;
                            break;
                        }
                        break;
                    case 1303478295:
                        if (currentName.equals("partners_role_human_readable")) {
                            c = 15;
                            break;
                        }
                        break;
                    case 2067081988:
                        if (currentName.equals("shop_id")) {
                            c = 16;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.show_business_name = Boolean.valueOf(jsonParser.getValueAsBoolean());
                        break;
                    case 1:
                        this.descriptive_title = BaseModel.parseString(jsonParser);
                        break;
                    case 2:
                        this.is_deleted = jsonParser.getBooleanValue();
                        break;
                    case 3:
                        this.role_in_design_process = BaseModel.parseString(jsonParser);
                        break;
                    case 4:
                        this.why_working_with_partner_other = BaseModel.parseString(jsonParser);
                        break;
                    case 5:
                        this.geoname = BaseModel.parseString(jsonParser);
                        break;
                    case 6:
                        this.why_working_with_partner_human_readable = BaseModel.parseString(jsonParser);
                        break;
                    case 7:
                        this.production_partner_id.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                        break;
                    case 8:
                        this.why_working_with_partner = BaseModel.parseString(jsonParser);
                        break;
                    case 9:
                        this.about_production_partner = BaseModel.parseString(jsonParser);
                        break;
                    case 10:
                        this.manufacturer_id.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                        break;
                    case 11:
                        this.location_id.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                        break;
                    case 12:
                        this.business_name = BaseModel.parseString(jsonParser);
                        break;
                    case 13:
                        this.role_in_design_process_human_readable = BaseModel.parseString(jsonParser);
                        break;
                    case 14:
                        this.partners_role = BaseModel.parseString(jsonParser);
                        break;
                    case 15:
                        this.partners_role_human_readable = BaseModel.parseString(jsonParser);
                        break;
                    case 16:
                        this.shop_id.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public String partners_role() {
        return this.partners_role;
    }

    public String partners_role_human_readable() {
        return this.partners_role_human_readable;
    }

    public EtsyId production_partner_id() {
        return this.production_partner_id;
    }

    public String role_in_design_process() {
        return this.role_in_design_process;
    }

    public String role_in_design_process_human_readable() {
        return this.role_in_design_process_human_readable;
    }

    public void setProductionPartnerId(EtsyId etsyId) {
        this.production_partner_id = etsyId;
    }

    public EtsyId shop_id() {
        return this.shop_id;
    }

    public Boolean show_business_name() {
        return this.show_business_name;
    }

    public String why_working_with_partner() {
        return this.why_working_with_partner;
    }

    public String why_working_with_partner_human_readable() {
        return this.why_working_with_partner_human_readable;
    }

    public String why_working_with_partner_other() {
        return this.why_working_with_partner_other;
    }
}
