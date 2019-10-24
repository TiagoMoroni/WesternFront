package com.badlogic.drop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.TimeUtils;

public class Soldier extends Rectangle {

    private int health;
    private Texture imagem = new Texture(Gdx.files.internal("soldier.png"));
    private long lastShotTime;
    private int reloadTime;

    public int getReloadTime() {
        return reloadTime;
    }

    public void setReloadTime(int reloadTime) {
        this.reloadTime = reloadTime;
    }

    public int getHealth() {
        return health;
    }

    public Texture getImagem() {
        return imagem;
    }

    public void setImagem(Texture imagem) {
        this.imagem = imagem;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Soldier(int width, int height, int health, int reloadTime, Texture imagem) {
        this.width = width; 
        this.height = height;
        this.setImagem(imagem);
        this.setHealth(health);
    }

    public long getLastShotTime() {
        return lastShotTime;
    }

    public void setLastShotTime(long lastShotTime) {
        this.lastShotTime = lastShotTime;
    }
    
    
    
}
