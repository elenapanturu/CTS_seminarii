package main_builder_var2;

import builder.AutobuzBuilder;
import builder.AutobuzLinie;

public class Program {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setAreOprire(false).setNrLinie(25);

        AutobuzLinie autobuz = autobuzBuilder.build();
        System.out.println(autobuz.toString());
    }
}
