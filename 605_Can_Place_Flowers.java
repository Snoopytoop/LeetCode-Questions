class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 1) {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0 && flowerbed[0] == 0 && flowerbed[1] == 0) {
                n--;
                flowerbed[i] = 1;
            } else if (i == flowerbed.length - 1 &&
                        flowerbed[i] == 0 &&
                        flowerbed[i - 1] == 0) {
                            n--;
                            flowerbed[i] = 1;
                        }else if (i != 0 && i != flowerbed.length -1 &&
                                flowerbed[i-1] == 0 && 
                                flowerbed[i] == 0 &&
                                flowerbed[i+1] == 0) {
                                    n--;
                                    flowerbed[i] = 1;
                                    }
             if (n == 0) {
                return true;
             }
        }
        return false;
    }
}
