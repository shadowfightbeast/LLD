package models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String name;
    private String email;
    private List<File> ownedFiles;
    private List<Folder> ownedFolders;
    private List<PublicLink> publicLinks;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.ownedFiles = new ArrayList<>();
        this.ownedFolders = new ArrayList<>();
        this.publicLinks = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void addFile(File file) {
        this.ownedFiles.add(file);
    }

    public void addFolder(Folder folder) {
        this.ownedFolders.add(folder);
    }

    public void addPublicLink(PublicLink link) {
        this.publicLinks.add(link);
    }
}
