package UjunAlRantaui.pbo;

import java.io.File;
import java.util.Arrays;
import java.util.Optional;

public class PercabanganIfElse {
    public static void main(String[] args) {

        File directory = new File(args.length != 0 ? args[0] : ".");

        if(directory.exists() && directory.isDirectory()) {
            Optional<File[]> files = Optional.ofNullable(directory.listFiles());

            if(files.isPresent()){
                files.map(value -> Arrays.stream(value))
                        .ifPresent(value -> {
                            value.forEach(file -> System.out.println(file.getName()));
                        });
            } else {
                System.out.println("Tidak ada file apapun");
            }
        } else {
            System.out.println("Folder tidak ditemukan");
        }
    }
}
