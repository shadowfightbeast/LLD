package models;

import java.util.List;

public class File {
    private String fileId;
    private String name;
    private User owner;
    private Folder parentFolder;
    private List<Version> versions;
    private List<PublicLink> publicLinks;
    private List<Permission> permissions;

    public File(String fileId, String name, Folder parentFolder, User owner) {
        this.fileId = fileId;
        this.name = name;
        this.parentFolder = parentFolder;
        this.owner = owner;
    }

    public String getFileId() {
        return fileId;
    }

    public String getName() {
        return name;
    }

    public Folder getParentFolder() {
        return parentFolder;
    }

    public User getOwner() {
        return owner;
    }

    public List<Version> getVersions() {
        return versions;
    }

    public List<PublicLink> getPublicLinks() {
        return publicLinks;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void addVersion(Version version) {
        this.versions.add(version);
    }

    public void addPublicLink(PublicLink publicLink) {
        this.publicLinks.add(publicLink);
    }

    public void addPermission(Permission permission) {
        this.permissions.add(permission);
    }
}
