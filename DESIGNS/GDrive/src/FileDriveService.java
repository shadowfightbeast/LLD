import models.FileStorageSystem;
import models.Folder;
import models.Permission;
import models.PublicLink;

import java.util.Date;
import java.util.UUID;

import models.File;
import models.User;

public class FileDriveService {
    private FileStorageSystem storageSystem;

    public FileDriveService(FileStorageSystem storageSystem) {
        this.storageSystem = storageSystem;
    }

    public File createFile(String name, Folder parentFolder, User owner) {
        File newFile = new File(UUID.randomUUID().toString(), name, parentFolder, owner);
        storageSystem.addFile(newFile);
        owner.addFile(newFile);
        return newFile;
    }

    public Folder createFolder(String name, Folder parentFolder, User owner) {
        Folder newFolder = new Folder(UUID.randomUUID().toString(), name, parentFolder, owner);
        storageSystem.addFolder(newFolder);
        owner.addFolder(newFolder);
        return newFolder;
    }

    public PublicLink shareFile(File file, User owner, Permission.PermissionType permissionType, Date expirationTime) {
        PublicLink publicLink = new PublicLink(file, owner, permissionType, expirationTime);
        file.addPublicLink(publicLink);
        owner.addPublicLink(publicLink);
        return publicLink;
    }

    public void deleteFile(String fileId) {
        File file = storageSystem.getFileById(fileId);
        if (file != null) {
            // Logic to remove the file from the system
            System.out.println("File " + fileId + " has been deleted.");
        }
    }

}
