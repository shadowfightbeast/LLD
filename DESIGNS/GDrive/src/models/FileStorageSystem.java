package models;

import java.util.HashMap;
import java.util.Map;

public class FileStorageSystem {
    private Map<String, File> files;
    private Map<String, Folder> folders;

    public FileStorageSystem() {
        this.files = new HashMap<>();
        this.folders = new HashMap<>();
    }

    public void addFile(File file) {
        files.put(file.getFileId(), file);
    }

    public File getFileById(String fileId) {
        return files.get(fileId);
    }

    public void addFolder(Folder folder) {
        folders.put(folder.getFolderId(), folder);
    }

    public Folder getFolderById(String folderId) {
        return folders.get(folderId);
    }

}
