package net.devkhan.workflowsample.dto;

/**
 * Created by KHAN on 2015-07-14.
 */
public class MobileVersion {

    private String availableVersion;

    private String currentVersion;

    public MobileVersion(String availableVersion, String currentVersion) {
        this.availableVersion = availableVersion;
        this.currentVersion = currentVersion;
    }

    public String getAvailableVersion() {
        return availableVersion;
    }

    public void setAvailableVersion(String availableVersion) {
        this.availableVersion = availableVersion;
    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

}
