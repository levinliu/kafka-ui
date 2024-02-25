package com.provectus.kafka.ui.model.rbac.permission;

import java.util.Set;
import org.apache.commons.lang3.EnumUtils;

public enum AclAction implements PermissibleAction {

  VIEW,
  EDIT

  ;

  public static final Set<AclAction> ALTER_ACTIONS = Set.of(EDIT);

  public static AclAction fromString(String name) {
    return EnumUtils.getEnum(AclAction.class, name);
  }

  @Override
  public boolean isAlter() {
    return ALTER_ACTIONS.contains(this);
  }
}
