package ghoulish.creatures;

import ghoulish.util.TextureContainer;

import java.awt.image.BufferedImage;

public abstract class Creature {
    double y;
    double x;
    int facty;
    int factx;
    int hp;
    String textureName;

    public Creature(int _y, int _x, int _hp, String texture) {
        y = facty = _y;
        x = factx = _x;
        hp = _hp;
        textureName = texture;
    }

    public double getDX() {
        return x;
    }

    public double getDY() {
        return y;
    }

    public int getIX() {
        return factx;
    }

    public int getIY() {
        return facty;
    }

    public boolean inflictDamage(int damage) {
        hp -= damage;

        if (hp <= 0)
            return false;
        return true;
    }

    public void move(int dy, int dx) {
        facty += dy;
        factx += dx;
    }

    public void move(double dy, double dx) {
        y += dy;
        x += dx;
    }

    public BufferedImage getTexture(){
        return TextureContainer.getTexture(textureName);
    }
}