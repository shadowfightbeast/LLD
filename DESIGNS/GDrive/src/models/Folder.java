package models;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String folderId;
    private String name;
    private User owner;
    private Folder parentFolder;
    private List<Folder> subFolders;
    private List<File> files;

    public Folder(String folderId, String name, Folder parentFolder, User owner) {
        this.folderId = folderId;
        this.name = name;
        this.parentFolder = parentFolder;
        this.owner = owner;
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public String getFolderId() {
        return folderId;
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

    public List<Folder> getSubFolders() {
        return subFolders;
    }

    public List<File> getFiles() {
        return files;
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void addSubFolder(Folder folder) {
        this.subFolders.add(folder);
    }
}
