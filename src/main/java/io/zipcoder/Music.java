package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        int currentSelection = 0;

        for(int i = 0; i <= playList.length; i++){
            if (playList[i].equals(selection)) {
                currentSelection = Math.abs(startIndex - i);
            }

        }




        return Integer.min(playList.length - currentSelection, currentSelection);
    }
}
