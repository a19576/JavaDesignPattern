package com.codermy.designpattern.adaptor;

/**
 * @author codermy
 * @createTime 2020/7/25
 */
public class Converter implements Headset {
    private Phone phone;

    public Converter(Phone phone){
        this.phone = phone;
    }

    @Override
    public String music() {
        String s = phone.throwTypec();
        System.out.println(String.format("%s ==========  > %s ",s,"听歌"));
        return "听歌";
    }
}
