package main.webapp.ressources;

import java.util.Random;

public enum RoomType {
    low, medium, high;

    public static RoomType randomEnum(){
        Random random = new Random();
        int x = random.nextInt(RoomType.values().length);
        return RoomType.values()[x];
    }
}
