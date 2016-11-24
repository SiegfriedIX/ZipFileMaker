package com.geekhub.homework4;

import java.io.File;
import java.io.IOException;

import static com.geekhub.homework4.Main.path1;

class FileFilterMain {

        static void fileFilterMain() throws IOException,NullPointerException {
            File dir = new File(path1);
            File[] files = dir.listFiles(new ImageFileFilter());
            for (File f : files != null ? files : new File[0])
            {
                System.out.println("Image file: " + f.getName());
                Output.outputImagesZip();
            }
            File[] files1 = dir.listFiles(new VideoFilesFilter());
            for (File f : files1 != null ? files1 : new File[0]){
                System.out.println("Video file:"+ f.getName());
                Output.outputVideoZip();
            }
            File[] files2 = dir.listFiles(new AudioFilesFilter());
            for (File f : files2 != null ? files2 : new File[0]){
                System.out.println("Audio file"+ f.getName());
                Output.outputAudioZip();
            }
        }
    }

