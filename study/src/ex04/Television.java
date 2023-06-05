package ex04;

public class Television {
    int channel;
    int volume;
    boolean onOff;

    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.channel = 7;
        myTv.volume = 10;
        myTv.onOff = true;

        Television yourTv = new Television();
        yourTv.channel = 8;
        yourTv.volume = 10;
        yourTv.onOff = true;
        System.out.println("나의 텔레비전은 채널 " + myTv.channel + "볼륨 " + myTv.volume + "압나다. ");
        System.out.println("너의 텔레비전은 채널 " + yourTv.channel + "볼륨 " + yourTv.volume + "압나다. ");
    }
}
