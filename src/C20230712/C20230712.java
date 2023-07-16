package C20230712;

//추상클래스 예제2
public class C20230712 {

    public static void main(String[] args) {
        // MusicPlayer 인스턴스 생성
        MusicPlayer musicPlayer = new MusicPlayer();

        // Playable 인터페이스의 구현체를 인자로 전달하여 음악 재생
        musicPlayer.play(new Mp3());
        musicPlayer.play(new Wav());
    }
}

// Playable 인터페이스 정의
interface Playable {
    void play();
}

// Mp3 클래스는 Playable 인터페이스를 구현
class Mp3 implements Playable {
    @Override
    public void play() {
        System.out.println("Mp3 재생 중...");
    }
}

// Wav 클래스는 Playable 인터페이스를 구현
class Wav implements Playable {
    @Override
    public void play() {
        System.out.println("Wav 재생 중...");
    }
}

// MusicPlayer 클래스
class MusicPlayer {
    public void play(Playable playable) {
        playable.play();
    }
}
