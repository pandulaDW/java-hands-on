package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileClass {
    static Path directoryPath = Paths.get("data");
    static Path filePath = Paths.get("Data.txt");

    public static void methods() throws Exception {
        String absDirPath = directoryPath.toAbsolutePath().toString();
        String absFilePath = directoryPath.resolve(filePath).toAbsolutePath().toString();

        System.out.println(new File(absDirPath).isDirectory());
        System.out.println(new File(absFilePath).isFile());

        //noinspection ConstantConditions
        for (String f : new File(absDirPath).list())
            System.out.println(f);

        //noinspection ConstantConditions
        for (File f : new File(absDirPath).listFiles()) {
            System.out.println(f.getPath());
        }

        File f = new File(absFilePath);
        f.setWritable(true);
        FileOutputStream fos = new FileOutputStream(absFilePath);
    }
}
