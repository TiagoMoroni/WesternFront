package com.badlogic.drop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;

public class Zombie extends Rectangle{
    
    private int speed = 300;
    private int health = 300;
    private Texture imagem = new Texture(Gdx.files.internal("zombie.png"));
    private float lastAttackTime;
    private int damage = 100;
    private int reloadTime = 1000000000;
    private boolean firstAttack;

    public boolean getFirstAttack() {
        return firstAttack;
    }

    public void setFirstAttack(boolean firstAttack) {
        this.firstAttack = firstAttack;
    }

    public float getLastAttackTime() {
        return lastAttackTime;
    }

    public void setLastAttackTime(float lastAttackTime) {
        this.lastAttackTime = lastAttackTime;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getReloadTime() {
        return reloadTime;
    }

    public void setReloadTime(int reloadTime) {
        this.reloadTime = reloadTime;
    }
    
    public Texture getImagem() {
        return imagem;
    }

    public void setImagem(Texture imagem) {
        this.imagem = imagem;
    }
    
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    public Zombie(){
        width = 64;
        height = 92;
        firstAttack = false;
    }
}
