package liang.chapter9_objectsAndClasses.task_9_8;

public enum Speed {
    SLOW(1),
    MEDIUM(2),
    FAST(3);

    public final int value;

    Speed(final int value) {
        this.value = value;
    }
}
