package com.designpattern.creating.prototype;

/**
 * @Descripton
 * 敌机类
 *  原型对象
 *  实现 Cloneable接口，重写 clone方法实现对象拷贝
 * @Classname EnemyPlane
 * @Author CaoYang
 * @Address 开发大道
 * @Date 2020/8/19 23:11
 * @Version 1.8.0
 * @Createder by 寒酥
 */
public class EnemyPlane implements Cloneable{
    private int x;

    private int y;

    private Bullet bullet = new Bullet();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void fly(){
        y++;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    @Override
    protected EnemyPlane clone() throws CloneNotSupportedException {
        EnemyPlane enemyPlane = (EnemyPlane) super.clone();
        enemyPlane.setBullet(this.bullet.clone());
        return enemyPlane;
    }

    private static EnemyPlane enemyPlane = new EnemyPlane();

    public static EnemyPlane getInstance(int x) throws CloneNotSupportedException {
        EnemyPlane clone = enemyPlane.clone();
        clone.setX(x);
        return clone;
    }
}
