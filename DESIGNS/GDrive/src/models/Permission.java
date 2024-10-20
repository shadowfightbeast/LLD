package models;

public class Permission {
    public enum PermissionType {
        READ, WRITE
    }

    private User user;
    private PermissionType permissionType;

    public Permission(User user, PermissionType permissionType) {
        this.user = user;
        this.permissionType = permissionType;
    }

    public User getUser() {
        return user;
    }

    public PermissionType getPermissionType() {
        return permissionType;
    }
}
