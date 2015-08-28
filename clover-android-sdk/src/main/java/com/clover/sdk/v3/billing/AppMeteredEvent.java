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

package com.clover.sdk.v3.billing;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class AppMeteredEvent implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }
  public com.clover.sdk.v3.apps.AppMetered getAppMetered() {
    return genClient.cacheGet(CacheKey.appMetered);
  }
  public java.lang.Long getCount() {
    return genClient.cacheGet(CacheKey.count);
  }
  public java.lang.Long getCreatedTime() {
    return genClient.cacheGet(CacheKey.createdTime);
  }
  public java.lang.Long getModifiedTime() {
    return genClient.cacheGet(CacheKey.modifiedTime);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<AppMeteredEvent> {
    id {
      @Override
      public Object extractValue(AppMeteredEvent instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    appMetered {
      @Override
      public Object extractValue(AppMeteredEvent instance) {
        return instance.genClient.extractRecord("appMetered", com.clover.sdk.v3.apps.AppMetered.JSON_CREATOR);
      }
    },
    count {
      @Override
      public Object extractValue(AppMeteredEvent instance) {
        return instance.genClient.extractOther("count", java.lang.Long.class);
      }
    },
    createdTime {
      @Override
      public Object extractValue(AppMeteredEvent instance) {
        return instance.genClient.extractOther("createdTime", java.lang.Long.class);
      }
    },
    modifiedTime {
      @Override
      public Object extractValue(AppMeteredEvent instance) {
        return instance.genClient.extractOther("modifiedTime", java.lang.Long.class);
      }
    },
    ;
  }

  private GenericClient<AppMeteredEvent> genClient = new GenericClient<AppMeteredEvent>(this);

  /**
   * Constructs a new empty instance.
   */
  public AppMeteredEvent() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public AppMeteredEvent(String json) throws IllegalArgumentException {
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
  public AppMeteredEvent(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public AppMeteredEvent(AppMeteredEvent src) {
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

    genClient.validateNull(getAppMetered(), "appMetered");

    genClient.validateNull(getCount(), "count");
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'appMetered' field is set and is not null */
  public boolean isNotNullAppMetered() {
    return genClient.cacheValueIsNotNull(CacheKey.appMetered);
  }

  /** Checks whether the 'count' field is set and is not null */
  public boolean isNotNullCount() {
    return genClient.cacheValueIsNotNull(CacheKey.count);
  }

  /** Checks whether the 'createdTime' field is set and is not null */
  public boolean isNotNullCreatedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.createdTime);
  }

  /** Checks whether the 'modifiedTime' field is set and is not null */
  public boolean isNotNullModifiedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.modifiedTime);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'appMetered' field has been set, however the value could be null */
  public boolean hasAppMetered() {
    return genClient.cacheHasKey(CacheKey.appMetered);
  }

  /** Checks whether the 'count' field has been set, however the value could be null */
  public boolean hasCount() {
    return genClient.cacheHasKey(CacheKey.count);
  }

  /** Checks whether the 'createdTime' field has been set, however the value could be null */
  public boolean hasCreatedTime() {
    return genClient.cacheHasKey(CacheKey.createdTime);
  }

  /** Checks whether the 'modifiedTime' field has been set, however the value could be null */
  public boolean hasModifiedTime() {
    return genClient.cacheHasKey(CacheKey.modifiedTime);
  }


  /**
   * Sets the field 'id'.
   */
  public AppMeteredEvent setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'appMetered'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public AppMeteredEvent setAppMetered(com.clover.sdk.v3.apps.AppMetered appMetered) {
    return genClient.setRecord(appMetered, CacheKey.appMetered);
  }

  /**
   * Sets the field 'count'.
   */
  public AppMeteredEvent setCount(java.lang.Long count) {
    return genClient.setOther(count, CacheKey.count);
  }

  /**
   * Sets the field 'createdTime'.
   */
  public AppMeteredEvent setCreatedTime(java.lang.Long createdTime) {
    return genClient.setOther(createdTime, CacheKey.createdTime);
  }

  /**
   * Sets the field 'modifiedTime'.
   */
  public AppMeteredEvent setModifiedTime(java.lang.Long modifiedTime) {
    return genClient.setOther(modifiedTime, CacheKey.modifiedTime);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'appMetered' field, the 'has' method for this field will now return false */
  public void clearAppMetered() {
    genClient.clear(CacheKey.appMetered);
  }
  /** Clears the 'count' field, the 'has' method for this field will now return false */
  public void clearCount() {
    genClient.clear(CacheKey.count);
  }
  /** Clears the 'createdTime' field, the 'has' method for this field will now return false */
  public void clearCreatedTime() {
    genClient.clear(CacheKey.createdTime);
  }
  /** Clears the 'modifiedTime' field, the 'has' method for this field will now return false */
  public void clearModifiedTime() {
    genClient.clear(CacheKey.modifiedTime);
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
  public AppMeteredEvent copyChanges() {
    AppMeteredEvent copy = new AppMeteredEvent();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(AppMeteredEvent src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new AppMeteredEvent(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<AppMeteredEvent> CREATOR = new android.os.Parcelable.Creator<AppMeteredEvent>() {
    @Override
    public AppMeteredEvent createFromParcel(android.os.Parcel in) {
      AppMeteredEvent instance = new AppMeteredEvent(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public AppMeteredEvent[] newArray(int size) {
      return new AppMeteredEvent[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<AppMeteredEvent> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<AppMeteredEvent>() {
    @Override
    public AppMeteredEvent create(org.json.JSONObject jsonObject) {
      return new AppMeteredEvent(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean APPMETERED_IS_REQUIRED = true;

    public static final boolean COUNT_IS_REQUIRED = true;

    public static final boolean CREATEDTIME_IS_REQUIRED = false;

    public static final boolean MODIFIEDTIME_IS_REQUIRED = false;

  }

}
