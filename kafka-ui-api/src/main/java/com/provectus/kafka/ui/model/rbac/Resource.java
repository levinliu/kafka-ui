package com.provectus.kafka.ui.model.rbac;

import org.apache.commons.lang3.EnumUtils;

public enum Resource {

  APPLICATIONCONFIG,
  CLUSTERCONFIG,
  TOPIC,
  CONSUMER,
  SCHEMA,
  CONNECT,
  KSQL,
  ACL,
  AUDIT;

  public static Resource fromString(String name) {
    return EnumUtils.getEnum(Resource.class, name);
  }


}
