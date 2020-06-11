package paiza.rankB;

import java.util.Scanner;

public class B043RatKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        Now position = new  Now(sc.nextInt(), sc.nextInt());

        String[][] map = new String[h][w];
        for (int i = 0; i < h; i++) {
            String[] hString = sc.next().split("");
            for (int j = 0; j < w; j++) {
                map[i][j] = hString[j];
            }
        }

        Direct current = Direct.North;
        while (position.h <= h && position.w <= w) {
            if (map[position.h-1][position.w-1].equals("*")) {
                map[position.h-1][position.w-1] = ".";
                position = go(current, position, true);
                current = next(current, true);
            } else {
                map[position.h-1][position.w-1] = "*";
                position = go(current, position, false);
                current = next(current, false);
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (j != w-1) System.out.print(map[i][j]);
                else System.out.println(map[i][j]);
            }
        }
    }
    
    private static Now go(Direct direct, Now now, boolean isHugo) {
        if (isHugo) return new Now(now.h + direct.richH, now.w + direct.richW);
        else return new Now(now.h + direct.poorH, now.w + direct.poorW);
    }

    private static Direct next(Direct direct, boolean isHugo) {
        if (direct == Direct.North && !isHugo) return Direct.East;
        else if (direct == Direct.East && !isHugo) return Direct.South;
        else if (direct == Direct.South && !isHugo) return Direct.West;
        else if (direct == Direct.West && !isHugo) return Direct.North;

        else if (direct == Direct.North && isHugo) return Direct.West;
        else if (direct == Direct.West && isHugo) return Direct.South;
        else if (direct == Direct.South && isHugo) return Direct.East;
        else return Direct.North;
    }

    static class Now {
        int h;
        int w;

        public Now(int h, int w) {
            this.h = h;
            this.w = w;
        }
    }

    enum Direct {
        North(0, 1, 0, -1),
        East(1, 0, -1, 0),
        South(0, -1, 0, 1),
        West(-1, 0, 1, 0);

        int poorH;
        int poorW;
        int richH;
        int richW;

        Direct(int poorH, int poorW, int richH, int richW) {
            this.poorH = poorH;
            this.poorW = poorW;
            this.richH = richH;
            this.richW = richW;
        }
    }
}
