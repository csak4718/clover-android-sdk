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
public final class Attribute implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

 /**
  * Unique identifier
  */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }
 /**
  * Name of this attribute
  */
  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }
 /**
  * The item group this attribute belongs to
  */
  public com.clover.sdk.v3.base.Reference getItemGroup() {
    return genClient.cacheGet(CacheKey.itemGroup);
  }
 /**
  * Options associated with this attribute
  */
  public java.util.List<com.clover.sdk.v3.inventory.Option> getOptions() {
    return genClient.cacheGet(CacheKey.options);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Attribute> {
    id {
      @Override
      public Object extractValue(Attribute instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    name {
      @Override
      public Object extractValue(Attribute instance) {
        return instance.genClient.extractOther("name", java.lang.String.class);
      }
    },
    itemGroup {
      @Override
      public Object extractValue(Attribute instance) {
        return instance.genClient.extractRecord("itemGroup", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    options {
      @Override
      public Object extractValue(Attribute instance) {
        return instance.genClient.extractListRecord("options", com.clover.sdk.v3.inventory.Option.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<Attribute> genClient = new GenericClient<Attribute>(this);

  /**
   * Constructs a new empty instance.
   */
  public Attribute() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Attribute(String json) throws IllegalArgumentException {
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
  public Attribute(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Attribute(Attribute src) {
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
    genClient.validateLength(getName(), 255);

    genClient.validateNull(getItemGroup(), "itemGroup");
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'itemGroup' field is set and is not null */
  public boolean isNotNullItemGroup() {
    return genClient.cacheValueIsNotNull(CacheKey.itemGroup);
  }

  /** Checks whether the 'options' field is set and is not null */
  public boolean isNotNullOptions() {
    return genClient.cacheValueIsNotNull(CacheKey.options);
  }

  /** Checks whether the 'options' field is set and is not null and is not empty */
  public boolean isNotEmptyOptions() { return isNotNullOptions() && !getOptions().isEmpty(); }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'itemGroup' field has been set, however the value could be null */
  public boolean hasItemGroup() {
    return genClient.cacheHasKey(CacheKey.itemGroup);
  }

  /** Checks whether the 'options' field has been set, however the value could be null */
  public boolean hasOptions() {
    return genClient.cacheHasKey(CacheKey.options);
  }


  /**
   * Sets the field 'id'.
   */
  public Attribute setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'name'.
   */
  public Attribute setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'itemGroup'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Attribute setItemGroup(com.clover.sdk.v3.base.Reference itemGroup) {
    return genClient.setRecord(itemGroup, CacheKey.itemGroup);
  }

  /**
   * Sets the field 'options'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Attribute setOptions(java.util.List<com.clover.sdk.v3.inventory.Option> options) {
    return genClient.setArrayRecord(options, CacheKey.options);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'itemGroup' field, the 'has' method for this field will now return false */
  public void clearItemGroup() {
    genClient.clear(CacheKey.itemGroup);
  }
  /** Clears the 'options' field, the 'has' method for this field will now return false */
  public void clearOptions() {
    genClient.clear(CacheKey.options);
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
  public Attribute copyChanges() {
    Attribute copy = new Attribute();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Attribute src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Attribute(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<Attribute> CREATOR = new android.os.Parcelable.Creator<Attribute>() {
    @Override
    public Attribute createFromParcel(android.os.Parcel in) {
      Attribute instance = new Attribute(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Attribute[] newArray(int size) {
      return new Attribute[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Attribute> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Attribute>() {
    @Override
    public Attribute create(org.json.JSONObject jsonObject) {
      return new Attribute(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean NAME_IS_REQUIRED = true;
    public static final long NAME_MAX_LEN = 255;

    public static final boolean ITEMGROUP_IS_REQUIRED = true;

    public static final boolean OPTIONS_IS_REQUIRED = false;

  }

}
