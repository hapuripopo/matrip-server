package thegrace.project.matrip.domain;

public enum NoticeType {

    REQUEST("Request"),
    ACCEPT("Accept"),
    MEMBER_ADDED("Member Added"),
    INFO_UPDATED("Info Updated");

    private String value;

    NoticeType(String value) {
        this.value = value;
    }
}
