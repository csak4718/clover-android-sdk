/**
 * Copyright (C) 2015 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2013 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.inventory;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class Discount implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

 /**
  * Unique identifier
  */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }
 /**
  * Name of the discount
  */
  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }
 /**
  * Discount amount in fraction of currency unit (e.g. cents) based on currency fraction digits supported
  */
  public java.lang.Long getAmount() {
    return genClient.cacheGet(CacheKey.amount);
  }
 /**
  * Discount amount in percent
  */
  public java.lang.Long getPercentage() {
    return genClient.cacheGet(CacheKey.percentage);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Discount> {
    id {
      @Override
      public Object extractValue(Discount instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    name {
      @Override
      public Object extractValue(Discount instance) {
        return instance.genClient.extractOther("name", java.lang.String.class);
      }
    },
    amount {
      @Override
      public Object extractValue(Discount instance) {
        return instance.genClient.extractOther("amount", java.lang.Long.class);
      }
    },
    percentage {
      @Override
      public Object extractValue(Discount instance) {
        return instance.genClient.extractOther("percentage", java.lang.Long.class);
      }
    },
    ;
  }

  private GenericClient<Discount> genClient = new GenericClient<Discount>(this);

  /**
   * Constructs a new empty instance.
   */
  public Discount() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Discount(String json) throws IllegalArgumentException {
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public Discount(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Discount(Discount src) {
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }


  @Override
  public void validate() {
    genClient.validateLength(getId(), 13);

    genClient.validateNull(getName(), "name");
    genClient.validateLength(getName(), 64);

    if (getAmount() != null && ( getAmount() > 0)) throw new IllegalArgumentException("Invalid value for 'getAmount()'");

    if (getPercentage() != null && ( getPercentage() < 0)) throw new IllegalArgumentException("Invalid value for 'getPercentage()'");
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'amount' field is set and is not null */
  public boolean isNotNullAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.amount);
  }

  /** Checks whether the 'percentage' field is set and is not null */
  public boolean isNotNullPercentage() {
    return genClient.cacheValueIsNotNull(CacheKey.percentage);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'amount' field has been set, however the value could be null */
  public boolean hasAmount() {
    return genClient.cacheHasKey(CacheKey.amount);
  }

  /** Checks whether the 'percentage' field has been set, however the value could be null */
  public boolean hasPercentage() {
    return genClient.cacheHasKey(CacheKey.percentage);
  }


  /**
   * Sets the field 'id'.
   */
  public Discount setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'name'.
   */
  public Discount setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'amount'.
   */
  public Discount setAmount(java.lang.Long amount) {
    return genClient.setOther(amount, CacheKey.amount);
  }

  /**
   * Sets the field 'percentage'.
   */
  public Discount setPercentage(java.lang.Long percentage) {
    return genClient.setOther(percentage, CacheKey.percentage);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'amount' field, the 'has' method for this field will now return false */
  public void clearAmount() {
    genClient.clear(CacheKey.amount);
  }
  /** Clears the 'percentage' field, the 'has' method for this field will now return false */
  public void clearPercentage() {
    genClient.clear(CacheKey.percentage);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public Discount copyChanges() {
    Discount copy = new Discount();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Discount src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Discount(src).getJSONObject(), src.genClient);
    }
  }

  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    return genClient.getBundle();
  }

  @Override
  public String toString() {
    return genClient.toString();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
    genClient.writeToParcel(dest, flags);
  }

  public static final android.os.Parcelable.Creator<Discount> CREATOR = new android.os.Parcelable.Creator<Discount>() {
    @Override
    public Discount createFromParcel(android.os.Parcel in) {
      Discount instance = new Discount(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Discount[] newArray(int size) {
      return new Discount[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Discount> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Discount>() {
    @Override
    public Discount create(org.json.JSONObject jsonObject) {
      return new Discount(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean NAME_IS_REQUIRED = true;
    public static final long NAME_MAX_LEN = 64;

    public static final boolean AMOUNT_IS_REQUIRED = false;
    public static final long AMOUNT_MAX = 0;

    public static final boolean PERCENTAGE_IS_REQUIRED = false;
    public static final long PERCENTAGE_MIN = 0;

  }

}
