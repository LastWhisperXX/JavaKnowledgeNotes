package com.designpattern.creating.builder;

/**
 * @Describe
 * 建造者模式
 * @ClassName MilkTea
 * @Author ZhuXunComputer
 * @Date 2020/8/27
 * @Version JDK1.8
 */
public class BubbleTea {

    private final String pearl;

    private final String ice;

    private final String size;

    private final String nata;

    private BubbleTea(Builder builder){
        this.pearl = builder.pearl;
        this.nata = builder.nata;
        this.ice = builder.ice;
        this.size = builder.size;
    }

    public String isPearl() {
        return pearl;
    }

    public String isIce() {
        return ice;
    }

    public String getSize() {
        return size;
    }

    public String isNata() {
        return nata;
    }

    public static class Builder{
        private String pearl = "无珍珠";

        private String ice = "常温";

        private String size = "中杯";

        private String nata = "无椰果";

        public Builder(String size) {
            this.size = size;
        }

        public Builder setPearl(String pearl){
            this.pearl = pearl;
            return this;
        }
        public Builder setIce(String ice){
            this.ice = ice;
            return this;
        }
        public Builder setNata(String nata){
            this.nata = nata;
            return this;
        }

        public BubbleTea build(){
            return new BubbleTea(this);
        }
    }

    @Override
    public String toString() {
        return "BubbleTea{" +
                "pearl='" + pearl + '\'' +
                ", ice='" + ice + '\'' +
                ", size='" + size + '\'' +
                ", nata='" + nata + '\'' +
                '}';
    }
}
