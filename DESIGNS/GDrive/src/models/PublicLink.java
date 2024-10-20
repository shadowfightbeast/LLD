package models;

import java.util.Date;
import java.util.UUID;

public class PublicLink {
    private String linkId;
    private File sharedFile;
    private User owner;
    private boolean isActive;
    private Date expirationTime;
    private Permission.PermissionType accessType;

    public PublicLink(File sharedFile, User owner, Permission.PermissionType accessType, Date expirationTime) {
        this.linkId = UUID.randomUUID().toString();
        this.sharedFile = sharedFile;
        this.owner = owner;
        this.isActive = true;
        this.expirationTime = expirationTime;
        this.accessType = accessType;
    }

    public boolean isLinkActive() {
        if (!isActive)
            return false;
        if (expirationTime != null && new Date().after(expirationTime)) {
            this.isActive = false;
        }
        return isActive;
    }

    public void deactivateLink() {
        this.isActive = false;
    }

    public File getSharedFile() {
        return sharedFile;
    }

    public Permission.PermissionType getAccessType() {
        return accessType;
    }

    public String getLinkId() {
        return linkId;
    }
}
