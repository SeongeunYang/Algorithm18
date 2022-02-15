package programmers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PG_방금그곡 {
    public String solution(String m, String[] musicinfos) {
        String answer = "None";
        long findPlayTime = 0;
        String search = convert(m);

        for (String music : musicinfos) {
            String[] musicInfo = music.split(",");
            try {
                SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
                Date startT = formatter.parse(musicInfo[0]);
                Date endT = formatter.parse(musicInfo[1]);

                String musicM = convert(musicInfo[3]);

                int playTime = (int) ((endT.getTime() - startT.getTime()) / 60000);
                int musicLen = musicM.length();
                if (musicLen < playTime) { // 재생시간 > 음악 길이
                    for (int i = 0; i < playTime / musicLen; i++) {
                        musicM += musicM;
                    }
                    musicM += musicM.substring(0, playTime % musicLen);
                } else { // 재생시간 <= 음악 길이
                    musicM = musicM.substring(0, playTime);
                }

                if (musicM.contains(search)) {
                    if (playTime > findPlayTime) {
                        answer = musicInfo[2];
                        findPlayTime = playTime;
                    }
                }
            } catch (ParseException e) {
                return "None";
            }
        }

        return answer;
    }

    public static String convert(String str) {
        str = str.replaceAll("C#", "H");
        str = str.replaceAll("D#", "I");
        str = str.replaceAll("F#", "J");
        str = str.replaceAll("G#", "K");
        str = str.replaceAll("A#", "L");

        return str;
    }

    public static void main(String[] args) {
        PG_방금그곡 method = new PG_방금그곡();
        String[] musicinfos = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        System.out.println(method.solution("ABC", musicinfos));
    }
}
