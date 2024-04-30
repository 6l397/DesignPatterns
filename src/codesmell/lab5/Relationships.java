package codesmell.lab5;

import java.util.ArrayList;
import java.util.List;

public class Relationships {
    private List<String> friends;
    private List<String> enemies;

    public Relationships() {
        this.friends = new ArrayList<>();
        this.enemies = new ArrayList<>();
    }

    public void addFriend(String friend) {
        this.friends.add(friend);
    }

    public void removeFriend(String friend) {
        this.friends.remove(friend);
    }

    public void addEnemy(String enemy) {
        this.enemies.add(enemy);
    }

    public void removeEnemy(String enemy) {
        this.enemies.remove(enemy);
    }

    public List<String> getFriends() {
        return friends;
    }

    public List<String> getEnemies() {
        return enemies;
    }
}
