package io.metalmynds.tractor.trailer.frameworks;

public abstract class FrameworkManager implements FrameworkManagement {

    public abstract void setup();

    public abstract void teardown();

    public abstract void start();

}
